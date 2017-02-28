package org.coyove.eugine.builtin;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.lang.System;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by coyove on 2016/9/9.
 */
public class SERead extends SExpression {
    public SERead() {
    }

    public SERead(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 0);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        String line = System.console().readLine();
        return line == null ? ExecEnvironment.Null : new SString(line);
    }

    @Override
    public SExpression deepClone() {
        SERead ret = new SERead();
        ret.atom = this.atom;
        return ret;
    }
}

