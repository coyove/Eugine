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
        if (args.length == 0)
            return;

        if (args[0].equals("--repl")) {
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

                    if (line.endsWith("~c")) {
                        multi = false;
                        multiLine = "";
                        continue;
                    }
                } else {
                    indicator = (++linec).toString() + " > ";
                    System.out.print(indicator);
                    line = System.console().readLine();
                }

                if (line.equals("~q"))
                    return;

                try {
                    Compound c = p.parse(line, "", "<vm>");

                    System.out.printf("res%d: %s\n", linec, SExpression.cast(c).evaluate(e.environment));

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
        }

        Eugine e = new Eugine();
        try {
            System.out.printf("%s", e.loadFile(args[0]).execute(e.environment));
        } catch (Exception ex) {
            if (ex instanceof VMException) {
                System.out.println("VM ERROR: " + ex.getMessage());
            } else {
                System.out.println("JVM ERROR: " + ex);
            }
        }
    }
}