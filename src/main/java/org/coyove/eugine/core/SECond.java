package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class SECond extends SExpression {
    private class Branch implements java.io.Serializable {
        public SExpression bcond;
        public SExpression bbody;
    }

    private SExpression condition;
    private List<Branch> branches;
    private SExpression defaultBranch = null;

    public SECond(Atom ha, Compound c) throws VMException {
        super(ha, c);

        if (c.atoms.size() < 2)
            throw new VMException("at least 1 branch must be defined", ha);

        condition = SExpression.cast(c.atoms.pop());
        branches = new List<Branch>();

        for (Base a : c.atoms) {
            final Compound b = (Compound)a;
            if (b == null || b.atoms.size() < 2)
                throw new VMException("each branch must be a compound", ha);

            final Base cond = b.atoms.pop();

            if (cond instanceof Atom && ((Atom) cond).token.type == Token.TokenType.ATOMIC &&
                    ((Atom) cond).token.value.toString().equals("_")) {
                defaultBranch = SExpression.cast(b.atoms.pop());
            } else {
                branches.add(new Branch() {{
                    bcond = SExpression.cast(cond);
                    bbody = SExpression.cast(b.atoms.pop());
                }});
            }
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        Object cond = condition.evaluate(env).get();

        for (Branch b : branches)
        {
            if (b.bcond.evaluate(env).get().equals(cond))
                return b.bbody.evaluate(env);
        }

        if (defaultBranch != null)
            return defaultBranch.evaluate(env);

        return new SNull();
    }
}
