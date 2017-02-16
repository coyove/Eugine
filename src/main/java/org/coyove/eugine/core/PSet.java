package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.core.flow.PCall;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by zezhong on 2016/9/9.
 */
public class PSet extends SExpression {
    @ReplaceableVariable
    public SExpression name;

    @ReplaceableVariable
    public SExpression value;

    public byte type;

    public final static byte VAR = 0;
    public final static byte LET = 1;
    public final static byte SET = 2;

    public PSet() {
    }

    public PSet(Atom ha, SExpression name, SExpression value, byte a) {
        atom = ha;
        this.name = name;
        this.value = value;
        type = a;

        if (a == LET) {
            if (!(name instanceof PVariable)) {
                ErrorHandler.print(9881, "'let' is only allowed to define a variable", ha);
            }
        }
    }

    public static SValue set(SExpression name,
                             SExpression value,
                             byte type, Atom atom,
                             ExecEnvironment env) throws EgException {
        SValue n = name.evaluate(env);
        SValue v = value.evaluate(env);
        SValue ret = v;

        if (v instanceof SString) {
            ret = v.clone();
        }

        if (name instanceof PVariable) {
            PVariable var = ((PVariable) name);
            String sn = var.name;

            if (var.isShared) {
                var.shared = ret;
            } else {
                if (type == SET) {
                    env.put(sn, ret);
                } else {
                    env.bPut(sn, ret);
                }
            }
        } else {
            Object refer = n.refer;
            if (refer != null && refer instanceof SValue &&
                    ((SValue) refer).immutable && !(refer instanceof SClosure)) {
                throw new EgException(2044, "referred variable is immutable", atom);
            }

            if (refer instanceof SDict) {
                ((SDict) refer).<HashMap<String, SValue>>get().put(n.refKey.toString(), ret);
            } else if (refer instanceof SList) {
                ((SList) refer).<ListEx<SValue>>get().set(n.refIndex, ret);
            } else if (refer instanceof SObject || refer instanceof SMetaExpression) {
                Object sub = ((SValue) refer).underlying;
                EgInterop.setField(sub, n.refKey.toString(), ret);
            } else if (refer instanceof SClosure) {
                if (n.refKey instanceof String) {
                    String k = n.refKey.toString();
                    if (type == VAR) {
                        ((SClosure) refer).extra.bPut(k, ret);

                        if (name instanceof PGet &&
                                ((PGet) name).subject instanceof PVariable &&
                                ((PVariable) ((PGet) name).subject).name.equals("this")) {
                            env.bPut(k, ret);
                        }
                    } else {
                        ((SClosure) refer).extra.put(k, ret);
                    }
                } else if (n.refKey instanceof SClosure) {
                    // TODO: avoid new PCall, make it static
                    (new PCall(atom, (SClosure) n.refKey, ListEx.build(ret))).evaluate(env);
                } else {
                    throw new EgException(2045, "invalid setter", atom);
                }
            } else {
                throw new EgException(2045, "failed to set, invalid referred object: " + refer, atom);
            }
        }

        return ret;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        return set(name, value, type, atom, env);
    }

    @Override
    public SExpression deepClone() {
        PSet ret = new PSet();
        ret.atom = this.atom;

        ret.name = this.name.deepClone();
        ret.value = this.value.deepClone();
        ret.type = this.type;
        return ret;
    }
}
