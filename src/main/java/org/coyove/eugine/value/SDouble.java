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

    public SDouble(String v, boolean imm) {
        super();
        value = Double.valueOf(v);
        immutable = imm;
    }

    public SDouble(double num) {
        super();
        value = num;
    }

    public SDouble(Double num, boolean imm) {
        super(num, imm);
        value = num;
        immutable = imm;
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
        return "Double = " + value;
    }
}
