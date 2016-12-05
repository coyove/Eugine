package org.coyove.eugine.base;

import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.core.flow.PCall;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by coyove on 2016/9/9.
 */
public abstract class SValue extends SExpression {
    public Object refer;
    public Object refKey;
    public int refIndex;

    public Object underlying;
    public boolean immutable;

    public SValue() {
    }

    public SValue(Object underlying) {
        this.underlying = underlying;
        this.immutable = false;
    }

    public SValue(Object underlying, boolean imm) {
        this(underlying);
        this.immutable = imm;
    }

    public <T> T get() {
        return (T) underlying;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) {
        return this;
    }

    @Override
    public String toString() {
        String valType = this.getClass().getSimpleName().substring(1);
        if (this instanceof SNull) {
            return "Null";
        } else if (this instanceof SDict) {
            HashMap<String, SValue> map = this.get();
            Set<String> keySet = map.keySet();
            String[] sets = new String[keySet.size()];
            int i = 0;
            for (String s : keySet) {
                sets[i++] = s + ": " + map.get(s).toString();
            }

            return "Dict = {" + StringUtils.join(sets, ", ") + "}";
        } else {
            return valType + " = " + underlying.toString();
        }
    }

    public String asString() {
        if (this instanceof SConcatString) {
            return this.get();
        } else if (underlying == null) {
            if (this instanceof SLong) {
                return ((Long) ((SLong) this).val()).toString();
            } else if (this instanceof SDouble) {
                return ((Double) ((SDouble) this).val()).toString();
            } else if (this instanceof SInt) {
                return ((Integer) ((SInt) this).val()).toString();
            } else {
                return "";
            }
        } else {
            return underlying.toString();
        }
    }

    public abstract SValue clone();

    @Override
    public SExpression deepClone() throws EgException {
        return this.clone();
    }

    @SuppressWarnings("unchecked")
    public static void copyAttributes(SValue to, SValue from) {
        to.immutable = from.immutable;
        to.refer = from.refer;
        to.refKey = from.refKey;
        to.refIndex = from.refIndex;
    }

    @Override
    public boolean equals(Object right) {
        if (!(right instanceof SValue)) {
            return false;
        }

        if (this instanceof SInt) {
            if (right instanceof SLong) {
                return ((SInt) this).val() == ((SLong) right).val();
            } else if (right instanceof SInt) {
                return ((SInt) this).val() == ((SInt) right).val();
            } else {
                return false;
            }
        }

        if (this instanceof SLong) {
            if (right instanceof SLong) {
                return ((SLong) this).val() == ((SLong) right).val();
            } else if (right instanceof SInt) {
                return ((SLong) this).val() == ((SInt) right).val();
            } else {
                return false;
            }
        }

        if (this instanceof SDouble) {
            if (right instanceof SDouble) {
                return Math.abs(((SDouble) this).val() - ((SDouble) right).val()) < 1e-6;
            } else {
                return false;
            }
        }

        if (this instanceof SString && right instanceof SString) {
            return this.<String>get().equals(((SString) right).<String>get());
        }

        if (this instanceof SClosure) {
            SValue eq = ((SClosure) this).extra.get("__equals__");
            if (eq != null && eq instanceof SClosure) {
                try {
                    Atom atom = ((SClosure) eq).atom;
                    SValue ret = (new PCall(atom, eq, ListEx.build(right)))
                            .evaluate(((SClosure) eq).outerEnv);
                    if (ret instanceof SBool) {
                        return (Boolean) ret.underlying;
                    } else {
                        throw new EgException(8082, "invalid __equals__ function", atom);
                    }
                } catch (EgException e) {
                    ErrorHandler.print(e);
                    return false;
                }
            }
        }

        Object lo = this.get();
        Object ro = ((SValue) right).get();

        if (lo != null && ro != null) {
            return lo.equals(ro);
        } else {
            return lo == ro;
        }
    }
}