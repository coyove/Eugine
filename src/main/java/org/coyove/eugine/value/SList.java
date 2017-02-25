package org.coyove.eugine.value;

import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.base.SComplexValue;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SList extends SComplexValue {
    public SList(ListEx<SValue> list) {
        super(list);
    }

    @Override
    public SValue clone() {
        ListEx<SValue> origin = this.get();
        ListEx<SValue> n = new ListEx<SValue>(origin.size());

        for (SValue t : origin) {
            n.add(t.clone());
        }

        SList ret = new SList(n);
        return ret;
    }

    @Override
    public SValue lightClone() {
        return this;
    }

    @Override
    public String asString() {
        ListEx<SValue> list = this.get();
        String[] items = new String[list.size()];
        int i = 0;
        for (SValue s : list) {
            items[i++] = s.toString();
        }

        return "[" + StringUtils.join(items, ", ") + "]";
    }

    @Override
    public String toString() {
        return "list = " + asString();
    }
}
