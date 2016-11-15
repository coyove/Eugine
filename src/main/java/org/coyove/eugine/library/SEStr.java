package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEStr extends SExpression {
    private SExpression argument;

    public SEStr() {}

    public SEStr(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);

        argument = args.head();
    }

    private SValue convert(SValue arg, ExecEnvironment env) throws VMException {
        if (arg instanceof SString) {
            return arg;
        } else if (arg instanceof SNull) {
            return new SString("null");
        } else if (arg instanceof SList) {
            ListEx<SExpression> ret = new ListEx<SExpression>();
            for (SExpression v : arg.<ListEx<SExpression>>get())
                ret.add(convert(v.evaluate(env), env));

            return new SList(ret);
        } else {
            if (arg instanceof SObject && arg.get() instanceof byte[]) {
                byte[] buf = arg.get();
                return new SString(Utils.bytesToHexString(buf));
            }

            return new SString(arg.get().toString());
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        return convert(argument.evaluate(env), env);
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEStr ret = new SEStr();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.argument = this.argument.deepClone();

        return ret;
    }
}
