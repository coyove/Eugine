package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;

/**
 * Created by coyove on 2016/9/9.
 */
public class SDouble extends SValue {
    public SDouble(Double num) {
        super(num);
    }

    public SDouble(Double num, boolean imm) {
        super(num, imm);
    }

    @Override
    public SValue clone()
    {
        SDouble ret = new SDouble((Double)underlying);
        SValue.copyAttributes(ret, this);
        return ret;
    }
}
