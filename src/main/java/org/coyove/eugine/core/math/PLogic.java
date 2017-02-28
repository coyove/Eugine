package org.coyove.eugine.core.math;

import org.coyove.eugine.base.*;
import org.coyove.eugine.core.PVariable;
import org.coyove.eugine.core.PCall;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.SClosure;

/**
 * Created by coyove on 2016/9/10.
 */
public class PLogic extends SExpression {
    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right;

    private byte log;

    public final static byte AND = 0;
    public final static byte OR = 1;

    public PLogic() {}

    public PLogic(Atom ha, SExpression l, SExpression r, byte a) {
        atom = ha;
        log = a;
        left = l;
        right = r;
    }

    public static ListEx<SExpression> namesToVariables(ListEx<String> argNames) {
        ListEx<SExpression> arguments = new ListEx<SExpression>(argNames.size());
        for (String name : argNames) {
            arguments.add(new PVariable(name));
        }

        return arguments;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue left = this.left.evaluate(env);
        if (left instanceof SClosure) {
            SValue right = this.right.evaluate(env);

            if (right instanceof SClosure) {
                ListEx<String> argNames = ((SClosure) left).argNames;

                SClosure comp = new SClosure(env, argNames, ((SClosure) left).passByValue,
                        ListEx.build(new PLogic(atom,
                                new PCall(atom, left, namesToVariables(argNames)),
                                new PCall(atom, right, namesToVariables(argNames)),
                                log)));

                comp.atom = atom;
                return comp;
            } else {
                throw new EgException(7823, "invalid closure to concat", atom);
            }
        }

        boolean ret = EgCast.toBoolean(left, atom);

        if (ret && log == OR) {
            return ExecEnvironment.True;
        }

        if (!ret && log == AND) {
            return ExecEnvironment.False;
        }

        boolean next = EgCast.toBoolean(right.evaluate(env), atom);
        if (log == AND) {
            ret = ret && next;
        } else {
            ret = ret || next;
        }

        return ret ? ExecEnvironment.True : ExecEnvironment.False;

    }

    @Override
    public SExpression deepClone() {
        PLogic ret = new PLogic();
        ret.atom = this.atom;

        ret.log = this.log;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();

        return ret;
    }
}
