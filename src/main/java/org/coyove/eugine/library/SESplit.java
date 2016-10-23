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

    public SESplit(Atom ha, Compound c) throws VMException {
        super(ha, c, 2);

        text = SExpression.cast(c.atoms.pop());
        delim = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SString text = Utils.cast(this.text.evaluate(env), SString.class,
                new VMException(3010, "subject must be string", headAtom));

        SString delim = Utils.cast(this.delim.evaluate(env), SString.class,
                new VMException(3011, "delimiter must be string", headAtom));

        List<SValue> ret = new List<SValue>();
        for (String s : text.<String>get().split(delim.<String>get())) {
            ret.add(new SString(s));
        }

        return new SList(ret);
    }

    @Override
    public SExpression deepClone() throws VMException {
        SESplit ret = new SESplit();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.text = this.text.deepClone();
        ret.delim = this.delim.deepClone();

        return ret;
    }
}
