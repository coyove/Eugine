package org.coyove.eugine.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.coyove.eugine.antlr.EugineLexer;
import org.coyove.eugine.antlr.EugineParser;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.library.log;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.SString;

import java.io.*;

/**
 * Created by coyove on 2016/10/30.
 */
public class Parser {
    public static SValue executeFile(String source) {
        return executeFile(source, new ExecEnvironment());
    }

    public static SValue executeCode(String source) {
        return executeCode(source, new ExecEnvironment());
    }

    public static SValue executeFile(String source, ExecEnvironment env) {
        try {
            return execute(new ANTLRFileStream(source), env, source);
        } catch (IOException e) {
            EgException.INTERNAL_ERROR.raise(null, e).exit();
        }

        return null;
    }

    public static SExpression compileFile(String source, String dest) {
        try {
            SExpression expr = source.endsWith(".seu") ?
                    compileSExpression(source) : compileSExpression(new ANTLRFileStream(source));

            FileOutputStream fileOut = new FileOutputStream(dest);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(expr);
            out.close();
            fileOut.close();

            return expr;
        } catch (IOException e) {
            EgException.INTERNAL_ERROR.raise(null, e).exit();
        }

        return null;
    }

    public static SValue executeCode(String source, ExecEnvironment env) {
        return execute(new ANTLRInputStream(source), env, "");
    }

    private static SExpression compileSExpression(String filename) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
            SExpression s = (SExpression) in.readObject();
            in.close();

            return s;
        } catch (Exception e) {
            EgException.INTERNAL_ERROR.raise(null, e).exit();
            return null;
        }
    }

    private static SExpression compileSExpression(ANTLRInputStream stream) {
        EugineLexer lexer = new EugineLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EugineParser parser = new EugineParser(tokens);

        log.Logger.debug("enter parsing stage");
        EugineParser.ProgContext pc;

        try {
            parser.setErrorHandler(new BailErrorStrategy());
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
            pc = parser.prog();
        } catch (ParseCancellationException e) {
            log.Logger.info("fallback to LL mode");

            parser.reset();
            parser.setErrorHandler(new DefaultErrorStrategy());
            parser.getInterpreter().setPredictionMode(PredictionMode.LL);
            pc = parser.prog();
        }

        Utils.replaceVariables(pc.v, new CascadeHashMap<String, SExpression>());

        return pc.v;
    }

    private static SValue execute(ANTLRInputStream stream, ExecEnvironment env, String source) {
        log.Logger.debug("lexical analysis: " + source);
        String filename = Utils.getFileName(source);

        long ss = System.currentTimeMillis();
        SExpression expr = source.endsWith(".seu") ? compileSExpression(source) : compileSExpression(stream);
        log.Logger.debug("finish parsing " + filename + " in " + (System.currentTimeMillis() - ss) + "ms");

        SValue oldPath = env.get("__path__");
        SValue oldFile = env.get("__file__");

        env.put("__path__", new SString(Utils.getDirectoryName(source)));
        env.put("__file__", new SString(filename));

        SValue ret = null;
        try {
            ret = expr.evaluate(env);
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
