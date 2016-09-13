package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEEval extends SExpression {
    private SExpression text;
    private SExpression env;

    public SEEval(Atom ha, Compound c) throws VMException {
        super(ha, c);
        if (c.atoms.size() != 1 && c.atoms.size() != 2)
            throw new VMException("it takes 1 or 2 arguments");

        text = SExpression.cast(c.atoms.pop());
        if (c.atoms.size() > 0)
            env = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {

        SString text = Utils.cast(this.text.evaluate(env), SString.class,
                new VMException("must eval a string", headAtom));

        if (this.env != null) {
            SDict e = Utils.cast(this.env.evaluate(env), SDict.class,
                    new VMException("the second argument must be a dict if provided", headAtom));

            env = new ExecEnvironment();
            HashMap<String, SValue> custom = e.get();

            for (String k : custom.keySet())
                env.put(k, custom.get(k));
        }

        Parser p = new Parser();
        Compound s = p.parse(text.<String>get(), "", "<eval>");

        return SExpression.cast(s).evaluate(env);
    }
}
