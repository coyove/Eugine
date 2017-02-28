package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class PRange extends SExpression {
    @ReplaceableVariable
    private SExpression start;

    @ReplaceableVariable
    private SExpression interval;

    @ReplaceableVariable
    private SExpression end;

    public PRange() {}

    public PRange(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 3);

        start = args.get(0);
        interval = args.get(1);
        end = args.get(2);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        double start = EgCast.toDouble(this.start.evaluate(env), atom);
        double interval = EgCast.toDouble(this.interval.evaluate(env), atom);
        double end = EgCast.toDouble(this.end.evaluate(env), atom);

        return new SRange(start, interval, end);
    }

    @Override
    public SExpression deepClone() {
        PRange ret = new PRange();
        ret.atom = this.atom;

        ret.start = this.start.deepClone();
        ret.interval = this.interval.deepClone();
        ret.end = this.end.deepClone();

        return ret;
    }
}
