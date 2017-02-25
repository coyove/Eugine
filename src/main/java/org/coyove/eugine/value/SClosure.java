package org.coyove.eugine.value;

import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.base.SComplexValue;
import org.coyove.eugine.core.flow.PCall;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SClosure extends SComplexValue {
    public ExecEnvironment outerEnv;

    public ExecEnvironment precastEnv;

    public ListEx<String> argNames;

    public ListEx<Boolean> passByValue;

    public ListEx<SExpression> body;

    public ExecEnvironment extra;

    public SClosure proto;

    public String doc = "";

    public SValue refer = null;

    // Used by TCO
    public final static byte TRANSPARENT = 1;
    public final static byte INLINE = 2;
    public final static byte GLASS = 4;
    public final static byte STRUCT = 8;
    public final static byte OPERATOR = 16;

    public byte type;

    public static SClosure makeEmptyClosure(ExecEnvironment env) {
        return new SClosure(env, new ListEx<String>(), new ListEx<Boolean>(), new ListEx<SExpression>());
    }

    public SClosure() {

    }

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
        type |= TRANSPARENT;
    }

    public SClosure(ExecEnvironment env, ListEx<SExpression> multi) {
        this(env, new ListEx<String>(), new ListEx<Boolean>(), multi);
        type |= TRANSPARENT;
    }

    @Override
    public SValue clone() {
        SClosure ret = new SClosure(outerEnv, argNames, passByValue, ListEx.deepClone(body));

        ret.extra = this.extra.clone();
        ret.precastEnv = this.precastEnv;
        ret.proto = this.proto;
        ret.doc = this.doc;
        ret.type = this.type;
        ret.refer = this.refer;

        return ret;
    }

    @Override
    public SValue lightClone() {
        return this;
    }

    public SClosure getCopy() throws EgException {
        SClosure ret = new SClosure(outerEnv, argNames, passByValue, body);

        ret.extra.parentEnv = this.extra;
        ret.precastEnv = this.precastEnv;
        ret.proto = this;
        ret.doc = this.doc;
        ret.type = this.type;
        ret.refer = this.refer;

        return ret;
    }

    @Override
    @SuppressWarnings("unchecked")
    public String toString() {
        return "closure = (" + StringUtils.join(argNames.toArray(), ",") + ") => {" +
                body.size() + "}";
    }

    @Override
    @SuppressWarnings("unchecked")
    public String asString() {
        SValue ts = this.extra.get("__tostring__");
        if (ts instanceof SClosure) {
            try {
                SValue ret = PCall.evaluateClosure(atom, ((SClosure) ts), ListEx.build(this), outerEnv);
                return ret.asString();
            } catch (EgException e) {
                ErrorHandler.print(e);
                return null;
            }
        } else {
            return "";
        }
    }
}
