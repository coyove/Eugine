package org.coyove.eugine.core;

import org.coyove.eugine.base.ReplaceableVariables;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;
import org.coyove.eugine.value.SList;

/**
 * Created by zezhong on 2016/11/16.
 */
public class PList extends SExpression {
    @ReplaceableVariables
    public ListEx<SExpression> values = new ListEx<SExpression>();

    public PList() {
    }

    public PList(Atom ha) {
        atom = ha;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        ListEx<SValue> ret = new ListEx<SValue>();
        for (SExpression value : values) {
            ret.add(value.evaluate(env).lightClone());
        }
        return new SList(ret);
    }

    @Override
    public SExpression deepClone() {
        PList ret = new PList();
        ret.atom = this.atom;
        ret.values = ListEx.deepClone(this.values);

        return ret;
    }
}
