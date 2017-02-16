package org.coyove.eugine.util;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/9.
 */
public class CascadeHashMap<K, V> extends HashMap<K, V> {

    public CascadeHashMap<K, V> parent = null;

    public CascadeHashMap() {
    }

    public CascadeHashMap(int cap) {
        super(cap);
    }

    public CascadeHashMap(CascadeHashMap<K, V> map) {
        this.parent = map;
    }

    @Override
    public boolean containsKey(Object key) {
        if (parent != null) {
            return super.containsKey(key) || parent.containsKey(key);
        } else {
            return super.containsKey(key);
        }
    }

    @Override
    public V get(Object key) {
        V v = super.get(key);

        if (parent != null && v == null) {
            v = parent.get(key);
        }

        return v;
    }

    @Override
    public V put(K key, V value) {
        if (parent != null) {
            if (super.containsKey(key) || !parent.containsKey(key)) {
                super.put(key, value);
            } else {
                parent.put(key, value);
            }
        } else {
            super.put(key, value);
        }

        return value;
    }

    public CascadeHashMap<K, V> clone() {
        CascadeHashMap<K, V> ret = new CascadeHashMap<K, V>(this.size());
        for (Entry<K, V> entry : super.entrySet()) {
            ret.put(entry.getKey(), entry.getValue());
        }

        ret.parent = this.parent;
        return ret;
    }
}