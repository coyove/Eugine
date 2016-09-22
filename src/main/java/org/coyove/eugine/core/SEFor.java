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

    public SEFor(Atom ha, Compound c) throws VMException {
        super(ha, c, 2);

        list = SExpression.cast(c.atoms.pop());
        body = SExpression.cast(c.atoms.pop());
    }

    private SValue execLoop(SClosure body, SValue v, int idx) throws VMException {
        ExecEnvironment newEnv = new ExecEnvironment();
        if (body.arguments.size() >= 1)
            newEnv.put(body.arguments.head(), v);

        if (body.arguments.size() == 2)
            newEnv.put(body.arguments.get(1), new SInteger((long) idx));

        newEnv.parentEnv = body.innerEnv;
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

            if (values.size() == 0) {
                whileLoop = true;
                condAlwaysTrue = true;
            }
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
            for (int i = 0; i < values.size(); i++) {
                SValue ret = execLoop(body, values.get(i), i);
                if (ret.underlying instanceof Boolean && !(Boolean) ret.underlying)
                    break;
            }
        }

        return new SNull();
    }
}
