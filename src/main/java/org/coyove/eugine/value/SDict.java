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
        HashMap<String, SValue> dict = (HashMap<String, SValue>)underlying;
        HashMap<String, SValue> n = new HashMap<String, SValue>();

        for (String s : dict.keySet()) {
            n.put(s, dict.get(s).clone());
        }

        SDict ret = new SDict(n);
        SValue.copyAttributes(ret, this);
        return ret;
    }
}
