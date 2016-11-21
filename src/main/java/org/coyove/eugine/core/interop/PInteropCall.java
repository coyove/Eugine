package org.coyove.eugine.core.interop;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by coyove on 2016/9/11.
 */
public class PInteropCall extends SExpression {
    @ReplaceableVariable
    private SExpression subject;

    private String methodName;

    private ListEx<String> definition;

    @ReplaceableVariable
    private ListEx<SExpression> arguments;

    private RETURN_TYPE type;
    public enum RETURN_TYPE { DIRECT_RETURN, CAST_TO_SVALUE }

    public PInteropCall() {}

    public PInteropCall(Atom ha, SExpression sub,
                        String m, ListEx<String> defs, ListEx<SExpression> args, RETURN_TYPE t) {
        atom = ha;

        subject = sub;
        methodName = m;
        definition = defs;
        arguments = args;
        type = t;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue sub = subject.evaluate(env);
        if (sub instanceof SNull)
            throw new EgException(2028, "null object found", atom);

        String method = methodName;

        Object[] ret;
        try {
            ret = InteropHelper.buildArguments(definition, arguments, env);
        } catch (EgException ex) {
            throw new EgException(ex.errorCode, ex.getMessage(), atom);
        }

        ListEx<Class> classes = (ListEx<Class>)ret[0];
        ListEx<Object> passArgs = (ListEx<Object>)ret[1];

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
            throw new EgException(2031, "error caused by '" + method + "': " + ie.getCause(), atom);
        } catch (Exception e) {
            throw new EgException(2032, "invoking '" + method + "' failed, " + e, atom);
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        PInteropCall ret = new PInteropCall();
        ret.atom = this.atom;

        ret.subject = this.subject.deepClone();
        ret.methodName = this.methodName;
        ret.definition = this.definition;
        ret.arguments = ListEx.deepClone(this.arguments);
        ret.type = this.type;
        return ret;
    }
}
