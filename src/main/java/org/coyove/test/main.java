package org.coyove.test;

import java.lang.System;
import java.util.HashMap;

import org.coyove.eugine.*;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.SInt;
import org.coyove.eugine.value.SNull;

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

    }
}

public class main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Utils.importExportables();
        try {
//            HashMap<String, SValue> map = new HashMap<String, SValue>();
//            map.put("test", new SInt(1));
//            map.put("test2", new SInt(2));
//
//            EgFastMap<SValue> zzz = new EgFastMap<SValue>();
//            zzz.put("test1", new SInt(1));
//            zzz.put("test2", new SInt(2));
//            zzz.put("test3", new SInt(2));
//            zzz.put("test4", new SInt(2));
//            zzz.put("test5", new SInt(2));
//            zzz.put("test6", new SInt(2));
//            zzz.put("test7", new SInt(2));
//            zzz.put("test8", new SInt(2));
//
//            long start = System.currentTimeMillis();
//            for (long i = 0; i < 1000000000l; i++) {
//                map.put("test4", map.get("test3"));
//            }
//            System.out.println(System.currentTimeMillis() - start);

            Eugine e = new Eugine();
            System.out.println(ANTLRHelper.executeFile(args[0], e.environment));
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
    }
}