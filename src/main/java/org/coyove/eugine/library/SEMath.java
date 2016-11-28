package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.Date;
import java.util.Random;

/**
 * Created by coyove on 2016/9/10.
 */
public class SEMath extends SExpression {
    @ReplaceableVariable
    private SExpression argument;

    @ReplaceableVariable
    private SExpression argument2;

    private static Random defaultRandom = new Random(new Date().getTime());

    private byte func;

    public final static byte SIN = 0;
    public final static byte COS = 1;
    public final static byte TAN = 2;
    public final static byte ASIN = 3;
    public final static byte ACOS = 4;
    public final static byte ATAN = 5;
    public final static byte ROUND = 6;
    public final static byte FLOOR = 7;
    public final static byte ABS = 8;
    public final static byte SGN = 9;
    public final static byte SQRT = 10;
    public final static byte RANDOM = 11;
    public final static byte POW = 12;

    public SEMath() {
    }

    public SEMath(Atom ha, ListEx<SExpression> args, byte f) {
        super(ha, args, f == POW ? 2 : 1);

        argument = args.head();
        if (args.size() > 1) {
            argument2 = args.get(1);
        }

        func = f;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue arg = argument.evaluate(env);
        double n = Utils.castDouble(arg, atom);

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
                return new SLong(Math.round(n));
            case FLOOR:
                return new SLong((long) Math.floor(n));
            case ABS:
                return new SDouble(Math.abs(n));
            case SGN:
                return new SLong((long) Math.signum(n));
            case SQRT:
                return new SDouble(Math.sqrt(n));
            case POW:
                double p = Utils.castDouble(argument2.evaluate(env), atom);
                return new SDouble(Math.pow(n, p));
            case RANDOM:
                if (n != 0) {
                    Random rand = new Random((long) n);
                    return new SDouble(rand.nextDouble());
                } else {
                    return new SDouble(defaultRandom.nextDouble());
                }
            default:
                throw new EgException(3007, "not implemented", atom);
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        SEMath ret = new SEMath();
        ret.atom = this.atom;

        ret.argument = this.argument.deepClone();
        if (this.argument2 != null) {
            ret.argument2 = this.argument2.deepClone();
        }
        ret.func = this.func;

        return ret;
    }
}
