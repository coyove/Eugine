package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;

/**
 * Created by coyove on 2016/9/9.
 */
public class SBool extends SValue {
    public SBool(Boolean list) {
        super(list);
    }

    @Override
    public SValue clone() {
        return this;
    }

    @Override
    public String toString() {
        return ((Boolean) underlying) ? "bool = true" : "bool = false";
    }

    @Override
    public String asString() {
        return ((Boolean) underlying) ? "true" : "false";
    }
}
