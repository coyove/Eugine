package org.coyove.eugine.core;

import org.apache.commons.lang3.ArrayUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class PMeta extends SExpression {
    @ReplaceableVariable
    private SExpression expr;

    public PMeta() {}

    public PMeta(Atom ha, SExpression e) {
        atom = ha;
        expr = e;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        return new SMetaExpression(expr);
    }

    @Override
    public SExpression deepClone() {
        PMeta ret = new PMeta();
        ret.atom = this.atom;
        ret.expr = this.expr.deepClone();

        return ret;
    }
}
