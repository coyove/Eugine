package org.coyove.eugine.library;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by coyove on 2016/9/9.
 */
public class SEJsonEncoder extends SExpression {
    @ReplaceableVariable
    private SExpression subject;

    public SEJsonEncoder() {
    }

    public SEJsonEncoder(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);
        subject = args.head();
    }

    private String encode(SValue re) throws EgException {
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
        } else if (re instanceof SLong) {
            return ((Long) ((SLong) re).val()).toString();
        } else if (re instanceof SInt) {
            return ((Integer) ((SInt) re).val()).toString();
        } else if (re instanceof SDouble) {
            return ((Double) ((SDouble) re).val()).toString();
        } else {
            return String.format("\"%1$s\"", re.underlying.toString());
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        return new SString(encode(this.subject.evaluate(env)));
    }

    @Override
    public SExpression deepClone() {
        SEJsonEncoder ret = new SEJsonEncoder();
        ret.atom = this.atom;

        ret.subject = this.subject.deepClone();
        return ret;
    }
}
