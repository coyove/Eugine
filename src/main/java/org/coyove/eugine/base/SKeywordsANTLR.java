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
            }};
}
