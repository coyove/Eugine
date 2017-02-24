package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;

/**
 * Created by coyove on 2016/9/9.
 */
public class SDouble extends SValue {
    private double value;

    public SDouble(String v) {
        super();
        value = Double.valueOf(v);
    }

    public SDouble(double num) {
        super();
        value = num;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T get() {
        return (T) ((Double) value);
    }

    public double val() {
        return value;
    }

    @Override
    public SValue clone() {
        SDouble ret = new SDouble(this.value);
        SValue.copyAttributes(ret, this);
        return ret;
    }

    @Override
    public String toString() {
        return "double = " + value;
    }

    @Override
    public String asString() {
        return "" + value;
    }
}
