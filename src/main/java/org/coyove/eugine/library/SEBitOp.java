package org.coyove.eugine.library;

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
        if (op == NOT) {
            if (_left instanceof SInt) {
                return new SInt(~((SInt) _left).val());
            } else if (_left instanceof SLong) {
                return new SLong(~((SLong) _left).val());
            } else {
                throw new EgException(3006, left + " is not an integer or long", atom);
            }
        }

        SValue _right = this.right.evaluate(env);

        if (_left instanceof SInt && _right instanceof SInt) {
            if (op == AND) {
                return new SInt(((SInt) _left).val() & ((SInt) _right).val());
            } else if (op == OR) {
                return new SInt(((SInt) _left).val() | ((SInt) _right).val());
            } else {
                return new SInt(((SInt) _left).val() ^ ((SInt) _right).val());
            }
        }

        if (_left instanceof SLong || _right instanceof SLong) {
            if (op == AND) {
                return new SLong(EgCast.toLong(_left, atom) & EgCast.toLong(_right, atom));
            } else if (op == OR) {
                return new SLong(EgCast.toLong(_left, atom) | EgCast.toLong(_right, atom));
            } else {
                return new SLong(EgCast.toLong(_left, atom) ^ EgCast.toLong(_right, atom));
            }
        }

        throw new EgException(3006, "invalid number", atom);
    }

    @Override
    public SExpression deepClone() throws EgException {
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
