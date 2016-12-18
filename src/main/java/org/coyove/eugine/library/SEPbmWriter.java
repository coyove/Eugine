package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEPbmWriter extends SExpression {
    @ReplaceableVariable
    private SExpression filename;

    @ReplaceableVariable
    private SExpression data;

    @ReplaceableVariable
    private SExpression sizeX;

    @ReplaceableVariable
    private SExpression sizeY;

    public SEPbmWriter() {}

    public SEPbmWriter(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 4);
        filename = args.head();
        sizeX = args.get(1);
        sizeY = args.get(2);
        data = args.get(3);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        String filename = EgCast.toString(this.filename.evaluate(env), atom);
        Long sizeX = EgCast.toLong(this.sizeX.evaluate(env), atom);
        Long sizeY = EgCast.toLong(this.sizeY.evaluate(env), atom);

        SValue _data = this.data.evaluate(env);
        if (!(_data instanceof SList)) {
            throw new EgException(7088, "invalid data", atom);
        }

        ListEx<SValue> list = _data.get();
        try {
            OutputStream stream = new FileOutputStream(filename);
            stream.write(("P4\n" + sizeX + " " + sizeY + "\n").getBytes());
            for (SValue v : list) {
                stream.write(((int) EgCast.toLong(v, atom)));
            }
            stream.close();
        } catch (Exception e) {
            throw new EgException(7088, "failed to write: " + e, atom);
        }

        return env.Null;
    }

    @Override
    public SExpression deepClone() {
        SEPbmWriter ret = new SEPbmWriter();
        ret.sizeX = this.sizeX.deepClone();
        ret.sizeY = this.sizeY.deepClone();
        ret.filename = this.filename.deepClone();
        ret.data = this.data.deepClone();

        return ret;
    }
}
