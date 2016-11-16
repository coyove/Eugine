package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SESplit extends SExpression {
    private SExpression text;
    private SExpression delim;

    public SESplit() {}

    public SESplit(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 2);

        text = args.get(0);
        delim = args.get(1);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SString text = Utils.cast(this.text.evaluate(env), SString.class,
                new EgException(3010, "subject must be string", atom));

        SString delim = Utils.cast(this.delim.evaluate(env), SString.class,
                new EgException(3011, "delimiter must be string", atom));

        ListEx<SExpression> ret = new ListEx<SExpression>();
        for (String s : text.<String>get().split(delim.<String>get())) {
            ret.add(new SString(s));
        }

        return new SList(ret);
    }

    @Override
    public SExpression deepClone() throws EgException {
        SESplit ret = new SESplit();
        ret.atom = this.atom;

        ret.text = this.text.deepClone();
        ret.delim = this.delim.deepClone();

        return ret;
    }
}
