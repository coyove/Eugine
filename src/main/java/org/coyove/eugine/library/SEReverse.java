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
    private SExpression sub;

    public SEReverse() {}

    public SEReverse(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);
        sub = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue subject = this.sub.evaluate(env);

        if (subject instanceof SList) {
            ListEx<SValue> l = subject.get();
            Object[] objs = l.toArray(new SValue[l.size()]);

            ArrayUtils.reverse(objs);
            ListEx<SValue> ret = new ListEx<SValue>(
                    Arrays.asList(Arrays.copyOf(objs, objs.length, SValue[].class)));
            return new SList(ret);
        } else if (subject instanceof SLong) {
            return new SLong(-((SLong) subject).val());
        } else if (subject instanceof SInt) {
            return new SInt(-((SInt) subject).val());
        } else if (subject instanceof SDouble) {
            return new SDouble(-((SDouble) subject).val());
        } else if (subject instanceof SBool) {
            return Utils.isBooleanTrue(subject) ? ExecEnvironment.False : ExecEnvironment.True;
        } else {
            return Utils.castBoolean(subject, atom) ? ExecEnvironment.False : ExecEnvironment.True;
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        SEReverse ret = new SEReverse();
        ret.atom = this.atom;
        ret.sub = this.sub.deepClone();
        return ret;
    }
}

