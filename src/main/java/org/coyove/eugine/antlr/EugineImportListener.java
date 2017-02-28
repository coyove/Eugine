package org.coyove.eugine.antlr;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.library.Exportable;
import org.coyove.eugine.util.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by coyove on 2016/10/30.
 */
public class EugineImportListener extends EugineBaseListener {
    public ExecEnvironment env;

    public static Set<String> reloadablePackages = new HashSet<String>();

    @Override
    @SuppressWarnings("unchecked")
    public void exitImportStmt(EugineParser.ImportStmtContext ctx) {
        super.enterImportStmt(ctx);

        Token sourceToken = ctx.getStop();
        int tt = sourceToken.getType();

        ListEx<String> importPath = new ListEx<String>();
        for (TerminalNode terminalNode : ctx.getTokens(tt)) {
            importPath.add(terminalNode.getSymbol().getText());
        }

        String className = StringUtils.join(importPath, ".");

        try {
            Class<? extends Exportable> cls = (Class<? extends Exportable>)
                    ClassUtils.getClass("org.coyove.eugine.library." + className);
            cls.newInstance().export(this.env);
        } catch (Exception e) {
            EgException.CANNOT_IMPORT_LIBRARY.raise(new Atom(sourceToken), className, e).exit();
        }
    }
}
