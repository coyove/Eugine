package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class PVariable extends SExpression {
    public String name;

    public boolean isShared = false;

    public SValue shared = null;

    public PVariable() {}

    public PVariable(String n) {
        name = n;
    }

    public PVariable(Atom ha, String n) {
        atom = ha;
        name = n;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        if (shared != null) return shared;

        SValue tmp = env.get(name);
        return tmp == null ? ExecEnvironment.Null : tmp;
    }

    @Override
    public SExpression deepClone() {
        PVariable ret = new PVariable();
        ret.atom = this.atom;
        ret.name = this.name;
        return ret;
    }
}
