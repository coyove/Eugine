package org.coyove.eugine.base;

import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;

/**
 * Created by coyove on 2016/9/9.
 */
public abstract class SExpression implements java.io.Serializable {
    protected Atom headAtom;
    protected Compound tailCompound;
    public int argCount; // for library closure

    public SExpression(Atom ha, Compound c) {
        headAtom = ha;
        tailCompound = c;
    }

    public SExpression(Atom ha, Compound c, int count) throws VMException {
        this(ha, c);
        argCount = count;
        if (c.atoms.size() < count)
            throw new VMException(2000, "not enough arguments", ha);
    }

    public SExpression() {
    }

    public abstract SValue evaluate(ExecEnvironment env) throws VMException;

    public static List<SValue> eval(List<SExpression> arguments, ExecEnvironment env) throws VMException {

        List<SValue> ret = new List<SValue>();
        for (SExpression e : arguments) {
            SValue v = e.evaluate(env);
            if (v instanceof SExploded) {
                ret.addAll(((SExploded) v).comps);
            } else {
                ret.add(v);
            }
        }

        return ret;
    }

    public static List<SExpression> castPlain(Compound c) throws VMException {
        List<SExpression> arguments = new List<SExpression>();
        for (Base a : c.atoms)
            arguments.add(SExpression.cast(a));

        return arguments;
    }

    public static SExpression cast(Base e) throws VMException {
        if (e instanceof Atom)
            return cast((Atom) e);

        if (e instanceof Compound)
            return cast((Compound) e);

        return null;
    }

    public static SExpression cast(Atom e) {
        if (e.token.type == Token.TokenType.STRING) {
            return new SString((String) e.token.value);
        } else if (e.token.type == Token.TokenType.DOUBLE) {
            return new SDouble((Double) e.token.value);
        } else if (e.token.type == Token.TokenType.INTEGER) {
            return new SInteger((Long) e.token.value);
        } else if (e.token.type == Token.TokenType.SEXPRESSION) {
            return (SExpression) e.token.value;
        } else {
            return new SEVariable((String) e.token.value, e, null);
        }
    }

    public static SExpression cast(Compound c) throws VMException {
        if (c.atoms.size() == 0)
            return new SEList(null, c);

        Base head_ = c.atoms.pop();

        if (head_ instanceof Compound) {
            if (c.atoms.size() == 0) {
                return SExpression.cast(head_);
            } else {
                Base first = head_;
                while (first instanceof Compound)
                    first = ((Compound) first).atoms.head();

                return new SECall(SExpression.cast(head_), castPlain(c), (Atom) first, c);
            }
        }

        Atom head = (Atom) head_;

        if (head.token.type == Token.TokenType.ATOMIC) {
            String tvalue = (String) head.token.value;

            if (SKeywords.KeywordsLookup.containsKey(tvalue))
                return SKeywords.KeywordsLookup.get(tvalue).call(head, c);

            if (c.atoms.size() == 0) {
                // TODO
                return new SEVariable(tvalue, head, c);
            } else {
                return new SECall(head, c);
            }

        } else {
            // if (head.token.type == Token.TokenType.STRING || head.token.type == Token.TokenType.NUMBER) {
            c.atoms.add(0, head);
            return new SEList(head, c);
        }
    }

    public SValue execute(ExecEnvironment env) throws VMException {
        return this.evaluate(env);
    }

    public abstract SExpression deepClone() throws VMException;
}
