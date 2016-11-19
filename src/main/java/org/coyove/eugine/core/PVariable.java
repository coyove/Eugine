package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class PVariable extends SExpression {
    public String varName;

    public short cacheIndex = -1;

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
        if (this.cacheIndex >= 0) {
            return SCache.slots[this.cacheIndex];
        }

        SValue tmp = env.get(varName);
        return tmp == null ? new SNull() : tmp;
    }

    @Override
    public SExpression deepClone() throws EgException {
        PVariable ret = new PVariable();
        ret.atom = this.atom;
        ret.varName = this.varName;
        ret.cacheIndex = this.cacheIndex;
        return ret;
    }
}
