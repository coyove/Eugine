package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;

/**
 * Created by coyove on 2016/9/9.
 */
public class SNull extends SValue {
    public SNull() {
        super(null);
    }

    public SNull(boolean imm) {
        super(null, imm);
    }

    @Override
    public SValue clone() {
        return new SNull();
    }
}
