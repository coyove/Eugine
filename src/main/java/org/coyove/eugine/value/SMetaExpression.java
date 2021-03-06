package org.coyove.eugine.value;

import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.base.SComplexValue;

/**
 * Created by coyove on 2017/1/9.
 */
public class SMetaExpression extends SComplexValue {
    public SMetaExpression(SExpression expr) {
        super(expr);
    }

    @Override
    public SValue clone() {
        return this;
    }

    @Override
    public SValue lightClone() {
        return this;
    }

    public String getSimpleName() {
        String name = underlying.getClass().getName();
        if (name.startsWith("org.coyove.eugine")) {
            name = name.substring(18);
        }
        return name;
    }

    @Override
    public String toString() {
        return "meta = " + getSimpleName();
    }

    @Override
    public String asString() {
        return "";
    }
}
