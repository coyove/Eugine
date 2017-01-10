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

    public ListEx<String> argNames;

    public ListEx<Boolean> passByValue;

    public String description;

    public boolean inline = false;

    public boolean coroutine = false;

    public boolean struct = false;

    public boolean operator = false;

    public PLambda() {
    }

    public PLambda(Atom ha, ListEx<String> args, ListEx<Boolean> pass, ListEx<SExpression> b) {
        this(ha, args, pass, b, "");
    }

    public PLambda(Atom ha, ListEx<String> args, ListEx<Boolean> pass, ListEx<SExpression> b, String d) {
        atom = ha;
        argNames = args;
        body = b;
        passByValue = pass;
        description = d;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) {
        SClosure cls = new SClosure(env, argNames, passByValue, body, description);
        cls.atom = this.atom;
        cls.immutable = true;
        cls.doc = description;
        cls.type |= inline ? SClosure.INLINE : 0;
        cls.type |= coroutine? SClosure.COROUTINE : 0;
        cls.type |= struct ? SClosure.STRUCT : 0;
        cls.type |= operator ? SClosure.OPERATOR : 0;
        return cls;
    }

    @Override
    public SExpression deepClone() {
        PLambda ret = new PLambda();
        ret.atom = this.atom;

        ret.body = ListEx.deepClone(this.body);
        ret.argNames = this.argNames;
        ret.inline = this.inline;
        ret.struct = this.struct;
        ret.coroutine = this.coroutine;
        ret.operator = this.operator;
        ret.passByValue = this.passByValue;
        ret.description = this.description;

        return ret;
    }
}
