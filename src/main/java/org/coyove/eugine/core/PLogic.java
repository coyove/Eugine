package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class PLogic extends SExpression {
    @ReplaceableVariables
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
        boolean ret = Utils.castBoolean(values.head().evaluate(env), atom);

        if (ret && log == LOGIC.OR) {
            return ExecEnvironment.True;
        }

        if (!ret && log == LOGIC.AND) {
            return ExecEnvironment.False;
        }

        if (log != LOGIC.NOT) {
            for (int i = 1; i < values.size(); i++) {
                boolean next = Utils.castBoolean(values.get(i).evaluate(env), atom);
                switch (log) {
                    case AND:
                        ret = ret && next;
                        if (!ret) {
                            return ExecEnvironment.False;
                        }
                        break;
                    case OR:
                        ret = ret || next;
                        if (ret) {
                            return ExecEnvironment.True;
                        }
                        break;
                }
            }
        } else  {
            ret = !ret;
        }

        return ret ? ExecEnvironment.True : ExecEnvironment.False;

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
