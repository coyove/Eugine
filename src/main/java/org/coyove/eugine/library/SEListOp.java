package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEListOp extends SExpression {
    private SExpression list;
    private SExpression pos = null;
    private SExpression value = null;
    private OPERATION op;

    public enum OPERATION {HEAD, TAIL, INIT, LAST, INSERT, SORT}

    public SEListOp() {}

    public SEListOp(Atom ha, ListEx<SExpression> args, OPERATION o) {
        super(ha, args, o == OPERATION.INSERT ? 3 : 1);

        list = args.head();
        op = o;

        if (o == OPERATION.INSERT) {
            pos = args.get(1);
            value = args.get(2);
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SList listObj = Utils.cast(this.list.evaluate(env), SList.class,
                new EgException(3005, "subject must be list", atom));

        ListEx<SValue> list = listObj.get();
        switch (op) {
            case HEAD:
                return list.size() > 0 ? list.head().evaluate(env) : new SNull();
            case TAIL:
                return list.size() > 0 ? new SList(list.skip(1)) : new SNull();
            case INIT:
                return list.size() > 0 ? new SList(list.sub(0, list.size() - 1)) : new SNull();
            case LAST:
                return list.size() > 0 ? list.get(list.size() - 1).evaluate(env) : new SNull();
            case INSERT:
                SValue value = this.value.evaluate(env);
                SInteger pos = Utils.cast(this.pos.evaluate(env), SInteger.class);
                if (pos == null) {
                    throw new EgException(3006, "position must be integer", atom);
                }

                list.add(pos.<Long>get().intValue(), value);
                return listObj;
            case SORT:
                if (list.size() == 0) {
                    return listObj;
                }

                if (list.head() instanceof SInteger) {
                    ListEx<Long> arr = new ListEx<Long>(list.size());
                    for (int i = 0; i < list.size(); i++) {
                        arr.add(list.get(i).evaluate(env).<Long>get());
                    }

                    Collections.sort(arr);
                    for (int i = 0; i < list.size(); i++) {
                        list.set(i, new SInteger(arr.get(i)));
                    }
                } else if (list.head() instanceof SDouble) {
                    ListEx<Double> arr = new ListEx<Double>(list.size());
                    for (int i = 0; i < list.size(); i++) {
                        arr.add(list.get(i).evaluate(env).<Double>get());
                    }

                    Collections.sort(arr);
                    for (int i = 0; i < list.size(); i++) {
                        list.set(i, new SDouble(arr.get(i)));
                    }
                } else if (list.head() instanceof SClosure) {
                    SClosure[] values = list.toArray(new SClosure[list.size()]);

                    Arrays.sort(values, new Comparator<SClosure>() {
                        public int compare(SClosure o1, SClosure o2) {
                            SValue v1 = o1.extra.get("__comparator__");
                            SValue v2 = o2.extra.get("__comparator__");

                            if (v1 == null || v2 == null) {
                                return 0;
                            }

                            BigDecimal num1 = Utils.castNumber(v1, atom);
                            BigDecimal num2 = Utils.castNumber(v2, atom);

                            double sign = Math.signum(num1.subtract(num2).doubleValue());
                            return ((int) sign);
                        }
                    });

                    for (int i = 0; i < values.length; i++) {
                        list.set(i, values[i]);
                    }
                }

                return listObj;
            default:
                throw new EgException(3006, "unknown list operation", atom);
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        SEListOp ret = new SEListOp();
        ret.atom = this.atom;
        ret.op = this.op;
        ret.list = this.list.deepClone();

        if (this.pos != null && this.value != null) {
            ret.pos = this.pos.deepClone();
            ret.value = this.value.deepClone();
        }

        return ret;
    }
}
