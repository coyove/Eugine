package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.math.BigDecimal;

/**
 * Created by coyove on 2016/9/10.
 */
public class PAdd extends SExpression {
    private ListEx<SExpression> values;
    private boolean self = false;

    public PAdd() {}

    public PAdd(Atom ha, ListEx<SExpression> args, boolean s) {
        super(ha, args, 1);

        values = args;
        self = s;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        ListEx<SValue> results = SExpression.eval(values, env);
        SValue lead = results.head();

        if (lead instanceof SString) {
            String ret = lead.get();

            if (self) {
                StringBuilder sb = new StringBuilder(ret);
                for (int i = 1; i < results.size(); i++) {
                    Object obj = results.get(i).get();
                    if (obj != null) {
                        sb.append(obj.toString());
                    }
                }

                lead.underlying = sb.toString();
                return new SNull();
            } else {
                for (int i = 1; i < results.size(); i++) {
                    Object obj = results.get(i).get();
                    if (obj != null) {
                        ret += obj.toString();
                    }
                }
                return new SString(ret);
            }
        }

        if (lead instanceof SDouble || lead instanceof SInteger) {
            BigDecimal ret = lead instanceof SDouble ?
                    BigDecimal.valueOf(lead.<Double>get()) :
                    BigDecimal.valueOf(lead.<Long>get());

            for (int i = 1; i < results.size(); i++) {
                BigDecimal next = Utils.getNumber(results.get(i), atom);
                ret = ret.add(next);
            }

            if (lead instanceof SDouble) {
                return new SDouble(ret.doubleValue());
            } else {
                return new SInteger(ret.longValue());
            }
        }

        if (lead instanceof SList) {
            ListEx<SExpression> list;
            if (self) {
                list = lead.get();
                if (lead.immutable) {
                    throw new EgException(2101, "list is immutable", atom);
                }

                list.addAll(results.skip(1));
                return new SNull();
            } else {
                list = (ListEx<SExpression>) lead.<ListEx<SExpression>>get().clone();
                list.addAll(results.skip(1));
                return new SList(list);
            }
        }

        return new SNull();
    }

    @Override
    public SExpression deepClone() throws EgException {
        PAdd ret = new PAdd();
        ret.atom = this.atom;
        ret.values = ListEx.deepClone(values);
        ret.self = this.self;
        return ret;
    }
}
