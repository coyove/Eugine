package org.coyove.eugine.value;

import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.VMException;

/**
 * Created by coyove on 2016/9/9.
 */
public class SString extends SValue {
    public SString(String str) {
        super(str);
    }

    public SString(String str, boolean imm) {
        super(str, imm);
    }

    @Override
    public SValue clone()
    {
        SString ret = new SString((String) underlying);
        SValue.copyAttributes(ret, this);
        return ret;
    }
}
