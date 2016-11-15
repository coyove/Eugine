package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class SELen extends SExpression {
    private SExpression argument;

    public SELen() {}

    public SELen(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);

        argument = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {

        SValue obj = argument.evaluate(env);
        if (obj instanceof SString) {
            return new SInteger((long) obj.<String>get().length());
        } else if (obj instanceof SList) {
            return new SInteger((long) obj.<ListEx<SValue>>get().size());
        } else {
            if (obj.get() instanceof byte[]) {
                byte[] buf = obj.get();
                return new SInteger(buf.length);
            }

            return new SInteger((long) 0);
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        SELen ret = new SELen();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.argument = this.argument.deepClone();
        return ret;
    }
}