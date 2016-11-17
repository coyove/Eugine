package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.math.BigDecimal;

/**
 * Created by coyove on 2016/9/10.
 */
public class PAdd extends SExpression {
    private SExpression left;
    private SExpression right;
    private boolean self = false;

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
        SValue left = this.left.evaluate(env);
        SValue right = this.right.evaluate(env);

        if (left instanceof SConcatString) {
            if (right.underlying != null) {
                if (self) {
                    if (right instanceof SConcatString) {
                        ((SConcatString) left).texts.addAll(((SConcatString) right).texts);
                    } else {
                        ((SConcatString) left).texts.add(right.underlying.toString());
                    }

                    return left;
                } else {
                    ListEx<String> t = ((SConcatString) left).texts;
                    SConcatString ret = new SConcatString(t.toArray(new String[t.size()]));

                    if (right instanceof SConcatString) {
                        ret.texts.addAll(((SConcatString) right).texts);
                        return ret;
                    } else {
                        ret.texts.add(right.underlying.toString());
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
                    return new SConcatString(left.underlying.toString(), right.underlying.toString());
                }
//                left.underlying = left.<String>get() + right.<String>get();
//                return new SNull();
            } else {
                return left.clone();
            }
        }

        if (left instanceof SDouble) {
            return new SDouble(left.<Double>get() + Utils.getDouble(right, atom));
        }

        if (left instanceof SInteger) {
            return new SInteger(left.<Long>get() + Utils.getLong(right, atom));
        }

        if (left instanceof SList) {
            ListEx<SValue> list;
            if (self) {
                list = left.get();
                if (left.immutable) {
                    throw new EgException(2101, "list is immutable", atom);
                }

                list.add(right);
                return new SNull();
            } else {
                list = (ListEx<SValue>) left.<ListEx<SValue>>get().clone();
                list.add(right);
                return new SList(list);
            }
        }

        return new SNull();
    }

    @Override
    public SExpression deepClone() throws EgException {
        PAdd ret = new PAdd();
        ret.atom = this.atom;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();
        ret.self = this.self;
        return ret;
    }
}
