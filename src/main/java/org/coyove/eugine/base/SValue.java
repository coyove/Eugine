package org.coyove.eugine.base;

import org.coyove.eugine.core.flow.PCall;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.*;

/**
 * Created by coyove on 2016/9/9.
 */
public abstract class SValue extends SExpression {
    public SValue() {
    }

    public abstract <T> T get();

    public abstract String asString();

    public abstract SValue clone();

    public abstract SValue lightClone();

    @Override
    public SValue evaluate(ExecEnvironment env) {
        return this;
    }

    @Override
    public SExpression deepClone() {
        return this.clone();
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object right) {
        if (!(right instanceof SValue)) {
            return false;
        }

        if (this instanceof SNumber) {
            if (right instanceof SNumber) {
                return Math.abs(((SNumber) this).doubleValue() -
                        ((SNumber) right).doubleValue()) < 1e-15;
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
                    SValue ret = PCall.evaluateClosure(atom, ((SClosure) eq), ListEx.build(right),
                            ((SClosure) eq).outerEnv);
                    if (ret instanceof SBool) {
                        return (Boolean) ((SBool) ret).underlying;
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