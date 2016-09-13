package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SExploded extends SValue {
    public List<SValue> comps;

    public SExploded(List<SValue> list) {
        super(list);
        comps = (List<SValue>) list.clone();
    }

    @Override
    public SValue clone() {
        SExploded ret = new SExploded(comps);
        SValue.copyAttributes(ret, this);
        return ret;
    }
}
