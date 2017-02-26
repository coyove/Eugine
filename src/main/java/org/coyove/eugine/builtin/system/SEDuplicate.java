package org.coyove.eugine.builtin.system;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEDuplicate extends SExpression {
    @ReplaceableVariable
    private SExpression subject;

    public static HashMap<Integer, SExpression> sharedPVariables = new HashMap<Integer, SExpression>();

    public SEDuplicate() {}

    public SEDuplicate(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);

        subject = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        sharedPVariables = new HashMap<Integer, SExpression>();
        return this.subject.evaluate(env).clone();
    }

    @Override
    public SExpression deepClone() {
        SEDuplicate ret = new SEDuplicate();
        ret.atom = this.atom;
        ret.subject = this.subject.deepClone();
        return ret;
    }
}
