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

    public static ListEx<String> CompoundToArguments(Compound c, Atom pos) throws VMException {
        ListEx<String> ret = new ListEx<String>();

        for (int i = 0; i < c.atoms.size(); i++) {
            Base a = c.atoms.get(i);

            if (a instanceof Compound || ((Atom) a).token.type != Token.TokenType.ATOMIC)
                throw new VMException(2039, "invalid argument name", pos);

            String name = ((Atom) a).token.value.toString();
            if (i != c.atoms.size() - 1 && name.length() > 3 && name.substring(name.length() - 3).equals("..."))
                throw new VMException(2040, "vararg must be at the end of the declaration", pos);

            ret.add(name);
        }

        return ret;
    }

    public PLambda() {
    }

    public PLambda(Atom ha, ListEx<String> args, ListEx<Boolean> pass, ListEx<SExpression> b) {
        this(ha, args, pass, b, "");
    }

    public PLambda(Atom ha, ListEx<String> args, ListEx<Boolean> pass, ListEx<SExpression> b, String d) {
        headAtom = ha;
        arguments = args;
        body = b;
        passByValue = pass;
        description = d;
    }

    public PLambda(Atom ha, Compound c) throws VMException {
        super(ha, c, 2);

        if (c.atoms.head() instanceof Atom)
            throw new VMException(2038, "invalid lambda declaration", ha);

        arguments = PLambda.CompoundToArguments((Compound) c.atoms.pop(), ha);
        body = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) {
        SClosure cls = new SClosure(env, arguments, passByValue, body, description);
        cls.immutable = true;
        return cls;
    }

    @Override
    public SExpression deepClone() throws VMException {
        PLambda ret = new PLambda();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.body = ListEx.deepClone(this.body);
        ret.arguments = this.arguments;
        ret.passByValue = this.passByValue;
        ret.description = this.description;

        return ret;
    }
}
