package org.coyove.eugine.library.system;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SESleep extends SExpression {
    @ReplaceableVariable
    private SExpression time;

    public SESleep() {}

    public SESleep(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);

        time = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        long time = EgCast.toLong(this.time.evaluate(env), atom);

        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            throw new EgException(3099, "sleep was interrupted", atom);
        }

        return ExecEnvironment.Null;
    }

    @Override
    public SExpression deepClone() {
        SESleep ret = new SESleep();
        ret.atom = this.atom;
        ret.time = this.time.deepClone();
        return ret;
    }
}
