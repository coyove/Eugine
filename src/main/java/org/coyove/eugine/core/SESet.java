package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by zezhong on 2016/9/9.
 */
public class SESet extends SExpression {
    private SExpression varName;
    private boolean directName;
    private SExpression varValue;
    private ACTION action;
    private DECLARE declare;

    public enum ACTION { IMMUTABLE, MUTABLE }
    public enum DECLARE { DECLARE, SET }

    public SESet(Atom ha, Compound c, DECLARE d, ACTION a) throws VMException {
        super(ha, c);
        if (c.atoms.size() < 1)
            throw new VMException("it takes at least 1 argument", ha);

        Base n = c.atoms.pop();
        if (n instanceof Atom && ((Atom) n).token.type == Token.TokenType.ATOMIC) {
            varName = new SString(((Atom) n).token.value.toString());
            directName = true;
        } else {
            varName = SExpression.cast(n);
            directName = false;
        }

        if (c.atoms.size() == 1) {
            varValue = SExpression.cast(c.atoms.pop());
        } else if (c.atoms.size() > 1) {
            varValue = SExpression.cast(c);
        } else {
            varValue = new SNull();
        }

        action = a;
        declare = d;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue n = varName.evaluate(env);
        SValue v = varValue.evaluate(env);
        SValue ret = v;

        if (action == ACTION.MUTABLE && v.immutable) {
            /**
             * (const b ...) (set a b)
             * b is immutable, a should be mutable
             * note that "clone" is shallow copy
             */
            ret = v.clone();
            ret.immutable = false;
        }

        if (action == ACTION.IMMUTABLE)
            ret.immutable = true;
//
//        ret.refDict = null;
//        ret.refList = null;

        if (directName) {
            String sn = n.get();

            if (declare == DECLARE.SET) {
                if (!env.containsKey(sn) && env.strict)
                    throw new VMException("strict mode", headAtom);

                if (env.containsKey(sn) && env.get(sn).immutable)
                    throw new VMException("variable '" + sn + "' is immutable", headAtom);

                env.put(sn, ret);
            } else if (declare == DECLARE.DECLARE) {
                // TODO
                env.putVar(sn, ret);
            }
        } else {
            if (n.refer != null && n.refer instanceof SValue && ((SValue) n.refer).immutable)
                throw new VMException("referred variable is immutable", headAtom);

            if (n.refer instanceof SDict) {
                ((SDict) n.refer).<HashMap<String, SValue>>get().put(n.refKey, ret);
            } else if (n.refer instanceof SList) {
                ((SList) n.refer).<List<SValue>>get().set(n.refIndex, ret);
            } else {
                try {
                    if (n.refer instanceof SObject) {
                        Object sub = ((SObject) n.refer).get();
                        InteropHelper.setField(sub, n.refKey, ret);
                    } else if (n.refer instanceof SClosure) {
                        if (declare == DECLARE.DECLARE) {
                            ((SClosure) n.refer).extra.putVar(n.refKey, ret);
                        } else {
                            ((SClosure) n.refer).extra.put(n.refKey, ret);
                        }
                    } else {
                        throw new VMException("failed to set field", headAtom);
                    }
                } catch (Exception e) {
                    throw new VMException(e.getMessage(), headAtom);
                }
            }
        }

        return ret;
    }
}
