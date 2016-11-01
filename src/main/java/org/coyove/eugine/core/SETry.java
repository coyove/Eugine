package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.core.SECall;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SETry extends SExpression {
    private SExpression mainBody;
    private SExpression catchBody = null;
    private SExpression finallyBody = null;
    private String exName;

    public SETry() {}

    public SETry(Atom ha, SExpression m, SExpression c, SExpression f, String e) {
        headAtom = ha;
        mainBody = m;
        catchBody = c;
        finallyBody = f;
        exName = e;
    }

    public SETry(Atom ha, Compound c) throws VMException {
        super(ha, c, 1);

        mainBody = SExpression.cast(c.atoms.pop());
        if (c.atoms.size() > 0)
            catchBody = SExpression.cast(c.atoms.pop());
        if (c.atoms.size() > 0)
            finallyBody = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        try {
            this.mainBody.evaluate(env);
        } catch (Exception ex) {
            env.putVar(exName == null ? "~ex" : exName, new SString(ex.toString()));
            if (this.catchBody != null) {
                this.catchBody.evaluate(env);
            }
        } finally {
            if (this.finallyBody != null) {
                return this.finallyBody.evaluate(env);
            } else {
                return new SNull();
            }
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        SETry ret = new SETry();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
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
