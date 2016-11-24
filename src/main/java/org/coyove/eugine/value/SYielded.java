package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;

/**
 * Created by zezhong on 2016/11/23.
 */
public class SYielded extends SValue {
    public SYielded(SValue v) {
        super(v);
    }

    @Override
    public SValue clone() {
        SYielded ret = new SYielded(((SValue) this.underlying).clone());
        SValue.copyAttributes(ret, this);
        return ret;
    }
}
