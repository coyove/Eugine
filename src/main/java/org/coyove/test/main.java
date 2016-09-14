package org.coyove.test;

import java.lang.System;

import org.coyove.eugine.*;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Compound;
import org.coyove.eugine.parser.Parser;
import org.coyove.eugine.util.VMException;

public class main {
    public static void main(String[] args) {
        Integer linec = 0;
        Eugine e = new Eugine();
        boolean multi = false;
        String multiLine = "";
        String indicator = "";

        while (true) {
            Parser p = new Parser();
            String line;

            if (multi) {
                System.out.printf("%" + (indicator.length() - 2) + "s| ", " ");

                multiLine += "\n" + System.console().readLine();
                line = multiLine;
            } else {
                indicator = (++linec).toString() + " > ";
                System.out.print(indicator);
                line = System.console().readLine();
            }

            try {
                Compound c = p.parse(line, "", "<vm>");
                SValue ret = SExpression.cast(c).evaluate(e.environment);
                String[] rets = ret.toString().split("\\.");

                System.out.printf("%" + (indicator.length() - 2) + "s= %s\n", " ",
                        rets[rets.length - 1].substring(1));

                multi = false;
                multiLine = "";
            } catch (VMException ex) {
                if (ex.errorCode == 1000) {
                    multi = true;
                    multiLine = line;
                } else {
                    System.out.println("ERROR: " + ex.getMessage());
                }
            }

        }

//
//        try {
//            e.loadFile(args[0]).execute(e.environment);
//        } catch (Exception ex) {
//            System.out.println("ERROR: " + ex.getMessage());
//        }
    }
}