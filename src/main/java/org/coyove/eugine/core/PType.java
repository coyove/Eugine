package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class PType extends SExpression {
    @ReplaceableVariable
    private SExpression name;

    private TYPE type;
    public enum TYPE {TYPE, ADDR}

    public PType() {}

    public PType(Atom ha, SExpression n, TYPE t) {
        atom = ha;
        name = n;
        type = t;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue v = name.evaluate(env);

        if (type == TYPE.ADDR) {
            return new SInt(v.hashCode());
        }

        if (v instanceof SObject) {
            return new SString(v.underlying.getClass().getName());
        } else if (v instanceof SMetaExpression) {
            String name = v.underlying.getClass().getName().replace(".", "/");
            if (name.startsWith("org/coyove/eugine")) {
                name = name.substring(18);
            }
            return new SString(name);
        } else {
            return new SString(v.getClass().getSimpleName().substring(1));
        }
    }

    @Override
    public SExpression deepClone() {
        PType ret = new PType();
        ret.atom = this.atom;

        ret.name = this.name.deepClone();
        ret.type = this.type;
        return ret;
    }
}
