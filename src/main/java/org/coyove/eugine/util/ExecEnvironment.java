package org.coyove.eugine.util;

import org.coyove.eugine.base.SValue;
import org.coyove.eugine.value.SBool;
import org.coyove.eugine.value.SClosure;
import org.coyove.eugine.value.SNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by coyove on 2016/9/9.
 */
public class ExecEnvironment extends HashMap<String, SValue> {
    public static SNull Null = new SNull(true);
    public static SBool True = new SBool(true, true);
    public static SBool False = new SBool(false, true);

    public ExecEnvironment parentEnv = null;

    public ExecEnvironment() {

    }

    public ExecEnvironment(ExecEnvironment m) {
        super(m);
    }

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
            v = parentEnv.get(key);
        }

        return v;
    }

    @Override
    public SValue put(String key, SValue value) {
        if (value == null) {
            Utils.print("trying to put a null value");
            System.exit(1);
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
        ExecEnvironment ret = bClone();
        if (this.parentEnv != null) {
            ret.parentEnv = this.parentEnv.clone();
        }
        return ret;
    }

    public ExecEnvironment bClone() {
        ExecEnvironment ret = new ExecEnvironment();
        for (String s : super.keySet()) {
            SValue v = super.get(s);
            if (v != null) {
                ret.bPut(s, v.clone());
            }
        }
        ret.parentEnv = this.parentEnv;
        return ret;
    }
}