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
    private SExpression list;

    public SEReverse() {}

    public SEReverse(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);
        list = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue subject = this.list.evaluate(env);

        if (subject instanceof SList) {
            ListEx<SValue> l = subject.get();
            Object[] objs = l.toArray(new SValue[l.size()]);

            ArrayUtils.reverse(objs);
            ListEx<SValue> ret = new ListEx<SValue>(
                    Arrays.asList(Arrays.copyOf(objs, objs.length, SValue[].class)));
            return new SList(ret);
        } else if (subject instanceof SInteger) {
            return new SInteger(-((SInteger) subject).val());
        } else if (subject instanceof SDouble) {
            return new SDouble(-((SDouble) subject).val());
        } else if (subject instanceof SBool) {
            return subject == ExecEnvironment.True ? ExecEnvironment.False : ExecEnvironment.True;
        }else {
            throw new EgException(3015, "require list, integer or double", atom);
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        SEReverse ret = new SEReverse();
        ret.atom = this.atom;

        ret.list = this.list.deepClone();

        return ret;
    }
}

