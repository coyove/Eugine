package org.coyove.eugine.core.interop;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by coyove on 2016/9/11.
 */
public class PInteropNew extends SExpression {
    @ReplaceableVariable
    private SExpression subject;

    private ListEx<String> definition;

    @ReplaceableVariables
    private ListEx<SExpression> arguments;

    public PInteropNew() {}

    public PInteropNew(Atom ha, SExpression s, ListEx<String> defs, ListEx<SExpression> args) {
        atom = ha;

        subject = s;
        definition = defs;
        arguments = args;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue sub = subject.evaluate(env);
        if (sub instanceof SNull)
            throw new EgException(2033, "null object found", atom);

        Object[] ret;
        try {
            ret = EgInterop.buildArguments(definition, arguments, env);
        } catch (EgException ex) {
            throw new EgException(ex.errorCode, ex.getMessage(), atom);
        }

        ListEx<Class> classes = (ListEx<Class>)ret[0];
        ListEx<Object> passArgs = (ListEx<Object>)ret[1];

        Object obj = sub.get();
        Class cls = ((obj instanceof Class) ? ((Class) obj) : obj.getClass());
        try {
            Constructor ctor = cls.getDeclaredConstructor(classes.toArray(new Class[classes.size()]));

            ctor.setAccessible(true);
            return EgInterop.castJavaType(ctor.newInstance(passArgs.toArray()));

        } catch (InvocationTargetException ie) {
            throw new EgException(2035, "error caused by the constructor: " + ie.getCause(), atom);
        } catch (Exception e) {
            throw new EgException(2036, "creating '" + cls.getSimpleName() + "' failed, " +
                    e.getMessage(), atom);
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        PInteropNew ret = new PInteropNew();
        ret.atom = this.atom;

        ret.subject = this.subject.deepClone();
        ret.definition = this.definition; // no need to clone
        ret.arguments = ListEx.deepClone(this.arguments);
        return ret;
    }
}
