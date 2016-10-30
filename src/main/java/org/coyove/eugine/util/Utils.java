package org.coyove.eugine.util;

import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.parser.Compound;
import org.coyove.eugine.value.SDouble;
import org.coyove.eugine.value.SInteger;
import org.coyove.eugine.value.SNull;
import org.coyove.eugine.value.SString;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Formatter;

/**
 * Created by coyove on 2016/9/10.
 */
public final class Utils {

    public static String getFileName(String path) {
        Path p = Paths.get(path);
        return p.getFileName().toString();
    }

    public static String getDirectoryName(String path) {
        Path p = Paths.get(path);
        String name = p.getFileName().toString();
        return path.substring(0, path.length() - name.length());
    }

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

    public static BigDecimal getNumber(SValue num, Atom headAtom) {
        BigDecimal ret;

        if (num instanceof SInteger) {
            ret = BigDecimal.valueOf(num.<Long>get());
        } else if (num instanceof SDouble) {
            ret = BigDecimal.valueOf(num.<Double>get());
        } else {
            ret = BigDecimal.valueOf(0);
            ErrorHandler.print(4008, "non-number found", headAtom);
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

    private static<T> void quickSort(T[] arr, int left, int right, Comparator<T> comp) {
        int i = left, j = right;
        T tmp;
        T pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (comp.compare(arr[i], pivot) < 0) {
                i++;
            }

            while (comp.compare(arr[j], pivot) > 0) {
                j--;
            }

            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        if (left < j)
            quickSort(arr, left, j, comp);
        if (i < right)
            quickSort(arr, i, right, comp);
    }

    public static<T> void quickSort(T[] arr, Comparator<T> comp) {
        quickSort(arr, 0, arr.length - 1, comp);
    }
}
