package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class SECond extends SExpression {
    public class Branch implements java.io.Serializable {
        public SExpression recv;
        public List<SExpression> body;
    }

    public SExpression condition;
    public List<Branch> branches;
    public List<SExpression> defaultBranch = null;

    public SECond() {}

    public SECond(Atom ha, Compound c) throws VMException {
        super(ha, c, 2);

        condition = SExpression.cast(c.atoms.pop());
        branches = new List<Branch>();

        for (Base a : c.atoms) {
            Compound b = (Compound) a;
            if (b == null || b.atoms.size() < 2)
                throw new VMException(2002, "invalid branch definition", ha);

            Base cond = b.atoms.pop();

            if (cond instanceof Atom && ((Atom) cond).token.type == Token.TokenType.ATOMIC &&
                    ((Atom) cond).token.value.toString().equals("_")) {
                defaultBranch = SExpression.castPlain(b);
            } else {
                Branch n = new Branch();
                n.recv = SExpression.cast(cond);
                n.body = SExpression.castPlain(b);

                branches.add(n);
            }
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        Object cond = condition.evaluate(env).get();
        SValue ret = new SNull();

        for (Branch b : branches) {
            if (b.recv.evaluate(env).get().equals(cond)) {
                for (SExpression e : b.body) {
                    ret = e.evaluate(env);
                }
                return ret;
            }
        }

        if (defaultBranch != null) {
            for (SExpression e : defaultBranch) {
                ret = e.evaluate(env);
            }
            return ret;
        }

        return ret;
    }

    @Override
    public SExpression deepClone() throws VMException {
        SECond ret = new SECond();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.condition = this.condition.deepClone();

        if (this.defaultBranch != null) {
            ret.defaultBranch = List.deepClone(this.defaultBranch);
        }

        ret.branches = new List<Branch>(this.branches.size());
        for (Branch branch : this.branches) {
            Branch n = new Branch();
            n.recv = branch.recv.deepClone();
            n.body = List.deepClone(branch.body);

            ret.branches.add(n);
        }

        return ret;
    }
}
