package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by coyove on 2016/9/10.
 */
public class PAdd extends SExpression {
    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right;

    private boolean self = false;

    public boolean expanded = false;

    public Object[] stack = new Object[3];

    public PAdd() {}

    public PAdd(Atom ha, ListEx<SExpression> args, boolean s) {
        super(ha, args, 2);

        left = args.get(0);
        right = args.get(1);
        self = s;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
//        if (expanded) {
//            return MathOpStack.eval(this.stack, env, atom);
//        }

        SValue left = this.left.evaluate(env);
        SValue right = this.right.evaluate(env);

        if (left instanceof SConcatString) {
            if (right.underlying != null) {
                String text;
                if (right instanceof SInteger) {
                    text = ((Long) ((SInteger) right).val()).toString();
                } else if (right instanceof SDouble) {
                    text = ((Double) ((SDouble) right).val()).toString();
                } else {
                    text = right.underlying.toString();
                }

                if (self) {
                    if (right instanceof SConcatString) {
                        ((SConcatString) left).texts.addAll(((SConcatString) right).texts);
                    } else {
                        ((SConcatString) left).texts.add(text);
                    }

                    return left;
                } else {
                    ListEx<String> t = ((SConcatString) left).texts;
                    SConcatString ret = new SConcatString(t.toArray(new String[t.size()]));

                    if (right instanceof SConcatString) {
                        ret.texts.addAll(((SConcatString) right).texts);
                        return ret;
                    } else {
                        ret.texts.add(text);
                        return ret;
                    }
                }
            } else {
                return left.clone();
            }
        }

        if (left instanceof SString) {
            if (right.underlying != null) {
                if (right instanceof SConcatString) {
                    SConcatString ret = new SConcatString(left.underlying.toString());
                    ret.texts.addAll(((SConcatString) right).texts);
                    return ret;
                } else {
                    String t;
                    if (right instanceof SInteger) {
                        t = ((Long) ((SInteger) right).val()).toString();
                    } else if (right instanceof SDouble) {
                        t = ((Double) ((SDouble) right).val()).toString();
                    } else {
                        t = right.underlying.toString();
                    }
                    return new SConcatString(left.underlying.toString(), t);
                }
            } else {
                return left.clone();
            }
        }

        if (left instanceof SDouble) {
            double r = Utils.castDouble(right, atom);
            double l = ((SDouble) left).val();

//            if (stack[0] == null) {
//                PMath.pushStack(stack, this.left, this.right, PMath.ACTION.ADD);
//            }

            return new SDouble(l + r);
        }

        if (left instanceof SInteger) {
            long l = ((SInteger) left).val();
            long r = Utils.castLong(right, atom);

//            if (stack[0] == null) {
//                PMath.pushStack(stack, this.left, this.right, PMath.ACTION.ADD);
//            }

            return new SInteger(l + r);
        }

        if (left instanceof SList) {
            ListEx<SValue> list;
            if (self) {
                list = left.get();
                if (left.immutable) {
                    throw new EgException(2101, "list is immutable", atom);
                }

                list.add(right);
                return env.Null;
            } else {
                list = (ListEx<SValue>) left.<ListEx<SValue>>get().clone();
                list.add(right);
                return new SList(list);
            }
        }

        return env.Null;
    }

    @Override
    public SExpression deepClone() throws EgException {
        PAdd ret = new PAdd();
        ret.atom = this.atom;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();
        ret.self = this.self;
        ret.stack = PMath.copyStack(this.stack);
        ret.expanded = this.expanded;

        return ret;
    }
}
