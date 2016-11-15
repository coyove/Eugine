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
        headAtom = ha;
        expression = e;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        synchronized (this) {
            return expression.evaluate(env);
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        // Sync cannot be cloned
        return this;
    }
}
