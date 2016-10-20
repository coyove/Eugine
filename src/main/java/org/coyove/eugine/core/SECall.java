package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;
import org.apache.commons.lang3.tuple.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SECall extends SExpression {
    private String closureName;
    private SExpression closureObject = null;

    private List<SExpression> arguments;
    private enum continueState { CONTINUE, TAIL_CALL, FALSE_NULL }

    public SECall() {}

    public SECall(Atom ha, Compound c) throws VMException {
        super(ha, c);
        closureName = ha.token.value.toString();
        arguments = SExpression.castPlain(c);
    }

    public SECall(SExpression cls, List<SExpression> args, Atom ha, Compound c) {
        super(ha, c);
        closureObject = cls;
        arguments = args;
    }

    public static boolean checkArgumentsCount(SClosure c, List<SValue> arguments) {
        int s = arguments.size();

        return !(
                c.argCount > s && !(c.argCount == s + 1 && c.arguments.get(s).endsWith("..."))
        );
    }

    public static ExecEnvironment prepareExecEnvironment(List<String> argNames, List<SValue> arguments) {
        ExecEnvironment newEnv = new ExecEnvironment();

        for (int i = 0; i < argNames.size(); i++) {
            String argName = argNames.get(i);

            if (argName.length() > 3 && argName.endsWith("...")) {
                argName = argName.substring(0, argName.length() - 3);
                newEnv.put(argName, new SList(arguments.skip(i)));
                break;
            } else {
                newEnv.put(argName, arguments.get(i));
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
                closure = (new SEVariable(closureName, headAtom, tailCompound)).evaluate(env);
                env.put(closureName, closure);
            }
        } else {
            closure = closureObject.evaluate(env);
        }

        return closure;
    }

    public Triple<SClosure, List<SValue>, continueState>
    getContinue(SExpression se, ExecEnvironment env) throws VMException {
        List<SValue> retArgs = new List<SValue>();
        SClosure retCls = null;
        continueState ret = continueState.CONTINUE;

        if (se instanceof SECall) {
            SECall call = (SECall) se;
            SValue cls_ = call.getClosure(env);

            if (cls_ instanceof SClosure) {
                retCls = (SClosure) cls_;
                retArgs = SExpression.eval(call.arguments, env);
                ret = continueState.TAIL_CALL;
            }
        } else if (se instanceof SEIf) {
            SEIf iif = (SEIf) se;
            ret = continueState.TAIL_CALL;

            if (iif.evaluateCondition(env)) {
                retCls = new SClosure(env, iif.trueBranch);
            } else if (iif.falseBranch != null) {
                retCls = new SClosure(env, iif.falseBranch);
            } else {
                ret = continueState.FALSE_NULL;
            }
        } else if (se instanceof SECond) {
            SECond cond = (SECond) se;
            Object tester = cond.condition.evaluate(env).get();
            boolean flag = false;

            ret = continueState.TAIL_CALL;

            for (SECond.Branch b : cond.branches) {
                if (b.recv.evaluate(env).get().equals(tester)) {
                    retCls = new SClosure(env, b.body);
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                if (cond.defaultBranch != null) {
                    retCls = new SClosure(env, cond.defaultBranch);
                } else {
                    ret = continueState.FALSE_NULL;
                }
            }
        } else if (se instanceof SEChain) {
            SEChain chain = (SEChain) se;
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
        List<SValue> arguments = SExpression.eval(this.arguments, env);
        SClosure closure;

        if (closure_ instanceof SClosure) {
            closure = (SClosure) closure_;
        } else {
            List<SValue> ret = new List<SValue>();
            ret.add(closure_);

            for (SValue a : arguments)
                ret.add(a);

            return new SList(ret);
        }


        while (true) {

            if (!checkArgumentsCount(closure, arguments)) {

                List<String> argNames = closure.arguments.skip(arguments.size());
                List<SExpression> newArgs = new List<SExpression>();

                for (SValue v : arguments)
                    newArgs.add(v);

                for (String a : argNames)
                    newArgs.add(new SEVariable(a, headAtom, tailCompound));

                SECall newBody = new SECall(closure, newArgs, headAtom, tailCompound);
                List<SExpression> body = new List<SExpression>();
                body.add(newBody);

                return new SClosure(env, argNames, body);
            }

            ExecEnvironment newEnv = prepareExecEnvironment(closure.arguments, arguments);
            newEnv.put("~parent", new SDict(closure.outerEnv));
            newEnv.put("~atom", new SObject(headAtom));

            if (!newEnv.containsKey("~this")) {
                if (closure.refer instanceof SClosure) {
                    SClosure refer = ((SClosure) closure.refer);
                    newEnv.put("~this", refer);
                    newEnv.put("~proto", refer.proto);
                } else {
                    newEnv.put("~this", closure);
                }
            }

            if (closure.outerEnv != null) {
                if (closure.transparent) {
                    newEnv = closure.outerEnv; //.cloneClosureAndConstOnly();
                } else {
                    // closure.outerEnv.cloneClosureAndConstInto(newEnv);
                    newEnv.parentEnv = closure.outerEnv.cloneClosureAndConstOnly();
                }
            }

            SValue ret = new SNull();

            boolean flag = false;
            for (int i = 0; i < closure.body.size(); i++) {
                SExpression se = closure.body.get(i);
                if (i == closure.body.size() - 1) {
                    Triple<SClosure, List<SValue>, continueState> tail = getContinue(se, newEnv);
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

            if (flag)
                continue;

            return ret;
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        SECall ret = new SECall();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;

        ret.closureName = this.closureName;
        ret.arguments = List.deepClone(this.arguments);

        if (this.closureObject != null) {
            ret.closureObject = this.closureObject.deepClone();
        } else {
            ret.closureObject = null;
        }

        return ret;
    }
}
