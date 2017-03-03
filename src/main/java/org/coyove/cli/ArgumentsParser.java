package org.coyove.cli;

import org.coyove.eugine.library.log;
import org.coyove.eugine.util.ListEx;

/**
 * Created by coyove on 2016/11/22.
 */
public class ArgumentsParser {
    public static class Options {
        public String source = null;

        public String outputBinaries = "";

        public boolean repl = false;

        public boolean binary = false;
    }

    public static Options read(String[] args) {
        int i = 0;
        Options ret = new Options();

        try {
            while (i < args.length) {
                if (args[i].equals("--repl") || args[i].equals("-r")) {
                    ret.repl = true;
                    i++;
                } else if (args[i].equals("--binary") || args[i].equals("-b")) {
                    ret.binary = true;
                    i++;
                } else if (args[i].equals("--binary-output") || args[i].equals("-bo")) {
                    ret.outputBinaries = args[i + 1];
                    i += 2;
                } else if (args[i].equals("--version")) {
                    System.out.println("eugine " + main.VERSION);
                    System.exit(0);
                } else if (args[i].equals("--verbose") || args[i].equals("-v")) {
                    if (args[i + 1].equals("debug"))
                        log.Logger.logLevel = log.Logger.DEBUG;
                    else if (args[i + 1].equals("info"))
                        log.Logger.logLevel = log.Logger.INFO;
                    else if (args[i + 1].equals("warn"))
                        log.Logger.logLevel = log.Logger.WARN;
                    else if (args[i + 1].equals("error"))
                        log.Logger.logLevel = log.Logger.ERROR;
                    else
                        log.Logger.warn("ignoring argument: " + args[i + 1]);

                    i += 2;
                } else {
                    ret.source = args[i];
                    i++;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            log.Logger.warn("invalid arguments");
            System.exit(1);
        }

        return ret;
    }
}
