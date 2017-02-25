package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;
import org.coyove.eugine.base.SComplexValue;
import org.coyove.eugine.util.ExecEnvironment;

/**
 * Created by coyove on 2016/9/9.
 */
public class SNull extends SComplexValue {
    public SNull() {
        super(null);
    }

    @Override
    public SValue clone() {
        return ExecEnvironment.Null;
    }

    @Override
    public SValue lightClone() {
        return this;
    }

    @Override
    public String toString() {
        return "null = null";
    }

    @Override
    public String asString() {
        return "<null>";
    }
}
