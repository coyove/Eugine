package org.coyove.eugine.util;

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
        List<T> ret = new List<T>(this.size() - 1);
        for (int i = count; i < this.size(); i++)
            ret.add(this.get(i));

        return ret;
    }

    public List<T> sub(int start, int end) {
        List<T> ret = new List<T>(end - start);
        for (int i = start; i < Math.min(this.size(), end); i++)
            ret.add(this.get(i));

        return ret;
    }

    public List<T> sub(int start) {
        List<T> ret = new List<T>(this.size() - start);
        for (int i = start; i < this.size(); i++)
            ret.add(this.get(i));

        return ret;
    }
}
