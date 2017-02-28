package org.coyove.eugine.util;

import org.coyove.cli.main;
import org.coyove.eugine.library.log;
import org.coyove.eugine.parser.Atom;

/**
 * Created by coyove on 2016/9/9.
 */
public class EgException extends Exception {
    public int errorCode = 0;

    public Atom src;

    public EgException(String message) {
        super(message);
    }

    public EgException(int code, String message) {
        super(message);
        errorCode = code;
    }

    public EgException(String message, Atom a) {
        super(message);
        src = a;
    }

    public EgException(int code, String message, Atom a) {
        this(message, a);
        errorCode = code;
    }

    @Override
    public String toString() {
        return formatMessage(src, errorCode, getMessage());
    }

    @SuppressWarnings("MalformedFormatString")
    private static String formatMessage(Atom src, int errorCode, String msg) {
        return src == null ?
                String.format("err%d: %s", errorCode, msg) :
                String.format("err%d at '%s': %s, file: %s, line: %d:%d",
                        errorCode, src.value, msg, src.source, src.line + 1, src.lineIndex);
    }

    public static void exit(int errCode, String errMessage, Atom ha) {
        log.Logger.error(formatMessage(ha, errCode, errMessage));

        if (!main.options.repl) System.exit(errCode);
    }

    public static void exit(EgException ex) {
        exit(ex.errorCode, ex.getMessage(), ex.src);
    }

    public void exit() {
        this.printStackTrace();
        exit(errorCode, getMessage(), src);
    }


    public interface EgExceptionHandler {
        EgException raise(Atom atom, Object... ex);
    }

    public static final EgExceptionHandler CANNOT_IMPORT_LIBRARY = new EgExceptionHandler() {
        public EgException raise(Atom atom, Object... ex) {
            return new EgException(1101,
                    "cannot import library '" + ex[0] + "', " + ((Exception) ex[1]).getMessage(), atom);
        }
    };

    public static final EgExceptionHandler NOT_ENOUGH_ARGUMENTS = new EgExceptionHandler() {
        public EgException raise(Atom atom, Object... ex) {
            return new EgException(1201, "not enough arguments, expecting " + ex[0], atom);
        }
    };

    public static final EgExceptionHandler INVALID_FUNCTION = new EgExceptionHandler() {
        public EgException raise(Atom atom, Object... ex) {
            if (ex.length >= 1)
                return new EgException(1202, "invalid function '" + ex[0] + "'", atom);
            else
                return new EgException(1202, "invalid function", atom);
        }
    };

    public static final EgExceptionHandler INVALID_LET_EXPR = new EgExceptionHandler() {
        public EgException raise(Atom atom, Object... ex) {
            return new EgException(1203, "cannot use 'let' here", atom);
        }
    };

    public static final EgExceptionHandler INVALID_VARIABLE_NAME = new EgExceptionHandler() {
        public EgException raise(Atom atom, Object... ex) {
            return new EgException(1204, "invalid variable name", atom);
        }
    };

    public static final EgExceptionHandler INVALID_FIELD = new EgExceptionHandler() {
        public EgException raise(Atom atom, Object... ex) {
            if (ex.length >= 1)
                return new EgException(1205, "invalid field/key/p_call '" + ex[0] + "'", atom);
            else
                return new EgException(1205, "invalid field/key/p_call/subject", atom);
        }
    };

    public static final EgExceptionHandler INVALID_SUBJECT = new EgExceptionHandler() {
        public EgException raise(Atom atom, Object... ex) {
            if (ex.length >= 1)
                return new EgException(1206, "invalid subject '" + ex[0] + "'", atom);
            else
                return new EgException(1206, "invalid subject", atom);
        }
    };

    public static final EgExceptionHandler INVALID_NUMBER = new EgExceptionHandler() {
        public EgException raise(Atom atom, Object... ex) {
            if (ex.length >= 1)
                return new EgException(1207, "invalid number '" + ex[0] + "'", atom);
            else
                return new EgException(1207, "invalid number", atom);
        }
    };

    public static final EgExceptionHandler INVALID_TYPENAME = new EgExceptionHandler() {
        public EgException raise(Atom atom, Object... ex) {
            return new EgException(1208, "invalid typename", atom);
        }
    };

    public static final EgExceptionHandler INDEX_OUT_OF_RANGE = new EgExceptionHandler() {
        public EgException raise(Atom atom, Object... ex) {
            return new EgException(2001, "index out of range", atom);
        }
    };

    public static final EgExceptionHandler DIVIDED_BY_ZERO = new EgExceptionHandler() {
        public EgException raise(Atom atom, Object... ex) {
            return new EgException(2002, "divided by zero", atom);
        }
    };
}
