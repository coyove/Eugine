package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.core.SECall;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEThread extends SExpression {
    private SExpression closure;
    private List<SExpression> arguments;

    public SEThread(Atom ha, Compound c) throws VMException
    {
        super(ha, c, 1);

        closure = SExpression.cast(c.atoms.pop());
        arguments = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(final ExecEnvironment env) throws VMException
    {
        final SClosure closure = Utils.cast(this.closure.evaluate(env), SClosure.class);
        if (closure == null)
            throw new VMException(3020, "invalid function to go", headAtom);

        Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    (new SECall(closure, arguments, headAtom, tailCompound)).evaluate(env);
                } catch (VMException ex) {

                }
            }
        });

        t.start();
        return new SNull();
    }
}
