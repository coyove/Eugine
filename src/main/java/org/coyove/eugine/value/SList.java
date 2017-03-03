package org.coyove.eugine.value;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.*;

import java.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SList extends SComplexValue {
    public final static Map<String, PseudoCallInterface> pseudoCalls =
            new HashMap<String, PseudoCallInterface>(){{
                put("reversed", new PseudoCallInterface() {
                    public SValue call(SValue in) {
                        ListEx<SValue> l = in.get();
                        Object[] objs = l.toArray(new SValue[l.size()]);

                        ArrayUtils.reverse(objs);
                        ListEx<SValue> ret = new ListEx<SValue>(
                                Arrays.asList(Arrays.copyOf(objs, objs.length, SValue[].class)));
                        return new SList(ret);
                    }
                });

                put("head", new PseudoCallInterface() {
                    public SValue call(SValue in) {
                        ListEx<SValue> l = in.get();
                        return l.size() > 0 ? l.head() : ExecEnvironment.Null;
                    }
                });

                put("last", new PseudoCallInterface() {
                    public SValue call(SValue in) {
                        ListEx<SValue> l = in.get();
                        return l.size() > 0 ? l.last() : ExecEnvironment.Null;
                    }
                });

                put("init", new PseudoCallInterface() {
                    public SValue call(SValue in) {
                        ListEx<SValue> l = in.get();
                        return new SList(l.sub(0, l.size() - 1));
                    }
                });

                put("tail", new PseudoCallInterface() {
                    public SValue call(SValue in) {
                        ListEx<SValue> l = in.get();
                        return new SList(l.skip(1));
                    }
                });

                put("remove", new PseudoCallInterface() {
                    public SValue call(final SValue in) {
                        final ListEx<SValue> list = in.get();
                        return new SNativeCall(new NativeCallInterface() {
                            public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments)
                                    throws EgException {
                                try {
                                    list.remove(EgCast.toInt(arguments.head(), atom));
                                    return in;
                                } catch (IndexOutOfBoundsException e) {
                                    throw EgException.INDEX_OUT_OF_RANGE.raise(atom);
                                }
                            }
                        }, 1);
                    }
                });

                put("concat", new PseudoCallInterface() {
                    public SValue call(final SValue in) {
                        final ListEx<SValue> list = in.get();
                        return new SNativeCall(new NativeCallInterface() {
                            public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments)
                                    throws EgException {
                                SList list2 = EgCast.to(arguments.head(), SList.class);
                                if (list2 == null)
                                    throw EgException.INVALID_SUBJECT.raise(atom);

                                list.addAll(list2.<ListEx<SValue>>get());
                                return in;
                            }
                        }, 1);
                    }
                });

                put("insert", new PseudoCallInterface() {
                    public SValue call(final SValue in) {
                        final ListEx<SValue> list = in.get();
                        return new SNativeCall(new NativeCallInterface() {
                            public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments)
                                    throws EgException {
                                try {
                                    list.add(EgCast.toInt(arguments.head(), atom),
                                            arguments.get(1).evaluate(env));
                                    return in;
                                } catch (IndexOutOfBoundsException e) {
                                    throw EgException.INDEX_OUT_OF_RANGE.raise(atom);
                                }
                            }
                        }, 2);
                    }
                });

                put("filter", new PseudoCallInterface() {
                    public SValue call(final SValue in) {
                        return new SNativeCall(new NativeCallInterface() {
                            @SuppressWarnings("unchecked")
                            public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments)
                                    throws EgException {
                                SClosure pred = EgCast.to(arguments.head(), SClosure.class);
                                if (pred == null || pred.argNames.size() < 1) {
                                    throw EgException.INVALID_FUNCTION.raise(atom, "predicate");
                                }

                                ListEx<SValue> list = in.get();
                                list = (ListEx<SValue>) list.clone();
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
                                return new SList(list);
                            }
                        }, 1);
                    }
                });

                put("sort", new PseudoCallInterface() {
                    public SValue call(final SValue in) {
                        return new SNativeCall(new NativeCallInterface() {
                            @SuppressWarnings("unchecked")
                            public SValue call(final Atom atom,
                                               final ExecEnvironment env, ListEx<SValue> arguments)
                                    throws EgException {
                                SClosure comparator = null;
                                if (arguments.size() > 0) {
                                    comparator = EgCast.to(arguments.head(), SClosure.class);
                                    if (comparator == null || comparator.argNames.size() < 2) {
                                        throw EgException.INVALID_FUNCTION.raise(atom, "comparator");
                                    }
                                }

                                ListEx<SValue> list = in.get();
                                list = (ListEx<SValue>) list.clone();
                                if (list.size() == 0) return new SList(list);

                                if (comparator == null) {
                                    double[] arr = new double[list.size()];
                                    for (int i = 0; i < list.size(); i++)
                                        arr[i] = EgCast.toDouble(list.get(i), atom);

                                    Arrays.sort(arr);
                                    for (int i = 0; i < list.size(); i++)
                                        list.set(i, new SNumber(arr[i]));

                                    return new SList(list);
                                }

                                final SClosure comp = comparator;
                                final ExecEnvironment newEnv = new ExecEnvironment();
                                final String name1 = comparator.argNames.head();
                                final String name2 = comparator.argNames.get(1);
                                newEnv.parentEnv = env;

                                Collections.sort(list, new Comparator<SValue>() {
                                    public int compare(SValue o1, SValue o2) {
                                        int ret = 0;
                                        try {
                                            if (comp instanceof SNativeCall) {
                                                ret = EgCast.toInt(((SNativeCall) comp)
                                                        .call(atom, env, ListEx.build(o1, o2)), atom);
                                            } else {
                                                newEnv.put(name1, o1);
                                                newEnv.put(name2, o2);

                                                SValue v = ExecEnvironment.Null;
                                                for (SExpression se : comp.body)
                                                    v = se.evaluate(newEnv);

                                                ret = EgCast.toInt(v, atom);
                                            }
                                        } catch (EgException e) {
                                            e.exit();
                                        }

                                        return ret;
                                    }
                                });

                                return new SList(list);
                            }
                        }, 0);
                    }
                });
            }};

    public SList(ListEx<SValue> list) {
        super(list);
    }

    @Override
    public SValue clone() {
        ListEx<SValue> origin = this.get();
        ListEx<SValue> n = new ListEx<SValue>(origin.size());

        for (SValue t : origin)
            n.add(t.clone());

        return new SList(n);
    }

    @Override
    public SValue lightClone() {
        return this;
    }

    @Override
    public String asString() {
        ListEx<SValue> list = this.get();
        String[] items = new String[list.size()];
        int i = 0;
        for (SValue s : list) {
            items[i++] = s.toString();
        }

        return "[" + StringUtils.join(items, ", ") + "]";
    }

    @Override
    public String toString() {
        return "list = " + asString();
    }
}
