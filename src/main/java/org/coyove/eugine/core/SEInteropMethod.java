package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by coyove on 2016/9/11.
 */
public class SEInteropMethod extends SExpression {
    private SExpression subject;
    private SExpression methodName;
    private SExpression definition;
    private List<SExpression> arguments;

    public SEInteropMethod(Atom ha, Compound c) throws VMException {
        super(ha, c);
        if (c.atoms.size() < 1)
            throw new VMException(2048, "needs the subject to invoke from", ha);

        if (c.atoms.size() < 2)
            throw new VMException(2048, "needs the method name to invoke", ha);

        if (c.atoms.size() < 3)
            throw new VMException(2048, "needs this method's definition", ha);

        subject = SExpression.cast(c.atoms.pop());
        methodName = SExpression.cast(c.atoms.pop());
        definition = SExpression.cast(c.atoms.pop());
        arguments = SExpression.castPlain(c);

    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue sub = subject.evaluate(env);
        if (sub instanceof SNull)
            throw new VMException(2044, "null object found", headAtom);

        SString mn = Utils.cast(methodName.evaluate(env), SString.class,
                new VMException(2045, "the method name must be a string", headAtom));
        String method = mn.get();

        Object[] ret;
        List<SValue> args = SExpression.eval(arguments, env);
        SList definition = Utils.cast(this.definition.evaluate(env), SList.class,
                new VMException(2046, "needs " + method + "'s definition", headAtom));

        try {
            ret = InteropHelper.formatDefinition(definition, args);
        } catch (VMException ex) {
            throw new VMException(ex.getMessage(), headAtom);
        }

        List<Class> classes = (List<Class>)ret[0];
        List<Object> passArgs = (List<Object>)ret[1];

        try {
            Object obj = sub.get();

            if (obj instanceof Class) {
                Method m = ((Class) obj).getDeclaredMethod(method, classes.toArray(new Class[classes.size()]));
                m.setAccessible(true);

                return InteropHelper.castJavaType(m.invoke(null, passArgs.toArray()));
            } else {
                Method m = obj.getClass().getDeclaredMethod(method, classes.toArray(new Class[classes.size()]));
                m.setAccessible(true);
                return InteropHelper.castJavaType(m.invoke(obj, passArgs.toArray()));
            }

        } catch (InvocationTargetException ie) {
            throw new VMException(2047, "error caused by '" + method + "': " + ie.getCause(), headAtom);
        } catch (Exception e) {
            throw new VMException("invoking '" + method + "' failed, " + e.getMessage(), headAtom);
        }
    }
}
