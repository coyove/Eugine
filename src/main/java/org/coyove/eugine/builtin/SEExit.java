package org.coyove.eugine.builtin;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEExit extends SExpression {
    @ReplaceableVariable
    private SExpression argument = null;

    public SEExit() {}

    public SEExit(Atom ha, ListEx<SExpression> args) {
        atom = ha;
        if (args.size() > 0) {
            argument = args.head();
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        if (argument != null) {
            SValue arg = argument.evaluate(env);
            SString msg = EgCast.to(arg, SString.class);

            if (msg == null) {
                SNumber num = EgCast.to(arg, SNumber.class);
                if (num == null)
                    throw EgException.INVALID_SUBJECT.raise(atom, arg);

                if (num.intValue() == 0)
                    System.exit(0);

                env.bPut("__e__", num);
                throw new EgException(9001, "" + num.intValue(), atom);
            } else {
                env.bPut("__e__", msg);
                throw new EgException(9000, msg.<String>get(), atom);
            }
        } else {
            throw new EgException(9000, "", atom);
        }
    }

    @Override
    public SExpression deepClone() {
        SEExit ret = new SEExit();
        ret.atom = this.atom;
        if (this.argument != null) {
            ret.argument = this.argument.deepClone();
        }

        return ret;
    }
}
