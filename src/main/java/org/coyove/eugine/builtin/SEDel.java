package org.coyove.eugine.builtin;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEDel extends SExpression {
    @ReplaceableVariable
    private SExpression subject;

    @ReplaceableVariable
    private SExpression index;

    public SEDel() {}

    public SEDel(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 2);

        subject = args.get(0);
        index = args.get(1);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue subObj = subject.evaluate(env);
        SValue idx = this.index.evaluate(env);

        if (idx instanceof SNumber && subObj instanceof SList) {
            ListEx<SValue> subList = subObj.get();
            int i = EgCast.toInt(idx, atom);
            if (i < 0 || i >= subList.size())
                throw EgException.INDEX_OUT_OF_RANGE.raise(atom);

            return subList.remove(i);
        } else if (idx instanceof SString && subObj instanceof SDict) {
            HashMap<String, SValue> dict = subObj.get();
            SValue ret = dict.remove(idx.<String>get());
            return ret == null ? ExecEnvironment.Null : ret;
        } else {
            throw EgException.INVALID_SUBJECT.raise(atom);
        }
    }

    @Override
    public SExpression deepClone() {
        SEDel ret = new SEDel();
        ret.atom = this.atom;

        ret.subject = this.subject.deepClone();
        ret.index = this.index.deepClone();
        return ret;
    }
}
