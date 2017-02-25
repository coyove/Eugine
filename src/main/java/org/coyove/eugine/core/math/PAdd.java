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

    private boolean assign;

    public PAdd() {
    }

    public PAdd(Atom ha, SExpression l, SExpression r) {
        atom = ha;
        left = l;
        right = r;
    }

    public PAdd(Atom ha, SExpression l, SExpression r, boolean a) {
        this(ha, l, r);
        assign = a;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue left = this.left.evaluate(env);
        SValue right = this.right.evaluate(env);

        if (left instanceof SConcatString) {
            if (right != ExecEnvironment.Null) {
                SConcatString ret = (SConcatString) (assign ? left : left.clone());
                ret.append(right.asString());
                return ret;
            } else {
                return assign ? left : left.clone();
            }
        }

        if (left instanceof SString) {
            if (right != ExecEnvironment.Null) {
                if (assign) {
                    ((SString) left).underlying = ((String) left.get()).concat(right.asString());
                    return left;
                } else {
                    return new SConcatString(left.get().toString(), right.asString());
                }
            } else {
                return assign ? left : left.clone();
            }
        }

        if (left instanceof SNumber) {
            if (assign) {
                SNumber l = (SNumber) left;
                l.set(l.doubleValue() + EgCast.toDouble(right, atom));
                return l;
            } else {
                return new SNumber(((SNumber) left).doubleValue() + EgCast.toDouble(right, atom));
            }
        }

        if (left instanceof SList) {
            ListEx<SValue> list = (ListEx<SValue>) (assign ?
                    left.<ListEx<SValue>>get() :
                    left.<ListEx<SValue>>get().clone());
            list.add(right);
            return new SList(list);
        }

        if (left instanceof SClosure) {
            SValue adder = ((SClosure) left).extra.get("__add__");
            if (adder != null && adder instanceof SClosure) {
                return PCall.evaluateClosure(this.atom, ((SClosure) adder), ListEx.build(left, right), env);
            }
        }

        if (right instanceof SClosure) {
            SValue adder = ((SClosure) right).extra.get("__add__");
            if (adder != null && adder instanceof SClosure) {
                return PCall.evaluateClosure(this.atom, ((SClosure) adder), ListEx.build(right, left), env);
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
        ret.assign = this.assign;

        return ret;
    }
}
