package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEKeys extends SExpression {
    private SExpression dict;

    public SEKeys(Atom ha, Compound c) throws VMException {
        super(ha, c, 1);
        dict = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {

        SValue dict = this.dict.evaluate(env);
        if (dict instanceof SDict) {
            List<SValue> ret = new List<SValue>();
            for (String k : dict.<HashMap<String, SValue>>get().keySet())
                ret.add(new SString(k));

            return new SList(ret);
        }
        else{
            throw new VMException(2037, "mismatch types", headAtom);
        }
    }
}
