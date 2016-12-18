package org.coyove.eugine.core;

import org.coyove.eugine.base.ReplaceableVariables;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;
import org.coyove.eugine.value.SDict;

import java.util.HashMap;

/**
 * Created by zezhong on 2016/11/16.
 */
public class PDict extends SExpression {
    public ListEx<String> keys = new ListEx<String>();

    @ReplaceableVariables
    public ListEx<SExpression> values = new ListEx<SExpression>();

    public PDict() {
    }

    public PDict(Atom ha) {
        atom = ha;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        HashMap<String, SValue> dict = new HashMap<String, SValue>();
        for (int i = 0; i < keys.size(); i++) {
            dict.put(keys.get(i), values.get(i).evaluate(env));
        }
        return new SDict(dict);
    }

    @Override
    public SExpression deepClone() {
        PDict ret = new PDict();
        ret.atom = this.atom;
        ret.keys = this.keys;
        ret.values = ListEx.deepClone(this.values);

        return ret;
    }
}
