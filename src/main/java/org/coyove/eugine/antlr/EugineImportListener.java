package org.coyove.eugine.antlr;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.base.SKeywords;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.pm.Exportable;
import org.coyove.eugine.util.*;

import java.lang.reflect.Method;

/**
 * Created by coyove on 2016/10/30.
 */
public class EugineImportListener extends EugineBaseListener {
    public ExecEnvironment env;

    @Override
    public void exitImportStmt(EugineParser.ImportStmtContext ctx) {
        super.enterImportStmt(ctx);

        Token sourceToken = ctx.getStop();
        int tt = sourceToken.getType();

        String source = sourceToken.getTokenSource().getSourceName();
        ListEx<String> importPath = new ListEx<String>();

        for (TerminalNode terminalNode : ctx.getTokens(tt)) {
            importPath.add(terminalNode.getSymbol().getText());
        }

        if (importPath.head().equals("_")) {
            String classname = StringUtils.join(importPath.skip(1), ".") + ".EgExport";
            try {
                Class cls = Class.forName(classname);
                Exportable export = ((Exportable) cls.newInstance());
                export.export(SKeywords.Lookup);
            } catch (Exception e) {
                ErrorHandler.print(9089, "error when importing " + classname + ": " + e, new Atom(sourceToken));
            }

        } else {
            ANTLRHelper.executeFile(Utils.getDirectoryName(source) +
                    StringUtils.join(importPath, "/") + ".eugine", this.env);
        }
    }
}
