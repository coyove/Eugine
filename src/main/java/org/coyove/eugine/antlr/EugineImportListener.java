package org.coyove.eugine.antlr;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.coyove.cli.main;
import org.coyove.eugine.base.SKeywords;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.parser.Parser;
import org.coyove.eugine.pm.Exportable;
import org.coyove.eugine.util.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by coyove on 2016/10/30.
 */
public class EugineImportListener extends EugineBaseListener {
    public ExecEnvironment env;
    public int pad;

    public static Set<String> reloadablePackages = new HashSet<String>();

    @Override
    @SuppressWarnings("unchecked")
    public void exitImportStmt(EugineParser.ImportStmtContext ctx) {
        super.enterImportStmt(ctx);

        boolean reload = ctx.getStart().getText().equals("reload");

        Token sourceToken = ctx.getStop();
        int tt = sourceToken.getType();

        String source = sourceToken.getTokenSource().getSourceName();
        ListEx<String> importPath = new ListEx<String>();

        for (TerminalNode terminalNode : ctx.getTokens(tt)) {
            importPath.add(terminalNode.getSymbol().getText());
        }

        if (ctx.getStart().getText().equals("include") || reload) {
            source = Utils.getDirectoryName(source) + StringUtils.join(importPath, "/");
            if (main.options.verbose) {
                Utils.print("Include " + source, pad);
            }

            String ppath = source + ".eugine";
            if (reload && !reloadablePackages.contains(ppath)) {
                reloadablePackages.add(ppath);
            }

            try {
                Parser.execute(new ANTLRFileStream(ppath), this.env, ppath, pad);
            } catch (Exception e) {
                ErrorHandler.print(9090, "error when opening " + ppath + ": " + e, new Atom(sourceToken));
            }
        } else {
            String className = StringUtils.join(importPath, ".");

            try {
                Class<? extends Exportable> cls = (Class<? extends Exportable>)
                        ClassUtils.getClass("org.coyove.eugine.library." + className);
                cls.newInstance().export(ExecEnvironment.globalStaticEnv);
            } catch (Exception e) {
                ErrorHandler.print(9090, className + " error: " + e, new Atom(sourceToken));
            }
        }
    }
}
