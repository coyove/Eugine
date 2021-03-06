package org.coyove.eugine.builtin;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEStr extends SExpression {
    @ReplaceableVariable
    private SExpression argument;

    public SEStr() {}

    public SEStr(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);

        argument = args.head();
    }

    private SValue convert(SValue arg) throws EgException {
        if (arg instanceof SString) {
            return arg;
        } else if (arg instanceof SNull) {
            return new SString("null");
        } else if (arg instanceof SList) {
            ListEx<SValue> ret = new ListEx<SValue>();
            for (SValue v : arg.<ListEx<SValue>>get())
                ret.add(convert(v));

            return new SList(ret);
        } else {
            if (arg instanceof SBuffer) {
                byte[] buf = arg.get();
                return new SString(new String(buf));
            }

            return new SString(arg.asString());
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        return convert(argument.evaluate(env));
    }

    @Override
    public SExpression deepClone() {
        SEStr ret = new SEStr();
        ret.atom = this.atom;
        ret.argument = this.argument.deepClone();
        return ret;
    }
}
