package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class SELen extends SExpression {
    private SExpression argument;

    public SELen(Atom ha, Compound c) throws VMException {
        super(ha, c, 1);

        argument = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {

        SValue obj = argument.evaluate(env);
        if (obj instanceof SString) {
            return new SInteger((long) obj.<String>get().length());
        } else if (obj instanceof SList) {
            return new SInteger((long) obj.<List<SValue>>get().size());
        } else {
            return new SInteger((long) 0);
        }
    }
}