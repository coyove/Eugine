package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.core.flow.PCall;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/10.
 */
public class PGet extends SExpression {
    @ReplaceableVariable
    public SExpression subject;

    @ReplaceableVariable
    public SExpression key;

    public PGet() {}

    public PGet(Atom ha, SExpression d, SExpression k) {
        atom = ha;
        subject = d;
        key = k;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue dict = this.subject.evaluate(env);
        SValue sk = this.key.evaluate(env);

        if (dict instanceof SDict) {
            String k;
            if (sk instanceof SString || sk instanceof SInt || sk instanceof SLong) {
                k = sk.asString();
            } else {
                throw new EgException(2019, "invalid key: " + sk, atom);
            }

            HashMap<String, SValue> d = dict.get();
            SValue dk = d.get(k);
            if (dk == null) {
                d.put(k, ExecEnvironment.Null);
                dk = new SNull();
            }

            return dk;
        } else if (dict instanceof SList) {
            ListEx<SValue> l = dict.get();
            int idx = EgCast.toInt(sk, atom);

            if (idx >= l.size() || idx < 0) {
                throw new EgException(2021, "index out of range", atom);
            }

            return l.get(idx);
        } else if (dict instanceof SString) {
            String str = dict.get();
            int idx = EgCast.toInt(sk, atom);

            if (idx >= str.length()) {
                throw new EgException(2023, "index out of range", atom);
            }

            return new SString(String.valueOf(str.charAt(idx)));

        } else if (dict instanceof SClosure) {
            String k = EgCast.toString(sk, atom);

            if (k.equals("__extra__")) {
                HashMap<String, SValue> ret = new HashMap<String, SValue>();
                for (String s : ((SClosure) dict).extra.keySet()) {
                    ret.put(s, ((SClosure) dict).extra.get(s));
                }

                return new SDict(ret);
            } else if (k.equals("__doc__")) {
                return new SString(((SClosure) dict).doc);
            } else {
                SValue ret = ((SClosure) dict).extra.get(k);
                if (ret == null) {
                    SValue getter = ((SClosure) dict).extra.get("__get__" + k);
                    if (getter == null) {
                        ret = new SNull();
                    } else if (getter instanceof SClosure) {
                        ret = PCall.evaluateClosure(atom, ((SClosure) getter), new ListEx<SValue>(), env);
                    } else {
                        throw new EgException(8456, "invalid getter", atom);
                    }
                } else {
                    ret = Utils.denormalize(ret);
                }

                return ret;
            }
        } else if (dict.underlying instanceof byte[]) {
            byte[] buf = ((byte[]) dict.underlying);
            return new SInt(buf[EgCast.toInt(sk, atom)]);
        } else if (dict instanceof SObject || dict instanceof SMetaExpression) {
            String field = EgCast.toString(sk, atom);

            try {
                Object obj = dict.get();
                return EgInterop.getField(obj, field);
            } catch (EgException e) {
                throw e;
            }
        } else {
            throw new EgException(7029, "failed to get", atom);
        }
    }

    @Override
    public SExpression deepClone() {
        PGet ret = new PGet();
        ret.atom = this.atom;

        ret.subject = this.subject.deepClone();
        ret.key = this.key.deepClone();

        return ret;
    }
}