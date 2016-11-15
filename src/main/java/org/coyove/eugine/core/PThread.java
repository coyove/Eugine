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
        public ListEx<SExpression> arguments;
        public Atom headAtom;
        public Compound tailCompound;
        public ExecEnvironment env;

        public void run() {
            try {
                (new PCall(closure, arguments, headAtom, tailCompound)).evaluate(env);
            } catch (VMException ex) {
                ErrorHandler.print(ex);
            }
        }
    }

    private SExpression closure;
    private ListEx<SExpression> arguments;

    public PThread() {}

    public PThread(Atom ha, SExpression c, ListEx<SExpression> args) {
        headAtom = ha;

        closure = c;
        arguments = args;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SClosure closure = Utils.cast(this.closure.evaluate(env), SClosure.class);
        if (closure == null) {
            throw new VMException(3020, "invalid function to go", headAtom);
        }

        GoTask go = new GoTask();
        go.closure = closure.clone();
        go.arguments = this.arguments;
        go.headAtom = this.headAtom;
        go.tailCompound = this.tailCompound;
        go.env = env;

        Thread t = new Thread(go);
        t.start();

        return new SNull();
    }

    @Override
    public SExpression deepClone() throws VMException {
        PThread ret = new PThread();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;

        // note here closure is not SClosure
        ret.closure = this.closure.deepClone();
        ret.arguments = ListEx.deepClone(this.arguments);

        return ret;
    }
}
