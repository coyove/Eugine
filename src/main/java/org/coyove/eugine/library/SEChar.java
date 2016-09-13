package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEChar extends SExpression {
    private SExpression argument;
    private CONVERT action;

    public enum CONVERT { ASC, CHR }

    public SEChar(Atom ha, Compound c, CONVERT a) throws VMException
    {
        super(ha, c);

        if (c.atoms.size() == 0)
            throw new VMException("it takes 1 argument");

        argument = SExpression.cast(c.atoms.pop());
        action = a;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException
    {
        SValue arg = argument.evaluate(env);
        switch (action) {
            case ASC:
                try {
                    SString str = Utils.cast(arg, SString.class,
                            new VMException("it only apply to a string with 1 char", headAtom));

                    return new SInteger(Long.valueOf((int) str.<String>get().charAt(0)));
                } catch (StringIndexOutOfBoundsException e) {
                    throw new VMException("string index out of range", headAtom);
                }
            case CHR:
                SInteger i = Utils.cast(arg, SInteger.class,
                        new VMException("it only apply to an integer", headAtom));

                return new SString(String.valueOf((char)(i.<Long>get().intValue())));
            default:
                throw new VMException("unknown operation", headAtom);
        }
    }
}
