package org.coyove.eugine.builtin;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEType extends SExpression {
    @ReplaceableVariable
    private SExpression name;

    public SEType() {}

    public SEType(Atom ha, ListEx<SExpression> n) {
        super(ha, n, 1);
        name = n.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue v = name.evaluate(env);

        if (v instanceof SObject) {
            return new SString(v.get().getClass().getName());
        } else if (v instanceof SMetaExpression) {
            return new SString(((SMetaExpression) v).getSimpleName());
        } else {
            return new SString(v.getClass().getSimpleName().substring(1));
        }
    }

    @Override
    public SExpression deepClone() {
        SEType ret = new SEType();
        ret.atom = this.atom;
        ret.name = this.name.deepClone();
        return ret;
    }
}
