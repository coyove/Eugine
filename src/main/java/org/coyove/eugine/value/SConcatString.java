package org.coyove.eugine.value;

import org.apache.commons.lang3.StringEscapeUtils;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.ListEx;

import java.util.Arrays;

/**
 * Created by coyove on 2016/11/17.
 */
public class SConcatString extends SString {
    public char[] text;
    private int length;

    public SConcatString(String... text) {
        super(text[0]);
        length = 0;
        for (String t : text) {
            length += t.length();
        }

        this.text = new char[length];
        int idx = 0;
        for (String s : text) {
            s.getChars(0, s.length(), this.text, idx);
            idx += s.length();
        }
    }

    public SConcatString() {
        super();
    }

    public int length() {
        return length;
    }

    public void append(String str) {
        int len = str.length();
        int newLen = length + len;

        if (newLen > text.length) {
            int newCapacity = text.length * 2 + 2;
            if (newCapacity < newLen) {
                newCapacity = newLen;
            }

            if (newCapacity < 0) {
                newCapacity = Integer.MAX_VALUE;
            }

            text = Arrays.copyOf(text, newCapacity);
        }

        str.getChars(0, len, text, length);
        length += len;
    }

    public void append(char[] buf) {
        append(String.valueOf(buf));
    }

    public String substring(int start, int end) {
        if (start < 0)
            throw new StringIndexOutOfBoundsException(start);
        if (end > length)
            throw new StringIndexOutOfBoundsException(end);
        if (start > end)
            throw new StringIndexOutOfBoundsException(end - start);
        return new String(text, start, end - start);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T get() {
        return (T)(new String(text, 0, length));
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue clone() {
        SConcatString ret = new SConcatString();
        ret.text = Arrays.copyOf(this.text, length);
        ret.length = this.length;
        SValue.copyAttributes(ret, this);
        return ret;
    }

    @Override
    public String toString() {
        return "String = \"" + StringEscapeUtils.escapeJava(underlying.toString()) + "\"";
    }
}
