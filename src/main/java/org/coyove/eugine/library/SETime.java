package org.coyove.eugine.library;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.Date;
import java.util.Locale;

/**
 * Created by coyove on 2016/9/10.
 */
public class SETime extends SExpression {
    @ReplaceableVariable
    private SExpression argument;

    @ReplaceableVariable
    private SExpression argument2;

    private OPERATION func;
    public enum OPERATION {TIME, UTC_TIME, FORMAT_TIME}

    public SETime() {
    }

    public SETime(Atom ha, ListEx<SExpression> args, OPERATION f) {
        super(ha, args, f == OPERATION.FORMAT_TIME ? 2 : 1);

        argument = args.head();
        if (args.size() > 1) {
            argument2 = args.get(1);
        }

        func = f;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue arg = argument.evaluate(env);

        switch (func) {
            case TIME:
                long div = Utils.castLong(arg, atom);
                if (div == 0) {
                    div++;
                }

                return new SLong(new Date().getTime() / div);
            case UTC_TIME:
                return new SString(DateFormatUtils.formatUTC(Utils.castLong(arg, atom),
                        "EEE, dd MMM yyyy HH:mm:ss zzz", new Locale("us")));
            case FORMAT_TIME:
                long millis = Utils.castLong(arg, atom);
                String format = Utils.cast(argument2.evaluate(env), SString.class,
                        new EgException(7034, "invalid time format", atom)).get();

                return new SString(DateFormatUtils.formatUTC(millis, format, new Locale("us")));
            default:
                throw new EgException(3007, "not implemented", atom);
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        SETime ret = new SETime();
        ret.atom = this.atom;

        ret.argument = this.argument.deepClone();
        if (this.argument2 != null) {
            ret.argument2 = this.argument2.deepClone();
        }
        ret.func = this.func;

        return ret;
    }
}
