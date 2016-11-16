package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class PSync extends SExpression {
    public SExpression expression;

    public PSync() {}

    public PSync(Atom ha, SExpression e) {
        atom = ha;
        expression = e;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        synchronized (this) {
            return expression.evaluate(env);
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        // Sync cannot be cloned
        return this;
    }
}
