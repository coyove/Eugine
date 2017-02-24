package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;

/**
 * Created by coyove on 2016/9/9.
 */
public class SBreak extends SValue {
    public SBreak() {
    }

    @Override
    public SValue clone() {
        return this;
    }

    @Override
    public String toString() {
        return "break = break";
    }

    @Override
    public String asString() {
        return "";
    }
}
