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
    private List<SExpression> arguments;
    private String delim;

    public SEPrint() {
    }

    public SEPrint(Atom ha, List<SExpression> args, String d) {
        super(ha, args, 1);

        arguments = args;
        delim = d;
    }

    private String print(SValue re, ExecEnvironment env, int padding, boolean quote) throws VMException {
        String ret = "";
        if (re instanceof SList) {
            List<SExpression> lv = re.get();
            String[] values = new String[lv.size()];

            for (int i = 0; i < lv.size(); i++) {
                values[i] = print(lv.get(i).evaluate(env), env, padding, true);
            }

            ret += "[" + StringUtils.join(values, ", ") + "]";
        } else if (re instanceof SDict) {
            HashMap<String, SExpression> map = re.get();
            Set<String> keys = map.keySet();
            String[] values = new String[keys.size()];
            int i = 0;

            for (String key : keys) {
                values[i++] = String.format("%1$" + padding + "s\"%2$s\": %3$s,\n", " ", key,
                        print(map.get(key).evaluate(env), env, padding + 2, true));
            }

            ret += "{\n" + StringUtils.join(values, "") + StringUtils.leftPad("}", padding - 1);
        } else if (re instanceof SNull) {
            ret = "null";
        } else if (re instanceof SString) {
            if (quote) {
                ret = String.format("\"%1$s\"", StringEscapeUtils.escapeJava(re.underlying.toString()));
            } else {
                ret = String.format("%1$s", re.underlying.toString());
            }
        } else if (re instanceof SClosure) {
            ret = re.toString();
        } else {
            ret = String.format("%1$s", re.underlying.toString());
        }

        return ret;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue ret = new SNull();
        for (SValue v : SExpression.eval(arguments, env)) {
            ret = v;
            System.out.print(print(v, env, 2, false));
        }
        System.out.print(delim);

        return ret;
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEPrint ret = new SEPrint();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;

        ret.delim = this.delim;
        ret.arguments = List.deepClone(this.arguments);

        return ret;
    }
}
