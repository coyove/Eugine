package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SESplit extends SExpression {
    @ReplaceableVariable
    private SExpression text;

    @ReplaceableVariable
    private SExpression delim;

    public SESplit() {}

    public SESplit(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 2);

        text = args.get(0);
        delim = args.get(1);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        String text = Utils.castString(this.text.evaluate(env), atom);
        String delim = Utils.castString(this.delim.evaluate(env), atom);

        ListEx<SValue> ret = new ListEx<SValue>();
        for (String s : text.split(delim)) {
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
