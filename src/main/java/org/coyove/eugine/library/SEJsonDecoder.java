package org.coyove.eugine.library;

import com.google.gson.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;
import java.util.Map;

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

    private SValue decode(JsonElement obj) {
        if (obj instanceof JsonObject) {
            HashMap<String, SValue> ret = new HashMap<String, SValue>();

            for (Map.Entry<String, JsonElement> elem : ((JsonObject) obj).entrySet()) {
                ret.put(elem.getKey(), decode(elem.getValue()));
            }

            return new SDict(ret);
        } else if (obj instanceof JsonArray) {
            ListEx<SValue> ret = new ListEx<SValue>(((JsonArray) obj).size());

            for (JsonElement elem : ((JsonArray) obj)) {
                ret.add(decode(elem));
            }

            return new SList(ret);
        } else if (obj instanceof JsonPrimitive) {
            JsonPrimitive p = ((JsonPrimitive) obj);
            if (p.isBoolean()) {
                return p.getAsBoolean() ? ExecEnvironment.True : ExecEnvironment.False;
            } else if (p.isString()) {
                return new SString(p.getAsString());
            } else if (p.isNumber()) {
                double num = p.getAsDouble();
                if (num % 1 == 0) {
                    return new SLong(p.getAsLong());
                } else {
                    return new SDouble(num);
                }
            } else {
                // never happen
                return null;
            }
        } else if (obj instanceof JsonNull) {
            return ExecEnvironment.Null;
        } else {
            // never happen
            return null;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        String json = Utils.cast(subject.evaluate(env), SString.class,
                new EgException(7032, "invalid json text", atom)).get();
        Gson g = new Gson();
        return decode(g.fromJson(json, JsonElement.class));
    }

    @Override
    public SExpression deepClone() throws EgException {
        SEJsonDecoder ret = new SEJsonDecoder();
        ret.atom = this.atom;

        ret.subject = this.subject.deepClone();
        return ret;
    }
}
