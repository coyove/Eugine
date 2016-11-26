package org.coyove.eugine.core.flow;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class PEnter extends SExpression {
    @ReplaceableVariable
    private SExpression mainBody;

    @ReplaceableVariable
    private SExpression catchBody = null;

    @ReplaceableVariable
    private SExpression finallyBody = null;

    private String exName;

    public PEnter() {}

    public PEnter(Atom ha, SExpression m, SExpression c, SExpression f, String e) {
        atom = ha;
        mainBody = m;
        catchBody = c;
        finallyBody = f;
        exName = e;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        try {
            this.mainBody.evaluate(env);
        } catch (Exception ex) {
            env.bPut(exName == null ? "__ex__" : exName, new SString(ex.toString()));
            if (this.catchBody != null) {
                this.catchBody.evaluate(env);
            }
        } finally {
            if (this.finallyBody != null) {
                return this.finallyBody.evaluate(env);
            } else {
                return env.Null;
            }
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        PEnter ret = new PEnter();
        ret.atom = this.atom;

        ret.mainBody = this.mainBody.deepClone();
        ret.exName = this.exName;

        if (this.catchBody != null) {
            ret.catchBody = this.catchBody.deepClone();
        }

        if (this.finallyBody != null) {
            ret.finallyBody = this.finallyBody.deepClone();
        }

        return ret;
    }
}