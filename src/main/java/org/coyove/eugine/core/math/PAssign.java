package org.coyove.eugine.core.math;

import org.coyove.eugine.base.*;
import org.coyove.eugine.core.PGet;
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

    public PAssign(Atom ha, SExpression l, SExpression r, String o) {
        atom = ha;
        subject = l;
        build(ha, l, r, o);
    }

    private void build(Atom ha, SExpression l, SExpression r, String o) {
        switch (o.charAt(0)) {
            case '+':
                op = new PAdd(ha, l, r, true);
                break;
            case '-':
                op = new PSubtract(ha, l, r, true);
                break;
            case '*':
                op = new PMultiply(ha, l, r, true);
                break;
            case '/':
                op = new PDivide(ha, l, r, true);
                break;
            case '%':
                op = new PModular(ha, l, r, true);
                break;
            case '&':
                op = new PBitAnd(ha, l, r, true);
                break;
            case '|':
                op = new PBitOr(ha, l, r, true);
                break;
            case '^':
                op = new PBitXor(ha, l, r, true);
                break;
        }
    }

    public PAssign(Atom ha, SExpression s, SExpression k, SExpression v, String o) {
        atom = ha;
        subject = s;
        build(ha, new PGet(ha, s, k), v, o);
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        return op.evaluate(env);
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
