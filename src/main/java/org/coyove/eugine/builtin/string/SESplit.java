package org.coyove.eugine.builtin.string;

import org.apache.commons.lang3.StringUtils;
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

    private boolean raw = false;

    public SESplit() {}

    public SESplit(Atom ha, ListEx<SExpression> args, boolean r) {
        super(ha, args, 2);

        text = args.get(0);
        delim = args.get(1);
        raw = r;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        String text = EgCast.toString(this.text.evaluate(env), atom);
        String delim = EgCast.toString(this.delim.evaluate(env), atom);

        ListEx<SValue> ret = new ListEx<SValue>();

        if (raw) {
            for (String s : StringUtils.splitByWholeSeparator(text, delim)) {
                ret.add(new SString(s));
            }
        } else {
            for (String s : text.split(delim)) {
                ret.add(new SString(s));
            }
        }

        return new SList(ret);
    }

    @Override
    public SExpression deepClone() {
        SESplit ret = new SESplit();
        ret.atom = this.atom;

        ret.text = this.text.deepClone();
        ret.delim = this.delim.deepClone();
        ret.raw = this.raw;
        return ret;
    }
}
