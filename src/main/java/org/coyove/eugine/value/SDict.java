package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;
import java.util.HashMap;

/**
 * Created by coyove on 2016/9/9.
 */
public class SDict extends SValue {
    public SDict(HashMap<String, SValue> dict) {
        super(dict);
    }

    public SDict(HashMap<String, SValue> dict, boolean imm) {
        super(dict, imm);
    }

    @Override
    public SValue clone()
    {
        SDict ret = new SDict((HashMap<String, SValue>)underlying);
        SValue.copyAttributes(ret, this);
        return ret;
    }
}
