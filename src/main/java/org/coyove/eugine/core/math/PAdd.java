package org.coyove.eugine.core.math;

import org.coyove.eugine.base.*;
import org.coyove.eugine.core.PVariable;
import org.coyove.eugine.core.flow.PCall;
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

    public PAdd() {
    }

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
                ret.append(right.asString());

                return ret;
            } else {
                return left.clone();
            }
        }

        if (left instanceof SString) {
            if (!(right instanceof SNull)) {
                if (right instanceof SConcatString) {
                    SConcatString ret = new SConcatString(left.underlying.toString());
                    ret.append(right.<String>get());
                    return ret;
                } else {
                    return new SConcatString(left.underlying.toString(), right.asString());
                }
            } else {
                return left.clone();
            }
        }

        if (left instanceof SDouble) {
            return new SDouble(((SDouble) left).val() + EgCast.toDouble(right, atom));
        }

        if (left instanceof SInt) {
            if (right instanceof SInt) {
                return new SInt(((SInt) left).val() + ((SInt) right).val());
            } else {
                return new SLong(((SInt) left).val() + EgCast.toLong(right, atom));
            }
        }

        if (left instanceof SLong) {
            return new SLong(((SLong) left).val() + EgCast.toLong(right, atom));
        }

        if (left instanceof SList) {
            ListEx<SValue> list = (ListEx<SValue>) left.<ListEx<SValue>>get().clone();
            list.add(right);
            return new SList(list);
        }

        if (left instanceof SClosure) {
            SValue adder = ((SClosure) left).extra.get("__add__");
            if (adder != null && adder instanceof SClosure) {
                return (new PCall(this.atom, adder, ListEx.build(left, right))).evaluate(env);
            }
        }

        if (right instanceof SClosure) {
            SValue adder = ((SClosure) right).extra.get("__add__");
            if (adder != null && adder instanceof SClosure) {
                return (new PCall(this.atom, adder, ListEx.build(right, left))).evaluate(env);
            }
        }

        return ExecEnvironment.Null;
    }

    @Override
    public SExpression deepClone() {
        PAdd ret = new PAdd();
        ret.atom = this.atom;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();

        return ret;
    }
}
