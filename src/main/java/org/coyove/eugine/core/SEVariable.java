package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SEVariable extends SExpression {
    public String varName;

    public SEVariable() {}

    public SEVariable(String n) {
        varName = n;
    }

    public SEVariable(String n, Atom ha, Compound c) {
        super(ha, c);
        varName = n;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        if (!env.containsKey(varName)) {
            if (varName.charAt(0) == '@') {
                return new SString(varName.substring(1), true);
            } else {
                if (env.strict) {
                    throw new VMException(2047, "strict mode", headAtom);
                }

                SValue tmp = new SNull(true);
                env.put(varName, tmp);
                tmp.refer = varName;
                return tmp;
            }
        }

        SValue tmp = env.get(varName);
        tmp.refer = varName;
        return tmp;
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEVariable ret = new SEVariable();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.varName = this.varName;

        return ret;
    }
}
