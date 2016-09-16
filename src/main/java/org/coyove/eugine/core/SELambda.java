package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class SELambda extends SExpression {
    private SExpression body;
    private List<String> arguments;

    public static List<String> CompoundToArguments(Compound c, Atom pos) throws VMException {
        List<String> ret = new List<String>();

        for (int i = 0; i < c.atoms.size(); i++) {
            Base a = c.atoms.get(i);

            if (a instanceof Compound || ((Atom) a).token.type != Token.TokenType.ATOMIC)
                throw new VMException(2056, "each argument name must be an atom", pos);

            String name = ((Atom) a).token.value.toString();
            if (i != c.atoms.size() - 1 && name.length() > 3 && name.substring(name.length() - 3).equals("..."))
                throw new VMException(2057, "vararg must be at the end of the declaration", pos);

            ret.add(name);
        }

        return ret;
    }

    public SELambda(Atom ha, Compound c) throws VMException {
        super(ha, c);

        if (c.atoms.size() < 2)
            throw new VMException(2058, "missing lambda body", ha);

        if (c.atoms.head() instanceof Atom)
            throw new VMException(2059, "invalid lambda declaration", ha);

        arguments = SELambda.CompoundToArguments((Compound)c.atoms.pop(), ha);
        body = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) {
        return new SClosure(env, arguments, body);
    }
}
