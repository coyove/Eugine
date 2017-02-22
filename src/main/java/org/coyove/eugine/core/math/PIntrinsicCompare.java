package org.coyove.eugine.core.math;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class PIntrinsicCompare extends SExpression {
    private int action;
    // 0 < 1 <= 2 == 3 != 4 >= 5 >

    @ReplaceableVariable
    private SExpression subject;

    private long value;

    public PIntrinsicCompare() {
    }

    public static SExpression get(Atom atom, SExpression l, String op, SExpression r) {
        if (l instanceof SInt || l instanceof SLong || r instanceof SInt || r instanceof SLong) {
            return new PIntrinsicCompare(atom, l, r, op);
        } else {
            if (op.equals("<"))
                return new PLess(atom, l, r);
            if (op.equals(">"))
                return new PGreat(atom, l, r);
            if (op.equals("<="))
                return new PLessEqual(atom, l, r);
            if (op.equals(">="))
                return new PGreatEqual(atom, l, r);
            if (op.equals("=="))
                return new PEqual(atom, l, r);
            if (op.equals("!="))
                return new PNotEqual(atom, l, r);
        }

        // never happen
        return null;
    }

    public PIntrinsicCompare(Atom ha, SExpression l, SExpression r, String a) {
        atom = ha;

        try {
            boolean inv = false;

            if (l instanceof SInt || l instanceof SLong) {
                value = EgCast.toLong((SValue) l, ha);
                subject = r;
                inv = true;
            }

            if (r instanceof SInt || r instanceof SLong) {
                value = EgCast.toLong((SValue) r, ha);
                subject = l;
            }

            if (a.equals("<")) {
                action = inv ? 5 : 0;
            } else if (a.equals("<=")) {
                action = inv ? 4 : 1;
            } else if (a.equals(">=")) {
                action = inv ? 1 : 4;
            } else if (a.equals(">")) {
                action = inv ? 0 : 5;
            } else {
                action = a.equals("==") ? 2 : 3;
            }

        } catch (Exception e) {
            // never happen
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue subject = this.subject.evaluate(env);
        if (subject instanceof SDouble) {
            double d = ((SDouble) subject).val() - value;
            switch (action) {
                case 0:
                    return d < 0 ? ExecEnvironment.True : ExecEnvironment.False;
                case 1:
                    return d <= 0 ? ExecEnvironment.True : ExecEnvironment.False;
                case 2:
                    return Math.abs(d) < 1e-6 ? ExecEnvironment.True : ExecEnvironment.False;
                case 3:
                    return Math.abs(d) >= 1e-6 ? ExecEnvironment.True : ExecEnvironment.False;
                case 4:
                    return d > 0 ? ExecEnvironment.True : ExecEnvironment.False;
                case 5:
                    return d >= 0 ? ExecEnvironment.True : ExecEnvironment.False;
            }
        }

        if (subject instanceof SLong || subject instanceof SInt) {
            long d = EgCast.toLong(subject, atom) - value;
            switch (action) {
                case 0:
                    return d < 0 ? ExecEnvironment.True : ExecEnvironment.False;
                case 1:
                    return d <= 0 ? ExecEnvironment.True : ExecEnvironment.False;
                case 2:
                    return d == 0 ? ExecEnvironment.True : ExecEnvironment.False;
                case 3:
                    return d != 0 ? ExecEnvironment.True : ExecEnvironment.False;
                case 4:
                    return d > 0 ? ExecEnvironment.True : ExecEnvironment.False;
                case 5:
                    return d >= 0 ? ExecEnvironment.True : ExecEnvironment.False;
            }
        }

        return ExecEnvironment.Null;
    }

    @Override
    public SExpression deepClone() {
        PIntrinsicCompare ret = new PIntrinsicCompare();
        ret.atom = this.atom;
        ret.action = this.action;
        ret.subject = this.subject.deepClone();
        ret.value = this.value;

        return ret;
    }
}
