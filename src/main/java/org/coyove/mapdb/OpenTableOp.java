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
public class OpenTableOp extends SExpression {
    private SExpression db;
    private SExpression tableName;

    public OpenTableOp() {}

    public OpenTableOp(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 2);
        db = args.head();
        tableName = args.get(1);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        String tableName = Utils.cast(this.tableName.evaluate(env), SString.class,
                new EgException(7032, "table name must be string", atom)).get();

        DB db = (DB) this.db.evaluate(env).underlying;
        ConcurrentMap map = db.hashMap(tableName).createOrOpen();
        return new SObject(map);
    }

    @Override
    public SExpression deepClone() throws EgException {
        OpenTableOp ret = new OpenTableOp();
        ret.atom = this.atom;
        ret.db = this.db.deepClone();
        ret.tableName = this.tableName.deepClone();
        return ret;
    }
}
