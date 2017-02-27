package org.coyove.eugine.library;

import org.apache.commons.lang3.ClassUtils;
import org.coyove.eugine.base.NativeCallInterface;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.*;

import java.lang.reflect.Constructor;

/**
 * Created by zezhong on 2017/2/27.
 */
public class java implements Exportable {

    public void export(ExecEnvironment env) {
        env.put("java", new SDict(){{
            put("new", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    String className = EgCast.toString(arguments.head(), atom);
                    arguments = arguments.skip(1);

                    try {
                        Class clazz = ClassUtils.getClass(className);
                        Constructor desiredCtor = null;
                        double max = 0;
                        for (Constructor ctor : clazz.getConstructors()) {
                            double s = EgInterop.getMatchingScore(ctor.getParameterTypes(), arguments);
//                            System.out.print(" ");
//
//                            for (Parameter param : ctor.getParameters()) {
//                                System.out.print(param.getType().getName() + ",");
//                            }
//                            System.out.println();
                            if (s != 0 && s > max) {
                                max = s;
                                desiredCtor = ctor;
                            }
                        }

                        if (desiredCtor == null)
                            throw new EgException(7823, "cannot find proper constructor", atom);

                        Object obj = desiredCtor.newInstance(
                                EgInterop.convertSValues(atom, arguments, desiredCtor.getParameterTypes()));

                        return EgInterop.castJavaType(obj);
                    } catch (Exception e) {
                        throw new EgException(7824, "constructor: " + e, atom);
                    }
                }
            }, 1));

            put("class", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    String className = EgCast.toString(arguments.head(), atom);

                    try {
                        Class clazz = ClassUtils.getClass(className);
                        return new SObject(clazz);
                    } catch (Exception e) {
                        throw new EgException(7824, "cannot find class: " + className, atom);
                    }
                }
            }, 1));
        }});
    }
}
