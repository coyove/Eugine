package org.coyove.eugine.util;

import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.core.PVariable;
import org.coyove.eugine.util.Utils;

import java.util.HashMap;

/**
 * Created by coyove on 2016/11/7.
 */
public class Branch implements java.io.Serializable {
    public SExpression recv;
    public ListEx<SExpression> body = new ListEx<SExpression>();

    public void set(Branch n) {
        recv = n.recv;
        body = n.body;
    }

    public void replaceBranch(HashMap<String, SExpression> replacer) {
        if (recv instanceof PVariable) {
            SExpression r = replacer.get(((PVariable) recv).varName);
            if (r != null) {
                recv = r;
            }
        } else {
            Utils.replaceVariables(recv, replacer);
        }

        for (int i = 0; i < body.size(); i++) {
            SExpression se = body.get(i);

            if (se instanceof PVariable) {
                SExpression r = replacer.get(((PVariable) se).varName);
                if (r != null) {
                    body.set(i, r);
                }
            } else {
                Utils.replaceVariables(se, replacer);
            }
        }
    }
}
