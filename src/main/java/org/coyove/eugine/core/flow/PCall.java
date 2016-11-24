package org.coyove.eugine.core.flow;

import org.apache.commons.lang3.tuple.Triple;
import org.coyove.eugine.base.ReplaceableVariable;
import org.coyove.eugine.base.ReplaceableVariables;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.core.PList;
import org.coyove.eugine.core.PSet;
import org.coyove.eugine.core.PVariable;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class PCall extends SExpression {
    @ReplaceableVariable
    private SExpression closureObject;

    @ReplaceableVariables
    private ListEx<SExpression> arguments;

    private boolean expanded = false;

    private final static byte CONTINUE = 0;
    private final static byte TAIL_CALL = 1;
    private final static byte FALSE_NULL = 2;

    public PCall() {
    }

    public PCall(Atom ha, SExpression cls, ListEx<SExpression> args) {
        atom = ha;
        closureObject = cls;
        arguments = args == null ? new ListEx<SExpression>() : args;
    }

    private static ExecEnvironment prepareEE(SClosure cls, ListEx<SValue> arguments) throws EgException {
        ListEx<String> argNames = cls.argNames;
        ListEx<Boolean> passByValue = cls.passByValue;
        ExecEnvironment newEnv = new ExecEnvironment();

        for (int i = 0; i < argNames.size(); i++) {
            String argName = argNames.get(i);

            if (argName.length() > 3 && argName.endsWith("...")) {
                argName = argName.substring(0, argName.length() - 3);
                if (passByValue.get(i)) {
                    newEnv.put(argName, new SList(ListEx.deepClone(arguments.skip(i))));
                } else {
                    newEnv.put(argName, new SList(arguments.skip(i)));
                }
                break;
            } else {
                if (passByValue.get(i)) {
                    newEnv.put(argName, arguments.get(i).clone());
                } else {
                    newEnv.put(argName, arguments.get(i));
                }
            }
        }

        return newEnv;
    }

    private Triple<SClosure, ListEx<SValue>, Byte>
    getContinue(SExpression se, ExecEnvironment env) throws EgException {
        ListEx<SValue> retArgs = new ListEx<SValue>();
        SClosure retCls = null;
        Byte ret = CONTINUE;

        if (se instanceof PCall) {
            PCall call = (PCall) se;
            SValue cls_ = call.closureObject.evaluate(env);

            if (cls_ instanceof SClosure) {
                retCls = (SClosure) cls_;
                retArgs = SExpression.eval(call.arguments, env, atom);
                ret = TAIL_CALL;
            }
        } else if (se instanceof PIf) {
            PIf iif = (PIf) se;
            ret = TAIL_CALL;

            if (iif.evaluateCondition(env)) {
                retCls = new SClosure(env, iif.trueBranch);
            } else if (iif.falseBranch != null) {
                retCls = new SClosure(env, iif.falseBranch);
            } else {
                ret = FALSE_NULL;
            }
        } else if (se instanceof PSwitch) {
            PSwitch cond = (PSwitch) se;
            SValue tester = cond.condition.evaluate(env);
            boolean flag = false;

            ret = TAIL_CALL;

            for (Branch b : cond.branches) {
                if (b.recv.evaluate(env).equals(tester)) {
                    retCls = new SClosure(env, b.body);
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                if (cond.defaultBranch != null) {
                    retCls = new SClosure(env, cond.defaultBranch.body);
                } else {
                    ret = FALSE_NULL;
                }
            }
        } else if (se instanceof PChain) {
            PChain chain = (PChain) se;
            if (chain.expressions.size() > 0) {
                ret = TAIL_CALL;
                retCls = new SClosure(env, chain.expressions);
            } else {
                ret = FALSE_NULL;
            }
        }

        return Triple.of(retCls, retArgs, ret);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        if (expanded) {
            SValue ret = ExecEnvironment.Null;
            for (SExpression argument : arguments) {
                ret = argument.evaluate(env);
            }
            return ret;
        }

        SValue closure_ = closureObject.evaluate(env);
        if (!(closure_ instanceof SClosure)) {
            throw new EgException(7031, "invalid calling closure: " + closure_, atom);
        }

        SClosure closure = (SClosure) closure_;
        ListEx<SValue> arguments = SExpression.eval(this.arguments, env, atom);

        // Inline: expand the inline code to upper level
        if (closure.isInline && this.arguments.size() >= closure.argNames.size()) {
            expanded = true;
            ListEx<SExpression> body = ListEx.deepClone(closure.body);
            if (closure.argNames.size() > 0) {
                if (closure.argNames.last().endsWith("...")) {
                    String varargName = closure.argNames.last();
                    varargName = varargName.substring(0, varargName.length() - 3);

                    ListEx<String> argNames = new ListEx<String>();
                    for (int i = 0; i < closure.argNames.size() - 1; i++) {
                        argNames.add(closure.argNames.get(i));
                    }

                    PList vararg = new PList(atom);
                    for (int i = closure.argNames.size() - 1; i < this.arguments.size(); i++) {
                        vararg.values.add(this.arguments.get(i));
                    }

                    PSet tmp = new PSet(atom, new SString(varargName), vararg, PSet.MUTABLE);

                    for (SExpression b : body) {
                        Utils.replaceVariables(b, argNames, this.arguments);
                    }

                    body.add(0, tmp);
                } else {
                    for (SExpression b : body) {
                        Utils.replaceVariables(b, closure.argNames, this.arguments);
                    }
                }
            }

            this.arguments = body;
        }

        Execute_Next_Closure:
        while (true) {
            // Curry
            if (closure.argNames.size() > arguments.size()) {
                ListEx<String> argNames = closure.argNames.skip(arguments.size());
                ListEx<Boolean> passByValue = closure.passByValue.skip(arguments.size());
                ListEx<SExpression> newArgs = new ListEx<SExpression>();

                for (SValue v : arguments) {
                    newArgs.add(v);
                }

                for (String a : argNames) {
                    newArgs.add(new PVariable(atom, a));
                }

                PCall newBody = new PCall(atom, closure, newArgs);
                ListEx<SExpression> body = new ListEx<SExpression>();
                body.add(newBody);

                return new SClosure(env, argNames, passByValue, body);
            }

            // Prepare the environment
            ExecEnvironment newEnv = prepareEE(closure, arguments);
            newEnv.put("__parent__", new SCascadeDict(closure.outerEnv));
            newEnv.put("__atom__", new SObject(atom));

            if (closure.refer instanceof SClosure) {
                newEnv.put("this", (SClosure) closure.refer);
                newEnv.put("__this__", closure);
            } else {
                newEnv.put("this", closure);
            }

            if (closure.outerEnv != null) {
                if (closure.transparent) {
                    newEnv = closure.outerEnv;
                } else {
                    newEnv.parentEnv = closure.outerEnv;
                }
            }

            // Execute the closure body
            if (closure.isCoroutine) {
                return execCoroutine(closure, newEnv);
            } else {
                SValue ret = ExecEnvironment.Null;

                for (int i = 0; i < closure.body.size(); i++) {
                    SExpression se = closure.body.get(i);

                    // TCO
                    if (i == closure.body.size() - 1) {
                        Triple<SClosure, ListEx<SValue>, Byte> tail = getContinue(se, newEnv);
                        if (tail.getRight() == TAIL_CALL) {
                            closure = tail.getLeft();
                            arguments = tail.getMiddle();

                            continue Execute_Next_Closure;
                        } else if (tail.getRight() == FALSE_NULL) {
                            return ExecEnvironment.Null;
                        }
                    }

                    ret = se.evaluate(newEnv);
                }

                return ret;
            }
        }
    }

    private SValue execCoroutine(SClosure closure, ExecEnvironment env) throws EgException {
        if (closure.coroutineState == SClosure.DEAD) {
            throw new EgException(7062, "coroutine is dead", atom);
        }

        if (closure.coroutineState == SClosure.RUNNING) {

        }

        // First time
        if (closure.dummyCoroutine == null) {
            closure.dummyCoroutine = new PChain();
            closure.dummyCoroutine.expressions = closure.body;
        }

        closure.coroutineState = SClosure.RUNNING;
        SValue ret = closure.dummyCoroutine.evaluate(env);
        closure.coroutineState = SClosure.SUSPENDED;

        if (ret instanceof SYielded) {
            return ((SValue) ret.underlying);
        }

        if (closure.dummyCoroutine.execToEnd) {
            closure.coroutineState = SClosure.DEAD;
        }

        return ret;
    }

    @Override
    public SExpression deepClone() throws EgException {
        PCall ret = new PCall();
        ret.atom = this.atom;
        ret.arguments = ListEx.deepClone(this.arguments);
        ret.expanded = this.expanded;
        ret.closureObject = this.closureObject.deepClone();

        return ret;
    }
}
