package org.coyove.eugine.core.math;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class PCompare extends SExpression {
    private String action;

    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right;

    public PCompare() {
    }

    public PCompare(Atom ha, ListEx<SExpression> args, String a) {
        super(ha, args, 2);

        action = a;
        left = args.get(0);
        right = args.get(1);
    }

    private int compareNumber(SValue left, SValue right) throws EgException {
        if (left instanceof SDouble) {
            return (int) Math.signum(((SDouble) left).val() - EgCast.toDouble(right, atom));
        }

        if (left instanceof SInt) {
            if (right instanceof SInt) {
                return (int) Math.signum(((SInt) left).val() - ((SInt) right).val());
            } else {
                return (int) Math.signum(((SInt) left).val() - EgCast.toLong(right, atom));
            }
        }

        if (left instanceof SLong) {
            return (int) Math.signum(((SLong) left).val() - EgCast.toLong(right, atom));
        }

        throw new EgException(7056, left + " is not a number", atom);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue left = this.left.evaluate(env);
        SValue right = this.right.evaluate(env);

        if (action.equals("==") || action.equals("!=")) {
            boolean flag = left.equals(right);

            if (action.equals("!=")) {
                flag = !flag;
            }

            return flag ? ExecEnvironment.True : ExecEnvironment.False;
        }

        if (action.equals(">"))
            return compareNumber(left, right) == 1 ? ExecEnvironment.True : ExecEnvironment.False;

        if (action.equals("<"))
            return compareNumber(left, right) == -1 ? ExecEnvironment.True : ExecEnvironment.False;

        if (action.equals(">="))
            return compareNumber(left, right) >= 0 ? ExecEnvironment.True : ExecEnvironment.False;

        if (action.equals("<="))
            return compareNumber(left, right) <= 0 ? ExecEnvironment.True : ExecEnvironment.False;

        return ExecEnvironment.Null;
    }

    @Override
    public SExpression deepClone() throws EgException {
        PCompare ret = new PCompare();
        ret.atom = this.atom;
        ret.action = this.action;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();

        return ret;
    }
}
