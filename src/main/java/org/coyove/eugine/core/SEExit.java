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
        super(ha, c, 1);

        argument = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SString msg = Utils.cast(argument.evaluate(env), SString.class);

        if (msg == null) {
            SInteger num = Utils.cast(argument.evaluate(env), SInteger.class);
            if (num == null)
                throw new VMException(2016, "message must be string or integer", headAtom);

            throw new VMException(7001, num.<Long>get().toString(), headAtom);
        }

        throw new VMException(7000, msg.<String>get(), headAtom);
    }
}
