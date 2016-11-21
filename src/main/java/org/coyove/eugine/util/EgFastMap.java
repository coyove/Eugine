package org.coyove.eugine.util;

import java.lang.reflect.Array;

/**
 * Created by coyove on 2016/11/21.
 */
public class EgFastMap<V extends Object> {
    private Object[] slots;
    private int[] keys;
    private int pointer;

    @SuppressWarnings("unchecked")
    public EgFastMap() {
        slots = new Object[8];
        keys = new int[8];
        pointer = -1;
    }

    public V put(String k, V value) {
        int h = hash(k);
        for(int i = 0; i <= pointer; i++) {
            if (keys[i] == h) {
                slots[pointer] = value;
                return value;
            }
        }

        pointer++;
        if (pointer >= 8) {
            return null;
        }

        slots[pointer] = value;
        keys[pointer] = h;
        return value;
    }

    public V get(String k) {
        int h = hash(k);
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] == h) {
                return (V) slots[i];
            }
        }

        return null;
    }

    private int hash(String key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
