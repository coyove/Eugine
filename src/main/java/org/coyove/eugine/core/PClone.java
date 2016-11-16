package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.*;

/**
 * Created by zezhong on 2016/9/9.
 */
public class PClone extends SExpression {
    private SExpression varName;

    public PClone() {}

    public PClone(Atom ha, SExpression sub) {
        atom = ha;
        varName = sub;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue n = varName.evaluate(env);

        if (n instanceof SClosure) {
            return ((SClosure) n).getCopy();
        } else {
            return n.clone();
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        PClone ret = new PClone();
        ret.atom = this.atom;
        ret.varName = this.varName.deepClone();

        return ret;
    }
}
