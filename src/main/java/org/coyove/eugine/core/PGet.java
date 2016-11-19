package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/10.
 */
public class PGet extends SExpression {
    @ReplaceableVariable
    public SExpression sub;

    @ReplaceableVariable
    public SExpression key;

    public PGet() {}

    public PGet(Atom ha, SExpression d, SExpression k) {
        atom = ha;
        sub = d;
        key = k;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue dict = this.sub.evaluate(env);
        SValue sk = this.key.evaluate(env);

        if (dict instanceof SDict) {
            String k;
            if (sk instanceof SString || sk instanceof SInteger ||
                    sk instanceof SDouble || sk instanceof SBool) {
                k = sk.get();
            } else {
                throw new EgException(2019, "invalid key: " + sk, atom);
            }

            HashMap<String, SValue> d = dict.get();

            if (!d.containsKey(k)) {
                d.put(k, new SNull());
            }

            SValue dk = d.get(k).evaluate(env);
            dk.refer = Utils.cast(dict, SDict.class);
            dk.refKey = k;

            return dk;
        } else if (dict instanceof SList) {
            ListEx<SExpression> l = dict.get();
            Long idx = Utils.castLong(sk, atom);

            if (idx >= l.size() || idx < 0)
                throw new EgException(2021, "index out of range", atom);

            SValue li = l.get(idx.intValue()).evaluate(env);

            li.refer = Utils.cast(dict, SList.class);
            li.refIndex = idx.intValue();

            return li;
        } else if (dict instanceof SString) {
            String str = dict.get();
            Long idx = Utils.castLong(sk, atom);

            if (idx >= str.length()) {
                throw new EgException(2023, "index out of range", atom);
            }

            return new SString(String.valueOf(str.charAt(idx.intValue())));

        } else if (dict instanceof SClosure) {
            String k = Utils.castString(sk, atom);

            if (k.equals("__extra__")) {
                HashMap<String, SValue> ret = new HashMap<String, SValue>();
                for (String s : ((SClosure) dict).extra.keySet()) {
                    ret.put(s, ((SClosure) dict).extra.get(s));
                }

                return new SDict(ret);
            } else if (k.equals("__doc__")) {
                return new SString(((SClosure) dict).doc);
            } else {
                SValue ret = ((SClosure) dict).extra.containsKey(k) ?
                        ((SClosure) dict).extra.get(k) : new SNull();

                ret.refer = dict;
                ret.refKey = k;

                return ret;
            }
        } else if (dict instanceof SObject) {
            String field = Utils.castString(sk, atom);

            try {
                Object obj = dict.get();

                SValue n = InteropHelper.getField(obj, field);
                n.refer = dict;
                n.refKey = field;

                return n;
            } catch (EgException e) {
                throw e;
            }
        } else {
            throw new EgException(7029, "failed to get", atom);
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        PGet ret = new PGet();
        ret.atom = this.atom;

        ret.sub = this.sub.deepClone();
        ret.key = this.key.deepClone();

        return ret;
    }
}