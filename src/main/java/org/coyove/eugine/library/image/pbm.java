package org.coyove.eugine.library.image;

import org.coyove.eugine.base.NativeCallInterface;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.library.Exportable;
import org.coyove.eugine.util.EgCast;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;
import org.coyove.eugine.value.SBuffer;
import org.coyove.eugine.value.SDict;
import org.coyove.eugine.value.SList;
import org.coyove.eugine.value.SNativeCall;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by zezhong on 2017/2/26.
 */
public class pbm implements Exportable {
    public void export(ExecEnvironment env) {
        env.put("pbm", new SDict() {{
            put("write", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    String filename = EgCast.toString(arguments.head().evaluate(env), atom);
                    long sizeX = EgCast.toLong(arguments.get(1).evaluate(env), atom);
                    long sizeY = EgCast.toLong(arguments.get(2).evaluate(env), atom);

                    SValue _data = arguments.get(3).evaluate(env);

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
            }, 4));
        }});
    }
}
