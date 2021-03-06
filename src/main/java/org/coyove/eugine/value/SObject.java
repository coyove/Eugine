package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;
import org.coyove.eugine.base.SComplexValue;

/**
 * Created by coyove on 2016/9/9.
 */
public class SObject extends SComplexValue {
    public SObject(Object obj) {
        super(obj);
    }

    @Override
    public SValue clone() {
        return new SObject(underlying);
    }

    @Override
    public SValue lightClone() {
        return this;
    }

    @Override
    public String toString() {
        return "object = " + underlying.toString();
    }

    @Override
    public String asString() {
        return underlying.toString();
    }
}
