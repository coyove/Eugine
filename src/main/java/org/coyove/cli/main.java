package org.coyove.cli;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.System;

import org.coyove.eugine.*;
import org.coyove.eugine.parser.Parser;
import org.coyove.eugine.util.*;

public class main {
    public final static String VERSION = "1.0.0rc";

    public static OptionsHost.Options options = null;

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        System.setProperty("file.encoding", "utf-8");
        options = OptionsHost.read(args);

        if (options.verbose) {
            Utils.print("Eugine started");
        }

        Eugine e = new Eugine();
        ExecEnvironment.globalStaticEnv = e.environment;

        for (String cn : options.imports) {
            Utils.loadExportables(cn);
        }

        if (options.delayExec || options.reloadable) {
            OptionsHost.addHUPHandler();
        }

        if (options.source != null) {
            try {
                // Thread.sleep(10000);
                Utils.print(Parser.executeFile(args[0], ExecEnvironment.globalStaticEnv).toString());
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            return;
        }

        if (options.repl) {
            Integer lineCount = 0;
            String indicator = "";
            boolean flag = false;
            String code = "";
            String totalCode = "";
            String lastLine = "";

            System.out.println("+------------------+");
            System.out.println("| Eugine REPL beta |");
            System.out.println("+------------------+");
            System.out.println("Type '\\q' to quit, '\\c' to abandon the code and start a new line");
            System.out.println("For more info, type '\\h'\n");

            while (true) {
                if (flag) {
                    String sp = getLeadingSpaces(lastLine);
                    System.out.printf("%" + (indicator.length() - 2) + "s| ", " ");
                    fakeInput(sp);
                    lastLine = System.console().readLine();
                    code += "\n" + lastLine;
                } else {
                    indicator = (++lineCount).toString() + " > ";
                    System.out.print(indicator);
                    lastLine = System.console().readLine();
                    code = lastLine;
                    flag = true;
                }

                if (code.endsWith("\\c")) {
                    flag = false;
                    code = "";
                    continue;
                }

                if (code.endsWith("\\q")) {
                    return;
                }

                if (lastLine.startsWith("\\e")) {
                    String filename = lastLine.substring(3).trim();
                    try {
                        OutputStream os = new FileOutputStream(filename);
                        os.write(totalCode.getBytes("utf-8"));
                        os.close();
                    } catch(Exception foe) {
                        foe.printStackTrace();
                    }
                    flag = false;
                    code = "";
                    continue;
                }

                if (code.endsWith(";")) {
                    code = code.substring(0, code.length() - 1);
                    System.out.println(Parser.executeCode(code, e.environment));
                    flag = false;
                    totalCode += code + "\n";
                    code = "";
                }
            }
            // end of inf loop
        }
    }

    private static String getLeadingSpaces(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(" ");
            } else if (s.charAt(i) == '\t') {
                sb.append("\t");
            } else {
                break;
            }
        }

        return sb.toString();
    }

    private static void fakeInput(String s) {
        if (options.noRobot) {
            return;
        }

        try {
            Robot r = new Robot();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    r.keyPress(32);
                    r.keyRelease(32);
                } else if (s.charAt(i) == '\t') {
                    r.keyPress(9);
                    r.keyRelease(9);
                } else {
                    break;
                }
            }
        } catch(Exception aex) {
        }
    }
}