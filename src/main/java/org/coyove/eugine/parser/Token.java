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

    public Token() { }

    public Token(TokenType tt, Object tv) {
        type = tt;
        value = tv;
    }

}
