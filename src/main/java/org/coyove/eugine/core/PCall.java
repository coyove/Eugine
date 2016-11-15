package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;
import org.apache.commons.lang3.tuple.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class PCall extends SExpression {
    private String closureName;
    private SExpression closureObject = null;

    private ListEx<SExpression> arguments;
    private enum continueState { CONTINUE, TAIL_CALL, FALSE_NULL }

    public PCall() {}

    public PCall(Atom ha, Compound c) throws VMException {
        super(ha, c);
        closureName = ha.token.value.toString();
        arguments = SExpression.castPlain(c);
    }

    public PCall(SExpression cls, ListEx<SExpression> args, Atom ha, Compound c) {
        super(ha, c);
        closureObject = cls;
        arguments = args == null ? new ListEx<SExpression>() : args;
    }

    public static ExecEnvironment prepareEE(SClosure cls, ListEx<SValue> arguments) throws VMException {
        ListEx<String> argNames = cls.arguments;
        ListEx<Boolean> passByValue = cls.passByValue;
        ExecEnvironment newEnv = new ExecEnvironment();

        for (int i = 0; i < argNames.size(); i++) {
            String argName = argNames.get(i);

            if (argName.length() > 3 && argName.endsWith("...")) {
                argName = argName.substring(0, argName.length() - 3);
                if (passByValue.get(i)) {
                    newEnv.put(argName, new SList(ListEx.deepClone(arguments.skip(i).cast(SExpression.class))));
                } else {
                    newEnv.put(argName, new SList(arguments.skip(i).cast(SExpression.class)));
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

    public SValue getClosure(ExecEnvironment env) throws VMException {
        SValue closure;

        if (closureObject == null) {
            if (env.containsKey(closureName)) {
                closure = env.get(closureName);
            } else {
                closure = (new PVariable(closureName, headAtom, tailCompound)).evaluate(env);
                env.put(closureName, closure);
            }
        } else {
            closure = closureObject.evaluate(env);
        }

        return closure;
    }

    public Triple<SClosure, ListEx<SValue>, continueState>
    getContinue(SExpression se, ExecEnvironment env) throws VMException {
        ListEx<SValue> retArgs = new ListEx<SValue>();
        SClosure retCls = null;
        continueState ret = continueState.CONTINUE;

        if (se instanceof PCall) {
            PCall call = (PCall) se;
            SValue cls_ = call.getClosure(env);

            if (cls_ instanceof SClosure) {
                retCls = (SClosure) cls_;
                retArgs = SExpression.eval(call.arguments, env);
                ret = continueState.TAIL_CALL;
            }
        } else if (se instanceof PIf) {
            PIf iif = (PIf) se;
            ret = continueState.TAIL_CALL;

            if (iif.evaluateCondition(env)) {
                retCls = new SClosure(env, iif.trueBranch);
            } else if (iif.falseBranch != null) {
                retCls = new SClosure(env, iif.falseBranch);
            } else {
                ret = continueState.FALSE_NULL;
            }
        } else if (se instanceof PCond) {
            PCond cond = (PCond) se;
            Object tester = cond.condition.evaluate(env).get();
            boolean flag = false;

            ret = continueState.TAIL_CALL;

            for (Branch b : cond.branches) {
                if (PCond.compare(b.recv.evaluate(env).get(), tester)) {
                    retCls = new SClosure(env, b.body);
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                if (cond.defaultBranch != null) {
                    retCls = new SClosure(env, cond.defaultBranch.body);
                } else {
                    ret = continueState.FALSE_NULL;
                }
            }
        } else if (se instanceof PChain) {
            PChain chain = (PChain) se;
            if (chain.expressions.size() > 0) {
                ret = continueState.TAIL_CALL;
                retCls = new SClosure(env, chain.expressions);
            } else {
                ret = continueState.FALSE_NULL;
            }
        }

        return Triple.of(retCls, retArgs, ret);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue closure_ = getClosure(env);
        ListEx<SValue> arguments = SExpression.eval(this.arguments, env);
        SClosure closure;

        if (closure_ instanceof SClosure) {
            closure = (SClosure) closure_;
        } else {
            throw new VMException(7031, "invalid calling closure", headAtom);
        }

        while (true) {

            if (closure.arguments.size() > arguments.size()) {

                ListEx<String> argNames = closure.arguments.skip(arguments.size());
                ListEx<Boolean> passByValue = closure.passByValue.skip(arguments.size());
                ListEx<SExpression> newArgs = new ListEx<SExpression>();

                for (SValue v : arguments)
                    newArgs.add(v);

                for (String a : argNames)
                    newArgs.add(new PVariable(a, headAtom, tailCompound));

                PCall newBody = new PCall(closure, newArgs, headAtom, tailCompound);
                ListEx<SExpression> body = new ListEx<SExpression>();
                body.add(newBody);

                return new SClosure(env, argNames, passByValue, body);
            }

            ExecEnvironment newEnv = prepareEE(closure, arguments);
            newEnv.put("__parent__", new SCascadeDict(closure.outerEnv));
            newEnv.put("__atom__", new SObject(headAtom));

            if (closure.refer instanceof SClosure) {
                SClosure refer = ((SClosure) closure.refer);
                newEnv.put("this", refer);
                newEnv.put("__this__", closure);
            } else {
                newEnv.put("this", closure);
            }

            if (closure.outerEnv != null) {
                if (closure.transparent) {
                    newEnv = closure.outerEnv; //.cloneClosureAndConstOnly();
                } else {
                    newEnv.parentEnv = closure.outerEnv; //.cloneClosureAndConstOnly();
                }
                newEnv.overlay = closure.outerEnv.overlay;
            }

            SValue ret = new SNull();

            boolean flag = false;
            for (int i = 0; i < closure.body.size(); i++) {
                SExpression se = closure.body.get(i);
                if (i == closure.body.size() - 1) {
                    Triple<SClosure, ListEx<SValue>, continueState> tail = getContinue(se, newEnv);
                    if (tail.getRight() == continueState.TAIL_CALL) {
                        closure = tail.getLeft();
                        arguments = tail.getMiddle();
                        flag = true;
                        break;
                    } else if (tail.getRight() == continueState.FALSE_NULL) {
                        return new SNull();
                    }
                }

                ret = se.evaluate(newEnv);
            }

            if (flag) {
                continue;
            }

            return ret;
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        PCall ret = new PCall();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;

        ret.closureName = this.closureName;
        ret.arguments = ListEx.deepClone(this.arguments);

        if (this.closureObject != null) {
            ret.closureObject = this.closureObject.deepClone();
        } else {
            ret.closureObject = null;
        }

        return ret;
    }
}
