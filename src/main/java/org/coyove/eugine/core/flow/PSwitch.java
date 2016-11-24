package org.coyove.eugine.core.flow;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class PSwitch extends SExpression {
    @ReplaceableVariable
    public SExpression condition;

    public ListEx<Branch> branches;

    public Branch defaultBranch = null;

    public PSwitch() {}

    public PSwitch(Atom ha, SExpression condition, ListEx<Branch> branches, Branch db) {
        atom = ha;

        this.condition = condition;
        this.branches = branches;
        this.defaultBranch = db;
    }

    public static boolean compare(Object left, Object right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else {
            return left.equals(right);
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue cond = condition.evaluate(env);
        SValue ret = ExecEnvironment.Null;

        for (Branch b : branches) {
            if (cond.equals(b.recv.evaluate(env))) {
                for (SExpression e : b.body) {
                    ret = e.evaluate(env);
                }
                return ret;
            }
        }

        if (defaultBranch != null) {
            for (SExpression e : defaultBranch.body) {
                ret = e.evaluate(env);
            }
            return ret;
        }

        return ret;
    }

    @Override
    public SExpression deepClone() throws EgException {
        PSwitch ret = new PSwitch();
        ret.atom = this.atom;
        ret.condition = this.condition.deepClone();

        if (this.defaultBranch != null) {
            ret.defaultBranch = new Branch();
            ret.defaultBranch.body = ListEx.deepClone(defaultBranch.body);
        }

        ret.branches = new ListEx<Branch>(this.branches.size());
        for (Branch branch : this.branches) {
            Branch n = new Branch();
            n.recv = branch.recv.deepClone();
            n.body = ListEx.deepClone(branch.body);

            ret.branches.add(n);
        }

        return ret;
    }
}
