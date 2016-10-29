package org.coyove.test;

import java.lang.System;
import org.coyove.eugine.*;
import org.coyove.eugine.antlr.EugineLexer;
import org.coyove.eugine.antlr.EugineParser;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.parser.Compound;
import org.coyove.eugine.parser.Parser;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.VMException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

import static org.coyove.test.REPLTask.multi;
import static org.coyove.test.REPLTask.multiLine;

final class REPLTask implements Runnable {
    public int line;
    public String code;
    public ExecEnvironment env;

    public static boolean multi = false;
    public static String multiLine = "";
    public static SExpression sExpr;

    public void run() {
        try {
            Parser p = new Parser();
            Compound c = p.parse(code, "", "<vm>");
            sExpr = SExpression.cast(c);

            System.out.printf("res%d: %s\n", line, sExpr.evaluate(env));
        } catch (VMException ex) {
            if (ex.errorCode == 1000) {
                multi = true;
                multiLine = code;

                return;
            } else {
                System.out.printf("err%d: %s\n", line, ex.getMessage());
            }
        }

        multi = false;
        multiLine = "";
    }
}

public class main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("./tests/antlr.eugine");

            ANTLRInputStream input = new ANTLRInputStream(is);
            EugineLexer lexer = new EugineLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // lexer.reset();
            EugineParser parser = new EugineParser(tokens);
            Eugine e = new Eugine();
            EugineParser.ProgContext pc = parser.prog();
            System.out.println(pc.v.execute(e.environment));
            System.out.println(pc.toStringTree(parser));


        } catch (Exception e) {
            e.printStackTrace();
        }

        if (1==1) return;

        if (args.length == 0) {
            return;
        }

        if (args[0].equals("--repl")) {
            Integer linec = 0;
            Eugine e = new Eugine();
            String indicator = "";

            System.out.println("+------------------+");
            System.out.println("| Eugine REPL beta |");
            System.out.println("+------------------+");
            System.out.println("Typing '~q' to quit, '~c' to abandon the code and start new\n");

            while (true) {
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

                REPLTask task = new REPLTask();
                task.code = line;
                task.line = linec;
                task.env = e.environment;
                final Thread t = new Thread(task);
                t.start();

                try {
                    t.join();
                } catch (InterruptedException iex) {
                    System.out.println("int");
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
                ex.printStackTrace();
            }
        }
    }
}