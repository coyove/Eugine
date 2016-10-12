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

    public SEInteropNew() {}

    public SEInteropNew(Atom ha, Compound c) throws VMException {
        super(ha, c, 2);

        subject = SExpression.cast(c.atoms.pop());
        definition = SExpression.cast(c.atoms.pop());
        arguments = SExpression.castPlain(c);
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue sub = subject.evaluate(env);
        if (sub instanceof SNull)
            throw new VMException(2033, "null object found", headAtom);

        List<SValue> args = SExpression.eval(arguments, env);
        Object[] ret;
        SList definition = Utils.cast(this.definition.evaluate(env), SList.class,
                new VMException(2034, "needs constructor's definition", headAtom));

        try {
            ret = InteropHelper.formatDefinition(definition, args);
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
            throw new VMException(2036, "invoking '" + cls.getSimpleName() + "' failed, " +
                    e.getMessage(), headAtom);
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEInteropNew ret = new SEInteropNew();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.subject = this.subject.deepClone();
        ret.definition = this.definition.deepClone();
        ret.arguments = List.deepClone(this.arguments);
        return ret;
    }
}
