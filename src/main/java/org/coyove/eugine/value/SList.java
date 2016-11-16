package org.coyove.eugine.value;

import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SList extends SValue {
    public SList(ListEx<SExpression> list) {
        super(list);
    }

    public SList(ListEx<SExpression> list, boolean imm) {
        super(list, imm);
    }

    @Override
    public SValue clone() {
        ListEx<SExpression> origin = (ListEx<SExpression>) this.underlying;
        ListEx<SExpression> n = new ListEx<SExpression>(origin.size());

        try {
            for (SExpression t : origin) {
                n.add(t.deepClone());
            }
        } catch (EgException ex) {
            ErrorHandler.print(ex);
        }

        SList ret = new SList(n);

        SValue.copyAttributes(ret, this);
        return ret;
    }
}
