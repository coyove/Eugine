package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.library.system.SEDuplicate;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;

import static org.coyove.eugine.library.system.SEDuplicate.sharedPVariables;

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
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        if (isShared) return shared;

        SValue tmp = env.get(name);
        return tmp == null ? ExecEnvironment.Null : tmp;
    }

    @Override
    public SExpression deepClone() {
        if (isShared) {
            SExpression existed = SEDuplicate.sharedPVariables.get(System.identityHashCode(this));
            if (existed != null) {
                return existed;
            }
        }

        PVariable ret = new PVariable();
        ret.atom = this.atom;
        ret.name = this.name;
        ret.isShared = this.isShared;

        if (isShared) {
            if (this.shared != null) {
                ret.shared = this.shared.clone();
            }

            SEDuplicate.sharedPVariables.put(System.identityHashCode(this), ret);
        }

        return ret;
    }
}
