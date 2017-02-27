package org.coyove.eugine.library;

import org.apache.commons.lang3.ClassUtils;
import org.coyove.eugine.base.NativeCallInterface;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.EgCast;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;
import org.coyove.eugine.value.SDict;
import org.coyove.eugine.value.SNativeCall;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by zezhong on 2017/2/27.
 */
public class java implements Exportable {
    private static double getMatchingScore(Parameter[] params, ListEx<SValue> args) {
        if (params.length == 0 && args.size() == 0)
            return Double.MAX_VALUE; // this is it

        if (params.length == 0)
            return 0; // definitely not

        if (params.length == args.size() + 1) {
            if (params[params.length - 1].isVarArgs()) {
                /*
                    private void foo(String a)
                    private void foo(String a, Object... o)
                */
            } else {
                return 0;
            }
        }

        if (params.length > args.size())
            return 0;

        if (params.length < args.size()) {
            if (params[params.length - 1].isVarArgs()) {

            } else {
                return 0;
            }
        }

        // ==
        for (int i = 0; i < params.length; i++) {
            if (params[i].getType() == String.class) {
                
            }
        }
    }

    public void export(ExecEnvironment env) {
        env.put("java", new SDict(){{
            put("new", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    String className = EgCast.toString(arguments.head(), atom);
                    try {
                        Class clazz = ClassUtils.getClass(className);
                        for (Constructor ctor : clazz.getConstructors()) {
                            for (Parameter param : ctor.getParameters()) {
                                System.out.print(param.getType().getName() + ",");
                            }
                            System.out.println();
                        }

                        return ExecEnvironment.True;
                    } catch (Exception e) {
                        return ExecEnvironment.Null;
                    }
                }
            }, 1));
        }});
    }
}
