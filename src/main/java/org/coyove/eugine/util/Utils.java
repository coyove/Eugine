package org.coyove.eugine.util;

import org.apache.commons.lang3.StringEscapeUtils;
import org.coyove.eugine.base.SKeywords;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.pm.Exportable;
import org.coyove.eugine.value.*;
import org.reflections.Reflections;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Formatter;

/**
 * Created by coyove on 2016/9/10.
 */
public final class Utils {
    public static void importExportables() {
        Reflections r = new Reflections("");
        for (Class<? extends Exportable> cls : r.getSubTypesOf(Exportable.class)) {
            try {
                cls.newInstance().export(SKeywords.Lookup);
            } catch (Exception e) {
                ErrorHandler.print(9987, "error when importing " + cls.getSimpleName() + ": " + e, null);
            }
        }
    }

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
    public static <T> T cast(Object obj, Class<T> cls, EgException ex) throws EgException {
        if (cls.isInstance(obj)) {
            return (T) obj;
        } else {
            throw ex;
        }
    }

    public static boolean getBoolean(SValue num, Atom headAtom) {
        if (num instanceof SInteger) {
            return num.<Long>get() != 0;
        } else if (num instanceof SDouble) {
            return Math.abs(num.<Double>get()) > 1e-6;
        } else if (num instanceof SBool) {
            return num.get();
        } else if (num instanceof SNull) {
            return false;
        } else if (num instanceof SString) {
            return !num.<String>get().isEmpty();
        } else {
            ErrorHandler.print(4008, num + " is not a boolean", headAtom);
            return false;
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
            ErrorHandler.print(4008, num + " is not a number", headAtom);
        }

        return ret;
    }

    public static Double getDouble(SValue num, Atom headAtom) throws EgException {
        Double ret;

        if (num instanceof SInteger) {
            ret = num.<Long>get().doubleValue();
        } else if (num instanceof SDouble) {
            ret = num.<Double>get();
        } else {
            throw new EgException(4007, num + " is not a number", headAtom);
        }

        return ret;
    }

    public static Long getLong(SValue num, Atom headAtom) throws EgException {
        Long ret;

        if (num instanceof SInteger) {
            ret = num.<Long>get();
        } else if (num instanceof SDouble) {
            ret = num.<Double>get().longValue();
        } else {
            throw new EgException(4007, num + " is not a number", headAtom);
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

    public static String unescape(String raw) {
        if (raw.charAt(0) == '@') {
            raw = raw.substring(2, raw.length() - 1);
            return raw.replace("\"\"", "\"");
        } else {
            raw = raw.substring(1, raw.length() - 1);
            return StringEscapeUtils.unescapeJava(raw);
        }
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
