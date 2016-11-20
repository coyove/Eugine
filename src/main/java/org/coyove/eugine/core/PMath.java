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
    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right;

    public Object[] stack = new Object[3];

    private ACTION action;

    public enum ACTION {ADD, SUBTRACT, MULTIPLY, DIVIDE, MODULAR}

    public PMath() {}

    public PMath(Atom ha, ListEx<SExpression> args, ACTION a) {
        super(ha, args, 2);

        action = a;
        left = args.get(0);
        right = args.get(1);
    }

    public SValue perform(SValue left, SValue right) throws EgException {
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
                    Double dr = Utils.castDouble(right, atom);
                    if (Math.abs(dr) < 1e-6) {
                        throw new EgException(7041, "divided by zero", atom);
                    } else {
                        return new SDouble(left.<Double>get() / dr);
                    }
                } else {
                    throw new EgException(7040, "invalid number: " + left, atom);
                }
            case MODULAR:
                if (left instanceof SInteger) {
                    Long lr = Utils.castLong(right, atom);
                    if (lr == 0) {
                        throw new EgException(7041, "moded by zero", atom);
                    } else {
                        return new SInteger(left.<Long>get() % lr);
                    }
                } else if (left instanceof SDouble) {
                    Double dr = Utils.castDouble(right, atom);
                    if (Math.abs(dr) < 1e-6) {
                        throw new EgException(7041, "moded by zero", atom);
                    } else {
                        return new SDouble(left.<Double>get() % dr);
                    }
                } else {
                    throw new EgException(7040, "invalid number: " + left, atom);
                }
            default:
                // never happen
                return null;
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        if (this.left instanceof PVariable && this.right instanceof PVariable) {
            if (((PVariable) this.left).varName.equals(((PVariable) this.right).varName)) {
                SValue left = this.left.evaluate(env);
                if (action == ACTION.MULTIPLY) {
                    if (stack[0] == null) {
                        stack[0] = stack[1] = ((PVariable) this.left).varName;
                        stack[2] = ACTION.MULTIPLY;
                    }

                    if (left instanceof SInteger) {
                        Long v = left.get();
                        return new SInteger(v * v);
                    } else if (left instanceof SDouble) {
                        Double v = left.get();
                        return new SDouble(v * v);
                    } else {
                        throw new EgException(7040, "invalid number: " + left, atom);
                    }
                }

                // basically you should write something like x - x, x / x or x % x
            }
        }

        SValue left = this.left.evaluate(env);
        SValue right = this.right.evaluate(env);
        SValue ret = perform(left, right);

        if (stack[0] == null) {
            if (this.left instanceof SInteger) {
                stack[0] = ((SInteger) this.left).underlying;
            } else if (this.left instanceof SDouble) {
                stack[0] = ((SDouble) this.left).underlying;
            } else {
                stack[0] = this.left;
            }

            if (this.right instanceof SInteger) {
                stack[1] = ((SInteger) this.right).underlying;
                if (stack[0] instanceof Double) {
                    stack[1] = ((Long) stack[1]).doubleValue();
                }
            } else if (this.right instanceof SDouble) {
                stack[1] = ((SDouble) this.right).underlying;
                if (stack[0] instanceof Long) {
                    stack[1] = ((Double) stack[1]).longValue();
                }
            } else {
                stack[1] = this.right;
            }

            stack[2] = action;
        }

        return ret;
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
