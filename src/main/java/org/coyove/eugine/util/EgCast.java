package org.coyove.eugine.util;

import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.value.*;

/**
 * Created by coyove on 2016/11/30.
 */
public class EgCast {
    @SuppressWarnings("unchecked")
    public static <T> T to(Object obj, Class<T> cls) {
        if (cls.isInstance(obj)) {
            return (T) obj;
        } else {
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T to(Object obj, Class<T> cls, EgException ex) throws EgException {
        if (cls.isInstance(obj)) {
            return (T) obj;
        } else {
            throw ex;
        }
    }

    public static boolean toBoolean(SValue num, Atom headAtom) throws EgException {
        if (num instanceof SNumber) {
            return Math.abs(((SNumber) num).doubleValue()) >= 1e-15;
        } else if (num instanceof SBool) {
            return num.get();
        } else if (num instanceof SNull) {
            return false;
        } else if (num instanceof SString) {
            return !num.<String>get().isEmpty();
        } else {
            throw new EgException(4008, num + " is not a boolean", headAtom);
        }
    }

    public static double toDouble(SValue num, Atom headAtom) throws EgException {
        if (num instanceof SNumber) {
            return ((SNumber) num).doubleValue();
        } else {
            throw new EgException(4007, num + " is not a number", headAtom);
        }
    }

    public static long toLong(SValue num, Atom headAtom) throws EgException {
        if (num instanceof SNumber) {
            return ((SNumber) num).longValue();
        } else {
            throw new EgException(4007, num + " is not a number", headAtom);
        }
    }

    public static int toInt(SValue num, Atom headAtom) throws EgException {
        if (num instanceof SNumber) {
            return ((SNumber) num).intValue();
        } else {
            throw new EgException(4007, num + " is not a number", headAtom);
        }
    }

    public static byte toByte(SValue num, Atom headAtom) throws EgException {
        if (num instanceof SNumber) {
            return ((SNumber) num).byteValue();
        } else {
            throw new EgException(4007, num + " is not a number", headAtom);
        }
    }

    public static String toString(SValue num, Atom headAtom) throws EgException {
        if (num instanceof SString) {
            return num.get();
        } else {
            throw new EgException(4007, num + " is not a string", headAtom);
        }
    }


}
