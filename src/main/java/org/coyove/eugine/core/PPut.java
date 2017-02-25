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
        SValue subject = this.subject.evaluate(env);
        SValue key = this.key.evaluate(env);
        SValue value = this.value.evaluate(env);

        if (subject instanceof SString) {
            char c;
            if (value instanceof SString) {
                c = value.<String>get().charAt(0);
            } else {
                c = (char) EgCast.toInt(value, atom);
            }

            ((SString) subject).setCharAt(EgCast.toInt(key, atom), c);
        } else if (subject instanceof SDict) {
            String k;
            if (key instanceof SString || key instanceof SInt || key instanceof SLong) {
                k = key.asString();
            } else {
                throw new EgException(2019, "invalid key: " + key, atom);
            }
            subject.<HashMap<String, SValue>>get().put(k, value);
        } else if (subject instanceof SList) {
            subject.<ListEx<SValue>>get().set(EgCast.toInt(key, atom), value);
        } else if ((subject instanceof SObject || subject instanceof SMetaExpression) &&
                key instanceof SString) {
            Object sub = subject.underlying;
            EgInterop.setField(sub, key.<String>get(), value);
        } else if (subject instanceof SClosure) {
            if (key instanceof SString) {
                String k = key.get();
                ExecEnvironment extra = ((SClosure) subject).extra;
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
            throw new EgException(2045, "invalid object: " + subject + ", key: " + key, atom);
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
