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

    public SEDel() {}

    public SEDel(Atom ha, Compound c) throws VMException {
        super(ha, c, 2);

        host = SExpression.cast(c.atoms.pop());
        index = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue subObj = host.evaluate(env);
        SValue idx = this.index.evaluate(env);

        if (idx instanceof SInteger && subObj instanceof SList) {
            if (subObj.immutable)
                throw new VMException(2006, "list is immutable", headAtom);

            List<SValue> subList = subObj.get();
            int i = idx.<Long>get().intValue();
            if (i < 0 || i >= subList.size())
                throw new VMException(2007, "index out of range", headAtom);

            return subList.remove(i);
        } else if (idx instanceof SString && subObj instanceof SDict) {
            if (subObj.immutable)
                throw new VMException(2008, "dict is immutable", headAtom);

            HashMap<String, SValue> dict = subObj.get();

            SValue ret = dict.remove(idx.<String>get());
            return ret == null ? new SNull() : ret;
        } else {
            throw new VMException(2009, "mismatch types", headAtom);
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEDel ret = new SEDel();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.host = this.host.deepClone();
        ret.index = this.index.deepClone();
        return ret;
    }
}
