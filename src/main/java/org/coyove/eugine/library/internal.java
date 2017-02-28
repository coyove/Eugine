package org.coyove.eugine.library;

import org.coyove.eugine.base.NativeCallInterface;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;
import org.coyove.eugine.value.SDict;
import org.coyove.eugine.value.SNativeCall;
import org.coyove.eugine.value.SObject;

/**
 * Created by zezhong on 2017/2/28.
 */
public class internal implements Exportable {
    public void export(ExecEnvironment env) {
        env.put("internal", new SDict(){{
            put("newenv", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    return new SObject(new ExecEnvironment());
                }
            }, 0));
        }});
    }
}
