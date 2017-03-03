package org.coyove.eugine.builtin;

import org.apache.commons.lang3.ClassUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.library.Exportable;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.*;

/**
 * Created by coyove on 2016/9/9.
 */
public class SEImport extends SExpression {
    private ListEx<SExpression> libNames;

    public SEImport(Atom ha, ListEx<SExpression> libs) {
        atom = ha;
        libNames = libs;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        for (SValue n : SExpression.eval(libNames, env, atom)) {
            String libName = EgCast.toString(n, atom);
            try {
                Class<? extends Exportable> cls = (Class<? extends Exportable>)
                        ClassUtils.getClass("org.coyove.eugine.library." + libName);
                cls.newInstance().export(env);
            } catch (Exception e) {
                throw EgException.CANNOT_IMPORT_LIBRARY.raise(atom, libName, e);
            }
        }

        return ExecEnvironment.Null;
    }

    @Override
    public SExpression deepClone() {
        return this;
    }
}
