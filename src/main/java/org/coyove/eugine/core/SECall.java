package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SECall extends SExpression {
    private String closureName;
    private SExpression lambdaObject = null;
    private List<SExpression> arguments;

    public SECall(String cls, List<SExpression> args, Atom ha, Compound c) {
        super(ha, c);
        closureName = cls;
        arguments = args;
    }

    public SECall(SExpression cls, List<SExpression> args, Atom ha, Compound c) {
        super(ha, c);
        lambdaObject = cls;
        arguments = args;
    }

    public static boolean checkArgumentsCount(List<String> argNames, List<SValue> arguments) {
        int s = arguments.size();
        return !(
                argNames.size() > s && !(argNames.size() == s + 1 && argNames.get(s).endsWith("..."))
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

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        SValue closure_;
        SClosure closure;

        if (lambdaObject == null) {
            if (env.containsKey(closureName)) {
                closure_ = env.get(closureName);
            } else {
                closure_ = (new SEVariable(closureName, headAtom, tailCompound)).evaluate(env);
                env.put(closureName, closure_);
            }
        } else {
            closure_ = lambdaObject.evaluate(env);
        }

        List<SValue> arguments = SExpression.eval(this.arguments, env);

        if (closure_ instanceof SClosure) {
            closure = (SClosure) closure_;
        } else {
            List<SValue> ret = new List<SValue>();
            ret.add(closure_);

            for (SValue a : arguments)
                ret.add(a);

            return new SList(ret);
        }

        if (!checkArgumentsCount(closure.arguments, arguments)) {

            List<String> argNames = closure.arguments.skip(arguments.size());
            List<SExpression> newArgs = new List<SExpression>();

            for (SValue v : arguments)
                newArgs.add(v);

            for (String a : argNames)
                newArgs.add(new SEVariable(a, headAtom, tailCompound));

            SECall newBody = new SECall(closure, newArgs, headAtom, tailCompound);

            return new SClosure(env, argNames, newBody);
        }

        ExecEnvironment newEnv = prepareExecEnvironment(closure.arguments, arguments);
        newEnv.put("~parent", new SDict(closure.innerEnv));
        newEnv.put("~atom", new SObject(headAtom));

        if (closure.refer instanceof SClosure) {
            SClosure refer = ((SClosure) closure.refer);
            newEnv.put("~this", refer);
            newEnv.put("~proto", refer.proto);
        } else {
            newEnv.put("~this", closure);
        }

        newEnv.parentEnv = closure.innerEnv;
        return closure.body.evaluate(newEnv);
    }
}
