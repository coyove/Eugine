package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;

/**
 * Created by coyove on 2016/9/9.
 */
public class SLong extends SValue {
    private long value;

    public SLong(String v) {
        super();
        value = Long.valueOf(v);
    }

    public SLong(long num) {
        super();
        value = num;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T get() {
        return (T) ((Long) value);
    }

    public long val() {
        return value;
    }

    @Override
    public SValue clone() {
        SLong ret = new SLong(this.value);
        SValue.copyAttributes(ret, this);
        return ret;
    }

    @Override
    public String toString() {
        return "long = " + value;
    }

    @Override
    public String asString() {
        return "" + value;
    }
}
