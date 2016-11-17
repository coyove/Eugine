package org.coyove.eugine.value;

import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.ListEx;

import java.util.Arrays;

/**
 * Created by coyove on 2016/11/17.
 */
public class SConcatString extends SString {
    public ListEx<String> texts;

    public SConcatString(String... text) {
        super(text[0]);
        texts = new ListEx<String>();
        texts.addAll(Arrays.asList(text));
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T get() {
        StringBuilder sb = new StringBuilder();
        for (String text : texts) {
            sb.append(text);
        }

        return (T)sb.toString();
    }

    @Override
    public SValue clone() {
        return new SConcatString(this.texts.toArray(new String[texts.size()]));
    }

    @Override
    public String toString() {
        return "ConcatString = " + this.get();
    }
}
