package org.coyove.eugine.library;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.lang.System;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by coyove on 2016/9/9.
 */
public class SEPrint extends SExpression {
    @ReplaceableVariables
    private ListEx<SExpression> arguments;

    private String delim;

    public SEPrint() {
    }

    public SEPrint(Atom ha, ListEx<SExpression> args, String d) {
        super(ha, args, 1);

        arguments = args;
        delim = d;
    }

    public static String format(SValue re, int padding, boolean quote) throws EgException {
        String ret = "";
        if (re instanceof SList) {
            ListEx<SValue> lv = re.get();
            String[] values = new String[lv.size()];

            for (int i = 0; i < lv.size(); i++) {
                values[i] = format(lv.get(i), padding, true);
            }

            ret += "[" + StringUtils.join(values, ", ") + "]";
        } else if (re instanceof SDict) {
            HashMap<String, SValue> map = re.get();
            Set<String> keys = map.keySet();
            String[] values = new String[keys.size()];
            int i = 0;

            for (String key : keys) {
                values[i++] = String.format("%1$" + padding + "s\"%2$s\": %3$s,\n", " ", key,
                        format(map.get(key), padding + 2, true));
            }

            ret += "{\n" + StringUtils.join(values, "") + StringUtils.leftPad("}", padding - 1);
        } else if (re instanceof SString) {
            if (quote) {
                ret = String.format("\"%1$s\"", StringEscapeUtils.escapeJava(re.<String>get()));
            } else {
                ret = String.format("%1$s", re.get());
            }
        } else {
            ret = re.asString();
        }

        return ret;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue ret = ExecEnvironment.Null;
        for (SValue v : SExpression.eval(arguments, env, atom)) {
            ret = v;
            System.out.print(format(v, 2, false));
        }
        System.out.print(delim);

        return ret;
    }

    @Override
    public SExpression deepClone() {
        SEPrint ret = new SEPrint();
        ret.atom = this.atom;
        ret.delim = this.delim;
        ret.arguments = ListEx.deepClone(this.arguments);
        return ret;
    }
}
