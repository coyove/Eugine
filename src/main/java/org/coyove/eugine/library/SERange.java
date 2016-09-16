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

    public SERange(Atom ha, Compound c) throws VMException {
        super(ha, c);
        List<SExpression> args = SExpression.castPlain(c);

        if (args.size() < 1)
            throw new VMException(2087, "needs the start", ha);

        if (args.size() < 2)
            throw new VMException(2087, "needs the end", ha);

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
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue start = this.start.evaluate(env);
        SValue interval = this.interval.evaluate(env);
        SValue end = this.end.evaluate(env);
        List<SValue> ret = new List<SValue>();

        if (start instanceof SInteger && interval instanceof SInteger && end instanceof SInteger) {
            for (Long i = start.get(); i < end.<Long>get(); i += interval.<Long>get())
                ret.add(new SInteger(i));
        } else if (start instanceof SDouble && interval instanceof SDouble && end instanceof SDouble) {
            for (Double i = start.get(); i < end.<Double>get(); i += interval.<Double>get())
                ret.add(new SDouble(i));
        } else {
            throw new VMException(2086, "needs integers or doubles", headAtom);
        }

        return new SList(ret);
    }
}
