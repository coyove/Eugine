package org.coyove.eugine.util;

import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.parser.Token;

/**
 * Created by coyove on 2016/9/9.
 */
public class EgException extends Exception {
    public static String exceptionFormat = "'%1$s': %2$s, File: %3$s, Line: %4$d:%5$d";
    public int errorCode = 0;

    public EgException(String message) {
        super(message);
    }

    public EgException(int code, String message) {
        super(message);
        errorCode = code;
    }

    public EgException(String message, Token tok) {
        super(tok == null ? message : String.format(exceptionFormat,
                tok.value, message, tok.source, tok.line + 1, tok.lineIndex));
    }

    public EgException(String message, Atom a) {
        super(a == null ? message : String.format(exceptionFormat,
                a.token.value, message, a.token.source, a.token.line + 1, a.token.lineIndex));
    }

    public EgException(int code, String message, Atom a) {
        this(message, a);
        errorCode = code;
    }

    public EgException(int code, String message, Token a) {
        this(message, a);
        errorCode = code;
    }
}
