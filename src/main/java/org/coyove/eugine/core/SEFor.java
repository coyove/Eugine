package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEFor extends SExpression {
    private SExpression list;
    private SExpression body;

    private DIRECTION direction;

    public enum DIRECTION {ASC, DESC}

    public SEFor() {
    }

    public SEFor(Atom ha, Compound c, DIRECTION dir) throws VMException {
        super(ha, c, 2);

        list = SExpression.cast(c.atoms.pop());
        body = SExpression.cast(c.atoms.pop());
        direction = dir;
    }

    private SValue execLoop(SClosure body, SValue v, int idx) throws VMException {
        ExecEnvironment newEnv = new ExecEnvironment();
        if (body.arguments.size() >= 1)
            newEnv.put(body.arguments.head(), v);

        if (body.arguments.size() == 2)
            newEnv.put(body.arguments.get(1), new SInteger((long) idx));

        newEnv.parentEnv = body.outerEnv;
        SValue ret = new SNull();

        for (SExpression se : body.body) {
            ret = se.evaluate(newEnv);
        }

        return ret;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SClosure body = Utils.cast(this.body.evaluate(env), SClosure.class,
                new VMException(2017, "invalid loop body", headAtom));

        SValue list_ = this.list.evaluate(env);
        List<SValue> values = new List<SValue>();

        boolean whileLoop = false;
        boolean condAlwaysTrue = false;

        if (list_ instanceof SList) {
            values = ((SList) list_).get();
        } else if (list_ instanceof SBool) {
            whileLoop = true;
            condAlwaysTrue = false;
        } else {
            throw new VMException(2018, "invalid loop condition", headAtom);
        }

        if (whileLoop) {
            while (condAlwaysTrue || this.list.evaluate(env).<Boolean>get()) {
                SValue ret = execLoop(body, new SNull(), 0);
                if (ret.underlying instanceof Boolean && !(Boolean) ret.underlying)
                    break;
            }
        } else {
            if (direction == DIRECTION.ASC) {
                for (int i = 0; i < values.size(); i++) {
                    SValue ret = execLoop(body, values.get(i), i);
                    if (ret.underlying instanceof Boolean && !(Boolean) ret.underlying)
                        break;
                }
            } else {
                for (int i = values.size() - 1; i >= 0; i--) {
                    SValue ret = execLoop(body, values.get(i), i);
                    if (ret.underlying instanceof Boolean && !(Boolean) ret.underlying)
                        break;
                }
            }
        }

        return new SNull();
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEFor ret = new SEFor();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.list = this.list.deepClone();
        ret.body = this.body.deepClone();
        ret.direction = this.direction;

        return ret;
    }
}
