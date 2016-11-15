package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SESleep extends SExpression {
    private SExpression time;

    public SESleep() {}

    public SESleep(Atom ha, List<SExpression> args) {
        super(ha, args, 1);

        time = args.head();
    }

    public SESleep(Atom ha, Compound c) throws VMException {
        super(ha, c, 1);

        time = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SInteger time = Utils.cast(this.time.evaluate(env), SInteger.class);
        if (time == null) {
            throw new VMException(3098, "sleep time must be integer", headAtom);
        }

        try {
            Thread.sleep(time.<Long>get());
        } catch (InterruptedException ex) {
            throw new VMException(3099, "sleep is interrupted", headAtom);
        }

        return new SNull();
    }

    @Override
    public SExpression deepClone() throws VMException {
        SESleep ret = new SESleep();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.time = this.time.deepClone();

        return ret;
    }
}
