package org.coyove.eugine.util;

import org.coyove.eugine.parser.Atom;

/**
 * Created by coyove on 2016/9/9.
 */
public class EgException extends Exception {
    public static String exceptionFormat = "'%1$s': %2$s, File: %3$s, Line: %4$d:%5$d";
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
        return src == null ? super.getMessage() : String.format(exceptionFormat,
                src.token.value, super.getMessage(), src.token.source, src.token.line + 1, src.token.lineIndex);
    }
}
