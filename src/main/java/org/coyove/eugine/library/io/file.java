package org.coyove.eugine.library.io;

import org.coyove.eugine.base.NativeCallInterface;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.library.Exportable;
import org.coyove.eugine.util.EgCast;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;
import org.coyove.eugine.value.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * Created by zezhong on 2017/2/26.
 */
public class file implements Exportable {
    public void export(ExecEnvironment env) {
        env.put("file", new SDict(){{
            put("exists", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    String path = EgCast.toString(arguments.head(), atom);
                    return Files.exists(Paths.get(path)) ? ExecEnvironment.True : ExecEnvironment.False;
                }
            }, 1));

            put("delete", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    String path = EgCast.toString(arguments.head(), atom);

                    try {
                        return Files.deleteIfExists(Paths.get(path)) ?
                                ExecEnvironment.True : ExecEnvironment.False;
                    } catch (Exception e) {
                        throw new EgException(9001, "error when deleting: " + path, atom);
                    }
                }
            }, 1));

            put("read", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    String path = EgCast.toString(arguments.head(), atom);
                    char opt = 't';

                    if (arguments.size() > 1)
                        opt = EgCast.toString(arguments.get(1), atom).charAt(0);

                    try {
                        switch (opt) {
                            case 'l':
                                String text = new String(Files.readAllBytes(Paths.get(path)));
                                if (text.isEmpty())
                                    return new SList(new ListEx<SValue>());

                                String[] lines = text.split("\\r?\\n");

                                ListEx<SValue> ret = new ListEx<SValue>(lines.length);
                                for (int i = 0; i < lines.length; i++) {
                                    String line = lines[i];
                                    if (i == lines.length - 1 && line.isEmpty()) break;

                                    ret.add(new SString(line));
                                }


                                return new SList(ret);
                            case 'b':
                                return new SBuffer(Files.readAllBytes(Paths.get(path)));
                            default:
                                return new SString(new String(Files.readAllBytes(Paths.get(path))));
                        }
                    } catch (Exception e) {
                        throw new EgException(9002, "error when reading: " + path, atom);
                    }
                }
            }, 1));

            put("write", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    String path = EgCast.toString(arguments.head(), atom);
                    SValue data = arguments.get(1);
                    char opt = 'w';

                    if (arguments.size() > 2)
                        opt = EgCast.toString(arguments.get(2), atom).charAt(0);

                    StandardOpenOption[] oo;

                    switch (opt) {
                        case 'a':
                            oo = new StandardOpenOption[]{StandardOpenOption.APPEND};
                            break;
                        default:
                            oo = new StandardOpenOption[]{
                                    StandardOpenOption.CREATE,
                                    StandardOpenOption.TRUNCATE_EXISTING,
                                    StandardOpenOption.WRITE};
                    }

                    try {
                        if (data instanceof SString) {
                            Files.write(Paths.get(path), data.<String>get().getBytes("utf-8"), oo);
                        } else if (data instanceof SBuffer) {
                            Files.write(Paths.get(path), ((byte[]) data.get()), oo);
                        } else if (data instanceof SList) {
                            StringBuilder sb = new StringBuilder();
                            ListEx<SValue> list = data.get();

                            for (int i = 0; i < list.size(); i++) {
                                SValue value = list.get(i);

                                if (value instanceof SString) {
                                    sb.append(value.<String>get()).append(i != list.size() - 1 ? "\n" : "");
                                }
                            }
                            Files.write(Paths.get(path), sb.toString().getBytes("utf-8"), oo);
                        } else {
                            throw new IOException();
                        }
                    } catch (Exception e) {
                        throw new EgException(9003, "error when writing: " + path, atom);
                    }

                    return ExecEnvironment.Null;
                }
            }, 2));
        }});
    }
}
