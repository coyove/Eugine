package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SEVariable extends SExpression {
    private String varName;

    public SEVariable(String n, Atom ha, Compound c) {
        super(ha, c);
        varName = n;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        if (!env.containsKey(varName)) {
            if (varName.charAt(0) == '@') {
                SValue tmp = new SString(varName.substring(1), true);
                env.put(varName, tmp);
                return tmp;
            } else {
                if (env.strict)
                    throw new VMException("strict mode", headAtom);

                SValue tmp = new SNull(true);
                env.put(varName, tmp);
                return tmp;
            }
        }

        return env.get(varName);
    }
}
