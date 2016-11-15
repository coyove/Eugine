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
    private SExpression list;

    public SEReverse() {}

    public SEReverse(Atom ha, List<SExpression> args) {
        super(ha, args, 1);
        list = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue subject = this.list.evaluate(env);

        if (subject instanceof SList) {
            List<SExpression> l = subject.get();
            Object[] objs = l.toArray(new SExpression[l.size()]);

            ArrayUtils.reverse(objs);
            List<SExpression> ret = new List<SExpression>(
                    Arrays.asList(Arrays.copyOf(objs, objs.length, SExpression[].class)));
            return new SList(ret);
        } else if (subject instanceof SInteger) {
            return new SInteger(-subject.<Long>get());
        } else if (subject instanceof SDouble) {
            return new SDouble(-subject.<Double>get());
        } else {
            throw new VMException(3015, "require list, integer or double", headAtom);
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEReverse ret = new SEReverse();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.list = this.list.deepClone();

        return ret;
    }
}

