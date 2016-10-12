package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEType extends SExpression {
    private SExpression name;

    public SEType(Atom ha, Compound c) throws VMException {
        super(ha, c, 1);

        name = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue v = name.evaluate(env);
        if (v instanceof SObject) {
            return new SString(v.underlying.getClass().getSimpleName());
        } else {
            return new SString(v.getClass().getSimpleName().substring(1));
        }
    }
}
