package org.coyove.eugine.core;

import org.apache.commons.lang3.ClassUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/11.
 */
public class SEInteropCast extends SExpression {
    private SExpression subject;
    private SExpression toType;

    public SEInteropCast() {}

    public SEInteropCast(Atom ha, Compound c) throws VMException {
        super(ha, c, 2);

        toType = SExpression.cast(c.atoms.pop());
        subject = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SString toType = Utils.cast(this.toType.evaluate(env), SString.class,
                new VMException(2027, "class name must be string", headAtom));
        SValue sub = subject.evaluate(env);

        String className = toType.get();
        try {
            Class tt = ClassUtils.getClass(className);
            return new SObject(tt.cast(sub.get()));
        } catch (ClassNotFoundException e) {
            throw new VMException(2028, "getting class '" + className + "' failed", headAtom);
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEInteropCast ret = new SEInteropCast();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.subject = this.subject.deepClone();
        ret.toType = this.toType.deepClone();
        return ret;
    }
}
