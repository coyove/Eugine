package org.coyove.eugine.util;

import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;

import java.util.Collection;

/**
 * Created by coyove on 2016/9/9.
 */
public class List<T> extends java.util.ArrayList<T> {
    public List(int cap) {
        super(cap < 0 ? 0 : cap);
    }

    public List(Collection<? extends T> list) {
        super(list);
    }

    public List() {
    }

    public static <TV>List build(TV... values) {
        List<TV> ret = new List<TV>(values.length);
        for (int i = 0; i < values.length; i++) {
            ret.add(values[i]);
        }

        return ret;
    }

    public T pop() {
        if (this.size() > 0)
            return this.remove(0);
        else
            return null;
    }

    public T head() {
        if (this.size() > 0)
            return this.get(0);
        else
            return null;
    }

    public List<T> skip(int count) {
        if (count > this.size()) {
            return new List<T>();
        } else {
            return new List<T>(this.subList(count, this.size()));
        }
    }

    public List<T> sub(int start, int end) {
        if (start > this.size()) {
            return new List<T>();
        } else if (end > this.size()) {
            return new List<T>(this.subList(start, this.size()));
        } else {
            return new List<T>(this.subList(start, end));
        }
    }

    public List<T> sub(int start) {
        return sub(start, this.size());
    }

    public static List<SExpression> deepClone(List<SExpression> src) throws VMException {
        List<SExpression> ret = new List<SExpression>(src.size());

        for (SExpression t : src) {
            ret.add(t.deepClone());
        }
        return ret;
    }

    public static List<String> deepCloneString(List<String> src) throws VMException {
        List<String> ret = new List<String>(src.size());

        for (String t : src) {
            ret.add(t);
        }
        return ret;
    }
}
