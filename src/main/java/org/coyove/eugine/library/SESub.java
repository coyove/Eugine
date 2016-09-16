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

        if (c.atoms.size() < 1)
            throw new VMException(2095, "needs a subject to get the sub range", ha);

        if (c.atoms.size() < 2)
            throw new VMException(2095, "needs a start index", ha);

        arguments = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        List<SValue> arguments = SExpression.eval(this.arguments, env);
        SValue subObj = arguments.head();

        VMException ex = new VMException(2092, "the start and the end index must be integers", headAtom);
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
                    throw new VMException(2093, "string index out of range", headAtom);
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
            throw new VMException(2094, "the subject must be a string or a list", headAtom);
        }

    }
}
