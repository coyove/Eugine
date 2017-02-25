package org.coyove.eugine.library.string;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEBuffer extends SExpression {
    @ReplaceableVariable
    private SExpression src;

    public SEBuffer() {}

    public SEBuffer(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);

        src = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue src = this.src.evaluate(env);
        if (src instanceof SString) {
            return new SBuffer(src.<String>get().getBytes());
        } else if (src instanceof SNumber) {
            return new SBuffer(new byte[EgCast.toInt(src, atom)]);
        } else {
            throw new EgException(3031, "failed to convert to bytes buffer", atom);
        }
    }

    @Override
    public SExpression deepClone() {
        SEBuffer ret = new SEBuffer();
        ret.atom = this.atom;
        ret.src = this.src.deepClone();
        return ret;
    }
}
