package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEGet extends SExpression {
    private SExpression dict;
    private List<SExpression> keys;

    public SEGet(Atom ha, Compound c) throws VMException {
        super(ha, c);
        if (c.atoms.size() < 1)
            throw new VMException(2036, "needs the subject to get from", ha);

        if (c.atoms.size() < 2)
            throw new VMException(2036, "needs the key (or index) to get", ha);

        dict = SExpression.cast(c.atoms.pop());
        keys = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue dict = this.dict.evaluate(env);
        List<SValue> keys = SExpression.eval(this.keys, env);

        for (SExpression sk : keys) {
            if (dict instanceof SDict) {
                SString key = Utils.cast(sk, SString.class,
                        new VMException(2029, "the key in the dict must be a string", headAtom));

                HashMap<String, SValue> d = dict.get();
                String k = key.get();

                if (!d.containsKey(k))
                    d.put(k, new SNull());

                SValue dk = d.get(k);
                dk.refer = Utils.cast(dict, SDict.class);
                dk.refKey = k;

                dict = dk;
            } else if (dict instanceof SList) {
                SInteger index = Utils.cast(sk, SInteger.class,
                        new VMException(2030, "the index in the list must be an integer", headAtom));

                List<SValue> l = dict.get();
                Long idx = index.get();

                if (idx >= l.size() || idx < 0)
                    throw new VMException(2031, "index out of range", headAtom);

                SValue li = l.get(idx.intValue());

                li.refer = Utils.cast(dict, SList.class);
                li.refIndex = idx.intValue();

                dict = li;
            } else if (dict instanceof SString) {
                SInteger index = Utils.cast(sk, SInteger.class,
                        new VMException(2032, "the index of the string must be an integer", headAtom));

                String str = dict.get();
                Long idx = index.get();

                if (idx >= str.length())
                    throw new VMException(2033, "index out of range", headAtom);

                return new SString(String.valueOf(str.charAt(idx.intValue())));

            } else if (dict instanceof SClosure) {
                SString key = Utils.cast(sk, SString.class,
                        new VMException(2034, "the field of the closure must be a string", headAtom));

                String k = key.get();
                SValue ret = ((SClosure) dict).extra.containsKey(k) ?
                        ((SClosure) dict).extra.get(k) : new SNull();

                ret.refer = dict;
                ret.refKey = k;

                dict = ret;
            } else if (dict instanceof SObject) {
                SString fn = Utils.cast(sk, SString.class,
                        new VMException(2035, "the field of the object must be a string", headAtom));

                String field = fn.get();
                try {
                    Object obj = dict.get();

                    SValue n = InteropHelper.getField(obj, field);
                    n.refer = dict;
                    n.refKey = field;

                    dict = n;
                } catch (Exception e) {
                    throw new VMException(e.getMessage(), headAtom);
                }
            }
        }

        return dict;
    }
}