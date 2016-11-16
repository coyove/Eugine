package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SERange extends SExpression {
    private SExpression start;
    private SExpression interval;
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
        ListEx<SValue> ret = new ListEx<SValue>();

        if (start instanceof SInteger && interval instanceof SInteger) {
            Long interval_ = interval.<Long>get();

            if (interval_ == 0) {
                for (Long i = 0l; i < start.<Long>get(); i ++) {
                    ret.add(end);
                }
            } else if (end instanceof SInteger) {
                for (Long i = start.get(); i < end.<Long>get(); i += interval_) {
                    ret.add(new SInteger(i));
                }
            }
        } else if (start instanceof SDouble && interval instanceof SDouble && end instanceof SDouble) {
            for (Double i = start.get(); i < end.<Double>get(); i += interval.<Double>get()) {
                ret.add(new SDouble(i));
            }
        } else {
            throw new EgException(3009, "needs integers or doubles", atom);
        }

        return new SList(ret);
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
