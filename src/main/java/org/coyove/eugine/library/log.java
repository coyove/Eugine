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

    // A very simple logger, missing some functionality.
    public static class Logger {
        public final static byte DEBUG = 0;
        public final static byte INFO = 1;
        public final static byte WARN = 2;
        public final static byte ERROR = 3;
        public static byte logLevel = 1;

        private final static long _start = System.currentTimeMillis();

        private static void log(byte level, String text) {
            try {
                log(level, new Atom(), text);
            } catch (Exception e) {
                // never happen
            }
        }

        public static void debug(String text) {
            log(DEBUG, text);
        }

        public static void info(String text) {
            log(INFO, text);
        }

        public static void warn(String text) {
            log(WARN, text);
        }

        public static void error(String text) {
            log(ERROR, text);
        }

        @SuppressWarnings("unchecked")
        public static synchronized void log(byte level, Atom atom, Object values) throws EgException {
            if (level < logLevel) return;

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

            long millis = System.currentTimeMillis();
            sb.append(DateFormatUtils.format(millis, "MMdd hh:mm:ss"));
            sb.append(String.format(".%03d %s ", millis - millis / 1000 * 1000,
                    Thread.currentThread().getName()));
            sb.append(atom.filename).append(":").append(atom.line + 1).append("] ");
            System.out.print(sb.toString());

            if (values instanceof ListEx){
                for (SValue v : (ListEx<SValue>) values)
                    System.out.print(v.asString() + " ");
            } else {
                System.out.print(values);
            }

            System.out.print("\n");
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
                    Logger.log(Logger.DEBUG, atom, arguments);
                    return ExecEnvironment.Null;
                }
            }, 1));

            put("info", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    Logger.log(Logger.INFO, atom, arguments);
                    return ExecEnvironment.Null;
                }
            }, 1));

            put("warn", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    Logger.log(Logger.WARN, atom, arguments);
                    return ExecEnvironment.Null;
                }
            }, 1));

            put("error", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    Logger.log(Logger.ERROR, atom, arguments);
                    return ExecEnvironment.Null;
                }
            }, 1));

            put("setlevel", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    Logger.logLevel = (byte) EgCast.toInt(arguments.head(), atom);
                    return arguments.head();
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
