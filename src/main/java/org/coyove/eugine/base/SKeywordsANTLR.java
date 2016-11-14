package org.coyove.eugine.base;

import org.antlr.v4.runtime.Token;
import org.coyove.eugine.core.*;
import org.coyove.eugine.library.*;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.parser.Compound;
import org.coyove.eugine.util.List;
import org.coyove.eugine.util.VMException;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/12.
 */
public class SKeywordsANTLR {
    public interface CallableKeyword {
        SExpression call(Token tok, List<SExpression> arguments);
    }

    public static HashMap<String, CallableKeyword> KeywordsLookup =
            new HashMap<String, CallableKeyword>() {{
                put("print", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SEPrint(new Atom(tok), arguments, "");
                    }
                });
                put("println", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SEPrint(new Atom(tok), arguments, "\n");
                    }
                });
                put("*", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SEElemArith(new Atom(tok), arguments, SEElemArith.ACTION.MULTIPLY);
                    }
                });
                put("-", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SEElemArith(new Atom(tok), arguments, SEElemArith.ACTION.SUBTRACT);
                    }
                });
                put("/", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SEElemArith(new Atom(tok), arguments, SEElemArith.ACTION.DIVIDE);
                    }
                });
                put("%", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SEElemArith(new Atom(tok), arguments, SEElemArith.ACTION.MODULAR);
                    }
                });
                put("+", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SEAdd(new Atom(tok), arguments, false);
                    }
                });
                put("+.", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SEAdd(new Atom(tok), arguments, true);
                    }
                });
                put("==", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SECompare(new Atom(tok), arguments, "==");
                    }
                });
                put("!=", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SECompare(new Atom(tok), arguments, "!=");
                    }
                });
                put(">", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SECompare(new Atom(tok), arguments, ">");
                    }
                });
                put("<", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SECompare(new Atom(tok), arguments, "<");
                    }
                });
                put("<=", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SECompare(new Atom(tok), arguments, "<=");
                    }
                });
                put(">=", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SECompare(new Atom(tok), arguments, ">=");
                    }
                });
                put("&&", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SELogic(new Atom(tok), arguments, SELogic.LOGIC.AND);
                    }
                });
                put("||", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SELogic(new Atom(tok), arguments, SELogic.LOGIC.OR);
                    }
                });
                put("!", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SELogic(new Atom(tok), arguments, SELogic.LOGIC.NOT);
                    }
                });
                put("reverse", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SEReverse(new Atom(tok), arguments);
                    }
                });
                put("irange", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SEIRange(new Atom(tok), arguments);
                    }
                });
                put("exit", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SEExit(new Atom(tok), arguments);
                    }
                });
                put("trim", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SETrim(new Atom(tok), arguments);
                    }
                });
                put("len", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SELen(new Atom(tok), arguments);
                    }
                });
                put("num", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SENum(new Atom(tok), arguments);
                    }
                });
                put("readFile", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.OPEN_TEXT);
                    }
                });
                put("readLines", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.OPEN_LINES);
                    }
                });
                put("readBinary", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.OPEN_BINARY);
                    }
                });
                put("sin", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.SIN);
                    }
                });
                put("cos", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.COS);
                    }
                });
                put("tan", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.TAN);
                    }
                });
                put("abs", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.ABS);
                    }
                });
                put("asin", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.ASIN);
                    }
                });
                put("acos", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.ACOS);
                    }
                });
                put("atan", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.ATAN);
                    }
                });
                put("sqrt", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.SQRT);
                    }
                });
                put("sgn", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.SGN);
                    }
                });
                put("pow", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.POW);
                    }
                });
                put("time", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.TIME);
                    }
                });
                put("utcTime", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.UTC_TIME);
                    }
                });
                put("sha", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.SHA);
                    }
                });
                put("round", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.ROUND);
                    }
                });
                put("floor", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.FLOOR);
                    }
                });
                put("random", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.RANDOM);
                    }
                });
                put("buffer", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SEBytesBuffer(new Atom(tok), c);
                    }
                });
                put("match", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SERegexMatch(new Atom(tok), c);
                    }
                });
                put("split", new CallableKeyword() {
                    public SExpression call(Token tok, List<SExpression> c) {
                        return new SESplit(new Atom(tok), c);
                    }
                });
            }};
}
