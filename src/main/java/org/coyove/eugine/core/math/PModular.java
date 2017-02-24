package org.coyove.eugine.core.math;

import org.coyove.eugine.base.ReplaceableVariable;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.EgCast;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.value.SDouble;
import org.coyove.eugine.value.SInt;
import org.coyove.eugine.value.SLong;

/**
 * Created by coyove on 2016/9/10.
 */
public class PModular extends SExpression {
    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right;

    public PModular() {}

    public PModular(Atom ha, SExpression left, SExpression right) {
        atom = ha;
        this.left = left;
        this.right = right;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue left = this.left.evaluate(env);
        SValue right = this.right.evaluate(env);

        if (left instanceof SDouble) {
            double r = EgCast.toDouble(right, atom);
            if (Math.abs(r) < 1e-6) {
                throw new EgException(1001, "moded by zero", atom);
            }

            double l = ((SDouble) left).val();
            double f = Math.floor(l / r);
            return new SDouble(l - f * r);
        }

        if (left instanceof SInt) {
            if (right instanceof SInt) {
                int r = ((SInt) right).val();
                if (r == 0) {
                    throw new EgException(1001, "moded by zero", atom);
                }
                return new SInt(Math.floorMod(((SInt) left).val(), r));
            } else {
                long r = EgCast.toLong(right, atom);
                if (r == 0) {
                    throw new EgException(1001, "moded by zero", atom);
                }
                return new SLong(Math.floorMod(((SInt) left).val(), r));
            }
        }

        if (left instanceof SLong) {
            long r = EgCast.toLong(right, atom);
            if (r == 0) {
                throw new EgException(1001, "moded by zero", atom);
            }
            return new SLong(Math.floorMod(((SLong) left).val(), r));
        }

        throw new EgException(7056, left + " is not a number", atom);
    }

    @Override
    public SExpression deepClone() {
        PModular ret = new PModular();
        ret.atom = this.atom;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();
        return ret;
    }
}
