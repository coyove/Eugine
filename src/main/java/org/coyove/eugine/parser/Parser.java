package org.coyove.eugine.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.coyove.cli.OptionsHost;
import org.coyove.cli.main;
import org.coyove.eugine.antlr.EugineImportListener;
import org.coyove.eugine.antlr.EugineLexer;
import org.coyove.eugine.antlr.EugineParser;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.SString;

import java.io.IOException;

/**
 * Created by coyove on 2016/10/30.
 */
public class Parser {
    public static SValue executeFile(String source, ExecEnvironment env) {
        try {
            return execute(new ANTLRFileStream(source), env, source, 0);
        } catch (IOException e) {
            Utils.print("File not found: " + source, 0);
            System.exit(1);
        }

        return null;
    }

    public static SValue executeCode(String source, ExecEnvironment env) {
        return execute(new ANTLRInputStream(source), env, "", 0);
    }

    public static SValue execute(ANTLRInputStream stream, ExecEnvironment env, String source, int pad) {
        EugineLexer lexer = new EugineLexer(stream);
        if (main.options.verbose) {
            Utils.print("Lexical analysis: " + source, pad + 2);
        }

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EugineParser parser = new EugineParser(tokens);
        // parser.getInterpreter().setPredictionMode(PredictionMode.SLL);

        if (main.options.verbose) {
            Utils.print("Enter parsing stage", pad + 2);
        }

        long ss = System.currentTimeMillis();
        EugineParser.ProgContext pc;

        try {
            parser.setErrorHandler(new BailErrorStrategy());
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
            pc = parser.prog();
        } catch (ParseCancellationException e) {
            Utils.print("Fallback to LL mode", pad + 2);
            parser.reset();
            parser.setErrorHandler(new DefaultErrorStrategy());
            parser.getInterpreter().setPredictionMode(PredictionMode.LL);
            pc = parser.prog();
        }

        if (main.options.verbose) {
            Utils.printf(pad + 2, "Finish parsing in %dms", System.currentTimeMillis() - ss);
        }

        ParseTreeWalker walk = new ParseTreeWalker();
        EugineImportListener eil = new EugineImportListener();

        SValue oldPath = env.get("__path__");
        SValue oldFile = env.get("__file__");

        eil.env = env;
        eil.pad = pad + 4;
        eil.env.put("__path__", new SString(Utils.getDirectoryName(source)));
        eil.env.put("__file__", new SString(Utils.getFileName(source)));

        walk.walk(eil, pc);

        try {
            if (main.options.delayExec && pad == 0) {
                if (main.options.verbose) {
                    Utils.print("Waiting signal to continue", pad + 2);
                }

                synchronized (OptionsHost.Options.delayExecLock) {
                    try {
                        OptionsHost.Options.delayExecLock.wait();
                        if (main.options.verbose) {
                            Utils.print("Execute SExpression", pad + 2);
                        }
                    } catch (InterruptedException e) {
                        // Shouldn't happen
                    }
                }
            }

            Utils.replaceVariables(pc.v, new CascadeHashMap<String, SExpression>());
            SValue ret = pc.v.execute(eil.env);

            if (oldPath != null) env.put("__path__", oldPath);
            if (oldFile != null) env.put("__file__", oldFile);

            if (main.options.verbose) {
                Utils.print("Finished " + source, pad);
            }

            return ret;
        } catch (EgException e) {
            ErrorHandler.print(e);
            return null;
        }
    }
}
