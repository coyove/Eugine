package org.coyove.eugine.parser;

/**
 * Created by coyove on 2016/9/9.
 */
public class Atom extends Base {
    public Token token;

    public Atom(Token tok)
    {
        token = tok;
    }

    public Atom(org.antlr.v4.runtime.Token tok) {
        token = new Token();
        token.line = tok.getLine() - 1;
        token.lineIndex = tok.getCharPositionInLine();
        token.source = tok.getTokenSource().getSourceName();
        token.value = tok.getText();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Atom) {
            Atom a = (Atom) o;
            return (a.token.type == this.token.type) && (a.token.value.equals(this.token.value));
        } else {
            return false;
        }
    }

    @Override
    public Base clone()
    {
        return new Atom(token);
    }
}
