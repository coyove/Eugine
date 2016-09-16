package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by coyove on 2016/9/11.
 */
public class SEInteropNew extends SExpression {
    private SExpression subject;
    private SExpression definition;
    private List<SExpression> arguments;

    public SEInteropNew(Atom ha, Compound c) throws VMException {
        super(ha, c);
        if (c.atoms.size() < 1)
            throw new VMException(2053, "needs the subject to create", ha);

        if (c.atoms.size() < 2)
            throw new VMException(2053, "needs the definition of the constructor", ha);

        subject = SExpression.cast(c.atoms.pop());
        definition = SExpression.cast(c.atoms.pop());
        arguments = SExpression.castPlain(c);
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue sub = subject.evaluate(env);
        if (sub instanceof SNull)
            throw new VMException(2049, "null object found", headAtom);

        List<SValue> args = SExpression.eval(arguments, env);
        Object[] ret;
        SList definition = Utils.cast(this.definition.evaluate(env), SList.class,
                new VMException(2050, "needs constructor's definition", headAtom));

        try {
            ret = InteropHelper.formatDefinition(definition, args);
        } catch (VMException ex) {
            throw new VMException(ex.getMessage(), headAtom);
        }

        List<Class> classes = (List<Class>)ret[0];
        List<Object> passArgs = (List<Object>)ret[1];

        Object obj = sub.get();
        Class cls = ((obj instanceof Class) ? ((Class) obj) : obj.getClass());
        try {
            Constructor ctor = cls.getDeclaredConstructor(classes.toArray(new Class[classes.size()]));

            ctor.setAccessible(true);
            return InteropHelper.castJavaType(ctor.newInstance(passArgs.toArray()));

        } catch (InvocationTargetException ie) {
            throw new VMException(2051, "error caused by the constructor: " + ie.getCause(), headAtom);
        } catch (Exception e) {
            throw new VMException(2052, "invoking '" + cls.getSimpleName() + "' failed, " +
                    e.getMessage(), headAtom);
        }
    }
}
