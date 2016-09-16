package org.coyove.eugine.base;

import org.coyove.eugine.core.*;
import org.coyove.eugine.library.*;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.parser.Compound;
import org.coyove.eugine.util.VMException;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/12.
 */
public class SKeywords {
    public interface CallableKeyword {
        SExpression call(Atom ha, Compound c) throws VMException;
    }

    public static HashMap<String, CallableKeyword> KeywordsLookup =
            new HashMap<String, CallableKeyword>() {{
                put("exit", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEExit(ha, c);
                    }
                });
                put("type", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEType(ha, c);
                    }
                });

                put("chain", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEChain(ha, c);
                    }
                });
                put("->", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEChain(ha, c);
                    }
                });
                put("eval", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEEval(ha, c);
                    }
                });
                put("print", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEPrint(ha, c, "");
                    }
                });
                put("println", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEPrint(ha, c, "\n");
                    }
                });
                put("set", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SESet(ha, c, SESet.DECLARE.SET, SESet.ACTION.MUTABLE);
                    }
                });
                put("var", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SESet(ha, c, SESet.DECLARE.DECLARE, SESet.ACTION.MUTABLE);
                    }
                });
                put("const", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SESet(ha, c, SESet.DECLARE.DECLARE, SESet.ACTION.IMMUTABLE);
                    }
                });
                put("=", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SESet(ha, c, SESet.DECLARE.SET, SESet.ACTION.MUTABLE);
                    }
                });
                put(":=", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SESet(ha, c, SESet.DECLARE.DECLARE, SESet.ACTION.MUTABLE);
                    }
                });
                put("clone", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEClone(ha, c);
                    }
                });
                put("get", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEGet(ha, c, false);
                    }
                });
                put(":", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEGet(ha, c, false);
                    }
                });
                put("::", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEGet(ha, c, true);
                    }
                });
                put("list", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEList(ha, c);
                    }
                });
                put("dict", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEDict(ha, c);
                    }
                });
                put("explode", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEExplode(ha, c);
                    }
                });
                put("lambda", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SELambda(ha, c);
                    }
                });
                put("=>", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SELambda(ha, c);
                    }
                });
                put("defun", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEDefun(ha, c);
                    }
                });
                put("if", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEIf(ha, c);
                    }
                });
                put("cond", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SECond(ha, c);
                    }
                });
                put("loop", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEFor(ha, c);
                    }
                });

                put("==", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SECompare(ha, c, "==");
                    }
                });
                put("eq", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SECompare(ha, c, "==");
                    }
                });
                put("!=", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SECompare(ha, c, "!=");
                    }
                });
                put("neq", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SECompare(ha, c, "!=");
                    }
                });
                put(">", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SECompare(ha, c, ">");
                    }
                });
                put("<", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SECompare(ha, c, "<");
                    }
                });
                put(">=", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SECompare(ha, c, ">=");
                    }
                });
                put("<=", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SECompare(ha, c, "<=");
                    }
                });

                put("+", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEAdd(ha, c, false);
                    }
                });
                put("+.", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEAdd(ha, c, true);
                    }
                });
                put("-", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEElemArith(ha, c, SEElemArith.ACTION.SUBTRACT);
                    }
                });
                put("*", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEElemArith(ha, c, SEElemArith.ACTION.MULTIPLY);
                    }
                });
                put("/", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEElemArith(ha, c, SEElemArith.ACTION.DIVIDE);
                    }
                });
                put("%", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEElemArith(ha, c, SEElemArith.ACTION.MODULAR);
                    }
                });

                put("+=", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SESelfOp(ha, c, "+");
                    }
                });
                put("-=", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SESelfOp(ha, c, "-");
                    }
                });
                put("*=", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SESelfOp(ha, c, "*");
                    }
                });
                put("/=", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SESelfOp(ha, c, "/");
                    }
                });

                put("++", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEIncDec(ha, c, true);
                    }
                });
                put("--", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEIncDec(ha, c, false);
                    }
                });

                put("&&", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SELogic(ha, c, SELogic.LOGIC.AND);
                    }
                });
                put("||", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SELogic(ha, c, SELogic.LOGIC.OR);
                    }
                });
                put("and", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SELogic(ha, c, SELogic.LOGIC.AND);
                    }
                });
                put("or", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SELogic(ha, c, SELogic.LOGIC.OR);
                    }
                });
                put("!", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SELogic(ha, c, SELogic.LOGIC.NOT);
                    }
                });
                put("not", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SELogic(ha, c, SELogic.LOGIC.NOT);
                    }
                });

                put("keys", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEKeys(ha, c);
                    }
                });
                put("len", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SELen(ha, c);
                    }
                });
                put("del", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEDel(ha, c);
                    }
                });

                put("sin", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEMath(ha, c, SEMath.OPERATION.SIN);
                    }
                });
                put("cos", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEMath(ha, c, SEMath.OPERATION.COS);
                    }
                });
                put("tan", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEMath(ha, c, SEMath.OPERATION.TAN);
                    }
                });
                put("abs", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEMath(ha, c, SEMath.OPERATION.ABS);
                    }
                });
                put("asin", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEMath(ha, c, SEMath.OPERATION.ASIN);
                    }
                });
                put("acos", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEMath(ha, c, SEMath.OPERATION.ACOS);
                    }
                });
                put("atan", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEMath(ha, c, SEMath.OPERATION.ATAN);
                    }
                });
                put("sqrt", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEMath(ha, c, SEMath.OPERATION.SQRT);
                    }
                });
                put("sgn", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEMath(ha, c, SEMath.OPERATION.SGN);
                    }
                });
                put("pow", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEMath(ha, c, SEMath.OPERATION.POW);
                    }
                });
                put("time", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEMath(ha, c, SEMath.OPERATION.TIME);
                    }
                });
                put("round", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEMath(ha, c, SEMath.OPERATION.ROUND);
                    }
                });
                put("floor", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEMath(ha, c, SEMath.OPERATION.FLOOR);
                    }
                });
                put("random", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEMath(ha, c, SEMath.OPERATION.RANDOM);
                    }
                });

                put("range", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SERange(ha, c);
                    }
                });
                put("head", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEListOp(ha, c, SEListOp.OPERATION.HEAD);
                    }
                });
                put("tail", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEListOp(ha, c, SEListOp.OPERATION.TAIL);
                    }
                });
                put("init", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEListOp(ha, c, SEListOp.OPERATION.INIT);
                    }
                });
                put("last", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEListOp(ha, c, SEListOp.OPERATION.LAST);
                    }
                });
                put("sub", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SESub(ha, c);
                    }
                });

                put("split", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SESplit(ha, c);
                    }
                });
                put("asc", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEChar(ha, c, SEChar.CONVERT.ASC);
                    }
                });
                put("chr", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEChar(ha, c, SEChar.CONVERT.CHR);
                    }
                });
                put("str", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEStr(ha, c);
                    }
                });
                put("num", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SENum(ha, c);
                    }
                });

                put(".", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEInteropMethod(ha, c);
                    }
                });
                put("cls", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEInteropClass(ha, c);
                    }
                });
                put("new", new CallableKeyword() {
                    public SExpression call(Atom ha, Compound c) throws VMException {
                        return new SEInteropNew(ha, c);
                    }
                });
            }};
}
