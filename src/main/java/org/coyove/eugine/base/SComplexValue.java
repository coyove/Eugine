package org.coyove.eugine.base;

/**
 * Created by coyove on 2017/2/25.
 */
public abstract class SComplexValue extends SValue {
    public Object underlying;

    public SComplexValue() {
    }

    public SComplexValue(Object underlying) {
        this.underlying = underlying;
    }

    @Override
    public <T> T get() {
        return (T) underlying;
    }
}
