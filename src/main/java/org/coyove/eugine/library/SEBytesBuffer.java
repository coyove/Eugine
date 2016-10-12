package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.nio.charset.Charset;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEBytesBuffer extends SExpression {
    private SExpression src;

    public SEBytesBuffer(Atom ha, Compound c) throws VMException {
        super(ha, c, 1);
        src = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue src =this.src.evaluate(env);
        if (src instanceof SString) {
            return new SObject(src.<String>get().getBytes(Charset.forName("UTF-8")));
        } else if (src instanceof SInteger) {
            return new SObject(new byte[src.<Long>get().intValue()]);
        } else {
            throw new VMException(3031, "failed to convert to bytes buffer", headAtom);
        }
    }
}
