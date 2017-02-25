package org.coyove.eugine.core.math;

import org.coyove.eugine.base.ReplaceableVariable;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.core.PVariable;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.EgCast;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.value.SNumber;

/**
 * Created by coyove on 2016/9/10.
 */
public class PMultiply extends SExpression {
    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right;

    private boolean assign;

    public PMultiply() {}

    public PMultiply(Atom ha, SExpression left, SExpression right) {
        atom = ha;
        this.left = left;
        this.right = right;
    }

    public PMultiply(Atom ha, SExpression l, SExpression r, boolean a) {
        this(ha, l, r);
        assign = a;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue left = this.left.evaluate(env);
        double l = EgCast.toDouble(left, atom);

        if (this.left instanceof PVariable && this.right instanceof PVariable) {
            if (((PVariable) this.left).name.equals(((PVariable) this.right).name)) {
                if (assign) {
                    ((SNumber) left).set(l * l);
                    return left;
                } else {
                    return new SNumber(l * l);
                }
            }
        }

        SValue right = this.right.evaluate(env);
        double r = EgCast.toDouble(right, atom);

        if (assign) {
            ((SNumber) left).set(l * r);
            return left;
        } else {
            return new SNumber(l * r);
        }
    }

    @Override
    public SExpression deepClone() {
        PMultiply ret = new PMultiply();
        ret.atom = this.atom;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();
        ret.assign = this.assign;
        return ret;
    }
}
