package org.coyove.eugine.builtin;

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
        double n = EgCast.toDouble(arg, atom);

        switch (func) {
            case SIN:
                return new SNumber(Math.sin(n));
            case COS:
                return new SNumber(Math.cos(n));
            case TAN:
                return new SNumber(Math.tan(n));
            case ASIN:
                return new SNumber(Math.asin(n));
            case ACOS:
                return new SNumber(Math.acos(n));
            case ATAN:
                return new SNumber(Math.atan(n));
            case ROUND:
                return new SNumber(Math.round(n));
            case FLOOR:
                return new SNumber(Math.floor(n));
            case ABS:
                return new SNumber(Math.abs(n));
            case SGN:
                return new SNumber(Math.signum(n));
            case SQRT:
                return new SNumber(Math.sqrt(n));
            case POW:
                double p = EgCast.toDouble(argument2.evaluate(env), atom);
                return new SNumber(Math.pow(n, p));
            case RANDOM:
                if (n != 0) {
                    Random rand = new Random((long) n);
                    return new SNumber(rand.nextDouble());
                } else {
                    return new SNumber(defaultRandom.nextDouble());
                }
            default:
                // never happen
                return null;
        }
    }

    @Override
    public SExpression deepClone() {
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
