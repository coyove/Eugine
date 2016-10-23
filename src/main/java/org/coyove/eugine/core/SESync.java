package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SESync extends SExpression {
    public List<SExpression> expressions;

    public SESync() {}

    public SESync(Atom ha, Compound c) throws VMException {
        super(ha, c);
        expressions = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        synchronized (this) {
            SValue ret = new SNull();
            for (int i = 0; i < expressions.size(); i++) {
                ret = expressions.get(i).evaluate(env);
            }
            return ret;
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        // Sync cannot be cloned
        return this;
    }
}
