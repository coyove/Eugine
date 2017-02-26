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
public class PBitOr extends SExpression {
    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right;

    private boolean assign;

    public PBitOr() {}

    public PBitOr(Atom ha, SExpression left, SExpression right) {
        atom = ha;
        this.left = left;
        this.right = right;
    }

    public PBitOr(Atom ha, SExpression l, SExpression r, boolean a) {
        this(ha, l, r);
        assign = a;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue left = this.left.evaluate(env);
        SValue right = this.right.evaluate(env);

        if (assign) {
            ((SNumber) left).set(EgCast.toLong(left, atom) | EgCast.toLong(right, atom));
            return left;
        } else {
            return new SNumber(EgCast.toLong(left, atom) | EgCast.toLong(right, atom));
        }
    }

    @Override
    public SExpression deepClone() {
        PBitOr ret = new PBitOr();
        ret.atom = this.atom;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();
        ret.assign = this.assign;
        return ret;
    }
}
