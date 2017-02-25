package org.coyove.eugine.library.image;

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


        try {
            OutputStream stream = new FileOutputStream(filename);
            stream.write(("P4\n" + sizeX + " " + sizeY + "\n").getBytes());

            if (_data instanceof SList) {
                ListEx<SValue> list = _data.get();
                for (SValue v : list) {
                    stream.write(EgCast.toInt(v, atom));
                }
            } else if (_data instanceof SBuffer) {
                stream.write(_data.<byte[]>get());
            } else {
                throw new EgException(7088, "invalid data", atom);
            }

            stream.close();
        } catch (Exception e) {
            throw new EgException(7088, "failed to write: " + e, atom);
        }

        return ExecEnvironment.Null;
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
