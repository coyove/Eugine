package org.coyove.eugine.base;

import org.antlr.v4.runtime.Token;
import org.coyove.eugine.core.*;
import org.coyove.eugine.library.*;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.ListEx;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/12.
 */
public class SKeywords {
    public interface CallableKeyword {
        SExpression call(Token tok, ListEx<SExpression> arguments);
    }

    public static HashMap<String, CallableKeyword> Lookup =
            new HashMap<String, CallableKeyword>() {{
                put("print", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEPrint(new Atom(tok), arguments, "");
                    }
                });
                put("println", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEPrint(new Atom(tok), arguments, "\n");
                    }
                });
                put("*", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new PMath(new Atom(tok), arguments, PMath.ACTION.MULTIPLY);
                    }
                });
                put("-", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new PMath(new Atom(tok), arguments, PMath.ACTION.SUBTRACT);
                    }
                });
                put("/", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new PMath(new Atom(tok), arguments, PMath.ACTION.DIVIDE);
                    }
                });
                put("%", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new PMath(new Atom(tok), arguments, PMath.ACTION.MODULAR);
                    }
                });
                put("+", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new PAdd(new Atom(tok), arguments, false);
                    }
                });
                put("<+", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new PAdd(new Atom(tok), arguments, true);
                    }
                });
                put("==", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new PCompare(new Atom(tok), arguments, "==");
                    }
                });
                put("!=", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new PCompare(new Atom(tok), arguments, "!=");
                    }
                });
                put(">", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new PCompare(new Atom(tok), arguments, ">");
                    }
                });
                put("<", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new PCompare(new Atom(tok), arguments, "<");
                    }
                });
                put("<=", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new PCompare(new Atom(tok), arguments, "<=");
                    }
                });
                put(">=", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new PCompare(new Atom(tok), arguments, ">=");
                    }
                });
                put("&&", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new PLogic(new Atom(tok), arguments, PLogic.LOGIC.AND);
                    }
                });
                put("||", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new PLogic(new Atom(tok), arguments, PLogic.LOGIC.OR);
                    }
                });
                put("!", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new PLogic(new Atom(tok), arguments, PLogic.LOGIC.NOT);
                    }
                });
                put("reverse", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEReverse(new Atom(tok), arguments);
                    }
                });
                put("irange", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new PIRange(new Atom(tok), arguments);
                    }
                });
                put("range", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SERange(new Atom(tok), arguments);
                    }
                });
                put("exit", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEExit(new Atom(tok), arguments);
                    }
                });
                put("eval", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEEval(new Atom(tok), arguments);
                    }
                });
                put("String.trim", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SETrim(new Atom(tok), arguments);
                    }
                });
                put("len", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SELen(new Atom(tok), arguments);
                    }
                });
                put("num", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SENum(new Atom(tok), arguments);
                    }
                });
                put("str", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEStr(new Atom(tok), arguments);
                    }
                });
                put("keys", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEKeys(new Atom(tok), arguments);
                    }
                });
                put("del", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEDel(new Atom(tok), arguments);
                    }
                });
                put("asc", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEChar(new Atom(tok), arguments, SEChar.CONVERT.ASC);
                    }
                });
                put("chr", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEChar(new Atom(tok), arguments, SEChar.CONVERT.CHR);
                    }
                });
                put("File.read", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.OPEN_TEXT);
                    }
                });
                put("File.readLines", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.OPEN_LINES);
                    }
                });
                put("File.readBinary", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.OPEN_BINARY);
                    }
                });
                put("File.write", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.WRITE);
                    }
                });
                put("File.append", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.APPEND);
                    }
                });
                put("File.exists", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.EXISTS);
                    }
                });
                put("Math.sin", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.SIN);
                    }
                });
                put("Math.cos", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.COS);
                    }
                });
                put("Math.tan", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.TAN);
                    }
                });
                put("Math.abs", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.ABS);
                    }
                });
                put("Math.asin", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.ASIN);
                    }
                });
                put("Math.acos", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.ACOS);
                    }
                });
                put("Math.atan", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.ATAN);
                    }
                });
                put("Math.sqrt", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.SQRT);
                    }
                });
                put("Math.sgn", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.SGN);
                    }
                });
                put("Math.pow", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.POW);
                    }
                });
                put("Time.unix", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SETime(new Atom(tok), c, SETime.OPERATION.TIME);
                    }
                });
                put("Time.format", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SETime(new Atom(tok), c, SETime.OPERATION.FORMAT_TIME);
                    }
                });
                put("Time.utcFormat", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SETime(new Atom(tok), c, SETime.OPERATION.UTC_TIME);
                    }
                });
                put("Math.round", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.ROUND);
                    }
                });
                put("Math.floor", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.FLOOR);
                    }
                });
                put("Math.random", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.OPERATION.RANDOM);
                    }
                });
                put("buffer", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEBytesBuffer(new Atom(tok), c);
                    }
                });
                put("String.match", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SERegexMatch(new Atom(tok), c);
                    }
                });
                put("String.split", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SESplit(new Atom(tok), c);
                    }
                });
                put("String.replace", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEReplace(new Atom(tok), c, SEReplace.OPERATION.NORMAL);
                    }
                });
                put("String.regexReplace", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEReplace(new Atom(tok), c, SEReplace.OPERATION.REGEX);
                    }
                });
                put("sleep", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SESleep(new Atom(tok), c);
                    }
                });
                put("contains", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEContains(new Atom(tok), c);
                    }
                });

                put("Digest.SHA1", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEDigest(new Atom(tok), c, SEDigest.ALGORITHM.SHA1, SEDigest.RETURN.BYTES);
                    }
                });
                put("Digest.SHA256", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEDigest(new Atom(tok), c, SEDigest.ALGORITHM.SHA256, SEDigest.RETURN.BYTES);
                    }
                });
                put("Digest.MD5", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEDigest(new Atom(tok), c, SEDigest.ALGORITHM.MD5, SEDigest.RETURN.BYTES);
                    }
                });
                put("Digest.hexSHA1", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEDigest(new Atom(tok), c, SEDigest.ALGORITHM.SHA1, SEDigest.RETURN.STRING);
                    }
                });
                put("Digest.hexSHA256", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEDigest(new Atom(tok), c, SEDigest.ALGORITHM.SHA256, SEDigest.RETURN.STRING);
                    }
                });
                put("Digest.hexMD5", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEDigest(new Atom(tok), c, SEDigest.ALGORITHM.MD5, SEDigest.RETURN.STRING);
                    }
                });
                put("List.headOf", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.OPERATION.HEAD);
                    }
                });
                put("List.tailOf", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.OPERATION.TAIL);
                    }
                });
                put("List.initOf", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.OPERATION.INIT);
                    }
                });
                put("List.lastOf", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.OPERATION.LAST);
                    }
                });
                put("List.sort", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.OPERATION.SORT);
                    }
                });
                put("List.insert", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.OPERATION.INSERT);
                    }
                });
                put("Bit.and", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEBitOp(new Atom(tok), c, SEBitOp.OPERATION.AND);
                    }
                });
                put("Bit.or", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEBitOp(new Atom(tok), c, SEBitOp.OPERATION.OR);
                    }
                });
                put("Bit.not", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEBitOp(new Atom(tok), c, SEBitOp.OPERATION.NOT);
                    }
                });
                put("Json.encode", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEJsonEncoder(new Atom(tok), c);
                    }
                });
                put("Json.decode", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEJsonDecoder(new Atom(tok), c);
                    }
                });
            }};
}
