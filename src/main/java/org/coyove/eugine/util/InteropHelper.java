package org.coyove.eugine.util;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.value.*;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Created by coyove on 2016/9/11.
 */
public class InteropHelper {
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
            List<SValue> ret = new List<SValue>();
            for (int i = 0; i < Array.getLength(value); i++)
                ret.add(castJavaType(Array.get(value, i)));

            return new SList(ret);
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
            List<SValue> list = obj.get();
            List<Object> ret = new List<Object>();

            for (SValue value : list) {
                ret.add(castSValue(value, c.getComponentType()));
            }
            return ret.toArray();
        } else {
            return obj.get();
        }
    }

    public static Object[] formatDefinition(SList definition, List<SValue> args) throws VMException {

        List<Class> classes = new List<Class>();
        List<Object> passArgs = new List<Object>();

        boolean vararg = false;
        int i = 0;
        for (SValue def : definition.<List<SValue>>get()) {
            if (vararg)
                throw new VMException(4001, "vararg must be at the tail of the definition");

            SString cls = Utils.cast(def, SString.class);
            if (cls == null)
                throw new VMException(4002, "must specify the type using string");

            String clsName = cls.get();

            if (clsName.endsWith("...")) {
                vararg = true;
                clsName = clsName.substring(0, clsName.length() - 3) + "[]";
            }

            if (i >= args.size())
                throw new VMException(4003, "not enough arguments");

            try {
                Class c = ClassUtils.getClass(clsName);
                classes.add(c);

                SValue value = args.get(i++);
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
                throw new VMException(4004, "cannot find type '" + clsName + "'");
            }
        }

        return new Object[]{
                classes, passArgs
        };
    }

    public static SValue getField(Object obj, String field) throws VMException {
        try {
            Field f = (obj instanceof Class ? (Class)obj : obj.getClass()).getDeclaredField(field);
            f.setAccessible(true);
            return InteropHelper.castJavaType(f.get(obj));
        } catch (Exception e) {
            throw new VMException(4005, "failed to get '" + field + "', " + e);
        }
    }

    public static SValue setField(Object obj, String field, SValue value) throws VMException {
        try {
            Field f = obj.getClass().getDeclaredField(field);
            f.setAccessible(true);
            f.set(obj, castSValue(value, f.getType()));
            return value;
        } catch (Exception e) {
            throw new VMException(4006, "failed to set '" + field + "', " + e);
        }
    }
}
