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
    @ReplaceableVariable
    private SExpression subject;

    @ReplaceableVariable
    private SExpression start;

    @ReplaceableVariable
    private SExpression end;

    public PSub() {
    }

    public PSub(Atom ha, SExpression sub, SExpression s, SExpression e) {
        atom = ha;
        start = s;
        end = e;
        subject = sub;
    }

//    private static boolean sliceSegment(StringBuilder sb, boolean append, int start, int end, String text, int idx, int len) {
//        String t = "";
//        boolean b = true;
//        if (idx + len < start) {
//                    /*
//                    idx   idx+len
//                     [#######]---//---|
//                                    start
//                     */
//            b = !append;
//        } else if (end < idx) {
//                    /*
//                             idx   idx+len
//                     |---//---[#######]
//                    end
//                     */
//            b = !append;
//            sb.subSequence()
//        } else if (idx <= start && start <= idx + len && end >= idx + len) {
//                    /*
//                    idx         idx+len
//                     [######|######]---//---|
//                          start            end
//                     */
//            t = (text.substring(start - idx));
//            b = true;
//        } else if (start < idx && end >= idx && idx + len >= end) {
//                    /*
//                             idx         idx+len
//                     |---//---[######|######]
//                   start            end
//                     */
//            t = (text.substring(0, end - idx));
//            b = !append;
//        } else if (idx >= start && end >= idx + len) {
//                    /*
//                            idx  idx+len
//                    |---//---[######]---//---|
//                  start                     end
//                     */
//            t = (text);
//            b = true;
//        } else if (idx <= start && end <= idx + len) {
//                    /*
//                    idx          idx+len
//                     [###|######|###]
//                       start   end
//                     */
//            t = (text.substring(start - idx, end - idx));
//            b = false;
//        }
//
//        if (append) {
//            sb.append(t);
//        } else {
//            sb.insert(0, t);
//        }
//
//        return b;
//    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue subObj = subject.evaluate(env);

        int start = EgCast.toInt(this.start.evaluate(env), atom);
        if (start < 0) {
            throw new EgException(3015, "start cannot be negative", atom);
        }

        int end = this.end != null ? EgCast.toInt(this.end.evaluate(env), atom) : 0;

        if (subObj instanceof SConcatString) {
            if (this.end == null) {
                end = ((SConcatString) subObj).length();
            }
            try {
                return new SString(((SConcatString) subObj).substring(start, end));
            } catch (StringIndexOutOfBoundsException se) {
                throw new EgException(3013, "string index out of range", atom);
            }
        } else if (subObj instanceof SString) {
            String subStr = EgCast.toString(subObj, atom);

            try {
                if (this.end == null) {
                    return new SString(subStr.substring(start));
                } else {
                    return new SString(subStr.substring(start, end));
                }
            } catch (StringIndexOutOfBoundsException se) {
                throw new EgException(3013, "string index out of range", atom);
            }

        } else if (subObj instanceof SList) {
            SList subList = (SList) subObj;
            if (this.end == null) {
                return new SList(subList.<ListEx<SValue>>get().sub(start));
            } else {
                return new SList(subList.<ListEx<SValue>>get().sub(start, end));
            }
        } else if (subObj instanceof SBuffer) {
            byte[] buf = subObj.get();
            if (this.end == null) {
                return new SBuffer(Arrays.copyOfRange(buf, start, buf.length));
            } else {
                return new SBuffer(Arrays.copyOfRange(buf, start, end));
            }
        } else {
            throw new EgException(3014, "invalid subject", atom);
        }

    }

    @Override
    public SExpression deepClone() {
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
