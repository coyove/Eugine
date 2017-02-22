package org.coyove.eugine.library.system;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by coyove on 2016/9/10.
 */
public class SECommand extends SExpression {
    @ReplaceableVariable
    private SExpression argument;

    private boolean async;

    public SECommand() {}

    public SECommand(Atom ha, ListEx<SExpression> args, boolean a) {
        super(ha, args, 1);

        argument = args.head();
        async = a;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        String cmd = EgCast.toString(argument.evaluate(env), atom);
        try {
            ProcessBuilder pb = new ProcessBuilder("sh", "-c", cmd);
            Process p = pb.start();
            if (async) {
                return ExecEnvironment.Null;
            }

            p.waitFor();

            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine())!= null) {
                sb.append(line + "\n");
            }

            return new SString(sb.toString());
        } catch(Exception e) {
            throw new EgException(8084, "error when executing '" + cmd + "': " + e, atom);
        }
    }

    @Override
    public SExpression deepClone() {
        SECommand ret = new SECommand();
        ret.atom = this.atom;
        ret.argument = this.argument.deepClone();
        ret.async = this.async;
        return ret;
    }
}