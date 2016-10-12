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
    private boolean self = false;

    public SEAdd(Atom ha, Compound c, boolean s) throws VMException {
        super(ha, c, 1);
        values = SExpression.castPlain(c);
        self = s;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws VMException {
        List<SValue> results = SExpression.eval(values, env);
        SValue lead = results.head();

        if (lead instanceof SString) {
            String ret = lead.get();

            if (self) {
                StringBuilder sb = new StringBuilder(ret);
                for (int i = 1; i < results.size(); i++)
                    sb.append(results.get(i).get().toString());

                lead.underlying = sb.toString();
                return new SNull();
            } else {
                for (int i = 1; i < results.size(); i++)
                    ret += results.get(i).get().toString();
                return new SString(ret);
            }
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
            List<SValue> list;
            if (self) {
                list = lead.get();
                if (lead.immutable)
                    throw new VMException(2101, "list is immutable", headAtom);
                list.addAll(results.skip(1));
                return new SNull();
            } else {
                list = (List<SValue>) lead.<List<SValue>>get().clone();
                list.addAll(results.skip(1));
                return new SList(list);
            }
        }

        return new SNull();
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEAdd ret = new SEAdd(headAtom, new Compound(), self);
        ret.values = List.clone(values);
        return ret;
    }
}
