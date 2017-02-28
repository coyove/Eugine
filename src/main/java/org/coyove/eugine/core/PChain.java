package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class PChain extends SExpression {
    @ReplaceableVariables
    public ListEx<SExpression> expressions;

    public PChain() {
        expressions = new ListEx<SExpression>();
    }

    public PChain(ListEx<SExpression> e) {
        expressions = e;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue ret = ExecEnvironment.Null;

        for (int i = 0; i < expressions.size(); i++) {
            SExpression se = expressions.get(i);
            ret = se.evaluate(env);

            if (ret == ExecEnvironment.Break) {
                return ret;
            }
        }

        return ret;
    }

    @Override
    public SExpression deepClone() {
        PChain ret = new PChain();
        ret.expressions = ListEx.deepClone(this.expressions);
        return ret;
    }
}
