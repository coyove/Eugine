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
    public SValue evaluate(ExecEnvironment env) throws VMException {
        String key = Utils.cast(this.key.evaluate(env), SString.class,
                new VMException(3011, "key must be string", headAtom)).get();

        SValue sub = this.map.evaluate(env);
        if (sub instanceof SDict) {
            HashMap<String, SExpression> map = sub.get();
            return new SBool(map.containsKey(key));
        } else if (sub instanceof SString) {
            String text = sub.get();
            return new SInteger(StringUtils.indexOf(text, key));
        } else {
            throw new VMException(3010, "invalid subject", headAtom);
        }
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEContains ret = new SEContains();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.map = this.map.deepClone();
        ret.key = this.key.deepClone();

        return ret;
    }
}
