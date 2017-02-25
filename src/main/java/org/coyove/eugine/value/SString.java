package org.coyove.eugine.value;

import org.apache.commons.lang3.StringEscapeUtils;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.base.SComplexValue;

/**
 * Created by coyove on 2016/9/9.
 */
public class SString extends SComplexValue {
    public SString() {
        // Only used by SConcatString
    }

    public SString(String str) {
        super(str);
    }

    public void setCharAt(int index, char c) {
        StringBuilder sb = new StringBuilder(((String) underlying));
        sb.setCharAt(index, c);
        underlying = sb.toString();
    }

    @Override
    public SValue clone() {
        return new SString((String) underlying);
    }

    @Override
    public SValue lightClone() {
        return clone();
    }

    @Override
    public String toString() {
        return "string = \"" + StringEscapeUtils.escapeJava(underlying.toString()) + "\"";
    }

    @Override
    public String asString() {
        return underlying.toString();
    }
}
