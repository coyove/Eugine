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
public class PInteropNew extends SExpression {
    private SExpression subject;
    private List<String> definition;
    private List<SExpression> arguments;

    public PInteropNew() {}

    public PInteropNew(Atom ha, SExpression s, List<String> defs, List<SExpression> args) {
        headAtom = ha;

        subject = s;
        definition = defs;
        arguments = args;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue sub = subject.evaluate(env);
        if (sub instanceof SNull)
            throw new VMException(2033, "null object found", headAtom);

        Object[] ret;
        try {
            ret = InteropHelper.buildArguments(definition, arguments, env);
        } catch (VMException ex) {
            throw new VMException(ex.errorCode, ex.getMessage(), headAtom);
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
            throw new VMException(2035, "error caused by the constructor: " + ie.getCause(), headAtom);
        } catch (Exception e) {
            throw new VMException(2036, "creating '" + cls.getSimpleName() + "' failed, " +
                    e.getMessage(), headAtom);
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        PInteropNew ret = new PInteropNew();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.subject = this.subject.deepClone();
        ret.definition = this.definition; // no need to clone
        ret.arguments = List.deepClone(this.arguments);
        return ret;
    }
}
