package org.coyove.eugine.library;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.security.MessageDigest;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEMath extends SExpression {
    private SExpression argument;
    private SExpression argument2;
    private static Random defaultRandom = new Random(new Date().getTime());

    private OPERATION func;

    public enum OPERATION {SIN, COS, TAN, ASIN, ACOS, ATAN,
        ROUND, FLOOR, ABS, SGN, SQRT, RANDOM, TIME, UTC_TIME, POW}

    public SEMath() {
    }

    public SEMath(Atom ha, List<SExpression> args, OPERATION f) {
        super(ha, args, 1);

        argument = args.head();
        if (args.size() > 1) {
            argument2 = args.get(1);
        }

        func = f;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue arg = argument.evaluate(env);
        double n = Utils.getDouble(arg, headAtom);

        switch (func) {
            case SIN:
                return new SDouble(Math.sin(n));
            case COS:
                return new SDouble(Math.cos(n));
            case TAN:
                return new SDouble(Math.tan(n));
            case ASIN:
                return new SDouble(Math.asin(n));
            case ACOS:
                return new SDouble(Math.acos(n));
            case ATAN:
                return new SDouble(Math.atan(n));
            case ROUND:
                return new SInteger(Math.round(n));
            case FLOOR:
                return new SInteger((long) Math.floor(n));
            case ABS:
                return new SDouble(Math.abs(n));
            case SGN:
                return new SInteger((long) Math.signum(n));
            case SQRT:
                return new SDouble(Math.sqrt(n));
            case POW:
                double p = Utils.getDouble(argument2.evaluate(env), headAtom);
                return new SDouble(Math.pow(n, p));
            case RANDOM:
                if (n != 0) {
                    Random rand = new Random((long) n);
                    return new SDouble(rand.nextDouble());
                } else {
                    return new SDouble(defaultRandom.nextDouble());
                }
            case TIME:
                return new SInteger((long) (new Date().getTime() / n));
            case UTC_TIME:
                return new SString(DateFormatUtils.formatUTC((long) n,
                        "EEE, dd MMM yyyy HH:mm:ss zzz", new Locale("us")));
            default:
                throw new VMException(3007, "not implemented", headAtom);
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEMath ret = new SEMath();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.argument = this.argument.deepClone();
        if (this.argument2 != null) {
            ret.argument2 = this.argument2.deepClone();
        }
        ret.func = this.func;

        return ret;
    }
}
