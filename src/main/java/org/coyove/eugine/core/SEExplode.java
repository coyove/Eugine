package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEExplode extends SExpression {
    private SExpression list;

    public SEExplode(Atom ha, Compound c) throws VMException {
        super(ha, c, 1);
        list = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        final SValue var = this.list.evaluate(env);
        if (var instanceof SList) {
            return new SExploded(var.<List<SValue>>get());
        } else {
            return new SExploded(new List<SValue>() {{
                add(var);
            }});
        }
    }
}
