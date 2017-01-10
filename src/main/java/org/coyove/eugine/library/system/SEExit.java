package org.coyove.eugine.library.system;

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
            SString msg = EgCast.to(argument.evaluate(env), SString.class);

            if (msg == null) {
                SInt num = EgCast.to(argument.evaluate(env), SInt.class);
                if (num == null) {
                    throw new EgException(2016, "message must be string or integer", atom);
                }

                env.bPut("__e__", num);
                throw new EgException(7001, ((Integer) num.val()).toString(), atom);
            } else {
                env.bPut("__e__", msg);
                throw new EgException(7000, msg.<String>get(), atom);
            }
        } else {
            throw new EgException(7000, "", atom);
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
