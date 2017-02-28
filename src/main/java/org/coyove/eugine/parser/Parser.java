package org.coyove.eugine.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.coyove.eugine.antlr.EugineImportListener;
import org.coyove.eugine.antlr.EugineLexer;
import org.coyove.eugine.antlr.EugineParser;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.library.log;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.SString;

import java.io.IOException;

/**
 * Created by coyove on 2016/10/30.
 */
public class Parser {
    public static SValue executeFile(String source, ExecEnvironment env) {
        try {
            return execute(new ANTLRFileStream(source), env, source);
        } catch (IOException e) {
            log.Logger.error("file not found: " + source);
            System.exit(1);
        }

        return null;
    }

    public static SValue executeCode(String source, ExecEnvironment env) {
        return execute(new ANTLRInputStream(source), env, "");
    }

    private static SValue execute(ANTLRInputStream stream, ExecEnvironment env, String source) {
        EugineLexer lexer = new EugineLexer(stream);
        log.Logger.debug("lexical analysis: " + source);
        String filename = Utils.getFileName(source);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EugineParser parser = new EugineParser(tokens);

        log.Logger.debug("enter parsing stage");

        long ss = System.currentTimeMillis();
        EugineParser.ProgContext pc;

        try {
            parser.setErrorHandler(new BailErrorStrategy());
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
            pc = parser.prog();
        } catch (ParseCancellationException e) {
            log.Logger.info(filename + " fallback to LL mode");

            parser.reset();
            parser.setErrorHandler(new DefaultErrorStrategy());
            parser.getInterpreter().setPredictionMode(PredictionMode.LL);
            pc = parser.prog();
        }

        log.Logger.debug("finish parsing " + filename + " in " + (System.currentTimeMillis() - ss) + "ms");

        ParseTreeWalker walk = new ParseTreeWalker();
        EugineImportListener eil = new EugineImportListener();

        SValue oldPath = env.get("__path__");
        SValue oldFile = env.get("__file__");

        eil.env = env;
        eil.env.put("__path__", new SString(Utils.getDirectoryName(source)));
        eil.env.put("__file__", new SString(filename));

        walk.walk(eil, pc);
        Utils.replaceVariables(pc.v, new CascadeHashMap<String, SExpression>());

        SValue ret = null;
        try {
            ret = pc.v.evaluate(eil.env);
        } catch (Exception e) {
            if (e instanceof EgException)
                ((EgException) e).exit();

            e.printStackTrace();
            EgException.exit(0, "unhandled exception: " + e.getMessage(), null);
        }

        if (oldPath != null) env.put("__path__", oldPath);
        if (oldFile != null) env.put("__file__", oldFile);

        log.Logger.debug("finished " + source);

        return ret;
    }
}
