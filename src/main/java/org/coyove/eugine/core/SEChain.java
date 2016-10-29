package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SEChain extends SExpression {
    public List<SExpression> expressions;

    public SEChain() {
        expressions = new List<SExpression>();
    }

    public SEChain(Atom ha, Compound c) throws VMException {
        super(ha, c);
        expressions = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue ret = new SNull();
        for (int i = 0; i < expressions.size(); i++) {
            SExpression se = expressions.get(i);
            ret = se.evaluate(env);
        }
        return ret;
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEChain ret = new SEChain();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.expressions = List.deepClone(this.expressions);
        return ret;
    }
}
