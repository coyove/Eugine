package org.coyove.eugine.value;

import org.antlr.v4.runtime.misc.Triple;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SRange extends SValue {
    public Long start;
    public Long end;
    public Long interval;

    public SRange(Long start, Long interval, Long end) {
        super(new Triple<Long, Long, Long>(start, end, interval));

        this.start = start;
        this.end = end;
        this.interval = interval;
    }

    @Override
    public SValue clone() {
        SRange ret = new SRange(start, interval, end);
        SValue.copyAttributes(ret, this);
        return ret;
    }
}
