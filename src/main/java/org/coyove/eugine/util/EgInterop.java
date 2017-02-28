package org.coyove.eugine.util;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.value.*;

import java.lang.reflect.*;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by coyove on 2016/9/11.
 */
public class EgInterop {
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

    public static SValue castJavaType(Object value) {
        if (value == null) {
            return ExecEnvironment.Null;
        } else if (value instanceof String) {
            return new SString((String) value);
        } else if (value instanceof Double) {
            return new SNumber((Double) value);
        } else if (value instanceof Long) {
            return new SNumber((Long) value);
        } else if (value instanceof Integer) {
            return new SNumber((Integer) value);
        } else if (value instanceof Byte) {
            return new SNumber((Byte) value);
        } else if (value instanceof Character) {
            return new SNumber((Character) value);
        } else if (value instanceof Short) {
            return new SNumber((Short) value);
        } else if (value instanceof Boolean) {
            return (Boolean) value ? ExecEnvironment.True : ExecEnvironment.False;
        } else if (value.getClass().isArray()) {
            ListEx<SValue> ret = new ListEx<SValue>();
            for (int i = 0; i < Array.getLength(value); i++)
                ret.add(castJavaType(Array.get(value, i)));

            return new SList(ret);
        } else if (value instanceof Collection) {
            Collection list = (Collection) value;
            ListEx<SValue> ret = new ListEx<SValue>(list.size());
            for (Object o : list) {
                ret.add(castJavaType(o));
            }

            return new SList(ret);
        } else if (value instanceof Map) {
            Map map = (Map) value;
            HashMap<String, SValue> ret = new HashMap<String, SValue>(map.size());
            for (Object o : map.keySet()) {
                ret.put(o.toString(), castJavaType(map.get(o)));
            }

            return new SDict(ret);
        } else if (value instanceof SValue) {
            return ((SValue) value);
        } else if (value instanceof SExpression) {
            return new SMetaExpression((SExpression) value);
        }

        return new SObject(value);
    }

    public static Object castSValue(SValue obj, Class c) {
        if (obj instanceof SNumber) {
            SNumberToJavaType conv = numericTypes.get(c);
            return conv != null ? conv.convert((SNumber) obj) : c.cast(obj.get());

        } else if (obj instanceof SList) {
            ListEx<SValue> list = obj.get();
            ListEx<Object> ret = new ListEx<Object>();

            for (SValue value : list) {
                ret.add(castSValue(value, c.getComponentType()));
            }
            return ret.toArray();
        } else if (obj instanceof SClosure) {
            return obj;
        } else {
            return c.cast(obj.get());
        }
    }

    public static SValue getField(Object obj, String field) throws EgException {
        try {
            Field f = (obj instanceof Class ? (Class) obj : obj.getClass()).getDeclaredField(field);
            f.setAccessible(true);
            return EgInterop.castJavaType(f.get(obj));
        } catch (Exception e) {
            throw new EgException(4005, "failed to get '" + field + "': " + e);
        }
    }

    public static SValue setField(Object obj, String field, SValue value) throws EgException {
        try {
            Field f = obj.getClass().getDeclaredField(field);
            f.setAccessible(true);

            if (obj instanceof SExpression) {
                if (value instanceof SList && ListEx.class.equals(f.getType())) {
                    Class ct = (Class) ((ParameterizedType) f.getGenericType()).getActualTypeArguments()[0];
                    ListEx<SValue> list = value.get();

                    ListEx<Object> exprs = new ListEx<Object>(list.size());

                    for (SValue expr : list) {
                        if (SExpression.class.equals(ct)) {
                            if (expr instanceof SMetaExpression) {
                                exprs.add(((SMetaExpression) expr).underlying);
                            } else {
                                exprs.add(expr);
                            }
                        } else {
                            exprs.add(castSValue(expr, ct));
                        }
                    }

                    f.set(obj, exprs);
                } else if (value instanceof SMetaExpression) {
                    f.set(obj, ((SMetaExpression) value).underlying);
                } else {
                    f.set(obj, value);
                }
            } else {
                f.set(obj, castSValue(value, f.getType()));
            }

            return value;
        } catch (Exception e) {
            throw new EgException(4006, "failed to set '" + field + "': " + e);
        }
    }

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

    public static double getMatchingScore(Class[] params, ListEx<SValue> args) {
        double score = 0;

        if (params.length == 0 && args.size() == 0)
            return Double.MAX_VALUE; // this is it

        if (params.length == 0)
            return 0; // definitely not

        if (params.length == args.size() + 1) {
            if (params[params.length - 1].isArray()) {
                /*
                    private void foo(String a)
                    private void foo(String a, Object... o) <-

                    foo("abc"), first one is preferred
                */
                for (int i = 0; i < params.length - 1; i++)
                    score += compareClass(params[i], args.get(i));

                return score - 0.25; // varargs penalty
            } else {
                return 0;
            }
        }

        if (params.length > args.size())
            return 0;

        if (params.length < args.size()) {
            if (params[params.length - 1].isArray()) {
                for (int i = 0; i < params.length - 1; i++)
                    score += compareClass(params[i], args.get(i));

                score += compareClass(params[params.length - 1].getComponentType(),
                        args.get(params.length - 1));

                return score;
            } else {
                return 0;
            }
        }

        // ==

        for (int i = 0; i < params.length - 1; i++)
            score += compareClass(params[i], args.get(i));

        if (params[params.length - 1].isArray()) {
            score += compareClass(params[params.length - 1].getComponentType(),
                    args.get(params.length - 1));
        } else {
            score += compareClass(params[params.length - 1], args.get(params.length - 1));
        }

        return score;
    }

    private static Object convertSValue(SValue arg, Class cls) {
        //    0 - not match
        // 0.25 - ok
        //  0.5 - cls is object
        //    1 - match

        if (cls == Object.class) {
            if (arg instanceof SNumber) {
                if (((SNumber) arg).isInteger())
                    return ((SNumber) arg).longValue();
                else
                    return ((SNumber) arg).doubleValue();
            }

            return arg.get();
        }

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

    public static Object[] convertSValues(Atom atom, ListEx<SValue> args, Class[] params)
            throws EgException {
        Object[] ret = new Object[params.length];

        if (params.length == 0 && args.size() == 0)
            return ret;

        if (params.length == args.size() + 1) {
            if (params[params.length - 1].isArray()) {
                /*
                    private void foo(String a, Object... o)
                    foo("abc")
                */
                for (int i = 0; i < params.length - 1; i++)
                    ret[i] = convertSValue(args.get(i), params[i]);

                ret[params.length - 1] =
                        Array.newInstance(params[params.length - 1].getComponentType(), 0);
                return ret;
            } else {
                throw new EgException(6565, "wrong parameter, shouldn't happen", atom);
            }
        }

        if (params.length > args.size())
            throw new EgException(6565, "wrong parameter, shouldn't happen", atom);

        if (params.length < args.size()) {
            if (params[params.length - 1].isArray()) {
                for (int i = 0; i < params.length - 1; i++)
                    ret[i] = convertSValue(args.get(i), params[i]);

                ListEx<SValue> svararg = args.skip(params.length - 1);
                Object[] vararg = new Object[svararg.size()];
                Class type = params[params.length - 1].getComponentType();

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
            ret[i] = convertSValue(args.get(i), params[i]);

        if (params[params.length - 1].isArray()) {
            ret[params.length - 1] = new Object[] {convertSValue(args.get(params.length - 1),
                    params[params.length - 1].getComponentType())};
        } else {
            ret[params.length - 1] = convertSValue(args.get(params.length - 1),
                    params[params.length - 1]);
        }

        return ret;
    }

    public static SValue callMostPossibleMethod(Atom atom,
                                                Object subject,
                                                String name,
                                                ListEx<SValue> arguments)
            throws EgException{
        try {
            Class clazz = subject instanceof Class ? ((Class) subject) : subject.getClass();
            Object receiver = subject instanceof Class ? null : subject;
            Method desiredMethod = null;
            double max = 0;
            for (Method m : clazz.getMethods()) {
                if (m.getName().equals(name)) {
                    double s = getMatchingScore(m.getParameterTypes(), arguments);
                    if (s != 0 && s > max) {
                        max = s;
                        desiredMethod = m;
                    }
                }
            }

            if (desiredMethod == null)
                throw new EgException(7823, "cannot find proper method", atom);

            Object obj = desiredMethod.invoke(receiver,
                    convertSValues(atom, arguments, desiredMethod.getParameterTypes()));

            return castJavaType(obj);
        } catch (Exception e) {
            if (e instanceof InvocationTargetException)
                throw new EgException(7823, "method invocation: " + e.getCause().toString(), atom);

            throw new EgException(7824, "method: " + e, atom);
        }
    }

    interface SNumberToJavaType {
        Object convert(SNumber num);
    }

    private static class SNumberToJavaTypeMap extends HashMap<Class, SNumberToJavaType> {
        public void put(Class key1, Class key2, SNumberToJavaType value) {
            super.put(key1, value);
            super.put(key2, value);
        }
    }
}
