package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class PVariable extends SExpression {
    public String name;

    public short cacheIndex = -1;

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
        if (this.cacheIndex >= 0) {
            return SCache.slots[this.cacheIndex];
        }

        SValue tmp = env.get(name);
        return tmp == null ? ExecEnvironment.Null : tmp;
    }

    @Override
    public SExpression deepClone() {
        PVariable ret = new PVariable();
        ret.atom = this.atom;
        ret.name = this.name;
        ret.cacheIndex = this.cacheIndex;
        return ret;
    }
}
