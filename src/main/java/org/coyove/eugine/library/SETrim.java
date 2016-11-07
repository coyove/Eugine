package org.coyove.eugine.library;

import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.Formatter;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SETrim extends SExpression {
    private SExpression argument;

    public SETrim() {}

    public SETrim(Atom ha, List<SExpression> args) {
        super(ha, args, 1);

        argument = args.head();
    }

    public SETrim(Atom ha, Compound c) throws VMException {
        super(ha, c, 1);

        argument = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue arg = argument.evaluate(env);
        if (arg instanceof SString) {
            return new SString(StringUtils.trim(arg.<String>get()));
        } else {
            return new SNull();
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        SETrim ret = new SETrim();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.argument = this.argument.deepClone();

        return ret;
    }
}
