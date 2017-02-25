package org.coyove.eugine.library.math;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEBitOp extends SExpression {
    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right = null;

    private byte op;
    public final static byte AND = 0;
    public final static byte OR = 1;
    public final static byte NOT = 2;
    public final static byte XOR = 3;

    public SEBitOp() {}

    public SEBitOp(Atom ha, ListEx<SExpression> args, byte o) {
        super(ha, args, o == NOT ? 1 : 2);
        op = o;

        left = args.head();
        if (o != NOT) {
            right = args.get(1);
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue _left = this.left.evaluate(env);
        long left = EgCast.toLong(_left, atom);

        if (op == NOT) {
            return new SNumber(~left);
        }

        SValue _right = this.right.evaluate(env);
        long right = EgCast.toLong(_right, atom);

        if (op == AND) {
            return new SNumber(left & right);
        } else if (op == OR) {
            return new SNumber(left | right);
        } else {
            return new SNumber(left ^ right);
        }
    }

    @Override
    public SExpression deepClone() {
        SEBitOp ret = new SEBitOp();
        ret.atom = this.atom;
        ret.op = this.op;
        ret.left = this.left.deepClone();

        if (this.right != null) {
            ret.right = this.right.deepClone();
        }

        return ret;
    }
}
