package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by zezhong on 2016/9/9.
 */
public class PSet extends SExpression {
    @ReplaceableVariable
    private SExpression varName;

    private boolean directName;

    @ReplaceableVariable
    private SExpression varValue;

    private ACTION action;

    private DECLARE declare;

    public enum ACTION {IMMUTABLE, MUTABLE}

    public enum DECLARE {DECLARE, SET}

    public PSet() {
    }

    public PSet(Atom ha, SExpression name, SExpression value, DECLARE d, ACTION a) {
        atom = ha;
        varName = name;
        varValue = value;

        directName = name instanceof SString;
        action = a;
        declare = d;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue n = varName.evaluate(env);
        SValue v = varValue.evaluate(env);
        SValue ret = v;

        if (action == ACTION.MUTABLE && v.immutable) {
            /**
             * (const b ...) (set a b)
             * b is immutable, a should be mutable
             * note that "clone" is shallow copy
             */
            ret = v.clone();
            ret.immutable = false;
        }

        if (action == ACTION.IMMUTABLE) {
            ret.immutable = true;
        }

        if (directName) {
            String sn = n.get();

            if (declare == DECLARE.SET) {
                if (!env.containsKey(sn) && env.strict)
                    throw new EgException(2042, "strict mode", atom);

                if (env.containsKey(sn) && env.get(sn).immutable)
                    throw new EgException(2043, "variable '" + sn + "' is immutable", atom);

                env.put(sn, ret);
            } else if (declare == DECLARE.DECLARE) {
                // TODO
                env.bPut(sn, ret);
            }
        } else {
            Object refer = n.refer;
            if (refer != null && refer instanceof SValue &&
                    ((SValue) refer).immutable && !(refer instanceof SClosure)) {
                throw new EgException(2044, "referred variable is immutable", atom);
            }

            if (refer instanceof String) {
                env.put(refer.toString(), ret);
            } else if (refer instanceof SDict) {
                ((SDict) refer).<HashMap<String, SValue>>get().put(n.refKey, ret);
            } else if (refer instanceof SList) {
                ((SList) refer).<ListEx<SValue>>get().set(n.refIndex, ret);
            } else if (refer instanceof SObject) {
                Object sub = ((SObject) refer).get();
                InteropHelper.setField(sub, n.refKey, ret);
            } else if (refer instanceof SClosure) {
                if (declare == DECLARE.DECLARE) {
                    ((SClosure) refer).extra.bPut(n.refKey, ret);
                } else {
                    ((SClosure) refer).extra.put(n.refKey, ret);
                }
            } else {
                throw new EgException(2045, "failed to set, invalid referred object: " + refer, atom);
            }
        }

        return ret;
    }

    @Override
    public SExpression deepClone() throws EgException {
        PSet ret = new PSet();
        ret.atom = this.atom;

        ret.varName = this.varName.deepClone();
        ret.varValue = this.varValue.deepClone();

        ret.directName = this.directName;
        ret.action = this.action;
        ret.declare = this.declare;

        return ret;
    }
}
