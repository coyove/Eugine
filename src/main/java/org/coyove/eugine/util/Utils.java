package org.coyove.eugine.util;

import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.core.PLambda;
import org.coyove.eugine.core.PSet;
import org.coyove.eugine.core.PVariable;
import org.coyove.eugine.pm.Exportable;
import org.coyove.eugine.value.SBool;

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

    public static void addLetExprToReplacer(SExpression se, CascadeHashMap<String, SExpression> replacer) {
        if (se instanceof PSet && ((PSet) se).type == PSet.LET) {
            PVariable v = (PVariable) ((PSet) se).name;
            v.isShared = true;
            replacer.put(v.name, v);
        }
    }

    @SuppressWarnings("unchecked")
    public static void replaceVariables(SExpression expr,
                                        CascadeHashMap<String, SExpression> replacer) {
        if (expr == null) {
            return;
        }

        if (expr instanceof PSet) {
            SExpression v = ((PSet) expr).value;
            if (v instanceof PVariable) {
                SExpression r = replacer.get(((PVariable) v).name);
                if (r != null) {
                    ((PSet) expr).value = r;
                }
            } else {
                replaceVariables(v, replacer);
            }

            SExpression name = ((PSet) expr).name;
            PSet set = ((PSet) expr);

            if (name instanceof PVariable) {
                String pname = ((PVariable) name).name;
                if (set.type == PSet.LET) {
                    ((PVariable) name).isShared = true;
                    replacer.put(pname, name);
                } else if (set.type == PSet.SET) {
                    if (replacer.containsKey(pname)) {
                        set.name = replacer.get(pname);
                    }
                }
            } else {
                replaceVariables(name, replacer);
            }

            return;
        }

        try {
            for (Field f : expr.getClass().getDeclaredFields()) {
                f.setAccessible(true);
                Object obj = f.get(expr);
                if (obj == null) {
                    continue;
                }

                CascadeHashMap<String, SExpression> _replacer = replacer;
                if (f.getAnnotation(ReplaceableVariable.class) != null) {
                    SExpression se = (SExpression) obj;
                    if (se instanceof PVariable) {
                        SExpression r = replacer.get(((PVariable) se).name);
                        if (r != null) {
                            f.set(expr, r);
                        }
                    } else {
                        replaceVariables(se, replacer);
                    }
                } else if (f.getAnnotation(ReplaceableVariables.class) != null) {
                    // special case, lambda's arguments may collide with the names in "from"
                    if (expr instanceof PLambda) {
                        _replacer = replacer.clone();
                        for (String la : ((PLambda) expr).argNames) {
                            _replacer.remove(la);
                        }
                    }

                    ListEx<SExpression> ses = (ListEx<SExpression>) obj;
                    for (int i = 0; i < ses.size(); i++) {
                        SExpression se = ses.get(i);
                        if (se instanceof PVariable) {
                            SExpression r = _replacer.get(((PVariable) se).name);
                            if (r != null) {
                                ses.set(i, r);
                            }
                        } else {
                            replaceVariables(se, _replacer);
                            ses.set(i, se);
                        }
                    }
                } else if (obj instanceof Branch) {
                    ((Branch) obj).replaceBranch(replacer);
                } else if (f.getName().equals("branches")) {
                    // special case of switch ... do {}
                    for (Branch b : ((ListEx<Branch>) obj)) {
                        b.replaceBranch(replacer);
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

    public static void printf(int pad, String text, Object... params) {
        System.out.println(DateFormatUtils.format(System.currentTimeMillis(), "[hh:mm:ss] ") +
                StringUtils.leftPad("", pad, " ") +  String.format(text, params));
    }

    public static void print(String text) {
        print(text, 0);
    }

    public static void printf(String text, Object... params) {
        print(String.format(text, params), 0);
    }

    public static boolean checkExit(SValue v) {
        if (v == ExecEnvironment.False || v == ExecEnvironment.Break) {
            return true;
        }

        return false;
    }

    public static boolean isBooleanTrue(SValue v) {
        if (v == ExecEnvironment.True) {
            return true;
        }

        if (v == ExecEnvironment.False) {
            return false;
        }

        return false;
    }
}
