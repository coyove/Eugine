package org.coyove.eugine.util;

import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.parser.Compound;
import org.coyove.eugine.value.SDouble;
import org.coyove.eugine.value.SInteger;
import org.coyove.eugine.value.SNull;
import org.coyove.eugine.value.SString;

import java.math.BigDecimal;
import java.util.Formatter;

/**
 * Created by coyove on 2016/9/10.
 */
public final class Utils {

    @SuppressWarnings("unchecked")
    public static <T> T cast(Object obj, Class<T> cls) {
        if (cls.isInstance(obj)) {
            return (T) obj;
        } else {
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T cast(Object obj, Class<T> cls, VMException ex) throws VMException {
        if (cls.isInstance(obj)) {
            return (T) obj;
        } else {
            throw ex;
        }
    }

    public static BigDecimal getNumber(SValue num, Atom headAtom) throws VMException {
        BigDecimal ret;

        if (num instanceof SInteger) {
            ret = BigDecimal.valueOf(num.<Long>get());
        } else if (num instanceof SDouble) {
            ret = BigDecimal.valueOf(num.<Double>get());
        } else {
            throw new VMException(4008, "non-number found", headAtom);
        }

        return ret;
    }

    public static Double getDouble(SValue num, Atom headAtom) throws VMException {
        Double ret;

        if (num instanceof SInteger) {
            ret = num.<Long>get().doubleValue();
        } else if (num instanceof SDouble) {
            ret = num.<Double>get();
        } else {
            throw new VMException(4007, "non-number found", headAtom);
        }

        return ret;
    }

    public static String bytesToHexString(byte[] buf) {
        Formatter formatter = new Formatter();
        for (byte b : buf) {
            formatter.format("%02x", b);
        }

        return formatter.toString();
    }
}
