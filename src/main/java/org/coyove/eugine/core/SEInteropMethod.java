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
    private String methodName;
    private List<String> definition;
    private List<SExpression> arguments;

    private RETURN_TYPE type;
    public enum RETURN_TYPE { DIRECT_RETURN, CAST_TO_SVALUE }

    public SEInteropMethod() {}

    public SEInteropMethod(Atom ha, SExpression sub,
            String m, List<String> defs, List<SExpression> args, RETURN_TYPE t) {
        headAtom = ha;

        subject = sub;
        methodName = m;
        definition = defs;
        arguments = args;
        type = t;
    }

    public SEInteropMethod(Atom ha, Compound c, RETURN_TYPE t) throws VMException {
        throw new VMException(9999, "not implemented", ha);
//        super(ha, c, 3);
//
//        subject = SExpression.cast(c.atoms.pop());
//        methodName = SExpression.cast(c.atoms.pop());
//        definition = SExpression.cast(c.atoms.pop());
//        arguments = SExpression.castPlain(c);
//        type = t;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue sub = subject.evaluate(env);
        if (sub instanceof SNull)
            throw new VMException(2028, "null object found", headAtom);

        String method = methodName;

        Object[] ret;
        try {
            ret = InteropHelper.buildArguments(definition, arguments, env);
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
        ret.methodName = this.methodName;
        ret.definition = this.definition;
        ret.arguments = List.deepClone(this.arguments);
        ret.type = this.type;
        return ret;
    }
}
