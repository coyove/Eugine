package org.coyove.eugine.base;

import org.antlr.v4.runtime.Token;
import org.coyove.eugine.builtin.*;
import org.coyove.eugine.builtin.SEMath;
import org.coyove.eugine.builtin.meta.SEMeta;
import org.coyove.eugine.builtin.string.*;
import org.coyove.eugine.builtin.system.*;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;
import org.coyove.eugine.value.SClosure;
import org.coyove.eugine.value.SDict;
import org.coyove.eugine.value.SString;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/12.
 */
public class SKeywords {
    public interface CallableKeyword {
        SExpression call(Token tok, ListEx<SExpression> arguments);
    }

    @SuppressWarnings("unchecked")
    public static class KeywordMap extends HashMap<String, CallableKeyword> {

        public CallableKeyword iput(String key, CallableKeyword value) {
            SClosure dummy = SClosure.makeEmptyClosure(ExecEnvironment.globalStaticEnv);
            dummy.doc = "'" + key + "' is a builtin function, use it by calling its full name.";
            dummy.body.add(new SEExit(null, ListEx.build(new SString("'" + key + "' is not assignable"))));

            if (key.contains(".")) {
                String[] parts = key.split("\\.");
                SValue _top = ExecEnvironment.globalStaticEnv.get(parts[0]);
                if (_top == null) {
                    _top = new SDict();
                    ExecEnvironment.globalStaticEnv.put(parts[0], _top);
                }

                if (_top instanceof SDict) {
                    SDict top = (SDict) _top;
                    for (int i = 1; i < parts.length - 1; i++) {
                        SDict tmp = (SDict) top.get(parts[i]);
                        if (tmp == null) {
                            tmp = new SDict();
                            top.put(parts[i], tmp);
                        }

                        top = tmp;
                    }

                    top.put(parts[parts.length - 1], dummy);
                }
            } else {
                ExecEnvironment.globalStaticEnv.put(key, dummy);
            }
            return super.put(key, value);
        }
    }

    public static KeywordMap Lookup = new KeywordMap() {{
                iput("print", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEPrint(new Atom(tok), arguments, "");
                    }
                });
                iput("println", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEPrint(new Atom(tok), arguments, "\n");
                    }
                });
                iput("typeof", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEType(new Atom(tok), arguments);
                    }
                });
                iput("range", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SERange(new Atom(tok), arguments);
                    }
                });
                iput("exit", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEExit(new Atom(tok), arguments);
                    }
                });
                iput("eval", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEEval(new Atom(tok), arguments);
                    }
                });
                iput("len", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SELen(new Atom(tok), arguments);
                    }
                });
                iput("num", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SENum(new Atom(tok), arguments);
                    }
                });
                iput("str", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEStr(new Atom(tok), arguments);
                    }
                });
                iput("del", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEDel(new Atom(tok), arguments);
                    }
                });
                iput("contains", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEContains(new Atom(tok), c);
                    }
                });
                iput("buffer", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEBuffer(new Atom(tok), c);
                    }
                });
                iput("reverse", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEReverse(new Atom(tok), arguments);
                    }
                });
                iput("keys", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEKeys(new Atom(tok), arguments);
                    }
                });
                iput("asc", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEChar(new Atom(tok), arguments, SEChar.CONVERT.ASC);
                    }
                });
                iput("chr", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEChar(new Atom(tok), arguments, SEChar.CONVERT.CHR);
                    }
                });

                iput("log.debug", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SELog(new Atom(tok), arguments, SELog.DEBUG);
                    }
                });
                iput("log.info", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SELog(new Atom(tok), arguments, SELog.INFO);
                    }
                });
                iput("log.warn", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SELog(new Atom(tok), arguments, SELog.WARN);
                    }
                });
                iput("log.error", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SELog(new Atom(tok), arguments, SELog.ERROR);
                    }
                });
                iput("log.level", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SELog(new Atom(tok), arguments, SELog.SET_LEVEL);
                    }
                });
                iput("sys.exec", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SECommand(new Atom(tok), arguments, false);
                    }
                });
                iput("sys.execa", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SECommand(new Atom(tok), arguments, true);
                    }
                });
                iput("File.read", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.OPEN_TEXT);
                    }
                });
                iput("File.readLines", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.OPEN_LINES);
                    }
                });
                iput("File.readBinary", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.OPEN_BINARY);
                    }
                });
                iput("File.write", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.WRITE);
                    }
                });
                iput("File.writeBinary", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.WRITE_BINARY);
                    }
                });
                iput("File.delete", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.DELETE);
                    }
                });
                iput("File.append", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.APPEND);
                    }
                });
                iput("File.exists", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEFile(new Atom(tok), arguments, SEFile.OPERATION.EXISTS);
                    }
                });
                iput("Math.sin", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.SIN);
                    }
                });
                iput("math.cos", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.COS);
                    }
                });
                iput("math.tan", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.TAN);
                    }
                });
                iput("math.abs", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.ABS);
                    }
                });
                iput("math.asin", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.ASIN);
                    }
                });
                iput("math.acos", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.ACOS);
                    }
                });
                iput("math.atan", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.ATAN);
                    }
                });
                iput("math.sqrt", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.SQRT);
                    }
                });
                iput("math.sgn", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.SGN);
                    }
                });
                iput("math.pow", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.POW);
                    }
                });
                iput("Time.unix", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SETime(new Atom(tok), c, SETime.OPERATION.TIME);
                    }
                });
                iput("Time.format", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SETime(new Atom(tok), c, SETime.OPERATION.FORMAT_TIME);
                    }
                });
                iput("Time.utcFormat", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SETime(new Atom(tok), c, SETime.OPERATION.UTC_TIME);
                    }
                });
                iput("Math.round", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.ROUND);
                    }
                });
                iput("math.floor", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.FLOOR);
                    }
                });
                iput("math.random", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMath(new Atom(tok), c, SEMath.RANDOM);
                    }
                });
                iput("str.trim", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SETrim(new Atom(tok), arguments);
                    }
                });
                iput("str.match", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SERegexMatch(new Atom(tok), c);
                    }
                });
                iput("str.split", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SESplit(new Atom(tok), c, true);
                    }
                });
                iput("str.join", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEJoin(new Atom(tok), c);
                    }
                });
                iput("str.replace", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEReplace(new Atom(tok), c, SEReplace.OPERATION.NORMAL);
                    }
                });
                iput("str.rsplit", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SESplit(new Atom(tok), c, false);
                    }
                });
                iput("str.rreplace", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEReplace(new Atom(tok), c, SEReplace.OPERATION.REGEX);
                    }
                });
//                iput("thread.start", new CallableKeyword() {
//                    public SExpression call(Token tok, ListEx<SExpression> c) {
//                        return new SEThread(new Atom(tok), c);
//                    }
//                });
//                iput("thread.sleep", new CallableKeyword() {
//                    public SExpression call(Token tok, ListEx<SExpression> c) {
//                        return new SESleep(new Atom(tok), c);
//                    }
//                });
//                iput("thread.wait", new CallableKeyword() {
//                    public SExpression call(Token tok, ListEx<SExpression> c) {
//                        return new SEWait(new Atom(tok), c);
//                    }
//                });
                iput("list.head", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.HEAD);
                    }
                });
                iput("list.tail", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.TAIL);
                    }
                });
                iput("list.init", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.INIT);
                    }
                });
                iput("list.last", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.LAST);
                    }
                });
                iput("list.sort", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.SORT);
                    }
                });
                iput("list.insert", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.INSERT);
                    }
                });
                iput("list.concat", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.CONCAT);
                    }
                });
                iput("list.filter", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEListOp(new Atom(tok), c, SEListOp.FILTER);
                    }
                });
                iput("meta.add", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMeta(new Atom(tok), c, SEMeta.ADD);
                    }
                });
                iput("meta.set", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMeta(new Atom(tok), c, SEMeta.SET);
                    }
                });
                iput("meta.remove", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMeta(new Atom(tok), c, SEMeta.REMOVE);
                    }
                });
                iput("meta.get", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMeta(new Atom(tok), c, SEMeta.GET);
                    }
                });
                iput("meta.body", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SEMeta(new Atom(tok), c, SEMeta.BODY);
                    }
                });
            }};
}
