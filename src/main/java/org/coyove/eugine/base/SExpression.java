package org.coyove.eugine.base;

import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;

/**
 * Created by coyove on 2016/9/9.
 */
public abstract class SExpression implements java.io.Serializable {
    public Atom atom;

    public SExpression(Atom ha, ListEx<SExpression> args, int count) {
        atom = ha;

        if (args.size() < count) {
            ErrorHandler.print(2000, "not enough arguments", ha);
        }
    }

    public SExpression() {
    }

    public static ListEx<SValue> eval(ListEx<SExpression> arguments,
                                      ExecEnvironment env,
                                      Atom atom) throws EgException {

        ListEx<SValue> ret = new ListEx<SValue>();
        for (SExpression e : arguments) {
            if (e != null) {
                if (e instanceof PVariable && ((PVariable) e).varName.endsWith("...")) {
                    String varName = ((PVariable) e).varName;
                    varName = varName.substring(0, varName.length() - 3);

                    SValue v = env.get(varName);
                    if (v == null) {
                        throw new EgException(9997, "invalid vararg", atom);
                    }

                    if (v instanceof SList) {
                        ret.addAll(v.<ListEx<SValue>>get());
                    } else {
                        throw new EgException(9998, "wrong vararg list", atom);
                    }
                } else {
                    ret.add(e.evaluate(env));
                }
            } else {
                throw new EgException(9998, "found null", atom);
            }
        }

        return ret;
    }

    public SValue execute(ExecEnvironment env) throws EgException {
        return this.evaluate(env);
    }

    public abstract SValue evaluate(ExecEnvironment env) throws EgException;

    public abstract SExpression deepClone();
}
