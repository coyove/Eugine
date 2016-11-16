package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class PLambda extends SExpression {
    private ListEx<SExpression> body;
    private ListEx<String> arguments;
    private ListEx<Boolean> passByValue;
    private String description;

    public PLambda() {
    }

    public PLambda(Atom ha, ListEx<String> args, ListEx<Boolean> pass, ListEx<SExpression> b) {
        this(ha, args, pass, b, "");
    }

    public PLambda(Atom ha, ListEx<String> args, ListEx<Boolean> pass, ListEx<SExpression> b, String d) {
        atom = ha;
        arguments = args;
        body = b;
        passByValue = pass;
        description = d;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) {
        SClosure cls = new SClosure(env, arguments, passByValue, body, description);
        cls.immutable = true;
        return cls;
    }

    @Override
    public SExpression deepClone() throws EgException {
        PLambda ret = new PLambda();
        ret.atom = this.atom;

        ret.body = ListEx.deepClone(this.body);
        ret.arguments = this.arguments;
        ret.passByValue = this.passByValue;
        ret.description = this.description;

        return ret;
    }
}
