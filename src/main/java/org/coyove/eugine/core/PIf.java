package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class PIf extends SExpression {
    @ReplaceableVariable
    public SExpression condition;

    @ReplaceableVariable
    public SExpression trueBranch;

    @ReplaceableVariable
    public SExpression falseBranch;

    public PIf() {}

    public PIf(Atom ha, SExpression c, SExpression t, SExpression f) {
        atom = ha;
        condition = c;
        trueBranch = t;
        falseBranch = f;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        if (evaluateCondition(env)) {
            return trueBranch.evaluate(env);
        } else {
            if (falseBranch != null) {
                return falseBranch.evaluate(env);
            } else {
                return ExecEnvironment.Null;
            }
        }
    }

    public boolean evaluateCondition(ExecEnvironment env) throws EgException {
        return Utils.castBoolean(condition.evaluate(env), atom);
    }

    @Override
    public SExpression deepClone() throws EgException {
        PIf ret = new PIf();
        ret.atom = this.atom;

        ret.condition = this.condition.deepClone();
        ret.trueBranch = this.trueBranch.deepClone();

        if (this.falseBranch != null) {
            ret.falseBranch = this.falseBranch.deepClone();
        }
        return ret;
    }
}
