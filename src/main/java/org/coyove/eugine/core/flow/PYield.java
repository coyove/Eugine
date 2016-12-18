package org.coyove.eugine.core.flow;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.SYielded;

/**
 * Created by coyove on 2016/9/9.
 */
public class PYield extends SExpression {
    @ReplaceableVariable
    public SExpression expression;

    public PYield() {}

    public PYield(Atom ha, SExpression e) {
        atom = ha;
        expression = e;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        return new SYielded(expression.evaluate(env));
    }

    @Override
    public SExpression deepClone() {
        PYield ret = new PYield();
        ret.expression = this.expression.deepClone();
        return ret;
    }
}
