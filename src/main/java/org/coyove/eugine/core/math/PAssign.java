package org.coyove.eugine.core.math;

import org.coyove.eugine.base.*;
import org.coyove.eugine.core.PSet;
import org.coyove.eugine.core.PVariable;
import org.coyove.eugine.core.flow.PCall;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.lang.reflect.Constructor;

/**
 * Created by coyove on 2016/9/10.
 */
public class PAssign extends SExpression {
    @ReplaceableVariable
    private SExpression subject;

    @ReplaceableVariable
    public SExpression op;

    public PAssign() {
    }

    public PAssign(Atom ha, SExpression l, SExpression r, Class <? extends SExpression> o) {
        atom = ha;
        subject = l;

        try {
            Constructor ctor = o.getConstructor(Atom.class, SExpression.class, SExpression.class);
            op = (SExpression) ctor.newInstance(ha, l, r);
        } catch (Exception e) {
            // nothing, shouldn't happen
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        return PSet.set(subject, op.evaluate(env), PSet.SET, atom, env);
    }

    @Override
    public SExpression deepClone() {
        PAssign ret = new PAssign();
        ret.atom = this.atom;
        ret.op = this.op.deepClone();
        ret.subject = this.subject.deepClone();

        return ret;
    }
}
