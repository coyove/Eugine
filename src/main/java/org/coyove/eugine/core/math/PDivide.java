package org.coyove.eugine.core.math;

import org.coyove.eugine.base.ReplaceableVariable;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.EgCast;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.value.SNumber;

/**
 * Created by coyove on 2016/9/10.
 */
public class PDivide extends SExpression {
    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right;

    private boolean assign;

    public PDivide() {}

    public PDivide(Atom ha, SExpression left, SExpression right) {
        atom = ha;
        this.left = left;
        this.right = right;
    }

    public PDivide(Atom ha, SExpression l, SExpression r, boolean a) {
        this(ha, l, r);
        assign = a;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue left = this.left.evaluate(env);
        SValue right = this.right.evaluate(env);

        if (left instanceof SNumber) {
            double r = EgCast.toDouble(right, atom);
            if (Math.abs(r) < 1e-15) {
                throw new EgException(1001, "divided by zero", atom);
            }

            if (assign) {
                SNumber l = (SNumber) left;
                l.set(l.doubleValue() / r);
                return l;
            } else {
                return new SNumber(((SNumber) left).doubleValue() / r);
            }
        }

        throw new EgException(7056, left + " is not a number", atom);
    }

    @Override
    public SExpression deepClone() {
        PDivide ret = new PDivide();
        ret.atom = this.atom;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();
        ret.assign = this.assign;
        return ret;
    }
}
