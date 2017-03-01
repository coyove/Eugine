package org.coyove.eugine.core.math;

import org.coyove.eugine.base.*;
import org.coyove.eugine.core.PGet;
import org.coyove.eugine.core.PPut;
import org.coyove.eugine.core.PVariable;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.SNumber;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by coyove on 2016/9/10.
 */
public class PAssign extends SExpression {
    @ReplaceableVariable
    private SExpression subject;

    @ReplaceableVariable
    public SExpression op;

    private Map<String, Class<? extends SExpression>> builderMap =
            new HashMap<String, Class<? extends SExpression>>() {{
                put("+=", PAdd.class);
                put("-=", PSubtract.class);
                put("*=", PMultiply.class);
                put("/=", PDivide.class);
                put("%=", PModular.class);
                put("&=", PBitAnd.class);
                put("|=", PBitOr.class);
                put("^=", PBitXor.class);
            }};

    public PAssign() {
    }

    public PAssign(Atom ha, SExpression l, SExpression r, String o) {
        atom = ha;
        subject = l;
        build(ha, l, r, o);
    }

    private void build(Atom ha, SExpression l, SExpression r, String o) {
        Class<? extends SExpression> cls = builderMap.get(o);
        try {
            Constructor ctor =
                    cls.getConstructor(Atom.class, SExpression.class, SExpression.class, boolean.class);
            op = (SExpression) ctor.newInstance(ha, l, r, true);
        } catch (Exception e) {
            EgException.INTERNAL_ERROR.raise(atom, e).exit();
        }
    }

    public PAssign(Atom ha, SExpression s, SExpression k, SExpression v, String o) {
        atom = ha;
        subject = s;
        build(ha, new PGet(ha, s, k), v, o);
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        return op.evaluate(env);
    }

    @Override
    public SExpression deepClone() {
        PAssign ret = new PAssign();
        ret.atom = this.atom;
        ret.op = this.op.deepClone();
        ret.subject = this.subject.deepClone();

        return ret;
    }
}
