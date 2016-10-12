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

    public SENum(Atom ha, Compound c) throws VMException {
        super(ha, c, 1);

        argument = SExpression.cast(c.atoms.pop());
    }

    private SValue convert(SValue arg) throws VMException {
        if (arg instanceof SString) {
            String str = arg.get();
            try {
                if (str.contains(".")) {
                    return new SDouble(Double.parseDouble(str));
                } else {
                    return new SInteger(Long.parseLong(str));
                }
            } catch (Exception e) {
                throw new VMException(3008, "invalid content to convert", headAtom);
            }
        } else if (arg instanceof SBool) {
            return new SInteger(arg.<Boolean>get() ? 1 : 0);
        } else if (arg instanceof SNull) {
            return new SNull();
        } else if (arg instanceof SList) {
            List<SValue> ret = new List<SValue>();
            for (SValue v : arg.<List<SValue>>get())
                ret.add(convert(v));

            return new SList(ret);
        } else if (arg instanceof SInteger) {
            return new SDouble(arg.<Long>get().doubleValue());
        } else if (arg instanceof SDouble) {
            return new SInteger(arg.<Double>get().longValue());
        } else {
            throw new VMException(3008, "invalid content to convert", headAtom);
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        return convert(argument.evaluate(env));
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
