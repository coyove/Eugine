package org.coyove.eugine.library;

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
            start = args.get(0);
            end = args.get(1);
            interval = new SLong(1);
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
        SValue _end = this.end.evaluate(env);

        if (_start instanceof SLong || _start instanceof SInt) {
            int interval = EgCast.toInt(_interval, atom);

            if (interval == 0) {
                int len = EgCast.toInt(_start, atom);
                SValue[] arr = new SValue[len];
                Arrays.fill(arr, _end);
                ListEx<SValue> ret = new ListEx<SValue>(Arrays.asList(arr));
                return new SList(ret);
            }

            int start = EgCast.toInt(_start, atom);
            int end = EgCast.toInt(_end, atom);

            ListEx<SValue> ret = new ListEx<SValue>(end - start);
            for (int i = start; i < end; i += interval) {
                ret.add(new SInt(i));
            }
            return new SList(ret);
        } else if (_start instanceof SDouble && _interval instanceof SDouble && _end instanceof SDouble) {
            ListEx<SValue> ret = new ListEx<SValue>();
            for (double i = ((SDouble) _start).val(); i < ((SDouble) _end).val(); i += ((SDouble) _interval).val()) {
                ret.add(new SDouble(i));
            }
            return new SList(ret);
        }

        throw new EgException(3009, "needs integers or doubles", atom);
    }

    @Override
    public SExpression deepClone() throws EgException {
        SERange ret = new SERange();
        ret.atom = this.atom;

        ret.start = this.start.deepClone();
        ret.interval = this.interval.deepClone();
        ret.end = this.end.deepClone();

        return ret;
    }
}
