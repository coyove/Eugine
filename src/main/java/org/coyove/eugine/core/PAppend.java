package org.coyove.eugine.core;

import org.apache.commons.lang3.ArrayUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class PAppend extends SExpression {
    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right;

    public PAppend() {}

    public PAppend(Atom ha, SExpression l, SExpression r) {
        atom = ha;
        left = l;
        right = r;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue left = this.left.evaluate(env);
        SValue right = this.right.evaluate(env);

        if (left instanceof SConcatString) {
            if (!(right instanceof SNull)) {
                ((SConcatString) left).append(right.asString());
            }

            return left;
        }

        if (left instanceof SString) {
            if (!(right instanceof SNull)) {
                String text = left.get();
                left.underlying = text + right.asString();
            }

            return left;
        }

        if (left instanceof SList) {
            ListEx<SValue> list = left.get();
            list.add(right);
            return left;
        }

        if (left.underlying instanceof byte[] && right.underlying instanceof byte[]) {
            byte[] l = (byte[]) left.underlying;
            byte[] r = (byte[]) right.underlying;

            left.underlying = ArrayUtils.addAll(l, r);
        }

        return ExecEnvironment.Null;
    }

    @Override
    public SExpression deepClone() {
        PAppend ret = new PAppend();
        ret.atom = this.atom;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();

        return ret;
    }
}
