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

    public SEReverse(Atom ha, Compound c) throws VMException {
        super(ha, c, 1);
        list = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SList list = Utils.cast(this.list.evaluate(env), SList.class);
        if (list == null)
            throw new VMException(3015, "require list", headAtom);

        List<SValue> l = list.get();
        Object[] objs = l.toArray(new SValue[l.size()]);

        ArrayUtils.reverse(objs);
        List<SValue> ret = new List<SValue>(Arrays.asList(Arrays.copyOf(objs, objs.length, SValue[].class)));
        return new SList(ret);
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

