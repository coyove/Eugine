package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class SELambda extends SExpression {
    private List<SExpression> body;
    private List<String> arguments;

    public static List<String> CompoundToArguments(Compound c, Atom pos) throws VMException {
        List<String> ret = new List<String>();

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

    public SELambda() {
    }

    public SELambda(Atom ha, Compound c) throws VMException {
        super(ha, c, 2);

        if (c.atoms.head() instanceof Atom)
            throw new VMException(2038, "invalid lambda declaration", ha);

        arguments = SELambda.CompoundToArguments((Compound) c.atoms.pop(), ha);
        body = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) {
        SClosure cls = new SClosure(env, arguments, body);
        cls.immutable = true;
        return cls;
    }

    @Override
    public SExpression deepClone() throws VMException {
        SELambda ret = new SELambda();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.body = List.deepClone(this.body);
        ret.arguments = this.arguments;

        return ret;
    }
}
