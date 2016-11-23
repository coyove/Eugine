package org.coyove.eugine.value;

import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SClosure extends SValue {
    public ExecEnvironment outerEnv;
    public ListEx<String> argNames;
    public ListEx<Boolean> passByValue;
    public ListEx<SExpression> body;
    public ExecEnvironment extra;
    public SClosure proto;
    public String doc = "";
    public boolean transparent = false;
    public boolean inline = false;

    public SClosure(ExecEnvironment env, ListEx<String> args, ListEx<Boolean> pass, ListEx<SExpression> b) {
        super(b);
        outerEnv = env;
        argNames = args;
        passByValue = pass;
        body = b;
        extra = new ExecEnvironment();
    }

    public SClosure(ExecEnvironment env, ListEx<String> args, ListEx<Boolean> pass,
                    ListEx<SExpression> b, String description) {
        this(env, args, pass, b);
        extra.put("__doc__", new SString(description));
    }

    public SClosure(ExecEnvironment env, SExpression single) {
        outerEnv = env;
        argNames = new ListEx<String>();
        passByValue = new ListEx<Boolean>();

        body = new ListEx<SExpression>();
        body.add(single);

        extra = new ExecEnvironment();
        transparent = true;
    }

    public SClosure(ExecEnvironment env, ListEx<SExpression> multi) {
        this(env, new ListEx<String>(), new ListEx<Boolean>(), multi);
        transparent = true;
    }

    @Override
    public SValue clone() {
        try {
            SClosure ret = new SClosure(outerEnv, argNames, passByValue, ListEx.deepClone(body));

            ret.extra = this.extra.clone();
            ret.proto = this.proto;
            ret.doc = this.doc;
            ret.transparent = this.transparent;

            SValue.copyAttributes(ret, this);
            return ret;
        } catch (EgException ex) {
            ErrorHandler.print(ex);
            return this;
        }
    }

    public SValue getCopy() throws EgException {
        SClosure ret = new SClosure(outerEnv, argNames, passByValue, ListEx.deepClone(body));

        ret.extra.parentEnv = this.extra;
        ret.transparent = this.transparent;
        ret.doc = this.doc;
        ret.proto = this;

        SValue.copyAttributes(ret, this);
        return ret;
    }

    @Override
    public String toString() {
        return "Closure = (" + StringUtils.join(argNames.toArray(), ",") + ") => {" +
                body.size() + "}";
    }
}
