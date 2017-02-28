package org.coyove.eugine.library;

import org.coyove.eugine.base.NativeCallInterface;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.EgCast;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;
import org.coyove.eugine.value.*;

/**
 * Created by zezhong on 2017/2/27.
 */
public class meta implements Exportable {
    private static SClosure getClosure(Atom atom, SValue arg) throws EgException {
        SClosure closure = EgCast.to(arg, SClosure.class);
        if (closure == null)
            throw new EgException(6791, "invalid closure", atom);

        return closure;
    }

    @SuppressWarnings("unchecked")
    private static ListEx<SExpression> getMetaExpression(Atom atom, SValue expr) throws EgException {
        if (!(expr instanceof SClosure) && !(expr instanceof SMetaExpression)) {
            throw new EgException(6791, "invalid meta expression", atom);
        }

        return expr instanceof SClosure ?
                ((SClosure) expr).body :
                ListEx.build(((SMetaExpression) expr).underlying);
    }

    public void export(ExecEnvironment env) {
        SDict meta = Exportable.Utils.buildTopRoute(env, "meta");
        meta.put("get", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    SClosure closure = getClosure(atom, arguments.head());

                    int idx = EgCast.toInt(arguments.get(1), atom);
                    try {
                        return new SMetaExpression(closure.body.get(idx));
                    } catch (Exception e) {
                        throw new EgException(6792, e.toString(), atom);
                    }
                }
            }, 2));

        meta.put("remove", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    SClosure closure = getClosure(atom, arguments.head());

                    int idx = EgCast.toInt(arguments.get(1), atom);
                    try {
                        closure.body.remove(idx);
                        return ExecEnvironment.True;
                    } catch (Exception e) {
                        throw new EgException(6792, e.toString(), atom);
                    }
                }
            }, 2));

        meta.put("body", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    SClosure closure = getClosure(atom, arguments.head());

                    ListEx<SValue> ret = new ListEx<SValue>(closure.body.size());
                    for (SExpression e : closure.body) {
                        ret.add(new SMetaExpression(e));
                    }

                    return new SList(ret);
                }
            }, 1));

        meta.put("add", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    SClosure closure = getClosure(atom, arguments.head());
                    if (arguments.get(1) instanceof SNumber) {
                        int idx = EgCast.toInt(arguments.get(1), atom);
                        if (arguments.size() < 3)
                            throw new EgException(6793, "not enough arguments", atom);

                        try {
                            closure.body.addAll(idx, getMetaExpression(atom, arguments.get(2)));
                        } catch (Exception e) {
                            throw new EgException(6792, e.toString(), atom);
                        }
                    } else {
                        closure.body.addAll(getMetaExpression(atom, arguments.get(1)));
                    }

                    return ExecEnvironment.Null;
                }
            }, 2));

        meta.put("set", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    SClosure closure = getClosure(atom, arguments.head());
                    int idx = EgCast.toInt(arguments.get(1), atom);

                    try {
                        closure.body.remove(idx);
                        closure.body.addAll(idx, getMetaExpression(atom, arguments.get(2)));
                    } catch (Exception e) {
                        throw new EgException(6792, e.toString(), atom);
                    }

                    return ExecEnvironment.Null;
                }
            }, 3));
    }
}
