package org.coyove.eugine.core.interop;

import org.apache.commons.lang3.ClassUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/11.
 */
public class PInteropCast extends SExpression {
    @ReplaceableVariable
    private SExpression subject;

    private String toType;

    public PInteropCast() {}

    public PInteropCast(Atom ha, SExpression s, String type) {
        atom = ha;
        subject = s;
        toType = type;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue sub = subject.evaluate(env);
        String className = EgInterop.expandJavaCassName(toType);

        try {
            Class tt = ClassUtils.getClass(className);
            return new SObject(tt.cast(sub.get()));
        } catch (ClassNotFoundException e) {
            throw new EgException(2028, "getting class '" + className + "' failed", atom);
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        PInteropCast ret = new PInteropCast();
        ret.atom = this.atom;

        ret.subject = this.subject.deepClone();
        ret.toType = this.toType;
        return ret;
    }
}
