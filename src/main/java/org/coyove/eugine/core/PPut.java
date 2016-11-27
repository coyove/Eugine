package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
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

    public enum DECLARE {DECLARE, SET}

    private DECLARE decl;

    public PPut() {
    }

    public PPut(Atom ha, SExpression s, SExpression k, SExpression v, DECLARE d) {
        atom = ha;
        subject = s;
        key = k;
        value = v;
        decl = d;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue refer = this.subject.evaluate(env);
        SValue key = this.key.evaluate(env);
        SValue value = this.value.evaluate(env);

        if (refer.immutable && !(refer instanceof SClosure)) {
            throw new EgException(2044, "subject is immutable", atom);
        }

        if (refer instanceof SDict) {
            String k;
            if (key instanceof SString || key instanceof SInt || key instanceof SLong) {
                k = key.asString();
            } else {
                throw new EgException(2019, "invalid key: " + key, atom);
            }
            refer.<HashMap<String, SValue>>get().put(k, value);
        } else if (refer instanceof SList) {
            refer.<ListEx<SValue>>get().set(Utils.castInt(key, atom), value);
        } else if (refer instanceof SObject && key instanceof SString) {
            Object sub = refer.get();
            InteropHelper.setField(sub, key.<String>get(), value);
        } else if (refer instanceof SClosure && key instanceof SString) {
            String k = key.get();
            if (decl == DECLARE.DECLARE) {
                ((SClosure) refer).extra.bPut(k, value);
                env.bPut(k, value);
            } else {
                ((SClosure) refer).extra.put(k, value);
                env.put(k, value);
            }
        } else {
            throw new EgException(2045, "invalid object: " + refer + ", key: " + key, atom);
        }

        return value;
    }

    @Override
    public SExpression deepClone() throws EgException {
        PPut ret = new PPut();
        ret.atom = this.atom;

        ret.subject = this.subject.deepClone();
        ret.key = this.key.deepClone();
        ret.value = this.value.deepClone();
        ret.decl = this.decl;

        return ret;
    }
}
