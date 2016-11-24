package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class PLambda extends SExpression {
    @ReplaceableVariables
    public ListEx<SExpression> body;

    public ListEx<String> arguments;

    public ListEx<Boolean> passByValue;

    public String description;

    public boolean inline;

    public boolean coroutine;

    public PLambda() {
    }

    public PLambda(Atom ha, ListEx<String> args, ListEx<Boolean> pass, ListEx<SExpression> b) {
        this(ha, args, pass, b, "", false, false);
    }

    public PLambda(Atom ha, ListEx<String> args, ListEx<Boolean> pass, ListEx<SExpression> b,
                   String d, boolean i, boolean c) {
        atom = ha;
        arguments = args;
        body = b;
        passByValue = pass;
        description = d;
        inline = i;
        coroutine = c;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) {
        SClosure cls = new SClosure(env, arguments, passByValue, body, description);
        cls.immutable = true;
        cls.doc = description;
        cls.isInline = inline;
        cls.isCoroutine = coroutine;
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
