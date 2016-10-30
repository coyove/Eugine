package org.coyove.eugine.antlr;

import org.antlr.runtime.TokenSource;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.coyove.eugine.util.ANTLRHelper;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.Utils;

/**
 * Created by coyove on 2016/10/30.
 */
public class EugineImportListener extends EugineBaseListener {
    public ExecEnvironment env;

    @Override
    public void exitImportStmt(EugineParser.ImportStmtContext ctx) {
        super.enterImportStmt(ctx);

        Token sourceToken = ctx.getStop();
        String source = sourceToken.getTokenSource().getSourceName();

        CommonTokenStream tokens = ANTLRHelper.loadFile(Utils.getDirectoryName(source) +
                sourceToken.getText() + ".eugine");

//        EugineParser parser = new EugineParser(tokens);
//        EugineParser.ProgContext pc = parser.prog();
//
//        ctx.getParent().getParent().children.add(1, pc);
        EugineParser parser = new EugineParser(tokens);
        EugineParser.ProgContext pc = parser.prog();

        ParseTreeWalker walk = new ParseTreeWalker();
        EugineImportListener eil = new EugineImportListener();
        eil.env = this.env;

        walk.walk(eil, pc);

        try {
            pc.v.execute(eil.env);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
