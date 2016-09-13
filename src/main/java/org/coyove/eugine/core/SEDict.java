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

    public SEDict(Atom ha, Compound c) throws VMException {
        super(ha, c);
        values = new List<SExpression>();

        for (Base a : c.atoms) {
            if (a instanceof Atom || ((Compound) a).atoms.size() != 2)
                throw new VMException("each element of the dict must be a list with 2 elements", ha);

            values.add(SExpression.cast(a));
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        HashMap<String, SValue> ret = new HashMap<String, SValue>();

        for (SExpression v : values)
        {
            List<SValue> c = v.evaluate(env).get();

            SString key = Utils.cast(c.head(), SString.class,
                    new VMException("key must be string", headAtom));

            ret.put(key.<String>get(), c.get(1));
        }

        return new SDict(ret);
    }
}
