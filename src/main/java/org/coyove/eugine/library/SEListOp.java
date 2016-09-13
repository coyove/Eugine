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
    private OPERATION op;

    public enum OPERATION { HEAD, TAIL, INIT, LAST }

    public SEListOp(Atom ha, Compound c, OPERATION o) throws VMException
    {
        super(ha, c);

        if (c.atoms.size() == 0)
            throw new VMException("it takes 1 argument", ha);

        list = SExpression.cast(c.atoms.pop());
        op = o;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException
    {
        SList listObj = Utils.cast(this.list.evaluate(env), SList.class,
                new VMException("operation only apply to a list", headAtom));

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
            default:
                throw new VMException("unknown list op", headAtom);
        }
    }
}
