package org.coyove.eugine.util;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import org.coyove.eugine.Eugine;
import org.coyove.eugine.antlr.EugineLexer;
import org.coyove.eugine.antlr.EugineParser;

import java.io.IOException;

/**
 * Created by coyove on 2016/10/30.
 */
public class ANTLRHelper {
    public static CommonTokenStream loadFile(String source)
    {
        CharStream afs = null;
        try {
            afs = new ANTLRFileStream(source);
        }
        catch (IOException e) {
            System.out.println("file not found");
            System.exit(1);
        }

        EugineLexer lexer = new EugineLexer(afs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        return tokens;
    }
}
