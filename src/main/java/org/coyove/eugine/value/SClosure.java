package org.coyove.eugine.value;

import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.*;

import java.math.BigDecimal;
import java.util.Collections;

/**
 * Created by coyove on 2016/9/9.
 */
public class SClosure extends SValue {
    public ExecEnvironment outerEnv;
    public List<String> arguments;
    public List<Boolean> passByValue;
    public List<SExpression> body;
    public ExecEnvironment extra;
    public SClosure proto;
    public boolean transparent = false;

    public SClosure(ExecEnvironment env, List<String> args, List<Boolean> pass, List<SExpression> b) {
        super(b);
        outerEnv = env;
        arguments = args;
        passByValue = pass;
        body = b;
        extra = new ExecEnvironment();
    }

    public SClosure(ExecEnvironment env, List<String> args, List<Boolean> pass,
                    List<SExpression> b, String description) {
        this(env, args, pass, b);
        extra.put("__doc__", new SString(description));
    }

    public SClosure(ExecEnvironment env, SExpression single) {
        outerEnv = env;
        arguments = new List<String>();
        passByValue = new List<Boolean>();

        body = new List<SExpression>();
        body.add(single);

        extra = new ExecEnvironment();
        transparent = true;
    }

    public SClosure(ExecEnvironment env, List<SExpression> multi) {
        this(env, new List<String>(), new List<Boolean>(), multi);
        transparent = true;
    }

    // This clone() is invoked by "(clone ...)"
    @Override
    public SValue clone() {
        try {
            SClosure ret = new SClosure(outerEnv, arguments, passByValue, List.deepClone(body));

            ret.extra = this.extra.clone();
            ret.proto = this.proto;
            ret.transparent = this.transparent;

            SValue.copyAttributes(ret, this);
            return ret;
        } catch (VMException ex) {
            ErrorHandler.print(ex);
            return this;
        }
    }

    public SValue getCopy() throws VMException {
        SClosure ret = new SClosure(outerEnv, arguments, passByValue, List.deepClone(body));

        ret.extra.parentEnv = this.extra;
        ret.transparent = this.transparent;
        ret.proto = this;

        SValue.copyAttributes(ret, this);
        return ret;
    }

    @Override
    public String toString() {
        return "(" + StringUtils.join(arguments.toArray(), ",") + ") => {" +
                body.size() + "}";
    }
}
