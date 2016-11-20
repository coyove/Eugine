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

    public boolean expanded = false;

    private ACTION action;

    public enum ACTION {EXPANDED, ADD, SUBTRACT, MULTIPLY, DIVIDE, MODULAR}

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
                    return new SInteger(((SInteger) left).val() - Utils.castLong(right, atom));
                } else if (left instanceof SDouble) {
                    return new SDouble(((SDouble) left).val() - Utils.castDouble(right, atom));
                } else {
                    throw new EgException(7040, "invalid number: " + left, atom);
                }
            case MULTIPLY:
                if (left instanceof SInteger) {
                    return new SInteger(((SInteger) left).val() * Utils.castLong(right, atom));
                } else if (left instanceof SDouble) {
                    return new SDouble(((SDouble) left).val() * Utils.castDouble(right, atom));
                } else {
                    throw new EgException(7040, "invalid number: " + left, atom);
                }
            case DIVIDE:
                if (left instanceof SInteger) {
                    Long lr = Utils.castLong(right, atom);
                    if (lr == 0) {
                        throw new EgException(7041, "divided by zero", atom);
                    } else {
                        return new SInteger(((SInteger) left).val() / lr);
                    }
                } else if (left instanceof SDouble) {
                    Double dr = Utils.castDouble(right, atom);
                    if (Math.abs(dr) < 1e-6) {
                        throw new EgException(7041, "divided by zero", atom);
                    } else {
                        return new SDouble(((SDouble) left).val() / dr);
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
                        return new SInteger(((SInteger) left).val() % lr);
                    }
                } else if (left instanceof SDouble) {
                    Double dr = Utils.castDouble(right, atom);
                    if (Math.abs(dr) < 1e-6) {
                        throw new EgException(7041, "moded by zero", atom);
                    } else {
                        return new SDouble(((SDouble) left).val() % dr);
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
//        if (expanded) {
//            return MathOpStack.eval(this.stack, env, atom);
//        }

        if (this.left instanceof PVariable && this.right instanceof PVariable) {
            if (((PVariable) this.left).varName.equals(((PVariable) this.right).varName)) {
                SValue left = this.left.evaluate(env);
                if (action == ACTION.MULTIPLY) {
                    if (stack[0] == null) {
                        stack[0] = stack[1] = this.left;
                        stack[2] = ACTION.MULTIPLY;
                    }

                    if (left instanceof SInteger) {
                        long v = ((SInteger) left).val();
                        return new SInteger(v * v);
                    } else if (left instanceof SDouble) {
                        double v = ((SDouble) left).val();
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

//        if (stack[0] == null) {
//            pushStack(stack, this.left, this.right, action);
//        }

        return ret;
    }

//    public static void pushStack(Object[] stack, SExpression left, SExpression right, ACTION action) {
//        if (left instanceof SInteger) {
//            stack[0] = ((SInteger) left).underlying;
//        } else if (left instanceof SDouble) {
//            stack[0] = ((SDouble) left).underlying;
//        } else {
//            stack[0] = left;
//        }
//
//        if (right instanceof SInteger) {
//            stack[1] = ((SInteger) right).underlying;
//            if (stack[0] instanceof Double) {
//                stack[1] = ((Long) stack[1]).doubleValue();
//            }
//        } else if (right instanceof SDouble) {
//            stack[1] = ((SDouble) right).underlying;
//            if (stack[0] instanceof Long) {
//                stack[1] = ((Double) stack[1]).longValue();
//            }
//        } else {
//            stack[1] = right;
//        }
//
//        stack[2] = action;
//    }

    public static Object[] copyStack(Object[] from) throws EgException {
        Object[] ret = new Object[3];

        if (from[0] != null) {
            ret = new Object[from.length];
            for (int i = 0; i < from.length; i++) {
                if (from[i] instanceof SExpression) {
                    ret[i] = ((SExpression) from[i]).deepClone();
                } else {
                    ret[i] = from[i];
                }
            }
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
        ret.stack = copyStack(this.stack);
        ret.expanded = this.expanded;

        return ret;
    }
}
