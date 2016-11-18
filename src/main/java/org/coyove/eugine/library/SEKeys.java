package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEKeys extends SExpression {
    @ReplaceableVariable
    private SExpression dict;

    public SEKeys() {}

    public SEKeys(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);
        dict = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {

        SValue dict = this.dict.evaluate(env);
        ListEx<SValue> ret = new ListEx<SValue>();
        if (dict instanceof SDict) {
            for (String k : dict.<HashMap<String, SValue>>get().keySet()) {
                ret.add(new SString(k));
            }
        } else if (dict instanceof SClosure) {
            for (String k : ((SClosure) dict).extra.keySet()) {
                ret.add(new SString(k));
            }
        } else {
            throw new EgException(2037, "mismatch types", atom);
        }

        return new SList(ret);
    }

    @Override
    public SExpression deepClone() throws EgException {
        SEKeys ret = new SEKeys();
        ret.atom = this.atom;

        ret.dict = this.dict.deepClone();
        return ret;
    }
}
