package org.coyove.eugine.core;

import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEIncDec extends SESet {
    private static Compound wrap(Atom ha, final Compound c, boolean inc) throws VMException {
        if (c.atoms.size() < 1)
            throw new VMException(2000, "not enough arguments", ha);

        Compound ret = new Compound();
        Compound op = new Compound();
        ret.atoms = new List<Base>() {{
            add(c.atoms.head());
        }};

        op.atoms.add(new Atom(new Token(Token.TokenType.ATOMIC, inc ? "+" : "-")));
        op.atoms.add(ret.clone());
        op.atoms.add(new Atom(new Token(Token.TokenType.INTEGER, (long)1)));

        ret.atoms.add(op);
        return ret;
    }

    public SEIncDec(Atom ha, Compound c, boolean i) throws VMException {
        super(ha, wrap(ha, c, i), DECLARE.SET, ACTION.MUTABLE);
    }
}
