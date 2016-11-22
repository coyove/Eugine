package org.coyove.eugine.core.math;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class PGreat extends SExpression {
    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right;

    public PGreat() {
    }

    public PGreat(Atom ha, SExpression l, SExpression r) {
        atom = ha;
        left = l;
        right = r;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue left = this.left.evaluate(env);
        SValue right = this.right.evaluate(env);
        boolean ret;

        if (left instanceof SDouble) {
            ret = ((SDouble) left).val() > Utils.castDouble(right, atom);
        } else if (left instanceof SInt) {
            if (right instanceof SInt) {
                ret = ((SInt) left).val() > ((SInt) right).val();
            } else {
                ret = ((SInt) left).val() > Utils.castLong(right, atom);
            }
        } else if (left instanceof SLong) {
            ret = ((SLong) left).val() > Utils.castLong(right, atom);
        } else {
            throw new EgException(7056, left + " is not a number", atom);
        }

        return ret ? ExecEnvironment.True : ExecEnvironment.False;
    }

    @Override
    public SExpression deepClone() throws EgException {
        PGreat ret = new PGreat();
        ret.atom = this.atom;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();

        return ret;
    }
}
