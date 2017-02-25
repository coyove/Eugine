package org.coyove.eugine.core.math;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class PLessEqual extends SExpression {
    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right;

    public PLessEqual() {
    }

    public PLessEqual(Atom ha, SExpression l, SExpression r) {
        atom = ha;
        left = l;
        right = r;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue left = this.left.evaluate(env);
        SValue right = this.right.evaluate(env);
        return EgCast.toDouble(left, atom) <= EgCast.toDouble(right, atom) ?
                ExecEnvironment.True : ExecEnvironment.False;
    }

    @Override
    public SExpression deepClone() {
        PLessEqual ret = new PLessEqual();
        ret.atom = this.atom;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();

        return ret;
    }
}
