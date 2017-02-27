package org.coyove.eugine.library.network;

import org.coyove.eugine.base.NativeCallInterface;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.library.Exportable;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.*;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by zezhong on 2017/2/26.
 */
public class socket implements Exportable {
    public void export(ExecEnvironment env) {
        SDict network = Exportable.Utils.buildTopRoute(env, "network");

        network.put("socket", new SDict(){{
            put("new", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
                    try {
                        final SClosure ret = SClosure.makeEmptyClosure(env);
                        final ServerSocket ss = new ServerSocket();

                        ret.extra.put("bind", new SNativeCall(new NativeCallInterface() {
                            public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments)
                                    throws EgException {
                                try {
                                    ss.bind(new InetSocketAddress(EgCast.toString(arguments.head(), atom),
                                            EgCast.toInt(arguments.get(1), atom)));

                                    return ExecEnvironment.True;
                                } catch (Exception e) {
                                    return ExecEnvironment.Null;
                                }
                            }
                        }, 2));
                        ret.extra.put("accept", new SNativeCall(new NativeCallInterface() {
                            public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments)
                                    throws EgException {
                                try {
                                    final Socket socket = ss.accept();
                                    final SClosure ret = SClosure.makeEmptyClosure(env);
                                    final InputStream is = socket.getInputStream();
                                    final OutputStream os = socket.getOutputStream();

                                    ret.extra.put("settimeout",
                                            new SNativeCall(new NativeCallInterface() {
                                                public SValue call(Atom atom,
                                                                   ExecEnvironment env,
                                                                   ListEx<SValue> arguments)
                                                        throws EgException {
                                                    try {
                                                        socket.setSoTimeout(EgCast.toInt(arguments.head(), atom));
                                                        return ExecEnvironment.True;
                                                    } catch (Exception e) {
                                                        return ExecEnvironment.Null;
                                                    }
                                                }
                                            }, 1));
                                    ret.extra.put("read",
                                            new SNativeCall(new NativeCallInterface() {
                                                public SValue call(Atom atom,
                                                                   ExecEnvironment env,
                                                                   ListEx<SValue> arguments)
                                                        throws EgException {
                                                    try {
                                                        SBuffer buf = EgCast.to(arguments.head(), SBuffer.class);
                                                        int read = is.read(buf.<byte[]>get());
                                                        return new SNumber(read);
                                                    } catch (Exception e) {
                                                        return ExecEnvironment.Null;
                                                    }
                                                }
                                            }, 1));
                                    ret.extra.put("write",
                                            new SNativeCall(new NativeCallInterface() {
                                                public SValue call(Atom atom,
                                                                   ExecEnvironment env,
                                                                   ListEx<SValue> arguments)
                                                        throws EgException {
                                                    try {
                                                        SBuffer buf = EgCast.to(arguments.head(), SBuffer.class);
                                                        os.write(buf.<byte[]>get());
                                                        return ExecEnvironment.True;
                                                    } catch (Exception e) {
                                                        return ExecEnvironment.Null;
                                                    }
                                                }
                                            }, 1));
                                    ret.extra.put("close",
                                            new SNativeCall(new NativeCallInterface() {
                                                public SValue call(Atom atom,
                                                                   ExecEnvironment env,
                                                                   ListEx<SValue> arguments)
                                                        throws EgException {
                                                    try {
                                                        os.flush();
                                                        os.close();
                                                        is.close();
                                                        socket.close();
                                                        return ExecEnvironment.True;
                                                    } catch (Exception e) {
                                                        return ExecEnvironment.Null;
                                                    }
                                                }
                                            }, 0
                                            ));
                                    return ret;
                                } catch (Exception e) {
                                    return ExecEnvironment.Null;
                                }
                            }
                        }, 0));

                        return ret;
                    } catch (Exception e) {
                        return ExecEnvironment.Null;
                    }
                }
            }, 0));
        }});
    }
}
