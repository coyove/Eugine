package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/10.
 */
public class PForStrict extends SExpression {
    @ReplaceableVariable
    private SExpression list;

    @ReplaceableVariable
    private SExpression body;

    private PFor.DIRECTION direction;

    public PForStrict() {
    }

    public PForStrict(Atom ha, SExpression l, SExpression b, PFor.DIRECTION dir) {
        atom = ha;
        list = l;
        body = b;
        direction = dir;
    }

    private SValue execLoop(SClosure body, SValue v, SValue idx) throws EgException {
        ExecEnvironment env = new ExecEnvironment();

        if (body.argNames.size() >= 1) {
            env.put(body.argNames.head(), v);
        }

        if (body.argNames.size() >= 2) {
            env.put(body.argNames.get(1), idx);
        }

        env.parentEnv = body.outerEnv;
        SValue ret = new SNull();
        for (SExpression se : body.body) {
            ret = se.evaluate(env);
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
                if (execLoop(body, new SString(s), m.get(s)) == ExecEnvironment.False) {
                    break;
                }
            }
        } else if (_list instanceof SList) {
            ListEx<SExpression> values = ((SList) _list).get();

            if (direction == PFor.DIRECTION.ASC) {
                for (int i = 0; i < values.size(); i++) {
                    if (execLoop(body, values.get(i).evaluate(env), new SInteger(i)) ==
                            ExecEnvironment.False) {
                        break;
                    }
                }
            } else {
                for (int i = values.size() - 1; i >= 0; i--) {
                    if (execLoop(body, values.get(i).evaluate(env), new SInteger(i)) ==
                            ExecEnvironment.False) {
                        break;
                    }
                }
            }
        } else if (_list instanceof SBool) {
            long i = 0;
            while (this.list.evaluate(env) == ExecEnvironment.True) {
                if (execLoop(body, ExecEnvironment.Null, new SInteger(i++)) == ExecEnvironment.False) {
                    break;
                }
            }
        } else if (_list instanceof SRange) {
            SRange r = (SRange) _list;
            long i = r.start;

            while (i < r.end) {
                SValue ret = execLoop(body, new SInteger(i), new SInteger(i));
                i += r.interval;
                if (ret == ExecEnvironment.False) {
                    break;
                }
            }
        } else {
            throw new EgException(2018, "invalid loop condition", atom);
        }

        return ExecEnvironment.Null;
    }

    @Override
    public SExpression deepClone() throws EgException {
        PForStrict ret = new PForStrict();
        ret.atom = this.atom;
        ret.list = this.list.deepClone();
        ret.body = this.body.deepClone();
        ret.direction = this.direction;

        return ret;
    }
}
