package org.coyove.test;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.System;
import org.coyove.eugine.*;
import org.coyove.eugine.base.SConfig;
import org.coyove.eugine.util.*;

public class main {
    public static ArgumentsParser.Arguments options = null;

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        options = ArgumentsParser.read(args);

        if (!options.isEnabled("core")) {
            Utils.importExportables();
        }

        if (options.isEnabled("aggressive")) {
            SConfig.strictForLoop = false;
        }

        if (options.getSource() != null) {
            try {
                Eugine e = new Eugine();
                System.out.println(ANTLRHelper.executeFile(args[0], e.environment));
            } catch (Exception e) {
                e.printStackTrace();
            }

            return;
        }

        if (options.isEnabled("repl")) {
            Integer lineCount = 0;
            Eugine e = new Eugine();
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
                    System.out.println(ANTLRHelper.executeCode(code, e.environment));
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
        if (options.isEnabled("no-robot")) {
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
                }
            }
        } catch(Exception aex) {
        }
    }
}