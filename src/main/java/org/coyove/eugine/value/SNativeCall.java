package org.coyove.eugine.value;

import org.coyove.eugine.base.NativeCallInterface;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;

/**
 * Created by zezhong on 2016/12/19.
 */
public class SNativeCall extends SClosure {

    public SNativeCall(NativeCallInterface nci, int a) {
        underlying = nci;
        argNames = new ListEx<String>(a);
        passByValue = new ListEx<Boolean>(a);
        for (int i = 0; i < a; i++) {
            argNames.add("v" + i);
            // Native call's arguments are passed by ref
            passByValue.add(false);
        }
    }

    public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
        return ((NativeCallInterface) underlying).call(atom, env, arguments);
    }

    @Override
    public SValue clone() {
        SNativeCall ret =  new SNativeCall((NativeCallInterface) underlying, 0);
        ret.argNames = this.argNames;
        ret.passByValue = this.passByValue;
        return ret;
    }

    @Override
    public String toString() {
        return "native = " + underlying.toString();
    }

    @Override
    public String asString() {
        return "";
    }
}
