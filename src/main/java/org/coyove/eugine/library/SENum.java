package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SENum extends SExpression {
    @ReplaceableVariable
    private SExpression subject;

    private byte op;
    public final static byte INT = 0;
    public final static byte LONG = 1;
    public final static byte DOUBLE = 2;
    public final static byte NUM = -1;

    public SENum() {}

    public SENum(Atom ha, ListEx<SExpression> args, byte o) {
        super(ha, args, 1);

        subject = args.head();
        op = o;
    }

    private SValue convert(SValue arg, ExecEnvironment env) throws EgException {
        if (arg instanceof SString) {
            String str = arg.get();
            str = str.trim();
            try {
                if (op == NUM) {
                    if (str.contains(".")) {
                        return new SDouble(Double.parseDouble(str));
                    } else {
                        return new SLong(Long.parseLong(str));
                    }
                } else if (op == INT) {
                    return new SInt(Integer.parseInt(str));
                } else if (op == LONG) {
                    return new SLong(Long.parseLong(str));
                } else {
                    return new SDouble(Double.parseDouble(str));
                }
            } catch (Exception e) {
                return ExecEnvironment.Null;
            }
        } else if (arg instanceof SBool) {
            return new SInt((Boolean) ((SBool) arg).underlying ? 1 : 0);
        } else if (arg instanceof SNull) {
            return ExecEnvironment.Null;
        } else if (arg instanceof SList) {
            ListEx<SValue> list = arg.get();
            ListEx<SValue> ret = new ListEx<SValue>(list.size());
            
            for (SValue v : list) {
                ret.add(convert(v.evaluate(env), env));
            }

            return new SList(ret);
        } else if (arg instanceof SLong) {
            if (op == INT) {
                return new SInt((int) ((SLong) arg).val());
            } else if (op == DOUBLE) {
                return new SDouble(((SLong) arg).val());
            } else {
                return arg;
            }
        } else if (arg instanceof SInt) {
            if (op == LONG) {
                return new SLong(((SInt) arg).val());
            } else if (op == DOUBLE) {
                return new SDouble(((SInt) arg).val());
            } else {
                return arg;
            }
        } else if (arg instanceof SDouble) {
            if (op == INT) {
                return new SInt((int) ((SDouble) arg).val());
            } else if (op == LONG) {
                return new SLong((long) ((SDouble) arg).val());
            } else {
                return arg;
            }
        } else {
            return ExecEnvironment.Null;
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        return convert(subject.evaluate(env), env);
    }

    @Override
    public SExpression deepClone() {
        SENum ret = new SENum();
        ret.atom = this.atom;
        ret.op = this.op;
        ret.subject = this.subject.deepClone();

        return ret;
    }
}
