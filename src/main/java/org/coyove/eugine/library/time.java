package org.coyove.eugine.library;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.coyove.eugine.base.NativeCallInterface;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.EgCast;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;
import org.coyove.eugine.value.SDict;
import org.coyove.eugine.value.SNativeCall;
import org.coyove.eugine.value.SNumber;
import org.coyove.eugine.value.SString;

import java.util.Date;
import java.util.Locale;

/**
 * Created by zezhong on 2017/2/26.
 */
public class time implements Exportable {
    public void export(ExecEnvironment env) {
        env.put("time", new SDict(){{
            put("utc", new SString("EEE, dd MMM yyyy HH:mm:ss zzz"));

            put("currenttimestamp", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    return new SNumber(new Date().getTime());
                }
            }, 0));

            put("format", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    return new SString(DateFormatUtils.formatUTC(
                            EgCast.toLong(arguments.head(), atom),
                            EgCast.toString(arguments.get(1), atom), new Locale("us")));
                }
            }, 2));
        }});
    }
}
