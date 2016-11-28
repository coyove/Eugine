package org.coyove.eugine.util;

import org.coyove.eugine.parser.Atom;
import org.coyove.cli.main;

/**
 * Created by coyove on 2016/10/30.
 */
public class ErrorHandler {
    public static void print(int errCode, String errMessage, Atom ha) {
        System.out.println((new EgException(errCode, errMessage, ha)).toString());

        if (!main.options.isEnabled("repl")) {
            System.exit(errCode);
        }
    }

    public static void print(EgException ex) {
        System.out.println(ex.toString());
        if (!main.options.isEnabled("repl")) {
            System.exit(ex.errorCode);
        }
    }
}
