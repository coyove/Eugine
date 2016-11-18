package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by coyove on 2016/9/10.
 */
public class PMath extends SExpression {
    private SExpression left;
    private SExpression right;
    private ACTION action;

    public enum ACTION {SUBTRACT, MULTIPLY, DIVIDE, MODULAR}

    public PMath() {}

    public PMath(Atom ha, ListEx<SExpression> args, ACTION a) {
        super(ha, args, 2);

        action = a;
        left = args.get(0);
        right = args.get(1);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue left = this.left.evaluate(env);
        SValue right = this.right.evaluate(env);

        switch (action) {
            case SUBTRACT:
                if (left instanceof SInteger) {
                    return new SInteger(left.<Long>get() - Utils.castLong(right, atom));
                } else if (left instanceof SDouble) {
                    return new SDouble(left.<Double>get() - Utils.castDouble(right, atom));
                } else {
                    throw new EgException(7040, "invalid number: " + left, atom);
                }
            case MULTIPLY:
                if (left instanceof SInteger) {
                    return new SInteger(left.<Long>get() * Utils.castLong(right, atom));
                } else if (left instanceof SDouble) {
                    return new SDouble(left.<Double>get() * Utils.castDouble(right, atom));
                } else {
                    throw new EgException(7040, "invalid number: " + left, atom);
                }
            case DIVIDE:
                if (left instanceof SInteger) {
                    Long lr = Utils.castLong(right, atom);
                    if (lr == 0) {
                        throw new EgException(7041, "divided by zero", atom);
                    } else {
                        return new SInteger(left.<Long>get() / lr);
                    }
                } else if (left instanceof SDouble) {
                    return new SDouble(left.<Double>get() / Utils.castDouble(right, atom));
                } else {
                    throw new EgException(7040, "invalid number: " + left, atom);
                }
            case MODULAR:
                if (left instanceof SInteger) {
                    return new SInteger(left.<Long>get() % Utils.castLong(right, atom));
                } else if (left instanceof SDouble) {
                    return new SDouble(left.<Double>get() % Utils.castDouble(right, atom));
                } else {
                    throw new EgException(7040, "invalid number: " + left, atom);
                }
            default:
                // never happen
                return null;
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        PMath ret = new PMath();
        ret.atom = this.atom;

        ret.action = this.action;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();

        return ret;
    }
}
