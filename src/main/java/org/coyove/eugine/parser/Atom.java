package org.coyove.eugine.parser;

import org.coyove.eugine.util.Utils;

import java.io.Serializable;

/**
 * Created by coyove on 2016/9/9.
 */
public class Atom implements Serializable {
    public Object value;
    public int line;
    public int lineIndex;
    public String source;
    public String filename;

    public Atom(org.antlr.v4.runtime.Token tok) {
        line = tok.getLine() - 1;
        lineIndex = tok.getCharPositionInLine();
        source = tok.getTokenSource().getSourceName();
        filename = "@" + Utils.getFileName(source).replace(".eugine", "");
        value = tok.getText();
    }

    public Atom() {
        StackTraceElement elem = Thread.currentThread().getStackTrace()[4];
        line = elem.getLineNumber() - 1;
        lineIndex = 0;
        filename = "@" + elem.getFileName();
    }
}
