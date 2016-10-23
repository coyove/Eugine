package org.coyove.eugine.core;

import org.apache.commons.lang3.ClassUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/11.
 */
public class SEInteropClass extends SExpression {
    private SExpression subject;

    public SEInteropClass() {}

    public SEInteropClass(Atom ha, Compound c) throws VMException {
        super(ha, c, 1);

        subject = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SString cls = Utils.cast(subject.evaluate(env), SString.class,
                new VMException(2027, "class name must be string", headAtom));

        String className = cls.get();

        try {
            return new SObject(ClassUtils.getClass(className));
        } catch (ClassNotFoundException e) {
            throw new VMException(2028, "getting class '" + className + "' failed", headAtom);
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEInteropClass ret = new SEInteropClass();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.subject = this.subject.deepClone();
        return ret;
    }
}
