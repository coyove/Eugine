package org.coyove.eugine.builtin;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/10.
 */
public class SELen extends SExpression {
    @ReplaceableVariable
    private SExpression subject;

    public SELen() {}

    public SELen(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);

        subject = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {

        SValue obj = subject.evaluate(env);
        if (obj instanceof SConcatString) {
            return new SNumber(((SConcatString) obj).length());
        } else if (obj instanceof SString) {
            return new SNumber(obj.<String>get().length());
        } else if (obj instanceof SList) {
            return new SNumber(obj.<ListEx<SValue>>get().size());
        } else if (obj instanceof SDict) {
            return new SNumber(obj.<HashMap<String, SValue>>get().size());
        } else if (obj instanceof SBuffer) {
            byte[] buf = obj.get();
            return new SNumber(buf.length);
        } else {
            return new SNumber(0);
        }
    }

    @Override
    public SExpression deepClone() {
        SELen ret = new SELen();
        ret.atom = this.atom;

        ret.subject = this.subject.deepClone();
        return ret;
    }
}