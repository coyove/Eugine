package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SList extends SValue {
    public SList(List<SValue> list) {
        super(list);
    }

    public SList(List<SValue> list, boolean imm) {
        super(list, imm);
    }

    @Override
    public SValue clone() {
        SList ret = new SList((List<SValue>) underlying);
        SValue.copyAttributes(ret, this);
        return ret;
    }
}
