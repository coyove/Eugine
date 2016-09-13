package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;

/**
 * Created by coyove on 2016/9/9.
 */
public class SBool extends SValue {
    public SBool(Boolean list) {
        super(list);
    }

    public SBool(Boolean list, boolean imm) {
        super(list, imm);
    }

    @Override
    public SValue clone() {
        SBool ret = new SBool((Boolean) underlying);
        SValue.copyAttributes(ret, this);
        return ret;
    }
}
