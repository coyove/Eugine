package org.coyove.eugine.library.encode;

import org.coyove.eugine.base.NativeCallInterface;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.library.Exportable;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;
import org.coyove.eugine.value.SDict;
import org.coyove.eugine.value.SNativeCall;

/**
 * Created by zezhong on 2017/2/26.
 */
public class digest implements Exportable {
    public void export(ExecEnvironment env) {
        env.put("digest", new SDict(){{
            put("sha1", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    return null;
                }
            }, 1));
        }});
    }
}
