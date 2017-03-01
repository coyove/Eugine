package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/10.
 */
public class PGet extends SExpression {
    @ReplaceableVariable
    public SExpression subject;

    @ReplaceableVariable
    public SExpression key;

    public boolean asCalled;

    public PGet() {}

    public PGet(Atom ha, SExpression d, SExpression k) {
        atom = ha;
        subject = d;
        key = k;
        asCalled = false;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        final SValue dict = this.subject.evaluate(env);
        SValue sk = this.key.evaluate(env);

        if (dict instanceof SDict) {
            String k;
            if (sk instanceof SString || sk instanceof SNumber) {
                k = sk.asString();
            } else {
                throw EgException.INVALID_FIELD.raise(atom, sk);
            }

            HashMap<String, SValue> d = dict.get();
            SValue dk = d.get(k);
            if (dk == null) {
                d.put(k, ExecEnvironment.Null);
                dk = ExecEnvironment.Null;
            }

            return dk;
        } else if (dict instanceof SList) {
            ListEx<SValue> l = dict.get();
            if (sk instanceof SNumber) {
                int idx = ((SNumber) sk).intValue();
                if (idx >= l.size() || idx < 0) {
                    throw EgException.INDEX_OUT_OF_RANGE.raise(atom);
                }
                return l.get(idx);
            } else {
                PseudoCallInterface pc = SList.pseudoCalls.get(EgCast.toString(sk, atom));
                if (pc == null)
                    throw EgException.INVALID_FIELD.raise(atom, EgCast.toString(sk, atom));

                return pc.call(dict);
            }
        } else if (dict instanceof SString) {
            String str = dict.get();
            if (sk instanceof SNumber) {
                int idx = ((SNumber) sk).intValue();

                if (idx >= str.length() || idx < 0)
                    throw EgException.INDEX_OUT_OF_RANGE.raise(atom);

                return new SString(String.valueOf(str.charAt(idx)));
            } else {
                PseudoCallInterface pc = SString.pseudoCalls.get(EgCast.toString(sk, atom));
                if (pc == null)
                    throw EgException.INVALID_FIELD.raise(atom, EgCast.toString(sk, atom));

                return pc.call(dict);
            }
        } else if (dict instanceof SClosure) {
            String k = EgCast.toString(sk, atom);

            if (k.startsWith("__")) {
                if (k.equals("__extra__")) {
                    HashMap<String, SValue> ret = new HashMap<String, SValue>();
                    for (String s : ((SClosure) dict).extra.keySet()) {
                        ret.put(s, ((SClosure) dict).extra.get(s));
                    }

                    return new SDict(ret);
                } else if (k.equals("__doc__")) {
                    return new SString(((SClosure) dict).doc);
                } else {
                    return ExecEnvironment.Null;
                }
            } else {
                SValue ret = ((SClosure) dict).extra.get(k);
                if (ret == null) {
                    SValue getter = ((SClosure) dict).extra.get("__get__" + k);
                    if (getter == null) {
                        ret = ExecEnvironment.Null;
                    } else if (getter instanceof SClosure) {
                        ret = PCall.evaluateClosure(atom, ((SClosure) getter), new ListEx<SValue>(), env);
                    } else {
                        throw EgException.INVALID_FUNCTION.raise(atom, "getter");
                    }
                }

                if (ret instanceof SClosure) {
                    ((SClosure) ret).refer = dict;
                }

                return ret;
            }
        } else if (dict instanceof SBuffer) {
            byte[] buf = dict.get();
            return new SNumber(buf[EgCast.toInt(sk, atom)]);
        } else if (dict instanceof SObject || dict instanceof SMetaExpression) {
            final String name = EgCast.toString(sk, atom);

            if (asCalled) {
                return new SNativeCall(new NativeCallInterface() {
                    public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments)
                            throws EgException {
                        return EgInterop.callMostPossibleMethod(atom, dict.get(), name, arguments);
                    }
                }, 0);
            } else {
                return EgInterop.getField(atom, dict.get(), name);
            }
        } else if (dict instanceof SError) {
            String name = EgCast.toString(sk, atom);
            if (name.equals("code")) {
                return new SNumber(((SError) dict).errorCode);
            } else if (name.equals("message")) {
                return new SString(((SError) dict).message);
            } else {
                throw EgException.INVALID_FIELD.raise(atom, name);
            }
        } else {
            throw EgException.INVALID_FIELD.raise(atom);
        }
    }

    @Override
    public SExpression deepClone() {
        PGet ret = new PGet();
        ret.atom = this.atom;

        ret.subject = this.subject.deepClone();
        ret.key = this.key.deepClone();
        ret.asCalled = this.asCalled;

        return ret;
    }
}