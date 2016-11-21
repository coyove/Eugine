package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEExit extends SExpression {
    @ReplaceableVariable
    private SExpression argument;

    public SEExit() {}

    public SEExit(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);

        argument = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SString msg = Utils.cast(argument.evaluate(env), SString.class);

        if (msg == null) {
            SInt num = Utils.cast(argument.evaluate(env), SInt.class);
            if (num == null) {
                throw new EgException(2016, "message must be string or integer", atom);
            }

            env.bPut("__e__", num);
            throw new EgException(7001, ((Integer) num.val()).toString(), atom);
        } else {
            env.bPut("__e__", msg);
            throw new EgException(7000, msg.<String>get(), atom);
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        SEExit ret = new SEExit();
        ret.atom = this.atom;

        ret.argument = this.argument.deepClone();
        return ret;
    }
}
