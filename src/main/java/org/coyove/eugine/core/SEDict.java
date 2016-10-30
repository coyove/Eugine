package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEDict extends SExpression {
    private List<SExpression> values;

    public SEDict() {}

    public SEDict(Atom ha, Compound c) throws VMException {
        super(ha, c);
        values = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        HashMap<String, SExpression> ret = new HashMap<String, SExpression>();

        for (SValue e : SExpression.eval(values, env)) {
            SList l = Utils.cast(e, SList.class);
            if (l == null)
                throw new VMException(2010, "invalid dict entry definition", headAtom);

            List<SValue> c = l.get();
            SString key = Utils.cast(c.head(), SString.class,
                    new VMException(2011, "key must be a string", headAtom));

            ret.put(key.<String>get(), c.get(1));
        }
        return new SDict(ret);
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEDict ret = new SEDict();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.values = List.deepClone(this.values);
        return ret;
    }
}
