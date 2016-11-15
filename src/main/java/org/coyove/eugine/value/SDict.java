package org.coyove.eugine.value;

import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.util.ErrorHandler;
import org.coyove.eugine.util.VMException;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/9.
 */
public class SDict extends SValue {
    public SDict(HashMap<String, SExpression> dict) {
        super(dict);
    }

    public SDict(HashMap<String, SExpression> dict, boolean imm) {
        super(dict, imm);
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue clone() {
        HashMap<String, SExpression> dict = (HashMap<String, SExpression>) underlying;
        HashMap<String, SExpression> n = new HashMap<String, SExpression>();

        try {
            for (String s : dict.keySet()) {
                n.put(s, dict.get(s).deepClone());
            }
        } catch (VMException ex) {
            ErrorHandler.print(ex);
        }

        SDict ret = new SDict(n);
        SValue.copyAttributes(ret, this);
        return ret;
    }
}
