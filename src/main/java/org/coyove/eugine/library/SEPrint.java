package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.lang.System;
import java.util.HashMap;

/**
 * Created by coyove on 2016/9/9.
 */
public class SEPrint extends SExpression {
    private List<SExpression> arguments;
    private String delim;

    public SEPrint(Atom ha, Compound c, String d) throws VMException {
        super(ha, c);
        delim = d;
        if (c.atoms.size() == 0)
            throw new VMException("it takes at least 1 argument", ha);

        arguments = SExpression.castPlain(c);
    }

    private String printSValue(SValue re, ExecEnvironment env, int padding) {
        String ret = "";
        if (re instanceof SList) {
            ret += "(list";
            for (SValue v : re.<List<SValue>>get())
                ret += (" ") + printSValue(v.evaluate(env), env, padding);

            ret += ")";
        } else if (re instanceof SDict) {
            ret += "(dict\n"; //String.format("dict (\n", " ");
            HashMap< String, SValue > map = re.get();

            for (String key : map.keySet()) {
                ret += String.format("%1$" + padding + "s %2$s=%3$s\n", " ", key,
                        printSValue(map.get(key).evaluate(env), env, padding + 2) );
            }
            ret += String.format("%1$" + padding + "s)", " ");
        } else if (re instanceof SNull) {
            ret = "null";
        } else {
            ret = String.format("%1$s", re.underlying.toString());
        }

        return ret;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue ret = new SBool(false);
        for (SValue v : SExpression.eval(arguments, env)) {
            ret = v;
            System.out.print(printSValue(v, env, 2));
        }
        System.out.print(delim);

        return ret;
    }
}
