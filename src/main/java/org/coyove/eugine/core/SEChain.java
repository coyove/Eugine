package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SEChain extends SExpression {
    protected List<SExpression> expressions;

    public SEChain(Atom ha, Compound c) throws VMException {
        super(ha, c);
        expressions = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue ret = new SNull();
        for (SExpression se : expressions)
            ret = se.evaluate(env);

        return ret;
    }
}
