package org.coyove.eugine.library;

import org.coyove.eugine.base.NativeCallInterface;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.core.flow.PCall;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.pm.Exportable;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.SClosure;
import org.coyove.eugine.value.SDict;
import org.coyove.eugine.value.SNativeCall;
import org.coyove.eugine.value.SObject;

/**
 * Created by zezhong on 2017/2/26.
 */
public class thread implements Exportable{
    private class ThreadTask implements Runnable {
        public SClosure closure;
        public Atom atom;
        public ListEx<SValue> arguments;
        public ExecEnvironment env;

        public void run() {
            try {
                PCall.evaluateClosure(atom, closure, arguments, env);
            } catch (EgException ex) {
                ErrorHandler.print(ex);
            }
        }
    }

    public void export(ExecEnvironment env) {
        env.put("thread", new SDict() {{
            put("start", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    ThreadTask tt = new ThreadTask();
                    tt.closure = EgCast.to(arguments.head(), SClosure.class);
                    if (tt.closure == null)
                        throw new EgException(1003, "must start a closure", atom);

                    tt.env = env;
                    tt.arguments = arguments.skip(1);

                    Thread t = new Thread(tt);
                    t.start();
                    return new SObject(t);
                }
            }, 1));

            put("sleep", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    long time = EgCast.toLong(arguments.head().evaluate(env), atom);

                    try {
                        Thread.sleep(time);
                    } catch (InterruptedException ex) {
                        throw new EgException(3099, "sleep was interrupted", atom);
                    }

                    return ExecEnvironment.Null;
                }
            }, 1));

            put("wait", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    Object t = arguments.head().evaluate(env).get();
                    if (t instanceof Thread) {
                        try {
                            ((Thread) t).join();
                            return ExecEnvironment.True;
                        } catch (InterruptedException e) {
                            throw new EgException(7055, "join was interrupted", atom);
                        }
                    }

                    return ExecEnvironment.Null;
                }
            }, 1));
        }});
    }
}
