package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;

/**
 * Created by coyove on 2016/9/9.
 */
public class SInteger extends SValue {
    private long value;

    public SInteger(String v) {
        super();
        value = Long.valueOf(v);
    }

    public SInteger(String v, boolean imm) {
        super();
        value = Long.valueOf(v);
        immutable = imm;
    }

    public SInteger(long num) {
        super();
        value = num;
    }

    public SInteger(long num, boolean imm) {
        super();
        value = num;
        immutable = imm;
    }

    public SInteger(int num) {
        super();
        value = num;
    }

    public SInteger(int num, boolean imm) {
        super();
        value = num;
        immutable = imm;
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
        SInteger ret = new SInteger(this.value);
        SValue.copyAttributes(ret, this);
        return ret;
    }

    @Override
    public String toString() {
        return "Integer = " + value;
    }
}
