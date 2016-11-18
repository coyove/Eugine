package org.coyove.mapdb;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;
import org.mapdb.DB;

/**
 * Created by zezhong on 2016/9/10.
 */
public class DbOp extends SExpression {
    @ReplaceableVariable
    private SExpression db;

    public enum OPERATION {CLOSE, COMMIT}
    private OPERATION op;

    public DbOp() {}

    public DbOp(Atom ha, ListEx<SExpression> args, OPERATION o) {
        super(ha, args, 1);
        db = args.head();
        op = o;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        DB db = (DB) this.db.evaluate(env).underlying;

        switch (op) {
            case CLOSE:
                db.close();
                break;
            case COMMIT:
                db.commit();
                break;
        }

        return new SNull();
    }

    @Override
    public SExpression deepClone() throws EgException {
        DbOp ret = new DbOp();
        ret.atom = this.atom;
        ret.db = this.db.deepClone();
        ret.op = this.op;
        return ret;
    }
}
