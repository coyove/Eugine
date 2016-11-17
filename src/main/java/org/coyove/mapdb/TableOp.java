package org.coyove.mapdb;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;
import org.mapdb.DB;

import java.util.concurrent.ConcurrentMap;

/**
 * Created by zezhong on 2016/9/10.
 */
public class TableOp extends SExpression {
    private SExpression table;
    private SExpression key;
    private SExpression value = null;

    public enum OPERATION {PUT, GET, REMOVE}
    private OPERATION op;

    public TableOp() {}

    public TableOp(Atom ha, ListEx<SExpression> args, OPERATION o) {
        super(ha, args, o == OPERATION.PUT ? 3 : 2);
        table = args.head();
        key = args.get(1);

        if (o == OPERATION.PUT) {
            value = args.get(2);
        }

        op = o;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        ConcurrentMap table = (ConcurrentMap) this.table.evaluate(env).underlying;
        String key = Utils.cast(this.key.evaluate(env), SString.class,
                new EgException(7032, "key must be string", atom)).get();

        Object obj;
        switch (op) {
            case GET:
                obj = table.get(key);
                return obj == null ? new SNull() : ((SValue) obj);
            case REMOVE:
                obj = table.remove(key);
                return obj == null ? new SNull() : ((SValue) obj);
            case PUT:
                SValue v = this.value.evaluate(env);
                table.put(key, v);
                return v;
        }

        return new SNull();
    }

    @Override
    public SExpression deepClone() throws EgException {
        TableOp ret = new TableOp();
        ret.atom = this.atom;
        ret.table = this.table.deepClone();
        ret.key = this.key.deepClone();

        if (this.value != null) {
            ret.value = this.value.deepClone();
        }

        ret.op = this.op;
        return ret;
    }
}
