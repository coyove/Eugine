package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEBitOp extends SExpression {
    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right = null;

    private OPERATION op;
    public enum OPERATION {AND, OR, NOT}

    public SEBitOp() {}

    public SEBitOp(Atom ha, ListEx<SExpression> args, OPERATION o) {
        super(ha, args, o == OPERATION.NOT ? 1 : 2);
        op = o;

        left = args.head();
        if (o != OPERATION.NOT) {
            right = args.get(1);
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        Long left = Utils.castLong(this.left.evaluate(env), atom);
        if (op == OPERATION.NOT) {
            return new SInteger(~left);
        }

        Long right = Utils.castLong(this.right.evaluate(env), atom);
        switch (op) {
            case AND:
                return new SInteger(left & right);
            case OR:
                return new SInteger(left | right);
            default:
                throw new EgException(3006, "unknown operation", atom);
        }
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
