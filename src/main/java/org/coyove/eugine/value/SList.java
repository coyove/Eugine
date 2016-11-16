package org.coyove.eugine.value;

import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SList extends SValue {
    public SList(ListEx<SValue> list) {
        super(list);
    }

    public SList(ListEx<SValue> list, boolean imm) {
        super(list, imm);
    }

    @Override
    public SValue clone() {
        ListEx<SValue> origin = this.get();
        ListEx<SValue> n = new ListEx<SValue>(origin.size());

        for (SValue t : origin) {
            n.add(t.clone());
        }

        SList ret = new SList(n);
        SValue.copyAttributes(ret, this);
        return ret;
    }
}
