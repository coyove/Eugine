package org.coyove.eugine.core.math;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.SMetaExpression;

/**
 * Created by coyove on 2016/9/10.
 */
public class PEqual extends SExpression {
    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right;

    public PEqual() {
    }

    public PEqual(Atom ha, SExpression l, SExpression r) {
        atom = ha;
        left = l;
        right = r;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue left = this.left.evaluate(env);
        SValue right = this.right.evaluate(env);

        boolean flag;
        if (left instanceof SMetaExpression && right instanceof SMetaExpression) {
            flag = left.underlying.getClass().equals(right.underlying.getClass());
        } else {
            flag = left.equals(right);
        }

        return flag ? ExecEnvironment.True : ExecEnvironment.False;
    }

    @Override
    public SExpression deepClone() {
        PEqual ret = new PEqual();
        ret.atom = this.atom;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();

        return ret;
    }
}
