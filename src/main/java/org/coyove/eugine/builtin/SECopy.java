package org.coyove.eugine.builtin;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.*;

import java.util.HashMap;

/**
 * Created by zezhong on 2016/9/9.
 */
public class SECopy extends SExpression {
    @ReplaceableVariable
    private SExpression subject;

    public SECopy() {}

    public SECopy(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);
        subject = args.head();
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue n = subject.evaluate(env);

        if (n instanceof SDict) {
            HashMap<String, SValue> dict = n.get();
            return new SDict((HashMap<String, SValue>) dict.clone());
        } else if (n instanceof SList) {
            ListEx<SValue> l = n.get();
            return new SList((ListEx<SValue>) l.clone());
        } else {
            return n.clone();
        }
    }

    @Override
    public SExpression deepClone() {
        SECopy ret = new SECopy();
        ret.atom = this.atom;
        ret.subject = this.subject.deepClone();

        return ret;
    }
}
