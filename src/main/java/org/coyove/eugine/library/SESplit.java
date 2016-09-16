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

    public SESplit(Atom ha, Compound c) throws VMException {
        super(ha, c);
        if (c.atoms.size() < 1)
            throw new VMException(2090, "needs a subject to split up", ha);

        if (c.atoms.size() < 2)
            throw new VMException(2090, "needs a delimiter", ha);

        text = SExpression.cast(c.atoms.pop());
        delim = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SString text = Utils.cast(this.text.evaluate(env), SString.class,
                new VMException(2088, "the subject must be a string", headAtom));

        SString delim = Utils.cast(this.delim.evaluate(env), SString.class,
                new VMException(2089, "the delimiter must be a string", headAtom));

        List<SValue> ret = new List<SValue>();
        for (String s : text.<String>get().split(delim.<String>get())) {
            ret.add(new SString(s));
        }

        return new SList(ret);
    }
}
