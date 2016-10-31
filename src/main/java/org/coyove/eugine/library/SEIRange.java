package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEIRange extends SExpression {
    private SExpression start;
    private SExpression interval;
    private SExpression end;

    public SEIRange() {}

    public SEIRange(Atom ha, List<SExpression> args) {
        super(ha, args, 3);

        start = args.get(0);
        interval = args.get(1);
        end = args.get(2);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        Long start = Utils.getLong(this.start.evaluate(env), headAtom);
        Long interval = Utils.getLong(this.interval.evaluate(env), headAtom);
        Long end = Utils.getLong(this.end.evaluate(env), headAtom);

        return new SRange(start, interval, end);
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEIRange ret = new SEIRange();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.start = this.start.deepClone();
        ret.interval = this.interval.deepClone();
        ret.end = this.end.deepClone();

        return ret;
    }
}
