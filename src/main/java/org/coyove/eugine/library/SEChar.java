package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEChar extends SExpression {
    @ReplaceableVariable
    private SExpression argument;

    private CONVERT action;
    public enum CONVERT {ASC, CHR}

    public SEChar() {}

    public SEChar(Atom ha, ListEx<SExpression> args, CONVERT a) {
        super(ha, args, 1);

        argument = args.head();
        action = a;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue arg = argument.evaluate(env);
        switch (action) {
            case ASC:
                try {
                    SString str = Utils.cast(arg, SString.class,
                            new EgException(3001, "invalid argument", atom));

                    return new SInteger(str.<String>get().charAt(0));
                } catch (StringIndexOutOfBoundsException e) {
                    throw new EgException(3002, "string index out of range", atom);
                }
            case CHR:
                SInteger i = Utils.cast(arg, SInteger.class,
                        new EgException(3003, "invalid argument", atom));

                return new SString(String.valueOf(i.val()));
            default:
                throw new EgException(3004, "unknown operation", atom);
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        SEChar ret = new SEChar();
        ret.atom = this.atom;

        ret.action = this.action;
        ret.argument = this.argument.deepClone();
        return ret;
    }
}
