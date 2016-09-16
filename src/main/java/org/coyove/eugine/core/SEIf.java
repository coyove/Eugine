package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEIf extends SExpression {
    private SExpression condition;
    private SExpression trueBranch;
    private SExpression falseBranch;

    public SEIf(Atom ha, Compound c) throws VMException {
        super(ha, c, 2);

        condition = SExpression.cast(c.atoms.pop());
        trueBranch = SExpression.cast(c.atoms.pop());
        falseBranch = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SBool res = Utils.cast(condition.evaluate(env), SBool.class,
                new VMException(2026, "invalid if condition", headAtom));

        if (res.get()) {
            return trueBranch.evaluate(env);
        } else {
            if (falseBranch != null) {
                return falseBranch.evaluate(env);
            } else {
                return new SNull();
            }
        }
    }
}
