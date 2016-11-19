package org.coyove.eugine.util;

import org.coyove.eugine.base.SValue;
import org.coyove.eugine.value.SClosure;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/9.
 */
public class ExecEnvironment extends HashMap<String, SValue> {
    public ExecEnvironment parentEnv = null;
    public boolean strict = false;
    public boolean overlay = false;

    @Override
    public boolean containsKey(Object key) {
        if (parentEnv != null) {
            return super.containsKey(key) || parentEnv.containsKey(key);
        } else {
            return super.containsKey(key);
        }
    }

    @Override
    public SValue get(Object key) {
        SValue v = super.get(key);
        if (parentEnv != null && v == null) {
            return parentEnv.get(key);
        } else {
            return v;
        }
    }

    @Override
    public SValue put(String key, SValue value) {
        if (value == null) {
            return null;
        }

        if (parentEnv != null) {
            if (super.containsKey(key) || !parentEnv.containsKey(key)) {
                super.put(key, value);
            } else {
                parentEnv.put(key, value);
            }
        } else {
            super.put(key, value);
        }

        return value;
    }

    public void bPut(String key, SValue value) {
        if (value != null) {
            super.put(key, value);
        }
    }

    public SValue bGet(String key) {
        return super.get(key);
    }

    public SValue bRemove(String key) {
        return super.remove(key);
    }

    public ExecEnvironment clone() {
        ExecEnvironment ret = new ExecEnvironment();// (ExecEnvironment) super.clone();
        for (String s : super.keySet()) {
            SValue v = super.get(s);
            if (v != null) {
                ret.bPut(s, v.clone());
            }
        }

        if (this.parentEnv != null) {
            ret.parentEnv = this.parentEnv.clone();
        }
        ret.strict = this.strict;
        ret.overlay = this.overlay;
        return ret;
    }

    public ExecEnvironment cloneClosureAndConstOnly() {
        if (!overlay) {
            return this;
        }

        ExecEnvironment ret = new ExecEnvironment();
        for (String s : super.keySet()) {
            SValue v = super.get(s);
            if (v != null) {
                if (v instanceof SClosure || v.immutable) {
                    ret.bPut(s, v.clone());
                }
            }
        }

        ret.parentEnv = this;
        ret.strict = this.strict;
        ret.overlay = this.overlay;
        return ret;
    }
}