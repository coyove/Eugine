package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class PVariable extends SExpression {
    public String varName;

    public PVariable() {}

    public PVariable(String n) {
        varName = n;
    }

    public PVariable(Atom ha, String n) {
        atom = ha;
        varName = n;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue tmp = env.get(varName);
        return tmp == null ? ExecEnvironment.Null : tmp;
    }

    @Override
    public SExpression deepClone() {
        PVariable ret = new PVariable();
        ret.atom = this.atom;
        ret.varName = this.varName;
        return ret;
    }
}
