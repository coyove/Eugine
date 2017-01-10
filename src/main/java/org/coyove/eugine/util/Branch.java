package org.coyove.eugine.util;

import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.core.PVariable;

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

    public void replaceBranch(ListEx<String> from, ListEx<SExpression> to) {
        if (recv instanceof PVariable) {
            String name = ((PVariable) recv).name;
            int idx = from.indexOf(name);
            if (idx > -1) {
                recv = to.get(idx);
            }
        } else {
            Utils.replaceVariables(recv, from, to);
        }

        for (int i = 0; i < body.size(); i++) {
            SExpression se = body.get(i);

            if (se instanceof PVariable) {
                String name = ((PVariable) se).name;
                int idx = from.indexOf(name);
                if (idx > -1) {
                    body.set(i, to.get(idx));
                }
            } else {
                Utils.replaceVariables(se, from, to);
            }
        }
    }
}
