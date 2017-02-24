package org.coyove.cli;

import org.coyove.eugine.antlr.EugineImportListener;
import org.coyove.eugine.parser.Parser;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;
import org.coyove.eugine.util.Utils;
import sun.misc.Signal;
import sun.misc.SignalHandler;

/**
 * Created by coyove on 2016/11/22.
 */
public class OptionsHost {
    public static class Options {
        public ListEx<String> imports = new ListEx<String>();
        public String source = null;
        public boolean verbose = false;
        public boolean repl = false;
        public boolean optimization = false;
        public boolean noRobot = false;
        public boolean reloadable = false;

        public boolean delayExec = false;
        public final static Object delayExecLock = new Object();
    }

    public static Options read(String[] args) {
        int i = 0;
        Options ret = new Options();
        while (i < args.length) {
            if (args[i].equals("--repl") || args[i].equals("-r")) {
                ret.repl = true;
                i++;
            } else if (args[i].equals("--opt")) {
                ret.optimization = true;
                i++;
            } else if (args[i].equals("--jar")) {
                ret.imports.add(args[i + 1]);
                i += 2;
            } else if (args[i].equals("--no-robot")) {
                ret.noRobot = true;
                i++;
            } else if (args[i].equals("--version")) {
                Utils.print("Eugine " + main.VERSION);
                System.exit(0);
            } else if (args[i].equals("--verbose")) {
                ret.verbose = true;
                i++;
            } else if (args[i].equals("--delay-exec")) {
                ret.delayExec = true;
                i++;
            } else if (args[i].equals("--reloadable")) {
                ret.reloadable = true;
                i++;
            } else {
                ret.source = args[i];
                i++;
            }
        }

        return ret;
    }

    // Non-portable code, but it's fine
    public static void addHUPHandler() {
        Signal.handle(new Signal("HUP"), new SignalHandler() {
            public void handle(Signal signal) {
                if (main.options.delayExec) {
                    Utils.print("SIGHUP received");
                    // We receive SIGHUP, continue executing the code
                    synchronized (Options.delayExecLock) {
                        Options.delayExecLock.notify();
                    }
                } else {
                    Utils.print("Reload packages");
                    for (String path : EugineImportListener.reloadablePackages) {
                        Parser.executeFile(path, ExecEnvironment.globalStaticEnv);
                    }
                }
            }
        });
    }
}
