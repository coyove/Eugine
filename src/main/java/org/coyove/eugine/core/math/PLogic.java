package org.coyove.eugine.core.math;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class PLogic extends SExpression {
    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right;

    private byte log;

    public final static byte AND = 0;
    public final static byte OR = 1;

    public PLogic() {}

    public PLogic(Atom ha, SExpression l, SExpression r, byte a) {
        atom = ha;
        log = a;
        left = l;
        right = r;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        boolean ret = Utils.castBoolean(left.evaluate(env), atom);

        if (ret && log == OR) {
            return ExecEnvironment.True;
        }

        if (!ret && log == AND) {
            return ExecEnvironment.False;
        }

        boolean next = Utils.castBoolean(right.evaluate(env), atom);
        if (log == AND) {
            ret = ret && next;
        } else {
            ret = ret || next;
        }

        return ret ? ExecEnvironment.True : ExecEnvironment.False;

    }

    @Override
    public SExpression deepClone() throws EgException {
        PLogic ret = new PLogic();
        ret.atom = this.atom;

        ret.log = this.log;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();

        return ret;
    }
}
