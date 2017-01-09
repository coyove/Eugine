package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEMeta extends SExpression {
    @ReplaceableVariable
    private SExpression closure;

    @ReplaceableVariable
    private SExpression index = null;

    @ReplaceableVariable
    private SExpression expr = null;

    public byte op;

    public final static byte ADD = 0;
    public final static byte SET = 1;
    public final static byte REMOVE = 2;

    public SEMeta() {}

    public SEMeta(Atom ha, ListEx<SExpression> args, byte op) {
        super(ha, args, op == SET ? 3 : 2);

        this.closure = args.head();
        this.op = op;

        switch (op) {
            case ADD:
                if (args.size() >= 3) {
                    this.index = args.get(1);
                    this.expr = args.get(2);
                } else {
                    this.expr = args.get(1);
                }
                break;
            case SET:
                this.index = args.get(1);
                this.expr = args.get(2);
                break;
            case REMOVE:
                this.index = args.get(1);
                break;
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SClosure closure = EgCast.to(this.closure.evaluate(env), SClosure.class);
        SClosure expr = EgCast.to(this.expr.evaluate(env), SClosure.class);

        if (closure == null) {
            throw new EgException(6791, "invalid closure", atom);
        }

        if (expr == null) {
            throw new EgException(6791, "invalid expression", atom);
        }

        switch (op) {
            case ADD:
                if (expr.body.size() > 0) {
                    if (this.index == null) {
                        closure.body.addAll(expr.body);
                    } else {
                        int idx = EgCast.toInt(this.index.evaluate(env), atom);
                        if (idx <= closure.body.size()) {
                            closure.body.addAll(idx, expr.body);
                        } else {
                            throw new EgException(6792, "index out of range", atom);
                        }
                    }
                }
                break;
            case SET:
                if (expr.body.size() > 0) {
                    int idx = EgCast.toInt(this.index.evaluate(env), atom);
                    if (idx < closure.body.size()) {
                        closure.body.remove(idx);
                        closure.body.addAll(idx, expr.body);
                    } else {
                        throw new EgException(6792, "index out of range", atom);
                    }
                }
                break;
            case REMOVE:
                closure.body.remove(EgCast.toInt(this.index.evaluate(env), atom));
                break;
        }

        return ExecEnvironment.Null;
    }

    @Override
    public SExpression deepClone() {
        SEMeta ret = new SEMeta();
        ret.atom = this.atom;
        ret.closure = this.closure.deepClone();
        ret.op = this.op;

        if (ret.expr != null) {
            ret.expr = this.expr.deepClone();
        }

        if (ret.index != null) {
            ret.index = this.index.deepClone();
        }
        return ret;
    }
}
