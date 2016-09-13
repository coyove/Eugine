package org.coyove.eugine.util;

import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.parser.Token;

/**
 * Created by coyove on 2016/9/9.
 */
public class VMException extends Exception {
    public static String exceptionFormat = "'%1$s': %2$s, File: %3$s, Line: %4$d:%5$d";

    public VMException(String message) {
        super(message);
    }

    public VMException(String message, Token tok) {
        super(String.format(exceptionFormat,
                tok.value, message, tok.source, tok.line + 1, tok.lineIndex));
    }

    public VMException(String message, Atom a) {
        super(String.format(exceptionFormat,
                a.token.value, message, a.token.source, a.token.line + 1, a.token.lineIndex));
    }
}
