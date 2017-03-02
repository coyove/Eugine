package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class PCall extends SExpression {
    @ReplaceableVariable
    private SExpression called;

    @ReplaceableVariables
    private ListEx<SExpression> arguments;

    public PCall() {
    }

    public PCall(Atom ha, SExpression cls, ListEx<SExpression> args) {
        atom = ha;
        called = cls;
        arguments = args == null ? new ListEx<SExpression>() : args;

        if (cls instanceof PGet)
            ((PGet) cls).asCalled = true;
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

        if (cls.precastEnv != null) {
            newEnv.putAll(cls.precastEnv);
        }

        return newEnv;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue _closure = called.evaluate(env);
        if (!(_closure instanceof SClosure))
            throw EgException.INVALID_FUNCTION.raise(atom);

        SClosure closure = (SClosure) _closure;
        ListEx<SValue> arguments = SExpression.eval(this.arguments, env, atom);
        return evaluateClosure(atom, closure, arguments, env);
    }

    @SuppressWarnings("unchecked")
    public static SValue evaluateClosure
            (Atom atom, SClosure closure, ListEx<SValue> arguments, ExecEnvironment env)
            throws EgException {

        Execute_Next_Closure:
        while (true) {
            SClosure returnAsStruct = null;
            if ((closure.type & SClosure.STRUCT) > 0) {
                closure = closure.getCopy();
                returnAsStruct = closure;
            }

            // Curry
            if (closure.argNames.size() > arguments.size()) {
                ListEx<String> argNames = closure.argNames.skip(arguments.size());
                ListEx<Boolean> passByValue = closure.passByValue.skip(arguments.size());

                if (closure instanceof SNativeCall) {
                    SNativeCall cls = (SNativeCall) closure;
                    SNativeCall curry = new SNativeCall((NativeCallInterface) cls.underlying, 0);
                    curry.argNames = argNames;
                    curry.passByValue = passByValue;
                    curry.precastArguments = arguments;
                    return curry;
                } else {
                    SClosure curry = new SClosure(env, argNames, passByValue,
                            (ListEx<SExpression>) closure.body.clone());
                    if (closure.precastEnv == null) {
                        curry.precastEnv = new ExecEnvironment();
                    } else {
                        curry.precastEnv = new ExecEnvironment(closure.precastEnv);
                    }

                    for (int i = 0; i < arguments.size(); i++) {
                        if (closure.passByValue.get(i)) {
                            curry.precastEnv.put(closure.argNames.get(i), arguments.get(i).clone());
                        } else {
                            curry.precastEnv.put(closure.argNames.get(i), arguments.get(i));
                        }
                    }

                    return curry;
                }
            }

            if (closure instanceof SNativeCall) {
                SNativeCall nc = ((SNativeCall) closure);
                if (nc.precastArguments != null)
                    arguments.addAll(0, nc.precastArguments);

                return nc.call(atom, env, arguments);
            }

            // Prepare the environment
            ExecEnvironment newEnv;
            if ((closure.type & SClosure.TRANSPARENT) > 0) {
                newEnv = closure.outerEnv;
            } else {
                newEnv = prepareEE(closure, arguments);
                newEnv.put("__atom__", new SObject(atom));

                if ((closure.type & SClosure.OPERATOR) == 0) {
                    if (closure.refer instanceof SClosure && (closure.type & SClosure.STRUCT) == 0) {
                        newEnv.put("this", closure.refer);
                        newEnv.put("__this__", closure);
                    } else {
                        newEnv.put("this", closure);
                    }
                }

                newEnv.parentEnv = closure.outerEnv;
            }

            // Execute the closure body
            SValue ret = ExecEnvironment.Null;

            for (int i = 0; i < closure.body.size(); i++) {
                SExpression se = closure.body.get(i);

                // TCO
                if (returnAsStruct == null && i == closure.body.size() - 1) {
                    if (se instanceof PCall) {
                        PCall call = (PCall) se;
                        SValue cls_ = call.called.evaluate(newEnv);

                        if (cls_ instanceof SClosure) {
                            closure = (SClosure) cls_;
                            arguments = SExpression.eval(call.arguments, newEnv, atom);
                            continue Execute_Next_Closure;
                        }
                    } else if (se instanceof PIf) {
                        PIf iif = (PIf) se;

                        if (iif.evaluateCondition(newEnv)) {
                            arguments = new ListEx<SValue>();
                            closure = new SClosure(newEnv, iif.trueBranch);
                            continue Execute_Next_Closure;
                        } else if (iif.falseBranch != null) {
                            arguments = new ListEx<SValue>();
                            closure = new SClosure(newEnv, iif.falseBranch);
                            continue Execute_Next_Closure;
                        } else {
                            return ExecEnvironment.Null;
                        }
                    } else if (se instanceof PSwitch) {
                        PSwitch cond = (PSwitch) se;
                        SValue tester = cond.condition.evaluate(newEnv);
                        boolean flag = false;
                        arguments = new ListEx<SValue>();

                        for (Branch b : cond.branches) {
                            if (b.recv.evaluate(newEnv).equals(tester)) {
                                closure = new SClosure(newEnv, b.body);
                                flag = true;
                                break;
                            }
                        }

                        if (!flag) {
                            if (cond.defaultBranch != null) {
                                closure = new SClosure(newEnv, cond.defaultBranch.body);
                            } else {
                                return ExecEnvironment.Null;
                            }
                        }

                        continue Execute_Next_Closure;
//                    } else if (se instanceof PChain) {
//                        PChain chain = (PChain) se;
//                        if (chain.expressions.size() > 0) {
//                            arguments = new ListEx<SValue>();
//                            closure = new SClosure(newEnv, chain.expressions);
//                            continue Execute_Next_Closure;
//                        } else {
//                            return ExecEnvironment.Null;
//                        }
                    }
                }

                ret = se.evaluate(newEnv);
            }

            if (returnAsStruct != null) {
                return returnAsStruct;
            } else {
                return ret;
            }
        }
        // End of while
    }

    @Override
    public SExpression deepClone() {
        PCall ret = new PCall();
        ret.atom = this.atom;
        ret.arguments = ListEx.deepClone(this.arguments);
        ret.called = this.called.deepClone();

        return ret;
    }
}
