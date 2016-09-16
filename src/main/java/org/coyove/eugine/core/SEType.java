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
        return new SString(name.evaluate(env).getClass().getSimpleName().substring(1));
    }
}
