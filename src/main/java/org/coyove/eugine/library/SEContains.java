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
    @ReplaceableVariable
    private SExpression map;

    @ReplaceableVariable
    private SExpression key;

    @ReplaceableVariable
    private SExpression start = null;

    public SEContains() {}

    public SEContains(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 2);

        map = args.get(0);
        key = args.get(1);

        if (args.size() > 2) {
            start = args.get(2);
        }
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue key = this.key.evaluate(env);
        SValue sub = this.map.evaluate(env);
        int start = this.start == null ? 0 : EgCast.toInt(this.start.evaluate(env), atom);

        if (sub instanceof SDict && key instanceof SString) {
            HashMap<String, SValue> map = sub.get();
            return map.containsKey(key.<String>get()) ? ExecEnvironment.True : ExecEnvironment.False;
        } else if (sub instanceof SList) {
            ListEx<SValue> list = sub.get();

            for (int i = start; i < list.size(); i++) {
                if (list.get(i).equals(key)) {
                    return new SInt(i);
                }
            }

            return new SInt(-1);
        } else if (sub instanceof SString && key instanceof SString) {
            String text = sub.get();
            return new SInt(StringUtils.indexOf(text, key.<String>get(), start));
        } else if (sub instanceof SClosure && key instanceof SString) {
            String text = sub.get();
            return ((SClosure) sub).extra.containsKey(text) ? ExecEnvironment.True : ExecEnvironment.False;
        } else if (sub.underlying instanceof byte[]) {
            byte[] s = ((byte[]) sub.underlying);
            byte[] k;
            if (key.underlying instanceof byte[]) {
                k = ((byte[]) key.underlying);
            } else {
                k = EgCast.toString(key, atom).getBytes();
            }

            if (s.length >= k.length) {
                for (int i = start; i < s.length - k.length; i++) {
                    for (int j = i; j < i + k.length; j++) {
                        if (s[j] != k[j - i]) {
                            break;
                        }

                        if (j == i + k.length - 1) {
                            return new SInt(i);
                        }
                    }
                }
            }

            return new SInt(-1);
        } else {
            throw new EgException(3010, "invalid subject or key", atom);
        }
    }

    @Override
    public SExpression deepClone() {
        SEContains ret = new SEContains();
        ret.atom = this.atom;
        ret.map = this.map.deepClone();
        ret.key = this.key.deepClone();
        if (this.start != null) {
            ret.start = this.start.deepClone();
        }

        return ret;
    }
}
