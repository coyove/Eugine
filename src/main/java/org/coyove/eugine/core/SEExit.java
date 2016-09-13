package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEExit extends SExpression {
    private SExpression argument;

    public SEExit(Atom ha, Compound c) throws VMException {
        super(ha, c);
        if (c.atoms.size() != 1)
            throw new VMException("it takes 1 argument");

        argument = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SString msg = Utils.cast(argument.evaluate(env), SString.class,
                new VMException("message must be a string", headAtom));

        throw new VMException(msg.<String>get(), headAtom);
    }
}
