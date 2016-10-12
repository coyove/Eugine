package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.*;

/**
 * Created by zezhong on 2016/9/9.
 */
public class SEClone extends SExpression {
    private SExpression varName;
    private List<SExpression> arguments;

    public SEClone() {}

    public SEClone(Atom ha, Compound c) throws VMException {
        super(ha, c, 1);

        varName = SExpression.cast(c.atoms.pop());
        arguments = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue n = varName.evaluate(env);
//        lock.lock();
        SValue ret = n.clone();
//        lock.unlock();

        if (ret instanceof SClosure) {
            ExecEnvironment extra = ((SClosure) ret).extra;

            if (extra.containsKey("~init")) {

                SClosure init = Utils.cast(extra.get("~init"), SClosure.class);
                if (init == null)
                    return ret;

                List<SValue> arguments = SExpression.eval(this.arguments, env);

                if (!SECall.checkArgumentsCount(init, arguments))
                    throw new VMException(2001, "not enough arguments to init", headAtom);

                ExecEnvironment newEnv = SECall.prepareExecEnvironment(init.arguments, arguments);

                newEnv.put("~parent", new SDict(init.outerEnv));
                newEnv.put("~atom", new SObject(headAtom));
                newEnv.put("~this", ret);

                newEnv.parentEnv = init.outerEnv;
                for (SExpression se : init.body)
                    se.evaluate(newEnv);

            }
        }

        return ret;
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEClone ret = new SEClone();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.varName = this.varName.deepClone();
        ret.arguments = List.deepClone(this.arguments);
        return ret;
    }
}
