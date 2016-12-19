package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;

/**
 * Created by zezhong on 2016/12/19.
 */
public class SNativeCall extends SValue {
    public SNativeCall()

    @Override
    public SValue clone() {
        return null;
    }

    @Override
    public String toString() {
        return "Native = " + underlying.toString();
    }
}
