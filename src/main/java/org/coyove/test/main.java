package org.coyove.test;

import java.io.*;
import java.lang.System;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.*;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

import org.coyove.eugine.*;
import org.coyove.eugine.base.ReplaceableVariable;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SKeywords;
import org.coyove.eugine.core.PAdd;
import org.coyove.eugine.parser.Compound;
import org.coyove.eugine.parser.Parser;
import org.coyove.eugine.pm.Exportable;
import org.coyove.eugine.util.ANTLRHelper;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.Utils;
import org.mapdb.DB;
import org.mapdb.DBMaker;

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
        } catch (EgException ex) {
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
        Utils.importExportables();
        try {
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