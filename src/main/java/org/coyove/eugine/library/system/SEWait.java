package org.coyove.eugine.library.system;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
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

        return ExecEnvironment.Null;
    }

    @Override
    public SExpression deepClone() {
        SEWait ret = new SEWait();
        ret.atom = this.atom;
        ret.argument = this.argument.deepClone();
        return ret;
    }
}
