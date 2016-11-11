package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SESub extends SExpression {
    private SExpression subject;
    private SExpression start;
    private SExpression end;

    public SESub() {}

    public SESub(Atom ha, SExpression sub, SExpression s, SExpression e) {
        headAtom = ha;
        start = s;
        end = e;
        subject = sub;
    }

    public SESub(Atom ha, Compound c) throws VMException {
        throw new VMException(9999, "not implemented", ha);
//        super(ha, c, 2);
//
//        arguments = SExpression.castPlain(c);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue subObj = subject.evaluate(env);

        VMException ex = new VMException(3012, "start and end index must be integers", headAtom);
        int start = Utils.cast(this.start.evaluate(env), SInteger.class, ex).<Long>get().intValue();
        if (start < 0) {
            throw new VMException(3015, "start cannot be negative", headAtom);
        }

        int end = this.end != null ? Utils.cast(this.end, SInteger.class, ex).<Long>get().intValue() : 0;

        if (subObj instanceof SString) {
            SString subStr = (SString) subObj;

            if (this.end == null) {
                return new SString(subStr.<String>get().substring(start));
            } else {
                try {
                    return new SString(subStr.<String>get().substring(start, end));
                } catch (StringIndexOutOfBoundsException se) {
                    throw new VMException(3013, "string index out of range", headAtom);
                }
            }

        } else if (subObj instanceof SList) {
            SList subList = (SList) subObj;
            if (this.end == null) {
                return new SList(subList.<List<SExpression>>get().sub(start));
            } else {
                return new SList(subList.<List<SExpression>>get().sub(start, end));
            }
        } else {
            throw new VMException(3014, "subject must be string or list", headAtom);
        }

    }

    @Override
    public SExpression deepClone() throws VMException {
        SESub ret = new SESub();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.subject = this.subject.deepClone();
        ret.start = this.start.deepClone();
        if (this.end != null) {
            ret.end = this.end.deepClone();
        }

        return ret;
    }
}
