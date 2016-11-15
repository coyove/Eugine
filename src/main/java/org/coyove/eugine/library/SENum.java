package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SENum extends SExpression {
    private SExpression argument;

    public SENum() {}

    public SENum(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);

        argument = args.head();
    }

    private SValue convert(SValue arg, ExecEnvironment env) throws VMException {
        if (arg instanceof SString) {
            String str = arg.get();
            str = str.trim();
            try {
                if (str.contains(".")) {
                    return new SDouble(Double.parseDouble(str));
                } else {
                    return new SInteger(Long.parseLong(str));
                }
            } catch (Exception e) {
                return new SNull();
            }
        } else if (arg instanceof SBool) {
            return new SInteger(arg.<Boolean>get() ? 1 : 0);
        } else if (arg instanceof SNull) {
            return new SNull();
        } else if (arg instanceof SList) {
            ListEx<SExpression> ret = new ListEx<SExpression>();
            for (SExpression v : arg.<ListEx<SExpression>>get())
                ret.add(convert(v.evaluate(env), env));

            return new SList(ret);
        } else if (arg instanceof SInteger) {
            return new SDouble(arg.<Long>get().doubleValue());
        } else if (arg instanceof SDouble) {
            return new SInteger(arg.<Double>get().longValue());
        } else {
            return new SNull();
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        return convert(argument.evaluate(env), env);
    }

    @Override
    public SExpression deepClone() throws VMException {
        SENum ret = new SENum();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.argument = this.argument.deepClone();

        return ret;
    }
}
