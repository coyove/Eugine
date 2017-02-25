package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;
import org.coyove.eugine.base.SComplexValue;

/**
 * Created by coyove on 2016/9/9.
 */
public class SBuffer extends SComplexValue {
    public SBuffer(byte[] buf) {
        super(buf);
    }

    @Override
    public SValue clone() {
        byte[] src = ((byte[]) underlying);
        byte[] newbuf = new byte[src.length];
        System.arraycopy(src, 0, newbuf, 0, src.length);

        return new SBuffer(newbuf);
    }

    @Override
    public SValue lightClone() {
        return this;
    }

    @Override
    public String toString() {
        return "buffer = " + ((byte[]) underlying).length;
    }

    @Override
    public String asString() {
        return "";
    }
}
