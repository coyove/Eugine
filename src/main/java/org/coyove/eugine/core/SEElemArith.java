package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEElemArith extends SExpression {
    private List<SExpression> values;
    private ACTION action;

    public enum ACTION {SUBTRACT, MULTIPLY, DIVIDE, MODULAR}

    public SEElemArith(Atom ha, Compound c, ACTION a) throws VMException {
        super(ha, c);
        if (c.atoms.size() < 2)
            throw new VMException("it takes at least 2 arguments", ha);

        action = a;
        values = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        List<SValue> results = SExpression.eval(values, env);
        SValue lead = results.head();

        if (lead instanceof SDouble || lead instanceof SInteger) {
        } else {
            return new SNull();
        }

        BigDecimal ret = lead instanceof SDouble ?
                BigDecimal.valueOf(lead.<Double>get()) :
                BigDecimal.valueOf(lead.<Long>get());

        for (int i = 1; i < results.size(); i++) {
            BigDecimal next = Utils.getNumber(results.get(i), headAtom);
            switch (action) {
                case SUBTRACT:
                    ret = ret.subtract(next);
                    break;
                case MULTIPLY:
                    ret = ret.multiply(next);
                    break;
                case DIVIDE:
                    if (next.abs().doubleValue() < 0.000001)
                        throw new VMException("divided by zero", headAtom);

                    ret = ret.divide(next, MathContext.DECIMAL64);
                    break;
                case MODULAR:
                    if (next.abs().doubleValue() < 0.000001)
                        throw new VMException("moded by zero", headAtom);

                    Long rem = ret.divide(next, MathContext.DECIMAL64).longValue();
                    ret = ret.subtract(next.multiply(BigDecimal.valueOf(rem)));
                    break;
            }
        }

        if (lead instanceof SDouble) {
            return new SDouble(ret.doubleValue());
        } else {
            return new SInteger(ret.longValue());
        }

    }
}
