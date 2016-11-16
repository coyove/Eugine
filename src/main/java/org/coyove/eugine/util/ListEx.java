package org.coyove.eugine.util;

import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;

import java.util.Collection;

/**
 * Created by coyove on 2016/9/9.
 */
public class ListEx<T> extends java.util.ArrayList<T> {
    public ListEx(int cap) {
        super(cap < 0 ? 0 : cap);
    }

    public ListEx(Collection<? extends T> list) {
        super(list);
    }

    public ListEx() {
    }

    public static <TV>ListEx build(TV... values) {
        ListEx<TV> ret = new ListEx<TV>(values.length);
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

    public T last() {
        if (this.size() > 0)
            return this.get(this.size() - 1);
        else
            return null;
    }

    public ListEx<T> skip(int count) {
        if (count > this.size()) {
            return new ListEx<T>();
        } else {
            return new ListEx<T>(this.subList(count, this.size()));
        }
    }

    public ListEx<T> sub(int start, int end) {
        if (start > this.size()) {
            return new ListEx<T>();
        } else if (end > this.size()) {
            return new ListEx<T>(this.subList(start, this.size()));
        } else {
            return new ListEx<T>(this.subList(start, end));
        }
    }

    public ListEx<T> sub(int start) {
        return sub(start, this.size());
    }

    @SuppressWarnings("unchecked")
    public static <T> ListEx<T> deepClone(ListEx<T> src) throws EgException {
        if (src == null) {
            return null;
        }

        ListEx<T> ret = new ListEx<T>(src.size());

        for (T t : src) {
            ret.add(((T) ((SExpression) t).deepClone()));
        }
        return ret;
    }

    public <T> ListEx<T> cast(Class<T> c) {
        ListEx<T> ret = new ListEx<T>(super.size());
        for (int i = 0; i < super.size(); i++) {
            ret.add((T) super.get(i));
        }

        return ret;
    }
}
