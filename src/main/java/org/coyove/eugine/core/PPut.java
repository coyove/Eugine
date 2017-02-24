package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.core.flow.PCall;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by zezhong on 2016/9/9.
 */
public class PPut extends SExpression {
    @ReplaceableVariable
    private SExpression subject;

    @ReplaceableVariable
    private SExpression key;

    @ReplaceableVariable
    private SExpression value;

    public static final byte VAR = 0;
    public static final byte SET = 1;

    private byte decl;

    public PPut() {
    }

    public PPut(Atom ha, SExpression s, SExpression k, SExpression v, byte d) {
        atom = ha;
        subject = s;
        key = k;
        value = v;
        decl = d;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue refer = this.subject.evaluate(env);
        SValue key = this.key.evaluate(env);
        SValue value = this.value.evaluate(env);

        if (refer instanceof SDict) {
            String k;
            if (key instanceof SString || key instanceof SInt || key instanceof SLong) {
                k = key.asString();
            } else {
                throw new EgException(2019, "invalid key: " + key, atom);
            }
            refer.<HashMap<String, SValue>>get().put(k, value);
        } else if (refer instanceof SList) {
            refer.<ListEx<SValue>>get().set(EgCast.toInt(key, atom), value);
        } else if ((refer instanceof SObject || refer instanceof SMetaExpression) &&
                key instanceof SString) {
            Object sub = refer.underlying;
            EgInterop.setField(sub, key.<String>get(), value);
        } else if (refer instanceof SClosure) {
            if (key instanceof SString) {
                String k = key.get();
                ExecEnvironment extra = ((SClosure) refer).extra;
                if (decl == VAR) {
                    extra.bPut(k, value);
                    env.bPut(k, value);
                } else { // SET
                    SValue setter = extra.get("__set__" + k);
                    if (setter instanceof SClosure) {
                        return PCall.evaluateClosure(atom, ((SClosure) setter), ListEx.build(value), env);
                    } else {
                        extra.put(k, value);
                        env.put(k, value);
                    }
                }
            }
        } else {
            throw new EgException(2045, "invalid object: " + refer + ", key: " + key, atom);
        }

        return value;
    }

    @Override
    public SExpression deepClone() {
        PPut ret = new PPut();
        ret.atom = this.atom;

        ret.subject = this.subject.deepClone();
        ret.key = this.key.deepClone();
        ret.value = this.value.deepClone();
        ret.decl = this.decl;

        return ret;
    }
}
