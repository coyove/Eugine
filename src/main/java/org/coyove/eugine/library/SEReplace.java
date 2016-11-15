package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEReplace extends SExpression {
    private SExpression text;
    private SExpression oldText;
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
    public SValue evaluate(ExecEnvironment env) throws VMException {
        String text = Utils.cast(this.text.evaluate(env), SString.class,
                new VMException(3010, "subject must be string", headAtom)).get();

        String oldText = Utils.cast(this.oldText.evaluate(env), SString.class,
                new VMException(3011, "old must be string", headAtom)).get();

        String newText = Utils.cast(this.newText.evaluate(env), SString.class,
                new VMException(3011, "new must be string", headAtom)).get();

        if (op == OPERATION.NORMAL) {
            return new SString(text.replace(oldText, newText));
        } else {
            return new SString(text.replaceAll(oldText, newText));
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEReplace ret = new SEReplace();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.text = this.text.deepClone();
        ret.oldText = this.oldText.deepClone();
        ret.newText = this.newText.deepClone();
        ret.op = this.op;

        return ret;
    }
}
