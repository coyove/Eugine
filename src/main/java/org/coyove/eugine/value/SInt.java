package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;

/**
 * Created by coyove on 2016/9/9.
 */
public class SInt extends SValue {
    private int value;

    public SInt(String v) {
        super();
        value = Integer.valueOf(v);
    }

    public SInt(int num) {
        super();
        value = num;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T get() {
        return (T) ((Integer) value);
    }

    public int val() {
        return value;
    }

    @Override
    public SValue clone() {
        SInt ret = new SInt(this.value);
        SValue.copyAttributes(ret, this);
        return ret;
    }

    @Override
    public String toString() {
        return "int = " + value;
    }

    @Override
    public String asString() {
        return "" + value;
    }
}
