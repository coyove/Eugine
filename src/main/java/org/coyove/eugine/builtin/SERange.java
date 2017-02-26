package org.coyove.eugine.builtin;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.Arrays;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SERange extends SExpression {
    @ReplaceableVariable
    private SExpression start;

    @ReplaceableVariable
    private SExpression interval;

    @ReplaceableVariable
    private SExpression end;

    public SERange() {}

    public SERange(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 2);

        if (args.size() == 2) {
            start = args.get(0); // repeat count
            interval = args.get(1); // item
        } else if (args.size() == 3) {
            start = args.get(0);
            interval = args.get(1);
            end = args.get(2);
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue _start = this.start.evaluate(env);
        SValue _interval = this.interval.evaluate(env);

        if (end != null) {
            SValue _end = this.end.evaluate(env);

            int interval = EgCast.toInt(_interval, atom);
            int start = EgCast.toInt(_start, atom);
            int end = EgCast.toInt(_end, atom);

            ListEx<SValue> ret = new ListEx<SValue>(end - start);
            for (int i = start; i < end; i += interval) {
                ret.add(new SNumber(i));
            }

            return new SList(ret);
        } else {
            SValue[] arr = new SValue[EgCast.toInt(_start, atom)];
            Arrays.fill(arr, _interval);
            ListEx<SValue> ret = new ListEx<SValue>(Arrays.asList(arr));
            return new SList(ret);
        }
    }

    @Override
    public SExpression deepClone() {
        SERange ret = new SERange();
        ret.atom = this.atom;

        ret.start = this.start.deepClone();
        ret.interval = this.interval.deepClone();
        ret.end = this.end.deepClone();

        return ret;
    }
}
