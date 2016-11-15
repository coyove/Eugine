package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class PIf extends SExpression {
    public SExpression condition;
    public SExpression trueBranch;
    public SExpression falseBranch;

    public PIf() {}

    public PIf(Atom ha, SExpression c, SExpression t, SExpression f) {
        headAtom = ha;
        condition = c;
        trueBranch = t;
        falseBranch = f;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        if (evaluateCondition(env)) {
            return trueBranch.evaluate(env);
        } else {
            if (falseBranch != null) {
                return falseBranch.evaluate(env);
            } else {
                return new SNull();
            }
        }
    }

    public boolean evaluateCondition(ExecEnvironment env) throws VMException {
        SBool res = Utils.cast(condition.evaluate(env), SBool.class,
                new VMException(2026, "invalid condition", headAtom));

        return res.get();
    }

    @Override
    public SExpression deepClone() throws VMException {
        PIf ret = new PIf();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.condition = this.condition.deepClone();
        ret.trueBranch = this.trueBranch.deepClone();

        if (this.falseBranch != null) {
            ret.falseBranch = this.falseBranch.deepClone();
        }
        return ret;
    }
}
