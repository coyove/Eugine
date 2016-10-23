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

    private RETURN_TYPE type;
    public enum RETURN_TYPE { DIRECT_RETURN, CAST_TO_SVALUE }

    public SEInteropMethod() {}

    public SEInteropMethod(Atom ha, Compound c, RETURN_TYPE t) throws VMException {
        super(ha, c, 3);

        subject = SExpression.cast(c.atoms.pop());
        methodName = SExpression.cast(c.atoms.pop());
        definition = SExpression.cast(c.atoms.pop());
        arguments = SExpression.castPlain(c);
        type = t;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue sub = subject.evaluate(env);
        if (sub instanceof SNull)
            throw new VMException(2028, "null object found", headAtom);

        SString mn = Utils.cast(methodName.evaluate(env), SString.class,
                new VMException(2029, "method name must be string", headAtom));
        String method = mn.get();

        Object[] ret;
        List<SValue> args = SExpression.eval(arguments, env);
        SList definition = Utils.cast(this.definition.evaluate(env), SList.class,
                new VMException(2030, "needs " + method + "'s definition", headAtom));

        try {
            ret = InteropHelper.formatDefinition(definition, args);
        } catch (VMException ex) {
            throw new VMException(ex.errorCode, ex.getMessage(), headAtom);
        }

        List<Class> classes = (List<Class>)ret[0];
        List<Object> passArgs = (List<Object>)ret[1];

        try {
            Object obj = sub.get();

            Method m = (obj instanceof Class ? (Class) obj : obj.getClass())
                    .getDeclaredMethod(method, classes.toArray(new Class[classes.size()]));
            m.setAccessible(true);

            Object result = m.invoke((obj instanceof Class) ? null : obj, passArgs.toArray());

            if (this.type == RETURN_TYPE.DIRECT_RETURN) {
                return new SObject(result);
            } else {
                return InteropHelper.castJavaType(result);
            }

        } catch (InvocationTargetException ie) {
            throw new VMException(2031, "error caused by '" + method + "': " + ie.getCause(), headAtom);
        } catch (Exception e) {
            throw new VMException(2032, "invoking '" + method + "' failed, " + e, headAtom);
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEInteropMethod ret = new SEInteropMethod();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;

        ret.subject = this.subject.deepClone();
        ret.methodName = this.methodName.deepClone();
        ret.definition = this.definition.deepClone();
        ret.arguments = List.deepClone(this.arguments);
        ret.type = this.type;
        return ret;
    }
}
