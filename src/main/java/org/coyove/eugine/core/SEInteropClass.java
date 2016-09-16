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

    public SEInteropClass(Atom ha, Compound c) throws VMException {
        super(ha, c);
        if (c.atoms.size() == 0)
            throw new VMException(2043, "needs the class name to get", ha);

        subject = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SString cls = Utils.cast(subject.evaluate(env), SString.class,
                new VMException(2041, "class name must be a string", headAtom));

        String className = cls.get();

        try {
            return new SObject(ClassUtils.getClass(className));
        } catch (ClassNotFoundException e) {
            throw new VMException(2042, "getting class '" + className + "' failed", headAtom);
        }
    }
}
