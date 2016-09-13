package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SEList extends SExpression {
    private List<SExpression> values;

    public SEList(Atom ha, Compound c) throws VMException {
        super(ha, c);

        values = new List<SExpression>();
        for (Base a : c.atoms)
            values.add(SExpression.cast(a));
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        return new SList(SExpression.eval(values, env));
    }
}
