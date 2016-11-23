package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class PThread extends SExpression {
    private class GoTask implements Runnable {
        public SExpression closure;
        public ExecEnvironment env;

        public void run() {
            try {
                (new PCall(atom, closure, arguments)).evaluate(env);
            } catch (EgException ex) {
                ErrorHandler.print(ex);
            }
        }
    }

    @ReplaceableVariable
    private SExpression closure;

    @ReplaceableVariables
    private ListEx<SExpression> arguments;

    public PThread() {}

    public PThread(Atom ha, SExpression c, ListEx<SExpression> args) {
        atom = ha;

        closure = c;
        arguments = args;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SClosure closure = Utils.cast(this.closure.evaluate(env), SClosure.class);
        if (closure == null) {
            throw new EgException(3020, "invalid function to go", atom);
        }

        GoTask go = new GoTask();
        go.closure = closure;
        go.env = env;

        Thread t = new Thread(go);
        t.start();

        return new SObject(t);
    }

    @Override
    public SExpression deepClone() throws EgException {
        PThread ret = new PThread();
        ret.atom = this.atom;

        // note here closure is not SClosure
        ret.closure = this.closure.deepClone();
        ret.arguments = ListEx.deepClone(this.arguments);

        return ret;
    }
}
