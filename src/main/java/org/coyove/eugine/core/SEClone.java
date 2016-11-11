package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.*;

/**
 * Created by zezhong on 2016/9/9.
 */
public class SEClone extends SExpression {
    private SExpression varName;
    private List<SExpression> arguments;

    public SEClone() {}

    public SEClone(Atom ha, SExpression sub) {
        headAtom = ha;
        varName = sub;
    }

    public SEClone(Atom ha, Compound c) throws VMException {
        super(ha, c, 1);

        varName = SExpression.cast(c.atoms.pop());
        arguments = SExpression.castPlain(c);
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
        SEClone ret = new SEClone();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.varName = this.varName.deepClone();
        ret.arguments = List.deepClone(this.arguments);
        return ret;
    }
}
