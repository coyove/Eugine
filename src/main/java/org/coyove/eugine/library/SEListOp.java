package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEListOp extends SExpression {
    private SExpression list;
    private SExpression pos = null;
    private SExpression value = null;
    private OPERATION op;

    public enum OPERATION {HEAD, TAIL, INIT, LAST, INSERT}

    public SEListOp() {}

    public SEListOp(Atom ha, Compound c, OPERATION o) throws VMException {
        super(ha, c, o == OPERATION.INSERT ? 3 : 1);

        list = SExpression.cast(c.atoms.pop());
        op = o;

        if (o == OPERATION.INSERT) {
            pos = SExpression.cast(c.atoms.pop());
            value = SExpression.cast(c.atoms.pop());
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SList listObj = Utils.cast(this.list.evaluate(env), SList.class,
                new VMException(3005, "subject must be list", headAtom));

        List<SValue> list = listObj.get();
        switch (op) {
            case HEAD:
                return list.size() > 0 ? list.head() : new SNull();
            case TAIL:
                return list.size() > 0 ? new SList(list.skip(1)) : new SNull();
            case INIT:
                return list.size() > 0 ? new SList(list.sub(0, list.size() - 1)) : new SNull();
            case LAST:
                return list.size() > 0 ? list.get(list.size() - 1) : new SNull();
            case INSERT:
                SValue value = this.value.evaluate(env);
                SInteger pos = Utils.cast(this.pos.evaluate(env), SInteger.class);
                if (pos == null) {
                    throw new VMException(3006, "position must be integer", headAtom);
                }

                list.add(pos.<Long>get().intValue(), value);
                return listObj;
            default:
                throw new VMException(3006, "unknown list operation", headAtom);
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEListOp ret = new SEListOp();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.op = this.op;
        ret.list = this.list.deepClone();

        if (this.pos != null && this.value != null) {
            ret.pos = this.pos.deepClone();
            ret.value = this.value.deepClone();
        }

        return ret;
    }
}
