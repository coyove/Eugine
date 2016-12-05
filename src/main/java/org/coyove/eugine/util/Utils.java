package org.coyove.eugine.util;

import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.core.PLambda;
import org.coyove.eugine.core.PVariable;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.pm.Exportable;
import org.coyove.eugine.value.*;

import java.lang.reflect.Field;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Formatter;

/**
 * Created by coyove on 2016/9/10.
 */
public final class Utils {
    @SuppressWarnings("unchecked")
    public static void loadExportables(String classname) {
        try {
            Class<? extends Exportable> cls = (Class<? extends Exportable>)
                    ClassUtils.getClass(classname + ".EgExport");
            cls.newInstance().export(SKeywords.Lookup);
        } catch (Exception e) {
            ErrorHandler.print(9987, "error when importing " + classname + ": " + e, null);
        }
    }

    public static String getFileName(String path) {
        try {
            Path p = Paths.get(path);
            return p.getFileName().toString();
        } catch (Exception e) {
            return "";
        }
    }

    public static String getDirectoryName(String path) {
        try {
            Path p = Paths.get(path);
            String name = p.getFileName().toString();
            return path.substring(0, path.length() - name.length());
        } catch (Exception e) {
            return "";
        }
    }

    public static SValue denormalize(SValue v) {
        if (v == ExecEnvironment.True) {
            return new SBool(true);
        } else if (v == ExecEnvironment.False) {
            return new SBool(false);
        } else if (v == ExecEnvironment.Null) {
            return new SNull();
        } else {
            return v;
        }
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

    @SuppressWarnings("unchecked")
    public static void replaceVariables(SExpression expr, ListEx<String> from, ListEx<SExpression> to) {
        if (expr == null) {
            return;
        }

        try {
            for (Field f : expr.getClass().getDeclaredFields()) {
                f.setAccessible(true);
                Object obj = f.get(expr);
                if (obj == null) {
                    continue;
                }

                if (f.getAnnotation(ReplaceableVariable.class) != null) {
                    SExpression se = (SExpression) obj;
                    if (se instanceof PVariable) {
                        String name = ((PVariable) se).varName;
                        int idx = from.indexOf(name);
                        if (idx > -1) {
                            f.set(expr, to.get(idx));
                        }
                    } else {
                        replaceVariables(se, from, to);
                    }
                } else if (f.getAnnotation(ReplaceableVariables.class) != null) {
                    // special case, lambda's arguments may collide with the names in "from"
                    ListEx<String> _from = from;
                    ListEx<SExpression> _to = to;
                    if (expr instanceof PLambda) {
                        _from = (ListEx<String>) from.clone();
                        _to = (ListEx<SExpression>) to.clone();
                        for (String la : ((PLambda) expr).arguments) {
                            for (int i = 0; i < _from.size(); i++) {
                                if (_from.get(i).equals(la)) {
                                    _from.remove(i);
                                    _to.remove(i);
                                    break;
                                }
                            }
                        }
                    }

                    ListEx<SExpression> ses = (ListEx<SExpression>) obj;
                    for (int i = 0; i < ses.size(); i++) {
                        SExpression se = ses.get(i);
                        if (se instanceof PVariable) {
                            String name = ((PVariable) se).varName;
                            int idx = _from.indexOf(name);
                            if (idx > -1) {
                                ses.set(i, _to.get(idx));
                            }
                        } else {
                            replaceVariables(se, _from, _to);
                            ses.set(i, se);
                        }
                    }
                } else if (obj instanceof Branch) {
                    ((Branch) obj).replaceBranch(from, to);
                } else if (f.getName().equals("branches")) {
                    // special case of switch ... do {}
                    for (Branch b : ((ListEx<Branch>) obj)) {
                        b.replaceBranch(from, to);
                    }
                }
            }
        } catch (Exception e) {
            // nothing
            e.printStackTrace();
        }
    }

    private static <T> void quickSort(T[] arr, int left, int right, Comparator<T> comp) {
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

    public static <T> void quickSort(T[] arr, Comparator<T> comp) {
        quickSort(arr, 0, arr.length - 1, comp);
    }

    public static void print(String text, int pad) {
        System.out.println(DateFormatUtils.format(System.currentTimeMillis(), "[hh:mm:ss] ") +
                StringUtils.leftPad("", pad, " ") + text);
    }

    public static void print(String text) {
        print(text, 0);
    }

    public static boolean checkExit(SValue v) {
        if (v == ExecEnvironment.False) {
            return true;
        }

        return v instanceof SBool && !((Boolean) v.underlying);
    }

    public static boolean isBooleanTrue(SValue v) {
        if (v == ExecEnvironment.True) {
            return true;
        }

        if (v == ExecEnvironment.False) {
            return false;
        }

        if (v instanceof SBool) {
            return (Boolean) v.underlying;
        }

        return false;
    }

    public static SValue tryGuessBits(String text) {
        long num = Long.parseLong(text);
        if (num < Integer.MAX_VALUE && num > Integer.MIN_VALUE) {
            return new SInt((int) num);
        } else {
            return new SLong(num);
        }
    }
}
