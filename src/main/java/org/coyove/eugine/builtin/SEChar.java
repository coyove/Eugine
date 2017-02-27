package org.coyove.eugine.builtin;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.nio.charset.Charset;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEChar extends SExpression {
    @ReplaceableVariable
    private SExpression argument;

    public SEChar() {}

    public SEChar(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);
        argument = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue arg = argument.evaluate(env);

        if (arg instanceof SBuffer) {
            byte[] buf = arg.get();
            return new SString(new String(buf, Charset.forName("US-ASCII")));
        } else {
            int i = EgCast.toInt(arg, atom);
            return new SString(String.valueOf((char) i));
        }
    }

    @Override
    public SExpression deepClone() {
        SEChar ret = new SEChar();
        ret.atom = this.atom;
        ret.argument = this.argument.deepClone();

        return ret;
    }
}
