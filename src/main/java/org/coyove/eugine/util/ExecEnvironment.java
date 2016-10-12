package org.coyove.eugine.util;

import org.coyove.eugine.base.SValue;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/9.
 */
public class ExecEnvironment extends HashMap<String, SValue> {
    public ExecEnvironment parentEnv = null;
    public boolean strict = false;

    @Override
    public boolean containsKey(Object key) {
        if (parentEnv != null) {
            if (super.containsKey(key))
                return true;
            else
                return parentEnv.containsKey(key);
        } else {
            return super.containsKey(key);
        }
    }

    @Override
    public SValue get(Object key) {
        if (parentEnv != null) {
            if (super.containsKey(key))
                return super.get(key);
            else
                return parentEnv.get(key);
        } else
            return super.get(key);
    }

    @Override
    public SValue put(String key, SValue value) {
        if (parentEnv != null) {
            if (super.containsKey(key) || !parentEnv.containsKey(key))
                super.put(key, value);
            else
                parentEnv.put(key, value);
        } else {
            super.put(key, value);

            if (key.equalsIgnoreCase("~strict"))
                strict = true;
            // TODO
        }

        return value;
    }

    public void putVar(String key, SValue value) {
        super.put(key, value);
    }

    @Override
    public ExecEnvironment clone() {
        ExecEnvironment ret = (ExecEnvironment) super.clone();

        if (this.parentEnv != null)
            ret.parentEnv = this.parentEnv;
        ret.strict = this.strict;

        return ret;
    }
}