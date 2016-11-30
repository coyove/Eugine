package org.coyove.eugine.util;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.coyove.cli.main;
import org.coyove.eugine.antlr.EugineImportListener;
import org.coyove.eugine.antlr.EugineLexer;
import org.coyove.eugine.antlr.EugineParser;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.value.SString;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by coyove on 2016/10/30.
 */
public class ANTLRHelper {
    public static SValue executeFile(String source, ExecEnvironment env) {
        if (main.options.verbose) {
            System.out.println("Loading " + source);
        }

        CharStream afs = null;
        try {
            afs = new ANTLRFileStream(source);
        } catch (IOException e) {
            System.out.println("File not found: " + source);
            System.exit(1);
        }

        EugineLexer lexer = new EugineLexer(afs);
        if (main.options.verbose) {
            System.out.println("    Lexer");
        }

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EugineParser parser = new EugineParser(tokens);
        if (main.options.verbose) {
            System.out.println("    Parsing");
        }

        EugineParser.ProgContext pc = parser.prog();

        ParseTreeWalker walk = new ParseTreeWalker();
        EugineImportListener eil = new EugineImportListener();

        SValue oldPath = env.get("__path__");
        SValue oldFile = env.get("__file__");

        eil.env = env;
        eil.env.put("__path__", new SString(Utils.getDirectoryName(source)));
        eil.env.put("__file__", new SString(Utils.getFileName(source)));

        if (main.options.verbose) {
            System.out.println("    Walking");
        }
        walk.walk(eil, pc);

        try {
            SValue ret = pc.v.execute(eil.env);

            env.put("__path__", oldPath);
            env.put("__file__", oldFile);

            if (main.options.verbose) {
                System.out.println("Finished " + source);
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
