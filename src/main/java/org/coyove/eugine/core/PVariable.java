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

    public SValue shared;

    public PVariable() {}

    public PVariable(String n) {
        name = n;
    }

    public PVariable(Atom ha, String n) {
        atom = ha;
        name = n;

        if (n == null || n.isEmpty())
            EgException.INVALID_VARIABLE_NAME.raise(atom).exit();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        if (isShared) return shared;

        SValue tmp = env.get(name);
        return tmp == null ? ExecEnvironment.Null : tmp;
    }

    @Override
    public SExpression deepClone() {
        PVariable ret = new PVariable();
        ret.atom = this.atom;
        ret.name = this.name;
        ret.isShared = this.isShared;
        if (this.shared != null) {
            ret.shared = this.shared.clone();
        }

        return ret;
    }
}
