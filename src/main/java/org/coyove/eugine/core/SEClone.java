package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.SClosure;
import org.coyove.eugine.value.SDict;
import org.coyove.eugine.value.SList;
import org.coyove.eugine.value.SObject;

/**
 * Created by zezhong on 2016/9/9.
 */
public class SEClone extends SExpression {
    private SExpression varName;
    private List<SExpression> arguments;

    public SEClone(Atom ha, Compound c) throws VMException {
        super(ha, c);
        if (c.atoms.size() < 1)
            throw new VMException("it takes 1 at least argument", ha);

        varName = SExpression.cast(c.atoms.pop());
        arguments = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue n = varName.evaluate(env);
        SValue ret = n.clone();

        if (ret instanceof SClosure) {
            ExecEnvironment extra = ((SClosure) ret).extra;
            if (extra.containsKey("~init")) {
                SClosure init = Utils.cast(extra.get("~init"), SClosure.class);
                if (init == null)
                    return ret;

                List<SValue> arguments = SExpression.eval(this.arguments, env);

                if (!SECall.checkArgumentsCount(init.arguments, arguments))
                    throw new VMException("not enough arguments to init", headAtom);

                ExecEnvironment newEnv = SECall.prepareExecEnvironment(init.arguments, arguments);

                newEnv.put("~parent", new SDict(init.innerEnv));
                newEnv.put("~atom", new SObject(headAtom));
                newEnv.put("~this", n);

                newEnv.parentEnv = init.innerEnv;
                init.body.evaluate(newEnv);
            }
        }

        return ret;
    }
}
