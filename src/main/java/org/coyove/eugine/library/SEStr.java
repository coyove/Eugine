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

    public SEStr(Atom ha, Compound c) throws VMException
    {
        super(ha, c);
        if (c.atoms.size() == 0)
            throw new VMException("it takes 1 argument");

        argument = SExpression.cast(c.atoms.pop());
    }

    private SValue convert(SValue arg) {
        if (arg instanceof SString) {
            return arg;
        } else if (arg instanceof SNull) {
            return new SString("null");
        } else if (arg instanceof SList) {
            List<SValue> ret = new List<SValue>();
            for (SValue v : arg.<List<SValue>>get())
                ret.add(convert(v));

            return new SList(ret);
        } else {
            return new SString(arg.get().toString());
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException
    {
        return convert(argument.evaluate(env));
    }
}
