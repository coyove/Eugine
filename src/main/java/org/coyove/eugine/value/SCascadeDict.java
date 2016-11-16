package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.ExecEnvironment;

/**
 * Created by coyove on 2016/9/9.
 */
public class SCascadeDict extends SValue {
    public SCascadeDict(ExecEnvironment dict) {
        super(dict);
    }

    public SCascadeDict(ExecEnvironment dict, boolean imm) {
        super(dict, imm);
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue clone() {
        SCascadeDict ret = new SCascadeDict(((ExecEnvironment) this.underlying).clone());
        SValue.copyAttributes(ret, this);
        return ret;
    }
}
