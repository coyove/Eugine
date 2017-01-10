package org.coyove.eugine.library.string;

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
    private SExpression subject;

    public SETrim() {
    }

    public SETrim(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);

        subject = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue arg = subject.evaluate(env);
        if (arg instanceof SString) {
            return new SString(StringUtils.trim(arg.<String>get()));
        } else {
            return ExecEnvironment.Null;
        }
    }

    @Override
    public SExpression deepClone() {
        SETrim ret = new SETrim();
        ret.atom = this.atom;
        ret.subject = this.subject.deepClone();
        return ret;
    }
}
