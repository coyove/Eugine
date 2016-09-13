package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEDefun extends SExpression {
    private String func;
    private SExpression body;
    private List<String> arguments;
    private String description;

    public SEDefun(Atom ha, Compound c) throws VMException {
        super(ha, c);

        if (c.atoms.size() < 3)
            throw new VMException("missing function body", ha);

        if (c.atoms.get(1) instanceof Atom)
            throw new VMException("the second argument must be the declaration", ha);

        Base n = c.atoms.pop();
        if (n instanceof Compound || ((Atom) n).token.type != Token.TokenType.ATOMIC)
            throw new VMException("function name must be an atom", ha);

        func = ((Atom) n).token.value.toString();
        arguments = SELambda.CompoundToArguments((Compound) c.atoms.pop(), ha);

        Base tmp = c.atoms.pop();
        if (tmp instanceof Atom && ((Atom) tmp).token.type == Token.TokenType.STRING) {
            description = ((Atom) tmp).token.value.toString();
            if (c.atoms.size() == 0)
                throw new VMException("missing function body", ha);

            body = SExpression.cast(c.atoms.pop());
        } else
            body = SExpression.cast(tmp);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) {
        SValue cls = new SClosure(env, arguments, body, description);
        env.putVar(func, cls);
        return cls;
    }
}
