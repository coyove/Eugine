package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;

/**
 * Created by coyove on 2016/9/9.
 */
public class SNumber extends SValue {
    private double value;

    public SNumber(String v) {
        super();
        value = Double.valueOf(v);
    }

    public SNumber(double num) {
        super();
        value = num;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T get() {
        return (T) ((Double) value);
    }

    public double doubleValue() {
        return value;
    }

    public int intValue() {
        return (int) value;
    }

    public long longValue() {
        return (long) value;
    }

    public byte byteValue() {
        return (byte) value;
    }

    public void set(double v) {
        value = v;
    }

    @Override
    public SValue clone() {
        return new SNumber(this.value);
    }

    @Override
    public SValue lightClone() {
        return clone();
    }

    @Override
    public String toString() {
        return "number = " + asString();
    }

    @Override
    public String asString() {
        if (value % 1 == 0)
            return "" + (long) value;

        return "" + value;
    }

    public boolean isInteger() {
        return value % 1 == 0;
    }
}
