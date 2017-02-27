package org.coyove.eugine.builtin;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SERange extends SExpression {
    @ReplaceableVariable
    private SExpression start;

    @ReplaceableVariable
    private SExpression interval;

    @ReplaceableVariable
    private SExpression end;

    public SERange() {}

    public SERange(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);

        if (args.size() == 1) {
            start = args.get(0);
        } else if (args.size() == 2) {
            start = args.get(0); // repeat count
            interval = args.get(1); // item
        } else if (args.size() == 3) {
            start = args.get(0);
            interval = args.get(1);
            end = args.get(2);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue _start = this.start.evaluate(env);

        if (end != null) {
            SValue _interval = this.interval.evaluate(env);
            SValue _end = this.end.evaluate(env);

            int interval = EgCast.toInt(_interval, atom);
            int start = EgCast.toInt(_start, atom);
            int end = EgCast.toInt(_end, atom);

            ListEx<SValue> ret = new ListEx<SValue>(end - start);
            for (int i = start; i < end; i += interval) {
                ret.add(new SNumber(i));
            }

            return new SList(ret);
        } else if (interval != null) {
            SValue value = this.interval.evaluate(env);
            SValue[] arr = new SValue[EgCast.toInt(_start, atom)];
            Arrays.fill(arr, value);
            ListEx<SValue> ret = new ListEx<SValue>(Arrays.asList(arr));
            return new SList(ret);
        } else {
            if (_start instanceof SList) {
                int len = _start.<ListEx<SValue>>get().size();
                ListEx<SValue> ret = new ListEx<SValue>(len);
                for (int i = 0; i < len; i++)
                    ret.add(new SNumber(i));

                return new SList(ret);
            } else if (_start instanceof SDict || _start instanceof SClosure) {
                HashMap<String, SValue> map = (HashMap<String, SValue>) (_start instanceof SDict ?
                        _start.get() : ((SClosure) _start).extra);
                ListEx<SValue> ret = new ListEx<SValue>(map.size());

                for (String s : map.keySet()) {
                    ret.add(new SString(s));
                }

                return new SList(ret);
            }
        }

        return ExecEnvironment.Null;
    }

    @Override
    public SExpression deepClone() {
        SERange ret = new SERange();
        ret.atom = this.atom;
        ret.start = this.start.deepClone();

        if (this.interval != null)
            ret.interval = this.interval.deepClone();

        if (this.end != null)
            ret.end = this.end.deepClone();

        return ret;
    }
}
