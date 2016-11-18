package org.coyove.eugine.library;

import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEContains extends SExpression {
    private SExpression map;
    private SExpression key;

    public SEContains() {}

    public SEContains(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 2);

        map = args.get(0);
        key = args.get(1);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue key = this.key.evaluate(env);

        SValue sub = this.map.evaluate(env);
        if (sub instanceof SDict && key instanceof SString) {
            HashMap<String, SValue> map = sub.get();
            return new SBool(map.containsKey(key.<String>get()));
        } else if (sub instanceof SList) {
            ListEx<SValue> list = sub.get();
            Object tester = key instanceof SConcatString ? key.<String>get() : key.get();

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(tester)) {
                    return new SInteger(i);
                }
            }

            return new SInteger(-1);
        } else if (sub instanceof SString && key instanceof SString) {
            String text = sub.get();
            return new SInteger(StringUtils.indexOf(text, key.<String>get()));
        } else {
            throw new EgException(3010, "invalid subject or key", atom);
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        SEContains ret = new SEContains();
        ret.atom = this.atom;
        ret.map = this.map.deepClone();
        ret.key = this.key.deepClone();

        return ret;
    }
}
