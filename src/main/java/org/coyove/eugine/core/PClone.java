package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.*;

/**
 * Created by zezhong on 2016/9/9.
 */
public class PClone extends SExpression {
    private SExpression varName;
//    private ListEx<SExpression> arguments;

    public PClone() {}

    public PClone(Atom ha, SExpression sub) {
        headAtom = ha;
        varName = sub;
    }

    public PClone(Atom ha, Compound c) throws VMException {
        throw new VMException(9999, "not implemented", ha);
//        super(ha, c, 1);
//
//        varName = SExpression.cast(c.atoms.pop());
//        arguments = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue n = varName.evaluate(env);

        if (n instanceof SClosure) {
            synchronized (n) {
                SClosure cls = ((SClosure) n);
                return cls.getCopy();
            }
        } else {
            return n.clone();
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        PClone ret = new PClone();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.varName = this.varName.deepClone();
//        ret.arguments = ListEx.deepClone(this.arguments);
        return ret;
    }
}
