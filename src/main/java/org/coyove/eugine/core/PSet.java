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
    private SExpression varName;

    @ReplaceableVariable
    private SExpression varValue;

    private byte type;

    public final static byte MUTABLE = 0;
    public final static byte IMMUTABLE = 1;
    public final static byte SET = 2;

    public PSet() {
    }

    public PSet(Atom ha, SExpression name, SExpression value, byte a) {
        atom = ha;
        varName = name;
        varValue = value;
        type = a;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue n = varName.evaluate(env);
        SValue v = varValue.evaluate(env);
        SValue value = v;

        if (v instanceof SString) {
            value = v.clone();
        }

//        if (type == MUTABLE && v.immutable) {
//            /**
//             * (const b ...) (set a b)
//             * b is immutable, a should be mutable
//             * note that "clone" is shallow copy
//             */
//            value = v.clone();
//            value.immutable = false;
//        }

        if (type == IMMUTABLE) {
            value.immutable = true;
        }

        if (varName instanceof PVariable) {
            String sn = ((PVariable) varName).name;
            PVariable var = (PVariable) varName;

            if (type == SET) {
                // TODO: find a more elegant way to deal with immutable variable checking
//                SValue sv = env.get(sn);
//                if (sv != null && sv.immutable) {
//                    throw new EgException(2043, "variable '" + sn + "' is immutable", atom);
//                }

                env.put(sn, value);
                if (SConfig.cacheVariables) {
                    if (var.cacheIndex >= 0) {
                        SCache.slots[var.cacheIndex] = value;
                    } else {
                        Short ci = env.cacheReverseLookupGet(sn);
                        if (ci != null) {
                            var.cacheIndex = ci;
                        } else {
                            // set a variable who was not declared
                        }
                    }
                }
            } else {
                env.bPut(sn, value);
                if (SConfig.cacheVariables) {
                    if (var.cacheIndex >= 0) {
                        SCache.slots[var.cacheIndex] = value;
                    } else {
                        short ci = SCache.put(value, env, sn);
                        var.cacheIndex = ci;
                        env.cacheReverseLookup.put(sn, ci);
                    }
                }
            }
        } else {
            Object refer = n.refer;
            if (refer != null && refer instanceof SValue &&
                    ((SValue) refer).immutable && !(refer instanceof SClosure)) {
                throw new EgException(2044, "referred variable is immutable", atom);
            }

            if (refer instanceof SDict) {
                ((SDict) refer).<HashMap<String, SValue>>get().put(n.refKey.toString(), value);
            } else if (refer instanceof SList) {
                ((SList) refer).<ListEx<SValue>>get().set(n.refIndex, value);
            } else if (refer instanceof SObject || refer instanceof SMetaExpression) {
                Object sub = ((SValue) refer).underlying;
                EgInterop.setField(sub, n.refKey.toString(), value);
            } else if (refer instanceof SClosure) {
                if (n.refKey instanceof String) {
                    String k = n.refKey.toString();
                    if (type == MUTABLE || type == IMMUTABLE) {
                        ((SClosure) refer).extra.bPut(k, value);

                        if (this.varName instanceof PGet &&
                                ((PGet) this.varName).subject instanceof PVariable &&
                                ((PVariable) ((PGet) this.varName).subject).name.equals("this")) {
                            env.bPut(k, value);
                        }
                    } else {
                        ((SClosure) refer).extra.put(k, value);
                    }
                } else if (n.refKey instanceof SClosure) {
                    // TODO: avoid new PCall, make it static
                    (new PCall(atom, (SClosure) n.refKey, ListEx.build(value))).evaluate(env);
                } else {
                    throw new EgException(2045, "invalid setter", atom);
                }
            } else {
                throw new EgException(2045, "failed to set, invalid referred object: " + refer, atom);
            }
        }

        return value;
    }

    @Override
    public SExpression deepClone() {
        PSet ret = new PSet();
        ret.atom = this.atom;

        ret.varName = this.varName.deepClone();
        ret.varValue = this.varValue.deepClone();
        ret.type = this.type;
        return ret;
    }
}
