package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEType extends SExpression {
    private SExpression name;

    private TYPE type;
    public enum TYPE {TYPE, ADDR}

    public SEType() {}

    public SEType(Atom ha, Compound c, TYPE t) throws VMException {
        super(ha, c, 1);

        name = SExpression.cast(c.atoms.pop());
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
        SEType ret = new SEType();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.name = this.name.deepClone();
        ret.type = this.type;
        return ret;
    }
}
