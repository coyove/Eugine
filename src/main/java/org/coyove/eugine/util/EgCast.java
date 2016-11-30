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
        if (num instanceof SLong) {
            return ((SLong) num).val() != 0;
        } else if (num instanceof SInt) {
            return ((SInt) num).val() != 0;
        } else if (num instanceof SDouble) {
            return Math.abs(((SDouble) num).val()) > 1e-6;
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
        double ret;

        if (num instanceof SLong) {
            ret = ((SLong) num).val();
        } else if (num instanceof SDouble) {
            ret = ((SDouble) num).val();
        } else if (num instanceof SInt) {
            ret = ((SInt) num).val();
        } else {
            throw new EgException(4007, num + " is not a double", headAtom);
        }

        return ret;
    }

    public static long toLong(SValue num, Atom headAtom) throws EgException {
        long ret;

        if (num instanceof SLong) {
            ret = ((SLong) num).val();
        } else if (num instanceof SInt) {
            ret = ((SInt) num).val();
        } else if (num instanceof SDouble) {
            ret = (long) ((SDouble) num).val();
        } else {
            throw new EgException(4007, num + " is not a long", headAtom);
        }

        return ret;
    }

    public static int toInt(SValue num, Atom headAtom) throws EgException {
        if (num instanceof SLong) {
            return (int) ((SLong) num).val();
        } else if (num instanceof SDouble) {
            return (int) ((SDouble) num).val();
        } else if (num instanceof SInt) {
            return ((SInt) num).val();
        } else {
            throw new EgException(4007, num + " is not an integer", headAtom);
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
