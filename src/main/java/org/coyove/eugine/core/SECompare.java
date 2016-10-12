package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.math.BigDecimal;

/**
 * Created by coyove on 2016/9/10.
 */
public class SECompare extends SExpression {
    private String action;
    private List<SExpression> values;

    public SECompare() {}

    public SECompare(Atom ha, Compound c, String a) throws VMException {
        super(ha, c, 1);

        action = a;
        values = SExpression.castPlain(c);
    }

    private boolean compareNumber(List<SValue> nums, int ...signs) throws VMException {
        BigDecimal first = Utils.getNumber(nums.head(), headAtom);

        for (int i = 1; i < nums.size(); i++) {
            BigDecimal next = Utils.getNumber(nums.get(i), headAtom);
            int sign = first.subtract(next).signum();

            if (signs[0] != sign && signs[1] != sign)
                return false;

            first = next;
        }

        return true;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        List<SValue> results = SExpression.eval(values, env);

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
    public SExpression deepClone() throws VMException {
        SECompare ret = new SECompare();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.action = this.action;
        ret.values = List.deepClone(this.values);

        return ret;
    }
}
