package org.coyove.eugine.library;

import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SETrim extends SExpression {
    @ReplaceableVariable
    private SExpression argument;

    public SETrim() {}

    public SETrim(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);

        argument = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue arg = argument.evaluate(env);
        if (arg instanceof SString) {
            return new SString(StringUtils.trim(arg.<String>get()));
        } else {
            return new SNull();
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        SETrim ret = new SETrim();
        ret.atom = this.atom;

        ret.argument = this.argument.deepClone();

        return ret;
    }
}
