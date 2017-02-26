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
public class PBitNot extends SExpression {
    @ReplaceableVariable
    private SExpression left;

    public PBitNot() {}

    public PBitNot(Atom ha, SExpression left) {
        atom = ha;
        this.left = left;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue left = this.left.evaluate(env);
        return new SNumber(~EgCast.toLong(left, atom));
    }

    @Override
    public SExpression deepClone() {
        PBitNot ret = new PBitNot();
        ret.atom = this.atom;
        ret.left = this.left.deepClone();

        return ret;
    }
}
