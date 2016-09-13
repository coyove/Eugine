package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;

/**
 * Created by coyove on 2016/9/9.
 */
public class SObject extends SValue {
    public SObject(Object obj) {
        super(obj);
    }

    public SObject(Object obj, boolean imm) {
        super(obj, imm);
    }

    @Override
    public SValue clone()
    {
        SObject ret = new SObject(underlying);
        SValue.copyAttributes(ret, this);
        return ret;
    }
}
