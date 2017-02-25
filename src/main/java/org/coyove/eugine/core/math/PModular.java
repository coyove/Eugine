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
public class PModular extends SExpression {
    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right;

    private boolean assign;

    public PModular() {}

    public PModular(Atom ha, SExpression left, SExpression right) {
        atom = ha;
        this.left = left;
        this.right = right;
    }

    public PModular(Atom ha, SExpression l, SExpression r, boolean a) {
        this(ha, l, r);
        assign = a;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue left = this.left.evaluate(env);
        SValue right = this.right.evaluate(env);

        double r = EgCast.toDouble(right, atom);
        if (Math.abs(r) < 1e-15) {
            throw new EgException(1001, "moded by zero", atom);
        }

        double l = EgCast.toDouble(left, atom);
        double f = Math.floor(l / r);
        if (assign) {
            ((SNumber) left).set(l - f * r);
            return left;
        } else {
            return new SNumber(l - f * r);
        }
    }

    @Override
    public SExpression deepClone() {
        PModular ret = new PModular();
        ret.atom = this.atom;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();
        ret.assign = this.assign;
        return ret;
    }
}
