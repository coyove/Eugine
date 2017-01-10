package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class PSync extends SExpression {
    @ReplaceableVariable
    public SExpression expr;

    public PSync() {}

    public PSync(Atom ha, SExpression e) {
        atom = ha;
        expr = e;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        synchronized (this) {
            return expr.evaluate(env);
        }
    }

    @Override
    public SExpression deepClone() {
        // Sync cannot be cloned
        return this;
    }
}
