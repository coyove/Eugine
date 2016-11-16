package org.coyove.eugine.util;

import org.coyove.eugine.parser.Atom;

/**
 * Created by coyove on 2016/10/30.
 */
public class ErrorHandler {
    public static void print(int errCode, String errMessage, Atom ha) {
        System.out.println((new EgException(errCode, errMessage, ha)).toString());
        System.exit(errCode);
    }

    public static void print(EgException ex) {
        System.out.println(ex.toString());
        System.exit(ex.errorCode);
    }
}
