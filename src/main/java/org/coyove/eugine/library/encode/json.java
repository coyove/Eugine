package org.coyove.eugine.library.encode;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.base.NativeCallInterface;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.library.Exportable;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.EgCast;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;
import org.coyove.eugine.value.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by zezhong on 2017/2/27.
 */
public class json implements Exportable {
    private static String encode(SValue re) throws EgException {
        if (re instanceof SList) {
            ListEx<SValue> lv = re.get();
            String[] values = new String[lv.size()];

            for (int i = 0; i < lv.size(); i++) {
                values[i] = encode(lv.get(i));
            }

            return "[" + StringUtils.join(values, ",") + "]";
        } else if (re instanceof SDict) {
            HashMap<String, SValue> map = re.get();
            Set<String> keys = map.keySet();
            String[] values = new String[keys.size()];
            int i = 0;

            for (String key : keys) {
                values[i++] = "\"" + StringEscapeUtils.escapeJava(key) + "\":" + encode(map.get(key));
            }

            return "{" + StringUtils.join(values, ",") + "}";
        } else if (re instanceof SNull) {
            return "null";
        } else if (re instanceof SString) {
            return String.format("\"%1$s\"", StringEscapeUtils.escapeJava(re.<String>get()));
        } else if (re instanceof SBool) {
            return re.get().toString().toLowerCase();
        } else if (re instanceof SNumber) {
            return re.asString();
        } else {
            return String.format("\"%1$s\"", re.get().toString());
        }
    }

    private static SValue decode(Atom atom, Object root) throws EgException {
        if (root == JSONObject.NULL) {
            return ExecEnvironment.Null;
        } else if (root instanceof JSONObject) {
            HashMap<String, SValue> ret = new HashMap<String, SValue>();

            for (String s : ((JSONObject) root).keySet()) {
                ret.put(s, decode(atom, ((JSONObject) root).get(s)));
            }

            return new SDict(ret);
        } else if (root instanceof JSONArray) {
            ListEx<SValue> ret = new ListEx<SValue>(((JSONArray) root).length());
            for (Object o : ((JSONArray) root)) {
                ret.add(decode(atom, o));
            }
            return new SList(ret);
        } else if (root instanceof Integer) {
            return new SNumber((Integer) root);
        } else if (root instanceof Long) {
            return new SNumber((Long) root);
        } else if (root instanceof Double) {
            return new SNumber((Double) root);
        } else if (root instanceof String) {
            return new SString((String) root);
        } else if (root instanceof Boolean) {
            return ((Boolean) root) ? ExecEnvironment.True : ExecEnvironment.False;
        } else {
            throw new EgException(9001, "invalid json node: " + root, atom);
        }
    }

    public void export(ExecEnvironment env) {
        env.put("json", new SDict(){{
            put("encode", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    return new SString(encode(arguments.head()));
                }
            }, 1));

            put("decode", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    String json = EgCast.toString(arguments.head(), atom);
                    if (json.trim().charAt(0) == '[') {
                        return decode(atom, new JSONArray(json));
                    } else {
                        return decode(atom, new JSONObject(json));
                    }
                }
            }, 1));
        }});
    }
}
