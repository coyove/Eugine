package org.coyove.eugine.parser;

/**
 * Created by coyove on 2016/9/9.
 */
public class Token implements java.io.Serializable {
    public enum TokenType {
        STRING, LPAREN, RPAREN, LBRACK, RBRACK, LBRACE, RBRACE, ATOMIC, DOUBLE, INTEGER, SEXPRESSION
    }

    public TokenType type;
    public Object value;
    public int line;
    public int lineIndex;
    public String source;
    public String filename;

    public Token() {
    }

    public Token(TokenType tt, Object tv) {
        type = tt;
        value = tv;
    }

    @Override
    public Token clone() {
        Token t = new Token();
        t.type = this.type;
        t.line = this.line;
        t.lineIndex = this.lineIndex;
        t.source = this.source;
        t.value = this.value;

        return t;
    }
}
