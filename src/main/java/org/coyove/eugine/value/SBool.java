package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;
import org.coyove.eugine.base.SComplexValue;

/**
 * Created by coyove on 2016/9/9.
 */
public class SBool extends SComplexValue {
    public SBool(Boolean list) {
        super(list);
    }

    @Override
    public SValue clone() {
        return this;
    }

    @Override
    public SValue lightClone() {
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
