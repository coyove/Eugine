package org.coyove.eugine.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.coyove.cli.OptionsHost;
import org.coyove.cli.main;
import org.coyove.eugine.antlr.EugineImportListener;
import org.coyove.eugine.antlr.EugineLexer;
import org.coyove.eugine.antlr.EugineParser;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ErrorHandler;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.Utils;
import org.coyove.eugine.value.SString;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by coyove on 2016/10/30.
 */
public class Parser {
    public static SValue executeFile(String source, ExecEnvironment env) {
        return executeFile(source, env, 0);
    }

    public static SValue executeFile(String source, ExecEnvironment env, int pad) {
        if (main.options.verbose) {
            Utils.print("Load " + source, pad);
        }

        CharStream afs = null;
        try {
            afs = new ANTLRFileStream(source);
        } catch (IOException e) {
            Utils.print("File not found: " + source, pad);
            System.exit(1);
        }

        EugineLexer lexer = new EugineLexer(afs);
        if (main.options.verbose) {
            Utils.print("Lexical analysis", pad + 2);
        }

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EugineParser parser = new EugineParser(tokens);
        if (main.options.verbose) {
            Utils.print("Enter parsing stage", pad + 2);
        }

        EugineParser.ProgContext pc = parser.prog();

        ParseTreeWalker walk = new ParseTreeWalker();
        EugineImportListener eil = new EugineImportListener();

        SValue oldPath = env.get("__path__");
        SValue oldFile = env.get("__file__");

        eil.env = env;
        eil.pad = pad + 4;
        eil.env.put("__path__", new SString(Utils.getDirectoryName(source)));
        eil.env.put("__file__", new SString(Utils.getFileName(source)));

        if (main.options.verbose) {
            Utils.print("Walk the tree", pad + 2);
        }
        walk.walk(eil, pc);

        try {
            if (main.options.delayExec && pad == 0) {
                if (main.options.verbose) {
                    Utils.print("Waiting signal to continue", pad + 2);
                }

                synchronized (OptionsHost.Options.delayExecLock) {
                    try {
                        OptionsHost.Options.delayExecLock.wait();
                    } catch (InterruptedException e) {
                        // Shouldn't happen
                    }
                }
            }

            if (main.options.verbose) {
                Utils.print("Execute SExpression", pad + 2);
            }

            SValue ret = pc.v.execute(eil.env);

            env.put("__path__", oldPath);
            env.put("__file__", oldFile);

            if (main.options.verbose) {
                Utils.print("Finished " + source, pad);
            }

            return ret;
        } catch (EgException e) {
            ErrorHandler.print(e);
            return null;
        }
    }

    public static SValue executeCode(String source, ExecEnvironment env) {
        CharStream afs = new ANTLRInputStream(source);

        EugineLexer lexer = new EugineLexer(afs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EugineParser parser = new EugineParser(tokens);
        EugineParser.ProgContext pc = parser.prog();

        ParseTreeWalker walk = new ParseTreeWalker();
        EugineImportListener eil = new EugineImportListener();

        SValue oldPath = env.get("__path__");
        SValue oldFile = env.get("__file__");

        eil.env = env;
        eil.env.put("__path__", new SString("vm"));
        eil.env.put("__file__", new SString("vm"));
        walk.walk(eil, pc);

        try {
            SValue ret = pc.v.execute(eil.env);

            env.put("__path__", oldPath);
            env.put("__file__", oldFile);

            return ret;
        } catch (EgException e) {
            ErrorHandler.print(e);
            return null;
        }
    }
}
