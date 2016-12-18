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
public class PSubtract extends SExpression {
    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right;

    public PSubtract() {}

    public PSubtract(Atom ha, SExpression left, SExpression right) {
        atom = ha;
        this.left = left;
        this.right = right;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue left = this.left.evaluate(env);
        SValue right = this.right.evaluate(env);

        if (left instanceof SDouble) {
            return new SDouble(((SDouble) left).val() - EgCast.toDouble(right, atom));
        }

        if (left instanceof SInt) {
            if (right instanceof SInt) {
                return new SInt(((SInt) left).val() - ((SInt) right).val());
            } else {
                return new SLong(((SInt) left).val() - EgCast.toLong(right, atom));
            }
        }

        if (left instanceof SLong) {
            return new SLong(((SLong) left).val() - EgCast.toLong(right, atom));
        }

        throw new EgException(7056, left + " is not a number", atom);
    }

    @Override
    public SExpression deepClone() {
        PSubtract ret = new PSubtract();
        ret.atom = this.atom;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();
        return ret;
    }
}
