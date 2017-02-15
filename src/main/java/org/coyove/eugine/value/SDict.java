package org.coyove.eugine.value;

import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.ErrorHandler;
import org.coyove.eugine.util.EgException;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by coyove on 2016/9/9.
 */
public class SDict extends SValue {
    public SDict(HashMap<String, SValue> dict) {
        super(dict);
    }

    public SDict(HashMap<String, SValue> dict, boolean imm) {
        super(dict, imm);
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue clone() {
        HashMap<String, SValue> dict = this.get();
        HashMap<String, SValue> n = new HashMap<String, SValue>();

        for (String s : dict.keySet()) {
            n.put(s, dict.get(s).clone());
        }

        SDict ret = new SDict(n);
        SValue.copyAttributes(ret, this);
        return ret;
    }

    @Override
    public String toString() {
        HashMap<String, SValue> map = this.get();
        Set<String> keySet = map.keySet();
        String[] sets = new String[keySet.size()];
        int i = 0;
        for (String s : keySet) {
            sets[i++] = s + ": " + map.get(s).toString();
        }

        return "Dict = {" + StringUtils.join(sets, ", ") + "}";
    }
}
