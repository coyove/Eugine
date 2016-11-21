package org.coyove.eugine.base;

import org.coyove.eugine.util.*;
import org.coyove.eugine.value.SConcatString;
import org.coyove.eugine.value.SDouble;
import org.coyove.eugine.value.SInteger;
import org.coyove.eugine.value.SString;

/**
 * Created by coyove on 2016/9/9.
 */
public abstract class SValue extends SExpression {
    public Object refer;
    public String refKey;
    public int refIndex;

    public Object underlying;
    public boolean immutable;

    public SValue() {
    }

    public SValue(Object underlying) {
        this.underlying = underlying;
        this.immutable = false;
    }

    public SValue(Object underlying, boolean imm) {
        this(underlying);
        this.immutable = imm;
    }

    public <T> T get() {
        return (T) underlying;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) {
        return this;
    }

    @Override
    public String toString() {
        String valType = this.getClass().getSimpleName().substring(1);
        return valType + " = " + (underlying == null ? "null" : underlying.toString());
    }

    public String asString() {
        if (underlying == null) {
            if (this instanceof SInteger) {
                return ((Long) ((SInteger) this).val()).toString();
            } else if (this instanceof SDouble) {
                return ((Double) ((SDouble) this).val()).toString();
            } else {
                return "";
            }
        } else {
            return underlying.toString();
        }
    }

    public abstract SValue clone();

    @Override
    public SExpression deepClone() throws EgException {
        return this.clone();
    }

    @SuppressWarnings("unchecked")
    public static void copyAttributes(SValue to, SValue from) {
        to.immutable = from.immutable;
        to.refer = from.refer;
        to.refKey = from.refKey;
        to.refIndex = from.refIndex;
    }

    @Override
    public boolean equals(Object right) {
        if (!(right instanceof SValue)) {
            return false;
        }

        if (this instanceof SInteger) {
            if (right instanceof SInteger) {
                return ((SInteger) this).val() == ((SInteger) right).val();
            } else {
                return false;
            }
        }

        if (this instanceof SDouble) {
            if (right instanceof SDouble) {
                return Math.abs(((SDouble) this).val() - ((SDouble) right).val()) < 1e-6;
            } else {
                return false;
            }
        }

        if (this instanceof SString && right instanceof SString) {
            return this.<String>get().equals(((SString) right).<String>get());
        }

        Object lo = this.get();
        Object ro = ((SValue) right).get();

        if (lo != null && ro != null) {
            return lo.equals(ro);
        } else {
            return lo == ro;
        }
    }
}