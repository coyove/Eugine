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

    private DIRECTION direction;
    public enum DIRECTION {ASC, DESC}

    public PFor() {
    }

    public PFor(Atom ha, SExpression l, SExpression b, DIRECTION dir) {
        atom = ha;
        list = l;
        body = b;
        direction = dir;
    }

    private SValue execLoop(SClosure body, SValue v, SValue idx) throws EgException {
        ExecEnvironment env = body.outerEnv;
        SValue[] olds = new SValue[2];
        String name1 = "";
        String name2 = "";

        if (body.argNames.size() >= 1) {
            name1 = body.argNames.head();
            olds[0] = env.bGet(name1);
            env.bPut(name1, v);
        }

        if (body.argNames.size() >= 2) {
            name2 = body.argNames.get(1);
            olds[1] = env.bGet(name2);
            env.bPut(name2, idx);
        }

        SValue ret = new SNull();
        for (SExpression se : body.body) {
            ret = se.evaluate(env);
        }

        if (olds[0] != null) {
            env.bPut(name1, olds[0]);
        }

        if (olds[1] != null) {
            env.bPut(name2, olds[1]);
        }

        return ret;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue _body = this.body.evaluate(env);
        if (!(_body instanceof SClosure)) {
            throw new EgException(2017, "invalid loop body", atom);
        }

        SClosure body = ((SClosure) _body);
        SValue _list = this.list.evaluate(env);

        if (_list instanceof SDict) {
            HashMap<String, SValue> m = ((SDict) _list).get();

            for (String s : m.keySet()) {
                SValue ret = execLoop(body, new SString(s), m.get(s));
                if (ret.underlying instanceof Boolean && !(Boolean) ret.underlying)
                    break;
            }
        } else if (_list instanceof SList) {
            ListEx<SExpression> values = ((SList) _list).get();

            if (direction == DIRECTION.ASC) {
                for (int i = 0; i < values.size(); i++) {
                    SValue ret = execLoop(body, values.get(i).evaluate(env), new SInteger((long) i));
                    if (ret.underlying instanceof Boolean && !(Boolean) ret.underlying)
                        break;
                }
            } else {
                for (int i = values.size() - 1; i >= 0; i--) {
                    SValue ret = execLoop(body, values.get(i).evaluate(env), new SInteger((long) i));
                    if (ret.underlying instanceof Boolean && !(Boolean) ret.underlying)
                        break;
                }
            }
        } else if (_list instanceof SBool) {
            Long i = (long) 0;
            while (this.list.evaluate(env) == ExecEnvironment.True) {
                SValue ret = execLoop(body, new SNull(), new SInteger(i++));
                if (ret.underlying instanceof Boolean && !(Boolean) ret.underlying)
                    break;
            }
        } else if (_list instanceof SRange) {
            SRange r = (SRange) _list;
            Long i = r.start;

            while (i < r.end) {
                SValue ret = execLoop(body, new SInteger(i), new SInteger(i));
                i += r.interval;
                if (ret.underlying instanceof Boolean && !(Boolean) ret.underlying)
                    break;
            }
        } else {
            throw new EgException(2018, "invalid loop condition", atom);
        }

        return env.Null;
    }

    @Override
    public SExpression deepClone() throws EgException {
        PFor ret = new PFor();
        ret.atom = this.atom;
        ret.list = this.list.deepClone();
        ret.body = this.body.deepClone();
        ret.direction = this.direction;

        return ret;
    }
}
