package org.coyove.eugine.util;

import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.core.PAdd;
import org.coyove.eugine.core.PMath;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.value.SDouble;
import org.coyove.eugine.value.SInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by coyove on 2016/11/20.
 */
public class MathOpStack {
    public static SValue eval(Object[] stack, ExecEnvironment env, Atom atom) throws EgException {
        Object[] evalStack = new Object[stack.length / 3 + 3];
        int pointer = 0;

        for (int i = 0; i < stack.length; i++) {
            Object o = stack[i];

            if (o instanceof SExpression) {
                SValue v = ((SExpression) o).evaluate(env);
                if (v instanceof SInteger) {
                    evalStack[pointer++] = ((SInteger) v).val();
                } else if (v instanceof SDouble) {
                    evalStack[pointer++] = ((SDouble) v).val();
                } else {
                    throw new EgException(9087, "invalid number", atom);
                }
            } else if (o instanceof Long || o instanceof Double) {
                evalStack[pointer++] = o;
            } else {
                PMath.ACTION action = ((PMath.ACTION) o);
                int li = pointer - 2;
                int ri = pointer - 1;
                Object left = evalStack[li];
                Object right = evalStack[ri];
                Object result = null;

                switch (action) {
                    case ADD:
                        if (left instanceof Long && right instanceof Long) {
                            result = ((Long) left) + ((Long) right);
                        } else if (left instanceof Long && right instanceof Double) {
                            result = ((Long) left) + ((Double) right);
                        } else if (left instanceof Double && right instanceof Long) {
                            result = ((Double) left) + ((Long) right);
                        } else if (left instanceof Double && right instanceof Double) {
                            result = ((Double) left) + ((Double) right);
                        }
                        break;
                    case SUBTRACT:
                        if (left instanceof Long && right instanceof Long) {
                            result = ((Long) left) - ((Long) right);
                        } else if (left instanceof Long && right instanceof Double) {
                            result = ((Long) left) - ((Double) right);
                        } else if (left instanceof Double && right instanceof Long) {
                            result = ((Double) left) - ((Long) right);
                        } else if (left instanceof Double && right instanceof Double) {
                            result = ((Double) left) - ((Double) right);
                        }
                        break;
                    case MULTIPLY:
                        if (left instanceof Long && right instanceof Long) {
                            result = ((Long) left) * ((Long) right);
                        } else if (left instanceof Long && right instanceof Double) {
                            result = ((Long) left) * ((Double) right);
                        } else if (left instanceof Double && right instanceof Long) {
                            result = ((Double) left) * ((Long) right);
                        } else if (left instanceof Double && right instanceof Double) {
                            result = ((Double) left) * ((Double) right);
                        }
                        break;
                    case DIVIDE:
                        if (left instanceof Long && right instanceof Long) {
                            result = ((Long) left) / ((Long) right);
                        } else if (left instanceof Long && right instanceof Double) {
                            result = ((Long) left) / ((Double) right);
                        } else if (left instanceof Double && right instanceof Long) {
                            result = ((Double) left) / ((Long) right);
                        } else if (left instanceof Double && right instanceof Double) {
                            result = ((Double) left) / ((Double) right);
                        }
                        break;
                    case MODULAR:
                        if (left instanceof Long && right instanceof Long) {
                            result = ((Long) left) % ((Long) right);
                        } else if (left instanceof Long && right instanceof Double) {
                            result = ((Long) left) % ((Double) right);
                        } else if (left instanceof Double && right instanceof Long) {
                            result = ((Double) left) % ((Long) right);
                        } else if (left instanceof Double && right instanceof Double) {
                            result = ((Double) left) % ((Double) right);
                        }
                        break;
                }

                pointer--;
                evalStack[li] = result;
            }
        }

        Object ret = evalStack[0];
        if (ret instanceof Long) {
            return new SInteger(((Long) ret));
        } else if (ret instanceof Double) {
            return new SDouble(((Double) ret));
        } else {
            throw new EgException(9086, "failed to do math", atom);
        }
    }

    public static Object[] expand(SExpression expr, boolean top) throws EgException {
        Object[] stack;
        if (expr instanceof PMath) {
            stack = ((PMath) expr).stack;
            if (((PMath) expr).expanded) {
                return stack;
            }
        } else if (expr instanceof PAdd) {
            stack = ((PAdd) expr).stack;
            if (((PAdd) expr).expanded) {
                return stack;
            }
        } else {
            return new Object[]{expr};
        }

        if (stack[0] == null) {
            throw new EgException(8098, "the stack is not filled");
        }

        List<Object> tmp = new ArrayList(Arrays.asList(stack));

        Object right = tmp.get(1);
        if (right instanceof SExpression) {
            tmp.remove(1);
            tmp.addAll(1, Arrays.asList(expand((SExpression) right, false)));
        }

        Object left = tmp.get(0);
        if (left instanceof SExpression) {
            tmp.remove(0);
            tmp.addAll(0, Arrays.asList(expand((SExpression) left, false)));
        }

        stack = tmp.toArray();
        if (expr instanceof PMath) {
            ((PMath) expr).stack = stack;
            ((PMath) expr).expanded = top;
        } else if (expr instanceof PAdd) {
            ((PAdd) expr).stack = stack;
            ((PAdd) expr).expanded = true;
        }

        return stack;
    }
}
