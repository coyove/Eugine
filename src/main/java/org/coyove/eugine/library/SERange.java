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
            interval = new SInteger(1);
        } else if (args.size() == 3) {
            start = args.get(0);
            interval = args.get(1);
            end = args.get(2);
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue start = this.start.evaluate(env);
        SValue interval = this.interval.evaluate(env);
        SValue end = this.end.evaluate(env);

        if (start instanceof SInteger && interval instanceof SInteger) {
            long interval_ = ((SInteger) interval).val();

            if (interval_ == 0) {
                int len = ((int) ((SInteger) start).val());
                SValue[] arr = new SValue[len];
                Arrays.fill(arr, end);
                ListEx<SValue> ret = new ListEx<SValue>(Arrays.asList(arr));
                return new SList(ret);
            } else if (end instanceof SInteger) {
                long len = ((SInteger) end).val() - ((SInteger) start).val();
                ListEx<SValue> ret = new ListEx<SValue>((int) len);
                for (long i = ((SInteger) start).val(); i < ((SInteger) end).val(); i += interval_) {
                    ret.add(new SInteger(i));
                }
                return new SList(ret);
            }
        } else if (start instanceof SDouble && interval instanceof SDouble && end instanceof SDouble) {
            ListEx<SValue> ret = new ListEx<SValue>();
            for (double i = ((SDouble) start).val(); i < ((SDouble) end).val(); i += ((SDouble) interval).val()) {
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
