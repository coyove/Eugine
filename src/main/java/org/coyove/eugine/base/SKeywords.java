package org.coyove.eugine.base;

import org.antlr.v4.runtime.Token;
import org.coyove.eugine.builtin.*;
import org.coyove.eugine.builtin.SEMath;
import org.coyove.eugine.builtin.meta.SEMeta;
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
                iput("copy", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> c) {
                        return new SECopy(new Atom(tok), c);
                    }
                });
                iput("math.sin", new CallableKeyword() {
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
                iput("math.round", new CallableKeyword() {
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
                iput("chr", new CallableKeyword() {
                    public SExpression call(Token tok, ListEx<SExpression> arguments) {
                        return new SEChar(new Atom(tok), arguments);
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
