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
