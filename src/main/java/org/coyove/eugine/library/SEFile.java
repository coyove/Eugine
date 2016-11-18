package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEFile extends SExpression {
    @ReplaceableVariable
    private SExpression filename;

    @ReplaceableVariable
    private SExpression data = null;

    private OPERATION fileOp;

    public enum OPERATION {
        OPEN_TEXT, OPEN_BINARY, OPEN_LINES, WRITE, APPEND, EXISTS
    }

    public SEFile() {
    }

    public SEFile(Atom ha, ListEx<SExpression> args, OPERATION op) {
        super(ha, args, op == OPERATION.OPEN_BINARY ||
                op == OPERATION.OPEN_LINES ||
                op == OPERATION.OPEN_TEXT ||
                op == OPERATION.EXISTS ? 1 : 2);

        filename = args.get(0);
        if (args.size() == 2) {
            data = args.get(1);
        }

        fileOp = op;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SString filename = Utils.cast(this.filename.evaluate(env), SString.class);
        SValue data = null;

        if (filename == null) {
            throw new EgException(3029, "filename must be string", atom);
        }

        if (this.data != null) {
            data = this.data.evaluate(env);
        }

        try {
            Path path = Paths.get(filename.<String>get());
            switch (fileOp) {
                case OPEN_TEXT:
                    return new SString(new String(Files.readAllBytes(path)));
                case OPEN_BINARY:
                    return new SObject(Files.readAllBytes(path));
                case OPEN_LINES:
                    java.util.List<String> lines = Files.readAllLines(path, Charset.forName("UTF-8"));
                    ListEx<SValue> ret = new ListEx<SValue>(lines.size());
                    for (String line : lines) {
                        ret.add(new SString(line));
                    }
                    return new SList(ret);
                case EXISTS:
                    return new SBool(Files.exists(path));
                default:
                    StandardOpenOption[] oo = fileOp == OPERATION.APPEND ?
                            new StandardOpenOption[]{StandardOpenOption.APPEND} :
                            new StandardOpenOption[]{
                                    StandardOpenOption.CREATE,
                                    StandardOpenOption.TRUNCATE_EXISTING,
                                    StandardOpenOption.WRITE};

                    if (data instanceof SString) {
                        Files.write(path, data.<String>get().getBytes("utf-8"), oo);
                    } else if (data instanceof SObject && data.get() instanceof byte[]) {
                        Files.write(path, ((byte[]) data.get()), oo);
                    } else if (data instanceof SList) {
                        StringBuilder sb = new StringBuilder();
                        for (SExpression v : data.<ListEx<SExpression>>get()) {
                            SValue value = v.evaluate(env);

                            if (value instanceof SString) {
                                sb.append(value.<String>get() + "\n");
                            }
                        }
                        Files.write(path, sb.toString().getBytes("utf-8"), oo);
                    } else {
                        throw new IOException();
                    }

                    return filename;
            }
        } catch (Exception ex) {
            return new SNull();
        }
    }

    @Override
    public SExpression deepClone() throws EgException {
        SEFile ret = new SEFile();
        ret.atom = this.atom;

        ret.filename = this.filename.deepClone();
        ret.fileOp = this.fileOp;
        if (this.data != null) {
            ret.data = this.data.deepClone();
        }

        return ret;
    }
}
