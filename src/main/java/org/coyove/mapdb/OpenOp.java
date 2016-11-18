package org.coyove.mapdb;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;
import org.mapdb.DB;
import org.mapdb.DBMaker;

/**
 * Created by zezhong on 2016/9/10.
 */
public class OpenOp extends SExpression {
    @ReplaceableVariable
    private SExpression filename;

    public OpenOp() {}

    public OpenOp(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);
        filename = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        String filename = Utils.cast(this.filename.evaluate(env), SString.class,
                new EgException(7032, "filename must be string", atom)).get();

        DB db = DBMaker.fileDB(filename).fileMmapEnableIfSupported().checksumHeaderBypass().make();
        return new SObject(db);
    }

    @Override
    public SExpression deepClone() throws EgException {
        OpenOp ret = new OpenOp();
        ret.atom = this.atom;
        ret.filename = this.filename.deepClone();
        return ret;
    }
}
