package org.coyove.eugine.base;

import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;

/**
 * Created by coyove on 2016/9/9.
 */
public abstract class SExpression implements java.io.Serializable {
    public Atom headAtom;
    public Compound tailCompound;

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

    public SExpression(Atom ha, List<SExpression> args, int count) {
        headAtom = ha;

        if (args.size() < count) {
            System.out.println((new VMException(2000, "not enough arguments", ha)).toString());
        }
    }

    public SExpression() {
    }

    public abstract SValue evaluate(ExecEnvironment env) throws VMException;

    public static List<SValue> eval(List<SExpression> arguments, ExecEnvironment env) throws VMException {

        List<SValue> ret = new List<SValue>();
        for (SExpression e : arguments) {
            if (e != null) {
                if (e instanceof PVariable && ((PVariable) e).varName.endsWith("...")) {
                    String varName = ((PVariable) e).varName;
                    varName = varName.substring(0, varName.length() - 3);

                    if (!env.containsKey(varName)) {
                        throw new VMException(9997, "invalid vararg");
                    }

                    SValue v = env.get(varName);

                    if (v instanceof SList) {
                        ret.addAll(v.<List<SExpression>>get().cast(SValue.class));
                    } else {
                        throw new VMException(9998, "wrong vararg list");
                    }
                } else {
                    SValue v = e.evaluate(env);
                    if (v instanceof SExploded) {
                        ret.addAll(((SExploded) v).comps);
                    } else {
                        ret.add(v);
                    }
                }
            } else {
                throw new VMException(9998, "found null");
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
            return new PVariable((String) e.token.value, e, null);
        }
    }

    public static SExpression cast(Compound c) throws VMException {
        throw new VMException(10000, "deprecated", ((Atom) c.atoms.head()));
    }

    public SValue execute(ExecEnvironment env) throws VMException {
        return this.evaluate(env);
    }

    public abstract SExpression deepClone() throws VMException;
}
