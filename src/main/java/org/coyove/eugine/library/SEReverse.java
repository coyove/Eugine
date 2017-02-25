package org.coyove.eugine.library;

import org.apache.commons.lang3.ArrayUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.Arrays;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEReverse extends SExpression {
    @ReplaceableVariable
    private SExpression subject;

    public SEReverse() {}

    public SEReverse(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);
        subject = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue subject = this.subject.evaluate(env);

        if (subject instanceof SList) {
            ListEx<SValue> l = subject.get();
            Object[] objs = l.toArray(new SValue[l.size()]);

            ArrayUtils.reverse(objs);
            ListEx<SValue> ret = new ListEx<SValue>(
                    Arrays.asList(Arrays.copyOf(objs, objs.length, SValue[].class)));
            return new SList(ret);
        } else if (subject instanceof SNumber) {
            return new SNumber(-EgCast.toDouble(subject, atom));
        } else if (subject instanceof SBool) {
            return Utils.isBooleanTrue(subject) ? ExecEnvironment.False : ExecEnvironment.True;
        } else {
            return EgCast.toBoolean(subject, atom) ? ExecEnvironment.False : ExecEnvironment.True;
        }
    }

    @Override
    public SExpression deepClone() {
        SEReverse ret = new SEReverse();
        ret.atom = this.atom;
        ret.subject = this.subject.deepClone();
        return ret;
    }
}

