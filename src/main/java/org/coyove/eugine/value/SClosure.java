package org.coyove.eugine.value;

import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.core.flow.PCall;
import org.coyove.eugine.core.flow.PChain;
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

    // Used by TCO
    public boolean isTransparent = false;

    public boolean isInline = false;

    public boolean isCoroutine = false;

    public boolean isStruct = false;

//    public final static byte TRANSPARENT = 1;
//    public final static byte INLINE = 2;
//    public final static byte COROUTINE = 4;
//    public final static byte STRUCT = 8;

    public volatile byte coroutineState = SUSPENDED;
    public final static byte SUSPENDED = 0;
    public final static byte RUNNING = 1;
    public final static byte DEAD = 2;

    public PChain dummyCoroutine = null;

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
        isTransparent = true;
    }

    public SClosure(ExecEnvironment env, ListEx<SExpression> multi) {
        this(env, new ListEx<String>(), new ListEx<Boolean>(), multi);
        isTransparent = true;
    }

    @Override
    public SValue clone() {
        try {
            SClosure ret = new SClosure(outerEnv, argNames, passByValue, ListEx.deepClone(body));

            ret.extra = this.extra.clone();
            ret.proto = this.proto;

            ret.doc = this.doc;
            ret.isCoroutine = this.isCoroutine;
            ret.isInline = this.isInline;
            ret.isStruct = this.isStruct;
            ret.isTransparent = this.isTransparent;

            SValue.copyAttributes(ret, this);
            return ret;
        } catch (EgException ex) {
            // Never happen
            ErrorHandler.print(ex);
            return this;
        }
    }

    public SClosure getCopy() throws EgException {
        SClosure ret = new SClosure(outerEnv, argNames, passByValue, ListEx.deepClone(body));

        ret.extra.parentEnv = this.extra;
        ret.proto = this;

        ret.isTransparent = this.isTransparent;
        ret.doc = this.doc;
        ret.isCoroutine = this.isCoroutine;
        ret.isInline = this.isInline;
        ret.isStruct = this.isStruct;

        SValue.copyAttributes(ret, this);
        return ret;
    }

    @Override
    public String toString() {
        SValue ts = this.extra.get("__to_string__");
        if (ts instanceof SClosure) {
            try {
                SValue ret = (new PCall(atom, ts, new ListEx<SExpression>())).evaluate(outerEnv);
                return ret.toString();
            } catch (EgException e) {
                ErrorHandler.print(e);
                return null;
            }
        } else {
            return "Closure = (" + StringUtils.join(argNames.toArray(), ",") + ") => {" +
                    body.size() + "}";
        }
    }
}
