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
    private SExpression list;
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

    private SValue execLoop(SClosure body, SValue v, Long idx) throws EgException {
        ExecEnvironment newEnv = new ExecEnvironment();
        if (body.arguments.size() >= 1)
            newEnv.put(body.arguments.head(), v);

        if (body.arguments.size() == 2)
            newEnv.put(body.arguments.get(1), new SInteger(idx));

        newEnv.parentEnv = body.outerEnv;
        SValue ret = new SNull();

        for (SExpression se : body.body) {
            ret = se.evaluate(newEnv);
        }

        return ret;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SClosure body = Utils.cast(this.body.evaluate(env), SClosure.class,
                new EgException(2017, "invalid loop body", atom));

        SValue list_ = this.list.evaluate(env);

        if (list_ instanceof SDict) {
            HashMap<String, SExpression> m = ((SDict) list_).get();
            long i = 0;

            for (String s : m.keySet()) {
                SValue ret = execLoop(body, new SString(s), i++);
                if (ret.underlying instanceof Boolean && !(Boolean) ret.underlying)
                    break;
            }
        } else if (list_ instanceof SList) {
            ListEx<SExpression> values = ((SList) list_).get();

            if (direction == DIRECTION.ASC) {
                for (int i = 0; i < values.size(); i++) {
                    SValue ret = execLoop(body, values.get(i).evaluate(env), (long) i);
                    if (ret.underlying instanceof Boolean && !(Boolean) ret.underlying)
                        break;
                }
            } else {
                for (int i = values.size() - 1; i >= 0; i--) {
                    SValue ret = execLoop(body, values.get(i).evaluate(env), (long) i);
                    if (ret.underlying instanceof Boolean && !(Boolean) ret.underlying)
                        break;
                }
            }
        } else if (list_ instanceof SBool) {
            Long i = (long) 0;
            while (this.list.evaluate(env).<Boolean>get()) {
                SValue ret = execLoop(body, new SNull(), i++);
                if (ret.underlying instanceof Boolean && !(Boolean) ret.underlying)
                    break;
            }
        } else if (list_ instanceof SRange) {
            SRange r = (SRange) list_;
            Long i = r.start;

            while (i < r.end) {
                SValue ret = execLoop(body, new SInteger(i), i);
                i += r.interval;
                if (ret.underlying instanceof Boolean && !(Boolean) ret.underlying)
                    break;
            }
        } else {
            throw new EgException(2018, "invalid loop condition", atom);
        }

        return new SNull();
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
