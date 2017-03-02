package org.coyove.eugine.library;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.coyove.eugine.base.NativeCallInterface;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.core.PCall;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.EgCast;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;
import org.coyove.eugine.value.*;

import java.util.Date;
import java.util.Locale;

/**
 * Created by zezhong on 2017/2/26.
 */
public class time implements Exportable {
    public void export(ExecEnvironment env) {
        SDict time = Exportable.Utils.buildTopRoute(env, "time");
        time.put("utc", new SString("EEE, dd MMM yyyy HH:mm:ss zzz"));

        time.put("currenttimestamp", new SNativeCall(new NativeCallInterface() {
            public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                return new SNumber(new Date().getTime());
            }
        }, 0));

        time.put("format", new SNativeCall(new NativeCallInterface() {
            public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                return new SString(DateFormatUtils.formatUTC(
                        EgCast.toLong(arguments.head(), atom),
                        EgCast.toString(arguments.get(1), atom), new Locale("us")));
            }
        }, 2));

        time.put("timing", new SNativeCall(new NativeCallInterface() {
            public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                SClosure func = EgCast.to(arguments.head(), SClosure.class);
                if (func == null)
                    throw EgException.INVALID_FUNCTION.raise(atom, arguments.head());

                long start = System.currentTimeMillis();
                PCall.evaluateClosure(atom, func, arguments.skip(1), env);
                return new SNumber(System.currentTimeMillis() - start);
            }
        }, 1));

        time.put("nanotiming", new SNativeCall(new NativeCallInterface() {
            public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                SClosure func = EgCast.to(arguments.head(), SClosure.class);
                if (func == null)
                    throw EgException.INVALID_FUNCTION.raise(atom, arguments.head());

                long start = System.nanoTime();
                PCall.evaluateClosure(atom, func, arguments.skip(1), env);
                return new SNumber(System.nanoTime() - start);
            }
        }, 1));
    }
}
