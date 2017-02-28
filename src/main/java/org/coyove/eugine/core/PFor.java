package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
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

    public PFor() {
    }

    public PFor(Atom ha, SExpression l, SExpression b) {
        atom = ha;
        list = l;
        body = b;
    }

    private SValue execLoop(SClosure body, ExecEnvironment _env, SValue v, SValue idx) throws EgException {
        boolean glass = (body.type & SClosure.GLASS) != 0;
        ExecEnvironment env = glass ? _env : new ExecEnvironment();
        SValue old1 = null;
        SValue old2 = null;
        String name1 = null;
        String name2 = null;

        if (!glass) {
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
        for (int i = 0; i < body.body.size(); i++) {
            SExpression se = body.body.get(i);
            ret = se.evaluate(env);

            if (ret == ExecEnvironment.Break) {
                break;
            }
        }

        if (glass) {
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
                throw EgException.INVALID_FUNCTION.raise(atom, "for loop body");
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

            for (int i = 0; i < values.size(); i++) {
                SValue idx = body.argNames.size() > 1 ? new SNumber(i) : ExecEnvironment.Null;

                if (Utils.checkExit(execLoop(body, env, values.get(i).evaluate(env), idx))) {
                    break;
                }
            }
        } else if (_list instanceof SBool) {
            double i = 0;
            while (Utils.isBooleanTrue(this.list.evaluate(env))) {
                SValue idx = body.argNames.size() > 1 ? new SNumber(i++) : ExecEnvironment.Null;

                if (Utils.checkExit(execLoop(body, env, ExecEnvironment.Null, idx))) {
                    break;
                }
            }
        } else if (_list instanceof SRange) {
            SRange r = (SRange) _list;
            double i = r.start;
            while (i != r.end) {
                SValue idx = new SNumber(i);
                SValue ret = execLoop(body, env, idx, idx);
                if (Utils.checkExit(ret)) {
                    break;
                }
                i += r.interval;
            }
        } else {
            throw EgException.INVALID_FUNCTION.raise(atom, "for loop exit condition");
        }

        return ExecEnvironment.Null;
    }

    @Override
    public SExpression deepClone() {
        PFor ret = new PFor();
        ret.atom = this.atom;
        ret.list = this.list.deepClone();
        ret.body = this.body.deepClone();

        if (this.cachedClosure != null) {
            ret.cachedClosure = ((SClosure) this.cachedClosure.clone());
        }

        return ret;
    }
}
