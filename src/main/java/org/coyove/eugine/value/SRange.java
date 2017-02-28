package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;
import org.coyove.eugine.base.SComplexValue;

/**
 * Created by coyove on 2016/9/9.
 */
public class SRange extends SComplexValue {
    public double start;
    public double end;
    public double interval;

    public SRange(double start, double interval, double end) {
        super();

        this.start = start;
        this.end = end;
        this.interval = interval;
    }

    @Override
    public SValue clone() {
        return new SRange(start, interval, end);
    }

    @Override
    public SValue lightClone() {
        return this;
    }

    @Override
    public String toString() {
        return String.format("range = {%d, %d, %d}", start, interval, end);
    }

    @Override
    public String asString() {
        return "";
    }
}
