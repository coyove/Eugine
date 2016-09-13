package org.coyove.test;

import java.lang.System;
import org.coyove.eugine.*;

public class main {
    public static void main(String[] args) {
        Eugine e = new Eugine();
        try {
            e.loadFile(args[0]).execute(e.environment);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}