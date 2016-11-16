package org.coyove.eugine.core;

import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;
import org.coyove.eugine.value.SDict;
import org.coyove.eugine.value.SList;

import java.util.HashMap;

/**
 * Created by zezhong on 2016/11/16.
 */
public class PList extends SExpression {
    public ListEx<SExpression> values = new ListEx<SExpression>();

    public PList() {
    }

    public PList(Atom ha) {
        atom = ha;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        ListEx<SValue> ret = new ListEx<SValue>();
        for (int i = 0; i < values.size(); i++) {
            ret.add(values.get(i).evaluate(env));
        }
        return new SList(ret);
    }

    @Override
    public SExpression deepClone() throws EgException {
        PList ret = new PList();
        ret.atom = this.atom;
        ret.values = ListEx.deepClone(this.values);

        return ret;
    }
}
