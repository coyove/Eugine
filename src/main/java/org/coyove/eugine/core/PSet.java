package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;

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
            if (!(name instanceof PVariable)) EgException.INVALID_LET_EXPR.raise(atom).exit();
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue ret = value.evaluate(env).lightClone();

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
            throw EgException.INVALID_SUBJECT.raise(atom);
        }

        return ret;
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
