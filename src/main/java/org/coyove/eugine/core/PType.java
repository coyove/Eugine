package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class PType extends SExpression {
    private SExpression name;

    private TYPE type;
    public enum TYPE {TYPE, ADDR}

    public PType() {}

    public PType(Atom ha, SExpression n, TYPE t) {
        headAtom = ha;
        name = n;
        type = t;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue v = name.evaluate(env);

        if (type == TYPE.ADDR) {
            return new SInteger(v.hashCode());
        }

        if (v instanceof SObject) {
            return new SString(v.underlying.getClass().getSimpleName());
        } else {
            return new SString(v.getClass().getSimpleName().substring(1));
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        PType ret = new PType();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.name = this.name.deepClone();
        ret.type = this.type;
        return ret;
    }
}
