package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
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
        SInteger time = Utils.cast(this.time.evaluate(env), SInteger.class);
        if (time == null) {
            throw new EgException(3098, "sleep time must be integer", atom);
        }

        try {
            Thread.sleep(time.<Long>get());
        } catch (InterruptedException ex) {
            throw new EgException(3099, "sleep is interrupted", atom);
        }

        return new SNull();
    }

    @Override
    public SExpression deepClone() throws EgException {
        SESleep ret = new SESleep();
        ret.atom = this.atom;

        ret.time = this.time.deepClone();

        return ret;
    }
}
