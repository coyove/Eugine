package org.coyove.eugine.library.json;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/9.
 */
public class SEJsonDecoder extends SExpression {
    @ReplaceableVariable
    private SExpression subject;

    public SEJsonDecoder() {
    }

    public SEJsonDecoder(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);
        subject = args.head();
    }

    private SValue decode(Object root) throws EgException {
        if (root == JSONObject.NULL) {
            return ExecEnvironment.Null;
        } else if (root instanceof JSONObject) {
            HashMap<String, SValue> ret = new HashMap<String, SValue>();

            for (String s : ((JSONObject) root).keySet()) {
                ret.put(s, decode(((JSONObject) root).get(s)));
            }

            return new SDict(ret);
        } else if (root instanceof JSONArray) {
            ListEx<SValue> ret = new ListEx<SValue>(((JSONArray) root).length());
            for (Object o : ((JSONArray) root)) {
                ret.add(decode(o));
            }
            return new SList(ret);
        } else if (root instanceof Integer) {
            return new SInt((Integer) root);
        } else if (root instanceof Long) {
            return new SLong((Long) root);
        } else if (root instanceof Double) {
            return new SDouble((Double) root);
        } else if (root instanceof String) {
            return new SString((String) root);
        } else if (root instanceof Boolean) {
            return ((Boolean) root) ? ExecEnvironment.True : ExecEnvironment.False;
        } else {
            throw new EgException(8099, "invalid json node: " + root, atom);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        String json = EgCast.toString(subject.evaluate(env), atom);
        if (json.trim().charAt(0) == '[') {
            return decode(new JSONArray(json));
        } else {
            return decode(new JSONObject(json));
        }
    }

    @Override
    public SExpression deepClone() {
        SEJsonDecoder ret = new SEJsonDecoder();
        ret.atom = this.atom;
        ret.subject = this.subject.deepClone();
        return ret;
    }
}
