package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEWait extends SExpression {
    @ReplaceableVariable
    private SExpression argument;

    public SEWait() {}

    public SEWait(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);

        argument = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        Object t = this.argument.evaluate(env).underlying;
        if (t instanceof Thread) {
            try {
                ((Thread) t).join();
            } catch (InterruptedException e) {
                throw new EgException(7055, "join was interrupted", atom);
            }
        }

        return env.Null;
    }

    @Override
    public SExpression deepClone() throws EgException {
        SEWait ret = new SEWait();
        ret.atom = this.atom;

        ret.argument = this.argument.deepClone();
        return ret;
    }
}
