package org.coyove.eugine.core.flow;

import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class PChain extends SExpression {
    @ReplaceableVariables
    public ListEx<SExpression> expressions;

    private int lastExecPoint = 0;

    private ExecEnvironment lastExecEnv = null;

    public boolean execToEnd = false;

    public PChain() {
        expressions = new ListEx<SExpression>();
    }

    public PChain(ListEx<SExpression> e) {
        expressions = e;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        execToEnd = false;
        SValue ret = ExecEnvironment.Null;
        if (lastExecEnv != null) {
            env = lastExecEnv;
        }

        for (int i = lastExecPoint; i < expressions.size(); i++) {
            SExpression se = expressions.get(i);
            ret = se.evaluate(env);

            if (ret instanceof SYielded) {
                lastExecEnv = env;
                lastExecPoint = se instanceof PYield ? i + 1 : i;
                return ret;
            }
        }

        lastExecEnv = null;
        lastExecPoint = 0;
        execToEnd = true;
        return ret;
    }

    @Override
    public SExpression deepClone() throws EgException {
        PChain ret = new PChain();
        ret.expressions = ListEx.deepClone(this.expressions);
        return ret;
    }
}
