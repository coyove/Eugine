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
    private SExpression argument;
    private SExpression argument2;
    private OPERATION func;
    private static Random defaultRandom = new Random(new Date().getTime());

    public enum OPERATION { SIN, COS, TAN, ASIN, ACOS, ATAN, ROUND, FLOOR, ABS, SGN, SQRT, RANDOM, TIME, POW }

    public SEMath(Atom ha, Compound c, OPERATION f) throws VMException {
        super(ha, c, 1);

        argument = SExpression.cast(c.atoms.pop());
        if (c.atoms.size() > 0)
            argument2 = SExpression.cast(c.atoms.pop());

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
                return new SInteger((long)Math.floor(n));
            case ABS:
                return new SDouble(Math.abs(n));
            case SGN:
                return new SInteger((long)Math.signum(n));
            case SQRT:
                return new SDouble(Math.sqrt(n));
            case POW:
                double p = Utils.getDouble(argument2.evaluate(env), headAtom);
                return new SDouble(Math.pow(n, p));
            case RANDOM:
                if (n != 0) {
                    Random rand = new Random((long)n);
                    return new SDouble(rand.nextDouble());
                } else {
                    return new SDouble(defaultRandom.nextDouble());
                }
            case TIME:
                return new SDouble((new Date()).getTime() / n);
            default:
                throw new VMException(3007, "not implemented", headAtom);
        }
    }

}
