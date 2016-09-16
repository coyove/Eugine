package org.coyove.eugine.core;

import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class SESelfOp extends SESet {
    private static Compound wrap(Atom ha, final Compound c, String o) throws VMException {
        if (c.atoms.size() < 1)
            throw new VMException(2064, "needs the operator", ha);

        if (c.atoms.size() < 2)
            throw new VMException(2064, "needs the subject to perform", ha);

        Compound ret = new Compound();
        Compound op = new Compound();
        ret.atoms = new List<Base>() {{
            add(c.atoms.head());
        }};

        op.atoms.add(new Atom(new Token(Token.TokenType.ATOMIC, o)));
        op.atoms.add(ret.clone());
        op.atoms.add(c.atoms.get(1).clone());

        ret.atoms.add(op);
        return ret;
    }

    public SESelfOp(Atom ha, Compound c, String op) throws VMException {
        super(ha, wrap(ha, c, op), DECLARE.SET, ACTION.MUTABLE);
    }
}
