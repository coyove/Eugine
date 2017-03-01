package org.coyove.eugine.library.io;

import org.coyove.eugine.base.NativeCallInterface;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.library.Exportable;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.EgCast;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;
import org.coyove.eugine.value.SDict;
import org.coyove.eugine.value.SNativeCall;
import org.coyove.eugine.value.SString;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by zezhong on 2017/2/27.
 */
public class system implements Exportable {
    public void export(ExecEnvironment env) {
        env.put("sys", new SDict(){{
            put("exec", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    String cmd = EgCast.toString(arguments.head(), atom);
                    try {
                        ProcessBuilder pb = new ProcessBuilder("sh", "-c", cmd);
                        Process p = pb.start();
                        if (arguments.size() > 1) {
                            if (EgCast.toString(arguments.get(1), atom).equals("a"))
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
                        throw new EgException(9001, "error when executing '" + cmd + "': " + e, atom);
                    }
                }
            }, 1));
        }});
    }
}
