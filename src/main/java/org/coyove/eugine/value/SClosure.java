package org.coyove.eugine.value;

import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SClosure extends SValue {
    public ExecEnvironment innerEnv;
    public List<String> arguments;
    public SExpression body;
    public ExecEnvironment extra;
    public SClosure proto;

    public SClosure(ExecEnvironment env, List<String> args, SExpression b) {
        super(b);
        innerEnv = env;
        arguments = args;
        body = b;
        extra = new ExecEnvironment();
    }

    public SClosure(ExecEnvironment env, List<String> args, SExpression b, String description) {
        this(env, args, b);
        extra.put("~doc", new SString(description));
    }

    @Override
    public SValue clone() {
        SClosure ret = new SClosure(innerEnv, arguments, body);

        ret.extra.parentEnv = this.extra;
        ret.proto = this;

        SValue.copyAttributes(ret, this);
        return ret;
    }
}
