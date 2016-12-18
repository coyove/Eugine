package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEReplace extends SExpression {
    @ReplaceableVariable
    private SExpression text;

    @ReplaceableVariable
    private SExpression oldText;

    @ReplaceableVariable
    private SExpression newText;

    private OPERATION op;
    public enum OPERATION {NORMAL, REGEX}

    public SEReplace() {}

    public SEReplace(Atom ha, ListEx<SExpression> args, OPERATION o) {
        super(ha, args, 3);

        text = args.get(0);
        oldText = args.get(1);
        newText = args.get(2);
        op = o;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        String text = EgCast.toString(this.text.evaluate(env), atom);
        String oldText = EgCast.toString(this.oldText.evaluate(env), atom);
        String newText = EgCast.toString(this.newText.evaluate(env), atom);

        if (op == OPERATION.NORMAL) {
            return new SString(text.replace(oldText, newText));
        } else {
            return new SString(text.replaceAll(oldText, newText));
        }
    }

    @Override
    public SExpression deepClone() {
        SEReplace ret = new SEReplace();
        ret.atom = this.atom;

        ret.text = this.text.deepClone();
        ret.oldText = this.oldText.deepClone();
        ret.newText = this.newText.deepClone();
        ret.op = this.op;

        return ret;
    }
}
