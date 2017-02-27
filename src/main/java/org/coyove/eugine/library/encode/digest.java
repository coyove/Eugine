package org.coyove.eugine.library.encode;

import org.coyove.eugine.base.NativeCallInterface;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.builtin.SEDigest;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.library.Exportable;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.*;

import java.security.MessageDigest;

import static org.coyove.eugine.util.Utils.bytesToHexString;

/**
 * Created by zezhong on 2017/2/26.
 */
public class digest implements Exportable {
    private static NativeCallInterface getDigestCall(final String name) {
        return new NativeCallInterface() {
            public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                MessageDigest md;
                SValue v = arguments.head();

                try {
                    md = MessageDigest.getInstance(name);
                    byte[] result;

                    if (v instanceof SString) {
                        result = md.digest(v.<String>get().getBytes("UTF-8"));
                    } else if (v instanceof SBuffer) {
                        result = md.digest(((byte[]) v.get()));
                    } else {
                        return ExecEnvironment.Null;
                    }

                    if (arguments.size() > 1) {
                        String opt = EgCast.toString(arguments.get(1), atom);
                        if (opt.equals("hex")) {
                            return new SString(bytesToHexString(result));
                        } else {
                            throw new EgException(7029, "invalid option", atom);
                        }
                    } else {
                        return new SBuffer(result);
                    }
                } catch (Exception ex) {
                    throw new EgException(7029, "algorithm not implemented: " + ex, atom);
                }
            }
        };
    }

    public void export(ExecEnvironment env) {
        env.put("digest", new SDict(){{
            put("sha1", new SNativeCall(getDigestCall("SHA-1"), 1));
            put("sha256", new SNativeCall(getDigestCall("SHA-256"), 1));
            put("md5", new SNativeCall(getDigestCall("MD5"), 1));
        }});
    }
}
