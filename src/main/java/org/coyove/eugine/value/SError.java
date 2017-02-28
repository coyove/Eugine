package org.coyove.eugine.value;

import org.apache.commons.lang3.NotImplementedException;
import org.coyove.eugine.base.SValue;

/**
 * Created by zezhong on 2017/2/28.
 */
public class SError extends SValue {
    public int errorCode;

    public String message;

    public SError(int c, String m) {
        errorCode = c;
        message = m;
    }

    @Override
    public <T> T get() {
        throw new NotImplementedException("don't call get here");
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
    public String asString() {
        return message;
    }

    @Override
    public String toString() {
        return "error" + errorCode + " = " + message;
    }
}
