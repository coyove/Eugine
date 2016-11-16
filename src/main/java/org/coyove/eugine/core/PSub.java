package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.Arrays;

/**
 * Created by zezhong on 2016/9/10.
 */
public class PSub extends SExpression {
    private SExpression subject;
    private SExpression start;
    private SExpression end;

    public PSub() {}

    public PSub(Atom ha, SExpression sub, SExpression s, SExpression e) {
        atom = ha;
        start = s;
        end = e;
        subject = sub;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue subObj = subject.evaluate(env);

        EgException ex = new EgException(3012, "start and end index must be integers", atom);
        int start = Utils.cast(this.start.evaluate(env), SInteger.class, ex).<Long>get().intValue();
        if (start < 0) {
            throw new EgException(3015, "start cannot be negative", atom);
        }

        int end = this.end != null ? Utils.cast(this.end.evaluate(env), SInteger.class, ex).<Long>get().intValue() : 0;

        if (subObj instanceof SString) {
            SString subStr = (SString) subObj;

            if (this.end == null) {
                return new SString(subStr.<String>get().substring(start));
            } else {
                try {
                    return new SString(subStr.<String>get().substring(start, end));
                } catch (StringIndexOutOfBoundsException se) {
                    throw new EgException(3013, "string index out of range", atom);
                }
            }

        } else if (subObj instanceof SList) {
            SList subList = (SList) subObj;
            if (this.end == null) {
                return new SList(subList.<ListEx<SValue>>get().sub(start));
            } else {
                return new SList(subList.<ListEx<SValue>>get().sub(start, end));
            }
        } else if (subObj.underlying instanceof byte[]) {
            byte[] buf = (byte[]) subObj.underlying;
            if (this.end == null) {
                return new SObject(Arrays.copyOfRange(buf, start, buf.length));
            } else {
                return new SObject(Arrays.copyOfRange(buf, start, end));
            }
        } else {
            throw new EgException(3014, "invalid subject", atom);
        }

    }

    @Override
    public SExpression deepClone() throws EgException {
        PSub ret = new PSub();
        ret.atom = this.atom;

        ret.subject = this.subject.deepClone();
        ret.start = this.start.deepClone();
        if (this.end != null) {
            ret.end = this.end.deepClone();
        }

        return ret;
    }
}
