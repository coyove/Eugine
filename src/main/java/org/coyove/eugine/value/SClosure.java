package org.coyove.eugine.value;

import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SClosure extends SValue {
    public ExecEnvironment outterEnv;
    public List<String> arguments;
    public int argCount;
    public List<SExpression> body;
    public ExecEnvironment extra;
    public SClosure proto;
    public boolean transparent = false;

    public SClosure(ExecEnvironment env, List<String> args, List<SExpression> b) {
        super(b);
        outterEnv = env;
        arguments = args;
        argCount = args.size();
        body = b;
        extra = new ExecEnvironment();
    }

    public SClosure(ExecEnvironment env, List<String> args, List<SExpression> b, String description) {
        this(env, args, b);
        extra.put("~doc", new SString(description));
    }

    public SClosure(ExecEnvironment env, final SExpression single) {
        this(env, new List<String>(), new List<SExpression>(){{ add(single);}});
        transparent = true;
    }

    public SClosure(ExecEnvironment env, List<SExpression> multi) {
        this(env, new List<String>(), multi);
        transparent = true;
    }

    @Override
    public SValue clone() {
        SClosure ret = new SClosure(outterEnv, arguments, body);

        ret.extra.parentEnv = this.extra;
        ret.proto = this;

        SValue.copyAttributes(ret, this);
        return ret;
    }

    public SValue clone_() {
        SClosure ret = new SClosure(outterEnv, arguments, body);

        ret.extra = this.extra.clone();
        ret.transparent = this.transparent;

        SValue.copyAttributes(ret, this);
        return ret;
    }
}
