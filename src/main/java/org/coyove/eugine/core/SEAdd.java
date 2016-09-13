package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.math.BigDecimal;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEAdd extends SExpression {
    private List<SExpression> values;

    public SEAdd(Atom ha, Compound c) throws VMException {
        super(ha, c);
        if (c.atoms.size() < 1)
            throw new VMException("it takes at least 1 argument", ha);

        values = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        List<SValue> results = SExpression.eval(values, env);
        SValue lead = results.head();

        if (lead instanceof SString) {
            String ret = lead.get();
            for (int i = 1; i < results.size(); i++)
                ret += results.get(i).get().toString();

            return new SString(ret);
        }

        if (lead instanceof SDouble || lead instanceof SInteger) {
            BigDecimal ret = lead instanceof SDouble ?
                    BigDecimal.valueOf(lead.<Double>get()) :
                    BigDecimal.valueOf(lead.<Long>get());

            for (int i = 1; i < results.size(); i++) {
                BigDecimal next = Utils.getNumber(results.get(i), headAtom);
                ret = ret.add(next);
            }

            if (lead instanceof SDouble) {
                return new SDouble(ret.doubleValue());
            }else {
                return new SInteger(ret.longValue());
            }
        }

        if (lead instanceof SList) {
            List<SValue> list = (List<SValue>)lead.<List<SValue>>get().clone();
            list.addAll(results.skip(1));

            return new SList(list);
        }

        return new SNull();
    }
}
