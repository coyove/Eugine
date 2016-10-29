package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;

/**
 * Created by coyove on 2016/9/9.
 */
public class SInteger extends SValue {
    public SInteger(String v) { super(Long.valueOf(v)); }

    public SInteger(String v, boolean imm) { super(Long.valueOf(v), imm); }

    public SInteger(Long num) {
        super(num);
    }

    public SInteger(Long num, boolean imm) {
        super(num, imm);
    }

    public SInteger(Integer num) {
        super(num.longValue());
    }

    public SInteger(Integer num, boolean imm) {
        super(num.longValue(), imm);
    }

    @Override
    public SValue clone()
    {
        SInteger ret = new SInteger((Long)underlying);
        SValue.copyAttributes(ret, this);
        return ret;
    }
}
