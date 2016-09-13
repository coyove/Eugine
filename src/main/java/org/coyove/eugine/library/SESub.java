package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SESub extends SExpression {
    private List<SExpression> arguments;

    public SESub(Atom ha, Compound c) throws VMException {
        super(ha, c);

        if (c.atoms.size() != 2 && c.atoms.size() != 3)
            throw new VMException("it takes 2 or 3 arguments", ha);

        arguments = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        List<SValue> arguments = SExpression.eval(this.arguments, env);
        SValue subObj = arguments.head();

        VMException ex = new VMException("start and end index must be integers", headAtom);
        int arg1 = Utils.cast(arguments.get(1), SInteger.class, ex).<Long>get().intValue();
        SInteger arg2 = null;

        if (arguments.size() == 3)
            arg2 = Utils.cast(arguments.get(2), SInteger.class, ex);

        if (subObj instanceof SString) {
            SString subStr = (SString) subObj;

            if (arg2 == null) {
                return new SString(subStr.<String>get().substring(arg1));
            } else {
                try {
                    return new SString(subStr.<String>get().substring(arg1, arg1 + arg2.<Long>get().intValue()));
                } catch (StringIndexOutOfBoundsException se) {
                    throw new VMException("string index out of range", headAtom);
                }
            }

        } else if (subObj instanceof SList) {
            SList subList = (SList) subObj;
            if (arg2 == null) {
                return new SList(subList.<List<SValue>>get().sub(arg1));
            } else {
                return new SList(subList.<List<SValue>>get().sub(arg1, arg1 + arg2.<Long>get().intValue()));
            }
        } else {
            throw new VMException("the first argument must be a string or a list", headAtom);
        }

    }
}
