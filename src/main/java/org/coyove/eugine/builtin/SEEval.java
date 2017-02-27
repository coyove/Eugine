package org.coyove.eugine.builtin;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.io.File;
import java.util.HashMap;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEEval extends SExpression {
    @ReplaceableVariable
    private SExpression subject;

    @ReplaceableVariable
    private SExpression env = null;

    public SEEval() {}

    public SEEval(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);

        subject = args.head();
        if (args.size() > 1) {
            env = args.get(1);
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue text = this.subject.evaluate(env);
        if (this.env != null) {
            SDict e = EgCast.to(this.env.evaluate(env), SDict.class);
            if (e == null)
                throw new EgException(2015, "environment must be a dict", atom);

            env = new ExecEnvironment();
            HashMap<String, SValue> custom = e.get();

            for (String k : custom.keySet()) {
                env.put(k, custom.get(k));
            }
        }

        if (text instanceof SString) {
            String s = text.get();
            String path = "";

            SValue p = env.get("__path__");
            if (p instanceof SString)
                path = p.get();

            if (new File(path + s).exists()) {
                return Parser.executeFile(path + s, env);
            } else {
                return Parser.executeCode(s, env);
            }
        } else if (text instanceof SMetaExpression) {
            return ((SExpression) text.get()).evaluate(env);
        } else {
            if (text instanceof SList) {
                ListEx<SValue> list = ((SList) text).get();
                if (list.head() instanceof SMetaExpression) {
                    SValue ret = ExecEnvironment.Null;
                    for (SValue expr : list) {
                        ret = ((SExpression) expr.get()).evaluate(env);
                    }

                    return ret;
                }
            }

            throw new EgException(2014, "invalid object to eval", atom);
        }
    }

    @Override
    public SExpression deepClone() {
        SEEval ret = new SEEval();
        ret.atom = this.atom;

        ret.subject = this.subject.deepClone();
        if (this.env != null) {
            ret.env = this.env.deepClone();
        }
        return ret;
    }
}
