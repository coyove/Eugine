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
    private ListEx<SExpression> values;

    public PCompare() {}

    public PCompare(Atom ha, ListEx<SExpression> args, String a) {
        super(ha, args, 1);

        action = a;
        values = args;
    }

    private boolean compareNumber(ListEx<SValue> nums, int ...signs) throws EgException {
        BigDecimal first = Utils.castNumber(nums.head(), atom);

        for (int i = 1; i < nums.size(); i++) {
            BigDecimal next = Utils.castNumber(nums.get(i), atom);
            int sign = first.subtract(next).signum();

            if (signs[0] != sign && signs[1] != sign)
                return false;

            first = next;
        }

        return true;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        ListEx<SValue> results = SExpression.eval(values, env);

        if (action.equals("==") || action.equals("!=")) {
            Object first = results.head().get();
            boolean ret = true;
            for (int i = 1; i < results.size(); i++) {
                Object next = results.get(i).get();
                boolean flag;

                if (first != null && next != null) {
                    flag = first.equals(next);
                } else {
                    flag = first == next;
                }

                if (action.equals("!="))
                    flag = !flag;

                ret = ret && flag;
            }

            return new SBool(ret);
        }

        if (action.equals(">"))
            return new SBool(compareNumber(results, 1, 1));

        if (action.equals("<"))
            return new SBool(compareNumber(results, -1, -1));

        if (action.equals(">="))
            return new SBool(compareNumber(results, 1, 0));

        if (action.equals("<="))
            return new SBool(compareNumber(results, -1, 0));

        return new SNull();
    }

    @Override
    public SExpression deepClone() throws EgException {
        PCompare ret = new PCompare();
        ret.atom = this.atom;
        ret.action = this.action;
        ret.values = ListEx.deepClone(this.values);

        return ret;
    }
}
