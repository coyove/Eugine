package org.coyove.eugine.core.math;

import org.coyove.eugine.base.*;
import org.coyove.eugine.core.flow.PCall;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.SClosure;

/**
 * Created by coyove on 2016/9/10.
 */
public class PNot extends SExpression {
    @ReplaceableVariable
    private SExpression right;

    public PNot() {
    }

    public PNot(Atom ha, SExpression r) {
        atom = ha;
        right = r;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue right = this.right.evaluate(env);
        if (right instanceof SClosure) {
            ListEx<String> argNames = ((SClosure) right).argNames;

            SClosure comp = new SClosure(env, argNames, ((SClosure) right).passByValue,
                    ListEx.build(new PNot(atom,
                            new PCall(atom, right, PLogic.namesToVariables(argNames))
                    )));

            comp.atom = atom;
            return comp;
        }

        boolean ret = EgCast.toBoolean(right, atom);
        return !ret ? ExecEnvironment.True : ExecEnvironment.False;
    }

    @Override
    public SExpression deepClone() {
        PNot ret = new PNot();
        ret.atom = this.atom;
        ret.right = this.right.deepClone();

        return ret;
    }
}
