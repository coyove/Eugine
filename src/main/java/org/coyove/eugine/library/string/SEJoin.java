package org.coyove.eugine.library.string;

import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEJoin extends SExpression {
    @ReplaceableVariable
    private SExpression sub;

    @ReplaceableVariable
    private SExpression delim;

    public SEJoin() {}

    public SEJoin(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 2);
        sub = args.head();
        delim = args.get(1);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue subject = this.sub.evaluate(env);
        String delim = EgCast.toString(this.delim.evaluate(env), atom);

        if (subject instanceof SList) {
            ListEx<SValue> l = subject.get();
            String[] s = new String[l.size()];

            for (int i = 0; i < l.size(); i++) {
                s[i] = l.get(i).asString();
            }

            return new SString(StringUtils.join(s, delim));
        } else {
            return ExecEnvironment.Null;
        }
    }

    @Override
    public SExpression deepClone() {
        SEJoin ret = new SEJoin();
        ret.atom = this.atom;
        ret.sub = this.sub.deepClone();
        ret.delim = this.delim.deepClone();
        return ret;
    }
}

