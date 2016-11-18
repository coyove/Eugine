package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEDel extends SExpression {
    @ReplaceableVariable
    private SExpression host;

    @ReplaceableVariable
    private SExpression index;

    public SEDel() {}

    public SEDel(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 2);

        host = args.get(0);
        index = args.get(1);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue subObj = host.evaluate(env);
        SValue idx = this.index.evaluate(env);

        if (idx instanceof SInteger && subObj instanceof SList) {
            if (subObj.immutable)
                throw new EgException(2006, "list is immutable", atom);

            ListEx<SValue> subList = subObj.get();
            int i = idx.<Long>get().intValue();
            if (i < 0 || i >= subList.size())
                throw new EgException(2007, "index out of range", atom);

            return subList.remove(i);
        } else if (idx instanceof SString && subObj instanceof SDict) {
            if (subObj.immutable)
                throw new EgException(2008, "dict is immutable", atom);

            HashMap<String, SValue> dict = subObj.get();

            SValue ret = dict.remove(idx.<String>get());
            return ret == null ? new SNull() : ret;
        } else {
            throw new EgException(2009, "mismatch types", atom);
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        SEDel ret = new SEDel();
        ret.atom = this.atom;

        ret.host = this.host.deepClone();
        ret.index = this.index.deepClone();
        return ret;
    }
}
