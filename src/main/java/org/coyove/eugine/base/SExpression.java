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

        if (args.size() < count)
            EgException.NOT_ENOUGH_ARGUMENTS.raise(atom, count).exit();
    }

    public SExpression() {
    }

    public static ListEx<SValue> eval(ListEx<SExpression> arguments,
                                      ExecEnvironment env,
                                      Atom atom) throws EgException {

        ListEx<SValue> ret = new ListEx<SValue>();
        for (SExpression e : arguments) {
            if (e != null) {
                if (e instanceof PVariable && ((PVariable) e).name.endsWith("...")) {
                    String varName = ((PVariable) e).name;
                    varName = varName.substring(0, varName.length() - 3);

                    SValue v = env.get(varName);
                    if (v == null)
                        throw EgException.INVALID_VARARG.raise(atom);

                    if (v instanceof SList) {
                        ret.addAll(v.<ListEx<SValue>>get());
                    } else {
                        throw EgException.INVALID_VARARG.raise(atom, v);
                    }
                } else {
                    ret.add(e.evaluate(env));
                }
            } else {
                throw EgException.INTERNAL_ERROR.raise(atom, "null");
            }
        }

        return ret;
    }

    public abstract SValue evaluate(ExecEnvironment env) throws EgException;

    public abstract SExpression deepClone();
}
