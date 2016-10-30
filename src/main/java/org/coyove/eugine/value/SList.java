package org.coyove.eugine.value;

import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SList extends SValue {
    public SList(List<SExpression> list) {
        super(list);
    }

    public SList(List<SExpression> list, boolean imm) {
        super(list, imm);
    }

    @Override
    public SValue clone() {
        List<SExpression> origin = (List<SExpression>) this.underlying;
        List<SExpression> n = new List<SExpression>(origin.size());

        try {
            for (SExpression t : origin) {
                n.add(t.deepClone());
            }
        } catch (VMException ex) {
            ErrorHandler.print(ex);
        }

        SList ret = new SList(n);

        SValue.copyAttributes(ret, this);
        return ret;
    }
}
