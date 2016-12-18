package org.coyove.eugine.core.math;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class PNot extends SExpression {
    @ReplaceableVariable
    private SExpression right;

    public PNot() {
    }

    public PNot(Atom ha, SExpression r) {
        atom = ha;
        right = r;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        boolean ret = EgCast.toBoolean(this.right.evaluate(env), atom);
        return !ret ? ExecEnvironment.True : ExecEnvironment.False;
    }

    @Override
    public SExpression deepClone() {
        PNot ret = new PNot();
        ret.atom = this.atom;
        ret.right = this.right.deepClone();

        return ret;
    }
}
