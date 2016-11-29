package org.coyove.eugine.core.math;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class PAdd extends SExpression {
    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right;

    public PAdd() {}

    public PAdd(Atom ha, SExpression l, SExpression r) {
        atom = ha;
        left = l;
        right = r;
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
            if (!(right instanceof SNull)) {
                SConcatString ret = (SConcatString) left.clone();

                if (right instanceof SConcatString) {
                    ret.append(((SConcatString) right).text);
                } else {
                    ret.append(right.asString());
                }

                return ret;
            } else {
                return left.clone();
            }
        }

        if (left instanceof SString) {
            if (!(right instanceof SNull)) {
                if (right instanceof SConcatString) {
                    SConcatString ret = new SConcatString(left.underlying.toString());
                    ret.append(((SConcatString) right).text);
                    return ret;
                } else {
                    return new SConcatString(left.underlying.toString(), right.asString());
                }
            } else {
                return left.clone();
            }
        }

        if (left instanceof SDouble) {
            return new SDouble(((SDouble) left).val() + Utils.castDouble(right, atom));
        }

        if (left instanceof SInt) {
            if (right instanceof SInt) {
                return new SInt(((SInt) left).val() + ((SInt) right).val());
            } else {
                return new SLong(((SInt) left).val() + Utils.castLong(right, atom));
            }
        }

        if (left instanceof SLong) {
            return new SLong(((SLong) left).val() + Utils.castLong(right, atom));
        }

        if (left instanceof SList) {
            ListEx<SValue> list = (ListEx<SValue>) left.<ListEx<SValue>>get().clone();
            list.add(right);
            return new SList(list);
        }

        return ExecEnvironment.Null;
    }

    @Override
    public SExpression deepClone() throws EgException {
        PAdd ret = new PAdd();
        ret.atom = this.atom;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();

        return ret;
    }
}
