package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.math.BigDecimal;

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

    private boolean compareNumber(SValue left, SValue right, int... signs) throws EgException {
        if (left instanceof SInteger) {
            long l = ((SInteger) left).val();
            long r = Utils.castLong(right, atom);
            int sign = (int) Math.signum(l - r);

            return (signs[0] == sign || signs[1] == sign);
        }

        if (left instanceof SDouble) {
            double l = ((SDouble) left).val();
            double r = Utils.castDouble(right, atom);
            int sign = (int) Math.signum(l - r);

            return (signs[0] == sign || signs[1] == sign);
        }

        return false;
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
            return compareNumber(left, right, 1, 1) ? ExecEnvironment.True : ExecEnvironment.False;

        if (action.equals("<"))
            return compareNumber(left, right, -1, -1) ? ExecEnvironment.True : ExecEnvironment.False;

        if (action.equals(">="))
            return compareNumber(left, right, 1, 0) ? ExecEnvironment.True : ExecEnvironment.False;

        if (action.equals("<="))
            return compareNumber(left, right, -1, 0) ? ExecEnvironment.True : ExecEnvironment.False;

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
