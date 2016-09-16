package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEDel extends SExpression {
    private SExpression host;
    private SExpression index;

    public SEDel(Atom ha, Compound c) throws VMException {
        super(ha, c);
        if (c.atoms.size() < 1)
            throw new VMException(2014, "needs the subject to delete from", ha);

        if (c.atoms.size() < 2)
            throw new VMException(2014, "needs the key (or index) to delete", ha);

        host = SExpression.cast(c.atoms.pop());
        index = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue subObj = host.evaluate(env);
        SValue idx = this.index.evaluate(env);

        if (idx instanceof SInteger && subObj instanceof SList) {
            if (subObj.immutable)
                throw new VMException(2010, "list is immutable", headAtom);

            List<SValue> subList = subObj.get();
            int i = idx.<Long>get().intValue();
            if (i < 0 || i >= subList.size())
                throw new VMException(2011, "index out of range", headAtom);

            return subList.remove(i);
        } else if (idx instanceof SString && subObj instanceof SDict) {
            if (subObj.immutable)
                throw new VMException(2012, "dict is immutable", headAtom);

            HashMap<String, SValue> dict = subObj.get();

            SValue ret = dict.remove(idx.<String>get());
            return ret == null ? new SNull() : ret;
        } else {
            throw new VMException(2013, "mismatch types", headAtom);
        }
    }
}
