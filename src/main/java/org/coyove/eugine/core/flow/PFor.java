package org.coyove.eugine.core.flow;

import org.coyove.eugine.base.*;
import org.coyove.eugine.core.PLambda;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/10.
 */
public class PFor extends SExpression {
    @ReplaceableVariable
    private SExpression list;

    @ReplaceableVariable
    private SExpression body;

    private SClosure cachedClosure = null;

    private byte direction;

    public final static byte ASC = 0;

    public final static byte DESC = 1;

    private int lastExecPointInForLoop = 0;

    private ExecEnvironment lastExecEnvInForLoop = null;

    private ListEx<SExpression> lastExecForLoop = null;

    public PFor() {
    }

    public PFor(Atom ha, SExpression l, SExpression b, byte dir) {
        atom = ha;
        list = l;
        body = b;
        direction = dir;
    }

    private SValue execLoop(SClosure body, ExecEnvironment _env, SValue v, SValue idx) throws EgException {
        ExecEnvironment env = SConfig.strictForLoop ? new ExecEnvironment() : _env;
        SValue old1 = null;
        SValue old2 = null;
        String name1 = null;
        String name2 = null;

        if (SConfig.strictForLoop) {
            if (body.argNames.size() >= 1) {
                env.put(body.argNames.head(), v);
            }

            if (body.argNames.size() >= 2) {
                env.put(body.argNames.get(1), idx);
            }

            env.parentEnv = _env;
        } else {
            if (body.argNames.size() >= 1) {
                name1 = body.argNames.head();
                old1 = env.bGet(name1);
                env.bPut(name1, v);
            }

            if (body.argNames.size() >= 2) {
                name2 = body.argNames.get(1);
                old2 = env.bGet(name2);
                env.bPut(name2, idx);
            }
        }

        SValue ret = ExecEnvironment.Null;

//        if (SConfig.strictForLoop) {

//        } else {
        for (int i = 0; i < body.body.size(); i++) {
            SExpression se = body.body.get(i);
            ret = se.evaluate(env);
        }
//        }

        if (!SConfig.strictForLoop) {
            if (old1 != null) {
                env.bPut(name1, old1);
            }

            if (old2 != null) {
                env.bPut(name2, old2);
            }
        }

        return ret;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue _body;
        SClosure body;

        if (this.cachedClosure != null) {
            body = this.cachedClosure;
//            body.outerEnv = env;
        } else {
            _body = this.body.evaluate(env);
            if (!(_body instanceof SClosure)) {
                throw new EgException(2017, "invalid loop body", atom);
            }

            if (this.body instanceof PLambda) {
                this.cachedClosure = (SClosure) _body;
            }

            body = ((SClosure) _body);
        }

        SValue _list = this.list.evaluate(env);

        if (_list instanceof SDict) {
            HashMap<String, SValue> m = ((SDict) _list).get();
            String[] keys = m.keySet().toArray(new String[m.size()]);

            for (int i = 0; i < keys.length; i++) {
                if (Utils.checkExit(execLoop(body, env, new SString(keys[i]), m.get(keys[i])))) {
                    break;
                }
            }
        } else if (_list instanceof SList) {
            ListEx<SExpression> values = ((SList) _list).get();

            if (direction == ASC) {
                for (int i = 0; i < values.size(); i++) {
                    if (Utils.checkExit(execLoop(body, env, values.get(i).evaluate(env), new SInt(i)))) {
                        break;
                    }
                }
            } else {
                for (int i = values.size() - 1; i >= 0; i--) {
                    if (Utils.checkExit(execLoop(body, env, values.get(i).evaluate(env), new SInt(i)))) {
                        break;
                    }
                }
            }
        } else if (_list instanceof SBool) {
            long i = 0;
            while (Utils.isBooleanTrue(this.list.evaluate(env))) {
                if (Utils.checkExit(execLoop(body, env, ExecEnvironment.Null, new SLong(i++)))) {
                    break;
                }
            }
        } else if (_list instanceof SRange) {
            SRange r = (SRange) _list;
            int i = r.start;
            while (i != r.end) {
                SValue ret = execLoop(body, env, new SInt(i), new SInt(i));
                if (Utils.checkExit(ret)) {
                    break;
                }
                i += r.interval;
            }
        } else {
            throw new EgException(2018, "invalid loop condition", atom);
        }

        return ExecEnvironment.Null;
    }

    @Override
    public SExpression deepClone() throws EgException {
        PFor ret = new PFor();
        ret.atom = this.atom;
        ret.list = this.list.deepClone();
        ret.body = this.body.deepClone();
        ret.direction = this.direction;

        if (this.cachedClosure != null) {
            ret.cachedClosure = ((SClosure) this.cachedClosure.clone());
        }

        return ret;
    }
}
