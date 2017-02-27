package org.coyove.eugine.library;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.commons.lang3.ClassUtils;
import org.coyove.eugine.base.NativeCallInterface;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zezhong on 2017/2/27.
 */
public class java implements Exportable {
    interface SNumberToJavaType {
        Object convert(SNumber num);
    }

    private static class SNumberToJavaTypeMap extends HashMap<Class, SNumberToJavaType> {
        public void put(Class key1, Class key2, SNumberToJavaType value) {
            super.put(key1, value);
            super.put(key2, value);
        }
    }

    private final static SNumberToJavaTypeMap numericTypes = new SNumberToJavaTypeMap(){{
        put(byte.class, Byte.class, new SNumberToJavaType() {
            public Object convert(SNumber num) {
                return num.byteValue();
            }
        });
        put(char.class, Character.class, new SNumberToJavaType() {
            public Object convert(SNumber num) {
                return (char) num.intValue();
            }
        });
        put(short.class, Short.class, new SNumberToJavaType() {
            public Object convert(SNumber num) {
                return (short) num.intValue();
            }
        });
        put(int.class, Integer.class, new SNumberToJavaType() {
            public Object convert(SNumber num) {
                return num.intValue();
            }
        });
        put(long.class, Long.class, new SNumberToJavaType() {
            public Object convert(SNumber num) {
                return num.longValue();
            }
        });
        put(float.class, Float.class, new SNumberToJavaType() {
            public Object convert(SNumber num) {
                return (float) num.doubleValue();
            }
        });
        put(double.class, Double.class, new SNumberToJavaType() {
            public Object convert(SNumber num) {
                return num.doubleValue();
            }
        });
    }};

    private static double compareClass(Class cls, SValue arg) {
        //    0 - not match
        // 0.25 - ok
        //  0.5 - cls is object
        //    1 - match

        if (arg instanceof SString && cls == String.class)
            return 1;

        if (arg instanceof SBool && (cls == boolean.class || cls == Boolean.class))
            return 1;

        if (arg instanceof SBuffer && (cls == byte[].class || cls == Byte[].class))
            return 1;

        if (cls == Object.class || arg instanceof SObject)
            return 0.5;

        if (cls.isArray() && arg instanceof SList)
            return compareClass(cls.getComponentType(), arg.<ListEx<SValue>>get().head());

        if (numericTypes.containsKey(cls) && arg instanceof SNumber)
            return 0.25;

        return 0;
    }

    private static double getMatchingScore(Parameter[] params, ListEx<SValue> args) {
        double score = 0;

        if (params.length == 0 && args.size() == 0)
            return Double.MAX_VALUE; // this is it

        if (params.length == 0)
            return 0; // definitely not

        if (params.length == args.size() + 1) {
            if (params[params.length - 1].isVarArgs()) {
                /*
                    private void foo(String a)
                    private void foo(String a, Object... o) <-

                    foo("abc"), first one is preferred
                */
                for (int i = 0; i < params.length - 1; i++)
                    score += compareClass(params[i].getType(), args.get(i));

                return score - 0.25; // varargs penalty
            } else {
                return 0;
            }
        }

        if (params.length > args.size())
            return 0;

        if (params.length < args.size()) {
            if (params[params.length - 1].isVarArgs()) {
                for (int i = 0; i < params.length - 1; i++)
                    score += compareClass(params[i].getType(), args.get(i));

                score += compareClass(params[params.length - 1].getType().getComponentType(),
                        args.get(params.length - 1));

                return score;
            } else {
                return 0;
            }
        }

        // ==

        for (int i = 0; i < params.length - 1; i++)
            score += compareClass(params[i].getType(), args.get(i));

        if (params[params.length - 1].isVarArgs()) {
            score += compareClass(params[params.length - 1].getType().getComponentType(),
                    args.get(params.length - 1));
        } else {
            score += compareClass(params[params.length - 1].getType(), args.get(params.length - 1));
        }

        return score;
    }

    private static Object convertSValue(SValue arg, Class cls) {
        //    0 - not match
        // 0.25 - ok
        //  0.5 - cls is object
        //    1 - match

        if (cls == String.class)
            return arg.<String>get();

        if (cls == boolean.class || cls == Boolean.class)
            return arg.<Boolean>get();

        if (cls == byte[].class || cls == Byte[].class)
            return arg.<byte[]>get();

        if (cls.isArray()) {
            ListEx<SValue> list = arg.get();
            Object[] ret = new Object[list.size()];

            for (int i = 0; i < list.size(); i++)
                ret[i] = convertSValue(list.get(i), cls.getComponentType());

            return ret;
        }

        SNumberToJavaType conv = numericTypes.get(cls);
        if (conv != null)
            return conv.convert((SNumber) arg);

        return arg.get();
    }

    private static Object[] convertSValues(Atom atom, ListEx<SValue> args, Parameter[] params)
            throws EgException {
        Object[] ret = new Object[params.length];

        if (params.length == 0 && args.size() == 0)
            return ret;

        if (params.length == args.size() + 1) {
            if (params[params.length - 1].isVarArgs()) {
                /*
                    private void foo(String a, Object... o)
                    foo("abc")
                */
                for (int i = 0; i < params.length - 1; i++)
                    ret[i] = convertSValue(args.get(i), params[i].getType());

                ret[params.length - 1] = new Object[0];
                return ret;
            } else {
                throw new EgException(6565, "wrong parameter, shouldn't happen", atom);
            }
        }

        if (params.length > args.size())
            throw new EgException(6565, "wrong parameter, shouldn't happen", atom);

        if (params.length < args.size()) {
            if (params[params.length - 1].isVarArgs()) {
                for (int i = 0; i < params.length - 1; i++)
                    ret[i] = convertSValue(args.get(i), params[i].getType());

                ListEx<SValue> svararg = args.skip(params.length - 1);
                Object[] vararg = new Object[svararg.size()];
                Class type = params[params.length - 1].getType().getComponentType();

                for (int i = 0; i < svararg.size(); i++)
                    vararg[i] = convertSValue(svararg.get(i), type);

                ret[params.length - 1] = vararg;

                return ret;
            } else {
                throw new EgException(6565, "wrong parameter, shouldn't happen", atom);
            }
        }

        // ==

        for (int i = 0; i < params.length - 1; i++)
            ret[i] = convertSValue(args.get(i), params[i].getType());

        if (params[params.length - 1].isVarArgs()) {
            ret[params.length - 1] = new Object[] {convertSValue(args.get(params.length - 1),
                    params[params.length - 1].getType().getComponentType())};
        } else {
            ret[params.length - 1] = convertSValue(args.get(params.length - 1),
                    params[params.length - 1].getType());
        }

        return ret;
    }

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
                            double s = getMatchingScore(ctor.getParameters(), arguments);
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
                                convertSValues(atom, arguments, desiredCtor.getParameters()));

                        return EgInterop.castJavaType(obj);
                    } catch (Exception e) {
                        throw new EgException(7824, "constructor: " + e, atom);
                    }
                }
            }, 1));
        }});
    }
}
