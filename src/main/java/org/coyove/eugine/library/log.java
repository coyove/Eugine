package org.coyove.eugine.library;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.coyove.eugine.base.NativeCallInterface;
import org.coyove.eugine.base.SValue;

import java.io.File;
import java.io.PrintStream;
import java.lang.System;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.EgCast;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;
import org.coyove.eugine.value.SDict;
import org.coyove.eugine.value.SNativeCall;
import org.coyove.eugine.value.SNumber;

/**
 * Created by zezhong on 2017/2/26.
 */
public class log implements Exportable {
    private final static byte DEBUG = 0;
    private final static byte INFO = 1;
    private final static byte WARN = 2;
    private final static byte ERROR = 3;
    private static byte logLevel = 0;

    static class Logger {
        private static long _start = System.currentTimeMillis();

        public static synchronized SValue log(byte level, Atom atom, ListEx<SValue> values) throws EgException {
            SValue ret = ExecEnvironment.Null;
            if (level < logLevel) {
                return ret;
            }

            StringBuilder sb = new StringBuilder();
            long diff = System.currentTimeMillis() - _start;

            switch (level) {
                case DEBUG:
                    sb.append("D");
                    break;
                case INFO:
                    sb.append("I");
                    break;
                case WARN:
                    sb.append("W");
                    break;
                case ERROR:
                    sb.append("E");
                    break;
            }
            sb.append(DateFormatUtils.format(System.currentTimeMillis(), "MMdd hh:mm:ss"));
            sb.append(String.format("-%09.3f %s ", diff / 1000.0, Thread.currentThread().getName()));
            sb.append(atom.token.filename).append(":").append(atom.token.line + 1).append("] ");
            System.out.print(sb.toString());
            for (SValue v : values) {
                ret = v;
                System.out.print(v.asString() + " ");
            }
            System.out.print("\n");
            return ret;
        }

    }

    public void export(ExecEnvironment env) {
        env.put("log", new SDict(){{
            put("level", new SDict() {{
                put("debug", new SNumber(0));
                put("info", new SNumber(1));
                put("warn", new SNumber(2));
                put("error", new SNumber(3));
            }});

            put("debug", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    return Logger.log(DEBUG, atom, arguments);
                }
            }, 1));

            put("info", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    return Logger.log(INFO, atom, arguments);
                }
            }, 1));

            put("warn", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    return Logger.log(WARN, atom, arguments);
                }
            }, 1));

            put("error", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    return Logger.log(ERROR, atom, arguments);
                }
            }, 1));

            put("setlevel", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    logLevel = (byte) EgCast.toInt(arguments.head(), atom);
                    return ExecEnvironment.True;
                }
            }, 1));

            put("setoutfile", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    String path = EgCast.toString(arguments.head(), atom);
                    try {
                        File file = new File(path);
                        System.setOut(new PrintStream(file));
                    } catch (Exception e) {
                        throw new EgException(8979, path + " is invalid", atom);
                    }
                    return ExecEnvironment.True;
                }
            }, 1));
        }});
    }
}
