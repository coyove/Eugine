package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class PLogic extends SExpression {
    private List<SExpression> values;

    private LOGIC log;
    public enum LOGIC {AND, OR, NOT}

    public PLogic() {}

    public PLogic(Atom ha, List<SExpression> args, LOGIC a) {
        super(ha, args, 1);

        log = a;
        values = args;
    }

    public PLogic(Atom ha, Compound c, LOGIC a) throws VMException {
        super(ha, c, 1);

        log = a;
        values = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        List<SValue> results = SExpression.eval(values, env);
        VMException ex = new VMException(2041, "non-boolean found", headAtom);

        SBool lead = Utils.cast(results.head(), SBool.class, ex);
        boolean ret = lead.get();

        if (ret && log == LOGIC.OR) {
            return new SBool(true);
        }

        if (log != LOGIC.NOT) {
            for (int i = 1; i < results.size(); i++) {
                SBool next = Utils.cast(results.get(i), SBool.class, ex);
                switch (log) {
                    case AND:
                        ret = ret && next.<Boolean>get();
                        if (!ret) {
                            return new SBool(false);
                        }
                        break;
                    case OR:
                        ret = ret || next.<Boolean>get();
                        if (ret) {
                            return new SBool(true);
                        }
                        break;
                }
            }
        } else  {
            ret = !ret;
        }

        return new SBool(ret);

    }

    @Override
    public SExpression deepClone() throws VMException {
        PLogic ret = new PLogic();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.log = this.log;
        ret.values = List.deepClone(this.values);

        return ret;
    }
}
