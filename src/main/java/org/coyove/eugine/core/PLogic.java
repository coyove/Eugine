package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class PLogic extends SExpression {
    private ListEx<SExpression> values;

    private LOGIC log;
    public enum LOGIC {AND, OR, NOT}

    public PLogic() {}

    public PLogic(Atom ha, ListEx<SExpression> args, LOGIC a) {
        super(ha, args, 1);

        log = a;
        values = args;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        EgException ex = new EgException(2041, "non-boolean found", atom);

        SBool lead = Utils.cast(values.head().evaluate(env), SBool.class, ex);
        boolean ret = lead.get();

        if (ret && log == LOGIC.OR) {
            return new SBool(true);
        }

        if (!ret && log == LOGIC.AND) {
            return new SBool(false);
        }

        if (log != LOGIC.NOT) {
            for (int i = 1; i < values.size(); i++) {
                SBool next = Utils.cast(values.get(i).evaluate(env), SBool.class, ex);
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
    public SExpression deepClone() throws EgException {
        PLogic ret = new PLogic();
        ret.atom = this.atom;

        ret.log = this.log;
        ret.values = ListEx.deepClone(this.values);

        return ret;
    }
}