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
            SValue tmp = (varName.charAt(0) == '@') ? new SString(varName.substring(1), true) : new SNull(true);

            if (env.containsKey(varName))
                return env.get(varName);

            env.put(varName, tmp);
            return tmp;
        }

        SValue imd = env.get(varName).evaluate(env);

//        if (imd instanceof SClosure && ((SClosure) imd).arguments.size() == 0)
//            // it is a closure that accepts 0 arguments, so just directly evaluate it
//            return ((SClosure) imd).body.evaluate(env);
//        else
            return imd;
    }
}
