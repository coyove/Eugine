package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SEList extends SExpression {
    private List<SExpression> values;

    public SEList() {}

    public SEList(Atom ha, Compound c) throws VMException {
        super(ha, c);

        values = new List<SExpression>();
        for (Base a : c.atoms)
            values.add(SExpression.cast(a));
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        return new SList(SExpression.eval(values, env));
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEList ret = new SEList();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.values = List.deepClone(this.values);
        return ret;
    }
}
