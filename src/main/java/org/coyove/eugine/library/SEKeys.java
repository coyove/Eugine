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
    private SExpression subject;

    public SEKeys() {}

    public SEKeys(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);
        subject = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {

        SValue dict = this.subject.evaluate(env);
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
    public SExpression deepClone() {
        SEKeys ret = new SEKeys();
        ret.atom = this.atom;

        ret.subject = this.subject.deepClone();
        return ret;
    }
}
