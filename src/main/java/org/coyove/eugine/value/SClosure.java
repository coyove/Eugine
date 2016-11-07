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
    public int argCount;
    public List<SExpression> body;
    public ExecEnvironment extra;
    public SClosure proto;
    public boolean transparent = false;

    public SClosure(ExecEnvironment env, List<String> args, List<SExpression> b) {
        super(b);
        outerEnv = env;
        arguments = args;
        argCount = args.size();
        body = b;
        extra = new ExecEnvironment();
    }

    public SClosure(ExecEnvironment env, List<String> args, List<SExpression> b, String description) {
        this(env, args, b);
        extra.put("__doc__", new SString(description));
    }

    public SClosure(ExecEnvironment env, SExpression single) {
        List<SExpression> body_ = new List<SExpression>();
        body_.add(single);

        outerEnv = env;
        arguments = new List<String>();
        argCount = 0;
        body = body_;
        extra = new ExecEnvironment();
        transparent = true;
    }

    public SClosure(ExecEnvironment env, List<SExpression> multi) {
        this(env, new List<String>(), multi);
        transparent = true;
    }

    // This clone() is invoked by "(clone ...)"
    @Override
    public SValue clone() {
        try {
            SClosure ret = new SClosure(outerEnv, arguments, List.deepClone(body));

            ret.extra = this.extra.clone();
            ret.proto = this.proto;
            ret.transparent = this.transparent;

            SValue.copyAttributes(ret, this);
            return ret;
        } catch (VMException ex) {
            // this shouldn't happen
            ex.printStackTrace();
            return this;
        }
    }

    public SValue getCopy() throws VMException {
        SClosure ret = new SClosure(outerEnv, arguments, List.deepClone(body));

        ret.extra.parentEnv = this.extra;
        ret.transparent = this.transparent;
        ret.proto = this;

        SValue.copyAttributes(ret, this);
        return ret;
    }

    @Override
    public String toString() {
        return "(" + StringUtils.join(arguments.toArray(), ",") + ") => { " +
                body.size() + " }";
    }
}
