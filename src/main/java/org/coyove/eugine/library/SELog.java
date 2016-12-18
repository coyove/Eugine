package org.coyove.eugine.library;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.util.*;

import java.lang.System;

/**
 * Created by coyove on 2016/9/9.
 */
public class SELog extends SExpression {
    @ReplaceableVariables
    private ListEx<SExpression> arguments;

    private byte level;
    private static byte logLevel = 0;

    public final static byte DEBUG = 0;
    public final static byte INFO = 1;
    public final static byte WARN = 2;
    public final static byte ERROR = 3;

    public final static byte SET_LEVEL = 10;

    public SELog() {
    }

    public SELog(Atom ha, ListEx<SExpression> args, byte l) {
        super(ha, args, 1);

        arguments = args;
        level = l;
    }

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
                System.out.print(SEPrint.format(v, 2, false) + " ");
            }
            System.out.print("\n");
            return ret;
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        if (level == SET_LEVEL) {
            logLevel = (byte) EgCast.toInt(arguments.head().evaluate(env), atom);
            return ExecEnvironment.Null;
        } else {
            ListEx<SValue> values = SExpression.eval(arguments, env, atom);
            return Logger.log(level, atom, values);
        }
    }

    @Override
    public SExpression deepClone() {
        SELog ret = new SELog();
        ret.atom = this.atom;
        ret.arguments = ListEx.deepClone(this.arguments);
        ret.level = this.level;
        return ret;
    }
}
