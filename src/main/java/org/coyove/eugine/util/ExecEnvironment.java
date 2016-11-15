package org.coyove.eugine.util;

import org.coyove.eugine.base.SExpression;
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
        } else {
            SValue ret = super.get(key);
            return ret;
        }
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

            if (key.equalsIgnoreCase("~strict")) {
                strict = true;
            }

            if (key.equalsIgnoreCase("__mt__")) {
                overlay = true;
            }
            // TODO
        }

        return value;
    }

    public void putVar(String key, SValue value) {
        super.put(key, value);
    }

    public ExecEnvironment clone() {
        ExecEnvironment ret = new ExecEnvironment();// (ExecEnvironment) super.clone();
        for (String s : super.keySet()) {
            SValue v = super.get(s);
            if (v != null) {
                ret.putVar(s, v.clone());
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
                    ret.putVar(s, v.clone());
                }
            }
        }

        ret.parentEnv = this;
        ret.strict = this.strict;
        ret.overlay = this.overlay;
        return ret;
    }
}