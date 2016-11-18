package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEEval extends SExpression {
    @ReplaceableVariable
    private SExpression text;

    @ReplaceableVariable
    private SExpression env = null;

    public SEEval() {}

    public SEEval(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);

        text = args.head();
        if (args.size() > 1) {
            env = args.get(1);
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {

        String text = Utils.cast(this.text.evaluate(env), SString.class,
                new EgException(2014, "must eval string", atom)).get();

        if (this.env != null) {
            SDict e = Utils.cast(this.env.evaluate(env), SDict.class,
                    new EgException(2015, "environment must be a dict", atom));

            env = new ExecEnvironment();
            HashMap<String, SValue> custom = e.get();

            for (String k : custom.keySet()) {
                env.put(k, custom.get(k));
            }
        }

        return ANTLRHelper.executeCode(text, env);
    }

    @Override
    public SExpression deepClone() throws EgException {
        SEEval ret = new SEEval();
        ret.atom = this.atom;

        ret.text = this.text.deepClone();
        if (this.env != null) {
            ret.env = this.env.deepClone();
        }
        return ret;
    }
}
