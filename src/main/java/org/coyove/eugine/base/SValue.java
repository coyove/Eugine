package org.coyove.eugine.base;

import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public abstract class SValue extends SExpression {
    public Object refer;
    public String refKey;
    public int refIndex;

    public Object underlying;
    public boolean immutable;

    public SValue(Object underlying) {
        this.underlying = underlying;
        this.immutable = false;
    }

    public SValue(Object underlying, boolean imm) {
        this(underlying);
        this.immutable = imm;
    }

    public <T> T get()
    {
        return (T)underlying;
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

    // It clones the SValue, but not includes the object underlaying
    public abstract SValue clone();

    @Override
    public SExpression deepClone() throws VMException {
        return this.clone();
    }

    @SuppressWarnings("unchecked")
    public static void copyAttributes(SValue to, SValue from) {
        to.immutable = from.immutable;
        to.refer = from.refer;
        to.refKey = from.refKey;
        to.refIndex = from.refIndex;
    }
}