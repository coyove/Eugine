package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SENum extends SExpression {
    @ReplaceableVariable
    private SExpression subject;

    public SENum() {}

    public SENum(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);

        subject = args.head();
    }

    private SValue convert(SValue arg, ExecEnvironment env) throws EgException {
        if (arg instanceof SString) {
            String str = arg.get();
            str = str.trim();
            try {
                return new SNumber(Double.parseDouble(str));
            } catch (Exception e) {
                return ExecEnvironment.Null;
            }
        } else if (arg instanceof SBool) {
            return new SNumber((Boolean) ((SBool) arg).underlying ? 1 : 0);
        } else if (arg instanceof SNull) {
            return ExecEnvironment.Null;
        } else if (arg instanceof SList) {
            ListEx<SValue> list = arg.get();
            ListEx<SValue> ret = new ListEx<SValue>(list.size());
            
            for (SValue v : list) {
                ret.add(convert(v.evaluate(env), env));
            }

            return new SList(ret);
        } else {
            return ExecEnvironment.Null;
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        return convert(subject.evaluate(env), env);
    }

    @Override
    public SExpression deepClone() {
        SENum ret = new SENum();
        ret.atom = this.atom;
        ret.subject = this.subject.deepClone();

        return ret;
    }
}
