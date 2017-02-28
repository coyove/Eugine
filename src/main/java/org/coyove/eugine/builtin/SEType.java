package org.coyove.eugine.builtin;

import org.coyove.eugine.base.*;
import org.coyove.eugine.core.PVariable;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEType extends SExpression {
    @ReplaceableVariable
    private SExpression subject;

    @ReplaceableVariable
    private SExpression type;

    public SEType() {}

    public SEType(Atom ha, ListEx<SExpression> n) {
        super(ha, n, 1);
        subject = n.head();

        if (n.size() > 1) {
            type = n.get(1);
            if (!(type instanceof PVariable))
                EgException.INVALID_TYPENAME.raise(ha).exit();
        }
    }

    private SValue returnCompare(String type2) {
        if (this.type != null) {
            String type = ((PVariable) this.type).name;
            return type.equals(type2) ? ExecEnvironment.True : ExecEnvironment.False;
        } else {
            return new SString(type2);
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue v = subject.evaluate(env);

        if (v instanceof SNumber)
            return returnCompare("number");
        if (v instanceof SString)
            return returnCompare("string");
        if (v instanceof SBool)
            return returnCompare("bool");
        if (v instanceof SNull)
            return returnCompare("null");
        if (v instanceof SList)
            return returnCompare("list");
        if (v instanceof SDict)
            return returnCompare("dict");
        if (v instanceof SClosure)
            return returnCompare("closure");
        if (v instanceof SBuffer)
            return returnCompare("buffer");
        if (v instanceof SError)
            return returnCompare("error");
        if (v instanceof SObject)
            return new SString(v.get().getClass().getName());
        if (v instanceof SMetaExpression)
            return new SString(((SMetaExpression) v).getSimpleName());

        return ExecEnvironment.Null;
    }

    @Override
    public SExpression deepClone() {
        SEType ret = new SEType();
        ret.atom = this.atom;
        ret.subject = this.subject.deepClone();

        if (this.type != null)
            ret.type = this.type.deepClone();

        return ret;
    }
}
