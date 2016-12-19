package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEListOp extends SExpression {
    @ReplaceableVariable
    private SExpression list;

    @ReplaceableVariable
    private SExpression pos = null;

    @ReplaceableVariable
    private SExpression value = null;

    private byte op;

    public final static byte HEAD = 0;
    public final static byte TAIL = 1;
    public final static byte INIT = 2;
    public final static byte LAST = 3;
    public final static byte INSERT = 4;
    public final static byte SORT = 5;
    public final static byte CONCAT = 6;
    public final static byte FILTER = 7;

    public SEListOp() {}

    public SEListOp(Atom ha, ListEx<SExpression> args, byte o) {
        super(ha, args, o == INSERT ? 3 : (o == CONCAT || o == FILTER ? 2 : 1));

        list = args.head();
        op = o;

        if (o == INSERT) {
            pos = args.get(1);
            value = args.get(2);
        }

        if (o == CONCAT || o == FILTER) {
            value = args.get(1);
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SList listObj = EgCast.to(this.list.evaluate(env), SList.class);
        if (listObj == null) {
            throw new EgException(3005, "subject must be list", atom);
        }

        ListEx<SValue> list = listObj.get();
        switch (op) {
            case HEAD:
                return list.size() > 0 ? list.head().evaluate(env) : ExecEnvironment.Null;
            case TAIL:
                return list.size() > 0 ? new SList(list.skip(1)) : ExecEnvironment.Null;
            case INIT:
                return list.size() > 0 ? new SList(list.sub(0, list.size() - 1)) : ExecEnvironment.Null;
            case LAST:
                return list.size() > 0 ? list.get(list.size() - 1).evaluate(env) : ExecEnvironment.Null;
            case INSERT:
                list.add(EgCast.toInt(this.pos.evaluate(env), atom), this.value.evaluate(env));
                return listObj;
            case CONCAT:
                SList list2 = EgCast.to(this.value.evaluate(env), SList.class);
                if (list2 == null) {
                    throw new EgException(3106, "must concat a list", atom);
                }

                list.addAll(list2.<ListEx<SValue>>get());
                return listObj;
            case FILTER:
                SClosure pred = EgCast.to(this.value.evaluate(env), SClosure.class);
                if (pred == null || pred.argNames.size() < 1) {
                    throw new EgException(3107, "invalid predicate function", atom);
                }

                if (pred instanceof SNativeCall) {
                    for (int i = list.size() - 1; i >= 0; i--) {
                        if (!Utils.isBooleanTrue(((SNativeCall) pred)
                                .call(atom, env, ListEx.build(list.get(i))))) {
                            list.remove(i);
                        }
                    }
                } else {
                    String name = pred.argNames.head();
                    ExecEnvironment newEnv = new ExecEnvironment();
                    newEnv.parentEnv = env;

                    for (int i = list.size() - 1; i >= 0; i--) {
                        newEnv.bPut(name, list.get(i));
                        SValue ret = ExecEnvironment.Null;
                        for (SExpression se : pred.body) {
                            ret = se.evaluate(newEnv);
                        }

                        if (!Utils.isBooleanTrue(ret)) {
                            list.remove(i);
                        }
                    }
                }

                return listObj;
            case SORT:
                if (list.size() == 0) {
                    return listObj;
                }

                if (list.head() instanceof SLong) {
                    ListEx<Long> arr = new ListEx<Long>(list.size());
                    for (int i = 0; i < list.size(); i++) {
                        arr.add(list.get(i).evaluate(env).<Long>get());
                    }

                    Collections.sort(arr);
                    for (int i = 0; i < list.size(); i++) {
                        list.set(i, new SLong(arr.get(i)));
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
                } else if (list.head() instanceof SInt) {
                    ListEx<Integer> arr = new ListEx<Integer>(list.size());
                    for (int i = 0; i < list.size(); i++) {
                        arr.add(list.get(i).evaluate(env).<Integer>get());
                    }

                    Collections.sort(arr);
                    for (int i = 0; i < list.size(); i++) {
                        list.set(i, new SInt(arr.get(i)));
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

                            try {
                                double num1 = EgCast.toDouble(v1, atom);
                                double num2 = EgCast.toDouble(v2, atom);
                                double sign = Math.signum(num1 - num2);
                                return ((int) sign);
                            } catch (Exception e) {
                                return 0;
                            }
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
    public SExpression deepClone() {
        SEListOp ret = new SEListOp();
        ret.atom = this.atom;
        ret.op = this.op;
        ret.list = this.list.deepClone();

        if (this.pos != null) {
            ret.pos = this.pos.deepClone();
        }

        if (this.value != null) {
            ret.value = this.value.deepClone();
        }

        return ret;
    }
}
