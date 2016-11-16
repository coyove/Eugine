package org.coyove.eugine.util;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.value.*;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by coyove on 2016/9/11.
 */
public class InteropHelper {
    public static HashMap<String, String> generalJavaTypes = new HashMap<String, String>() {{
        put("String", "java.lang.String");
        put("String[]", "java.lang.String[]");
    }};

    public static String expandJavaCassName(String cls) {
        if (generalJavaTypes.containsKey(cls)) {
            return generalJavaTypes.get(cls);
        } else {
            return cls;
        }
    }

    public static SValue castJavaType(Object value) {
        if (value == null) {
            return new SNull();
        } else if (value instanceof String) {
            return new SString((String) value);
        } else if (value instanceof Double) {
            return new SDouble((Double) value);
        } else if (value instanceof Long) {
            return new SInteger((Long) value);
        } else if (value instanceof Integer) {
            return new SInteger((Integer) value);
        } else if (value instanceof Byte) {
            return new SInteger(((Byte) value).longValue());
        } else if (value instanceof Character) {
            return new SInteger(((long) ((Character) value)));
        } else if (value instanceof Short) {
            return new SInteger(((long) ((Short) value)));
        } else if (value instanceof Boolean) {
            return new SBool((Boolean) value);
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
        } else if (value instanceof HashMap) {
            HashMap map = (HashMap) value;
            for (Object o : map.keySet()) {
                map.put(o, castJavaType(map.get(o)));
            }

            return new SDict(map);
        } else if (value instanceof SValue) {
            return ((SValue) value);
        }

        return new SObject(value);
    }

    public static Object castSValue(SValue obj, Class c) {
        if (obj instanceof SDouble || obj instanceof SInteger) {
            BigDecimal num = new BigDecimal(obj instanceof SDouble ?
                    obj.<Double>get() : obj.<Long>get()
            );

            if (c == int.class) {
                return (num.intValue());
            } else if (c == double.class) {
                return (num.doubleValue());
            } else if (c == float.class) {
                return (num.floatValue());
            } else if (c == long.class) {
                return (num.longValue());
            } else if (c == byte.class) {
                return (num.byteValue());
            } else if (c == short.class) {
                return (num.shortValue());
            } else if (c == char.class) {
                return ((char) num.intValue());
            } else {
                return obj.get();
            }
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
            return obj.get();
        }
    }

    public static Object[] buildArguments(ListEx<String> defs, ListEx<SExpression> args, ExecEnvironment env)
            throws EgException {

        ListEx<Class> classes = new ListEx<Class>();
        ListEx<Object> passArgs = new ListEx<Object>();

        boolean vararg = false;
        int i = 0;
        for (String clsName : defs) {
            if (vararg) {
                throw new EgException(4001, "vararg must be at the tail of the definition");
            }

            if (clsName.endsWith("...")) {
                vararg = true;
                clsName = clsName.substring(0, clsName.length() - 3) + "[]";
            }

            if (i >= args.size()) {
                throw new EgException(4003, "not enough arguments");
            }

            try {
                clsName = expandJavaCassName(clsName);
                Class c = ClassUtils.getClass(clsName);
                classes.add(c);

                SValue value = args.get(i++).evaluate(env);
                Object ret = InteropHelper.castSValue(value, c);

                if (value instanceof SObject) {
                    passArgs.add(value.get());
                } else if (c.isArray()) {
                    Object[] tmp = (Object[]) ret;
                    int len = tmp.length;

                    Class p = c.getComponentType();
                    if (p == int.class) {
                        passArgs.add(ArrayUtils.toPrimitive(Arrays.copyOf(tmp, len, Integer[].class)));
                    } else if (p == double.class) {
                        passArgs.add(ArrayUtils.toPrimitive(Arrays.copyOf(tmp, len, Double[].class)));
                    } else if (p == float.class) {
                        passArgs.add(ArrayUtils.toPrimitive(Arrays.copyOf(tmp, len, Float[].class)));
                    } else if (p == long.class) {
                        passArgs.add(ArrayUtils.toPrimitive(Arrays.copyOf(tmp, len, Long[].class)));
                    } else if (p == byte.class) {
                        passArgs.add(ArrayUtils.toPrimitive(Arrays.copyOf(tmp, len, Byte[].class)));
                    } else if (p == short.class) {
                        passArgs.add(ArrayUtils.toPrimitive(Arrays.copyOf(tmp, len, Short[].class)));
                    } else if (p == char.class) {
                        passArgs.add(ArrayUtils.toPrimitive(Arrays.copyOf(tmp, len, Character[].class)));
                    } else {
                        passArgs.add(Arrays.copyOf(tmp, len, c));
                    }
                } else {
                    passArgs.add(ret);
                }
            } catch (ClassNotFoundException ex) {
                throw new EgException(4004, "cannot find type '" + clsName + "'");
            }
        }

        return new Object[]{
                classes, passArgs
        };
    }

    public static SValue getField(Object obj, String field) throws EgException {
        try {
            Field f = (obj instanceof Class ? (Class) obj : obj.getClass()).getDeclaredField(field);
            f.setAccessible(true);
            return InteropHelper.castJavaType(f.get(obj));
        } catch (Exception e) {
            throw new EgException(4005, "failed to get '" + field + "', " + e);
        }
    }

    public static SValue setField(Object obj, String field, SValue value) throws EgException {
        try {
            Field f = obj.getClass().getDeclaredField(field);
            f.setAccessible(true);
            f.set(obj, castSValue(value, f.getType()));
            return value;
        } catch (Exception e) {
            throw new EgException(4006, "failed to set '" + field + "', " + e);
        }
    }
}
