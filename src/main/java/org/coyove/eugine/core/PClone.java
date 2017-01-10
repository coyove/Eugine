package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.*;

/**
 * Created by zezhong on 2016/9/9.
 */
public class PClone extends SExpression {
    @ReplaceableVariable
    private SExpression subject;

    public PClone() {}

    public PClone(Atom ha, SExpression sub) {
        atom = ha;
        subject = sub;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue n = subject.evaluate(env);

        if (n instanceof SClosure) {
            return ((SClosure) n).getCopy();
        } else {
            return n.clone();
        }
    }

    @Override
    public SExpression deepClone() {
        PClone ret = new PClone();
        ret.atom = this.atom;
        ret.subject = this.subject.deepClone();

        return ret;
    }
}
