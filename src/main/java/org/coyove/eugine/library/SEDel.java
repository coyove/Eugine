package org.coyove.eugine.library;

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

        if (idx instanceof SInt && subObj instanceof SList) {
            ListEx<SValue> subList = subObj.get();
            int i = ((SInt) idx).val();
            if (i < 0 || i >= subList.size())
                throw new EgException(2007, "index out of range", atom);

            return subList.remove(i);
        } else if (idx instanceof SString && subObj instanceof SDict) {
            HashMap<String, SValue> dict = subObj.get();
            SValue ret = dict.remove(idx.<String>get());
            return ret == null ? ExecEnvironment.Null : ret;
        } else {
            throw new EgException(2009, "mismatch types", atom);
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
