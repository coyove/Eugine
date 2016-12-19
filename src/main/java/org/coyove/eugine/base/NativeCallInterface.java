package org.coyove.eugine.base;

import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;

/**
 * Created by coyove on 2016/12/19.
 */
public interface NativeCallInterface {
    SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException;
}
