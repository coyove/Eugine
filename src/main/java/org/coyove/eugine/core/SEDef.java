package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEDef extends SExpression {
    private String func;
    private String description;
    private List<SExpression> body;
    private List<String> arguments;

    public SEDef() {}

    public SEDef(Atom ha, Compound c) throws VMException {
        super(ha, c, 3);

        if (c.atoms.get(1) instanceof Atom)
            throw new VMException(2003, "invalid function arguments list", ha);

        Base n = c.atoms.pop();
        if (n instanceof Compound || ((Atom) n).token.type != Token.TokenType.ATOMIC)
            throw new VMException(2004, "invalid function name", ha);

        func = ((Atom) n).token.value.toString();
        arguments = SELambda.CompoundToArguments((Compound) c.atoms.pop(), ha);

        Base tmp = c.atoms.head();
        if (tmp instanceof Atom && ((Atom) tmp).token.type == Token.TokenType.STRING) {
            description = ((Atom) tmp).token.value.toString();
            if (c.atoms.size() == 0)
                throw new VMException(2005, "missing function body", ha);

            c.atoms.pop();
        }

        body = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) {
        SValue cls = new SClosure(env, arguments, body, description);
        cls.immutable = true;
        env.putVar(func, cls);
        return cls;
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEDef ret = new SEDef();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;

        ret.func = this.func;
        ret.description = this.description;
        ret.body = List.deepClone(this.body);
        ret.arguments = this.arguments; // no need to clone this
        return ret;
    }
}
