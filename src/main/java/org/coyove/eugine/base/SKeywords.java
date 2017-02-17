package org.coyove.eugine.base;

import org.antlr.v4.runtime.Token;
import org.coyove.eugine.core.*;
import org.coyove.eugine.core.math.PCompare;
import org.coyove.eugine.library.*;
import org.coyove.eugine.library.image.SEPbmWriter;
import org.coyove.eugine.library.json.SEJsonDecoder;
import org.coyove.eugine.library.json.SEJsonEncoder;
import org.coyove.eugine.library.math.SEBitOp;
import org.coyove.eugine.library.math.SEMath;
import org.coyove.eugine.library.meta.SEMeta;
import org.coyove.eugine.library.string.*;
import org.coyove.eugine.library.system.*;
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
                put("System.exec", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SECommand(new Atom(tok), arguments, false);
                    }
                });
                put("System.execa", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SECommand(new Atom(tok), arguments, true);
                    }
                });
                put("System.dup", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEDuplicate(new Atom(tok), arguments);
                    }
                });
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
                put("typeof", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEType(new Atom(tok), arguments);
                    }
                });
                put("Log.debug", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SELog(new Atom(tok), arguments, SELog.DEBUG);
                    }
                });
                put("Log.info", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SELog(new Atom(tok), arguments, SELog.INFO);
                    }
                });
                put("Log.warn", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SELog(new Atom(tok), arguments, SELog.WARN);
                    }
                });
                put("Log.error", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SELog(new Atom(tok), arguments, SELog.ERROR);
                    }
                });
                put("Log.level", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SELog(new Atom(tok), arguments, SELog.SET_LEVEL);
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
                        return new SENum(new Atom(tok), arguments, SENum.NUM);
                    }
                });
                put("int", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SENum(new Atom(tok), arguments, SENum.INT);
                    }
                });
                put("long", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SENum(new Atom(tok), arguments, SENum.LONG);
                    }
                });
                put("double", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SENum(new Atom(tok), arguments, SENum.DOUBLE);
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
                put("File.writeBinary", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.WRITE_BINARY);
                    }
                });
                put("File.delete", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.DELETE);
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
                        return new SEMath(new Atom(tok), c, SEMath.SIN);
                    }
                });
                put("Math.cos", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.COS);
                    }
                });
                put("Math.tan", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.TAN);
                    }
                });
                put("Math.abs", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.ABS);
                    }
                });
                put("Math.asin", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.ASIN);
                    }
                });
                put("Math.acos", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.ACOS);
                    }
                });
                put("Math.atan", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.ATAN);
                    }
                });
                put("Math.sqrt", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.SQRT);
                    }
                });
                put("Math.sgn", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.SGN);
                    }
                });
                put("Math.pow", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.POW);
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
                        return new SEMath(new Atom(tok), c, SEMath.ROUND);
                    }
                });
                put("Math.floor", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.FLOOR);
                    }
                });
                put("Math.random", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.RANDOM);
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
                        return new SESplit(new Atom(tok), c, false);
                    }
                });
                put("String.splitRaw", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SESplit(new Atom(tok), c, true);
                    }
                });
                put("String.join", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEJoin(new Atom(tok), c);
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
                put("wait", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEWait(new Atom(tok), c);
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
                        return new SEListOp(new Atom(tok), c, SEListOp.HEAD);
                    }
                });
                put("List.tailOf", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.TAIL);
                    }
                });
                put("List.initOf", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.INIT);
                    }
                });
                put("List.lastOf", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.LAST);
                    }
                });
                put("List.sort", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.SORT);
                    }
                });
                put("List.insert", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.INSERT);
                    }
                });
                put("List.concat", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.CONCAT);
                    }
                });
                put("List.filter", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.FILTER);
                    }
                });
                put("Bit.and", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEBitOp(new Atom(tok), c, SEBitOp.AND);
                    }
                });
                put("Bit.or", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEBitOp(new Atom(tok), c, SEBitOp.OR);
                    }
                });
                put("Bit.xor", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEBitOp(new Atom(tok), c, SEBitOp.XOR);
                    }
                });
                put("Bit.not", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEBitOp(new Atom(tok), c, SEBitOp.NOT);
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
                put("Pbm.write", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEPbmWriter(new Atom(tok), c);
                    }
                });
                put("Meta.add", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMeta(new Atom(tok), c, SEMeta.ADD);
                    }
                });
                put("Meta.set", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMeta(new Atom(tok), c, SEMeta.SET);
                    }
                });
                put("Meta.remove", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMeta(new Atom(tok), c, SEMeta.REMOVE);
                    }
                });
                put("Meta.get", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMeta(new Atom(tok), c, SEMeta.GET);
                    }
                });
                put("Meta.body", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMeta(new Atom(tok), c, SEMeta.BODY);
                    }
                });
            }};
}
