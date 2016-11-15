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
    private SExpression dict;

    public SEKeys() {}

    public SEKeys(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);
        dict = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {

        SValue dict = this.dict.evaluate(env);
        ListEx<SExpression> ret = new ListEx<SExpression>();
        if (dict instanceof SDict) {
            for (String k : dict.<HashMap<String, SExpression>>get().keySet()) {
                ret.add(new SString(k));
            }
        } else if (dict instanceof SClosure) {
            for (String k : ((SClosure) dict).extra.keySet()) {
                ret.add(new SString(k));
            }
        } else {
            throw new VMException(2037, "mismatch types", headAtom);
        }

        return new SList(ret);
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEKeys ret = new SEKeys();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.dict = this.dict.deepClone();
        return ret;
    }
}
