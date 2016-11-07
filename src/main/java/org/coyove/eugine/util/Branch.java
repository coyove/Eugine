package org.coyove.eugine.util;

import org.coyove.eugine.base.SExpression;

/**
 * Created by coyove on 2016/11/7.
 */
public class Branch implements java.io.Serializable {
    public SExpression recv;
    public List<SExpression> body = new List<SExpression>();

    public void set(Branch n) {
        recv = n.recv;
        body = n.body;
    }
}
