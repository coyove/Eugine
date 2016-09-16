package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/10.
 */
public class SELogic extends SExpression {
    private LOGIC log;
    private List<SExpression> values;

    public enum LOGIC {AND, OR, NOT}

    public SELogic(Atom ha, Compound c, LOGIC a) throws VMException {
        super(ha, c);
        if (a != LOGIC.NOT && c.atoms.size() < 2)
            throw new VMException(2062, "needs at least 2 booleans to perform", ha);

        if (a == LOGIC.NOT && c.atoms.size() != 1)
            throw new VMException(2063, "needs a boolean", ha);

        log = a;
        values = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        List<SValue> results = SExpression.eval(values, env);
        VMException ex = new VMException(2061, "non-boolean found in the comparison", headAtom);

        SBool lead = Utils.cast(results.head(), SBool.class, ex);
        boolean ret = lead.get();

        if (log != LOGIC.NOT) {
            for (int i = 1; i < results.size(); i++) {
                SBool next = Utils.cast(results.get(i), SBool.class, ex);
                switch (log) {
                    case AND:
                        ret = ret && next.<Boolean>get();
                        break;
                    case OR:
                        ret = ret || next.<Boolean>get();
                        break;
                }
            }
        } else  {
            ret = !ret;
        }

        return new SBool(ret);

    }
}
