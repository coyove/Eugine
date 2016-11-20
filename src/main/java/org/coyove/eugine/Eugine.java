package org.coyove.eugine;

import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.ExecEnvironment;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by coyove on 2016/9/9.
 */
public class Eugine implements Serializable {
    public ExecEnvironment environment = new ExecEnvironment() {{
        put("__comparator__", new SString("__comparator__", true));
        put("__doc__", new SString("__doc__", true));
        put("__integer_max__", new SInteger(Long.MAX_VALUE, true));
        put("__integer_min__", new SInteger(Long.MIN_VALUE, true));
        put("__double_max__", new SDouble(Double.MAX_VALUE, true));
        put("__double_min__", new SDouble(Double.MIN_VALUE, true));
    }};

    public Object execute(SExpression sExpr) throws Exception {
        return sExpr.evaluate(environment).get();
    }

    public void compileToFile(SExpression s, String fn) throws Exception {
        FileOutputStream fileOut = new FileOutputStream(fn);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(s);
        out.close();
        fileOut.close();
    }

    public SExpression loadBinary(String filePath) throws Exception {
        Path p_ = Paths.get(filePath);

        String codeSource = p_.getFileName().toString();
        String codeFolder = filePath.substring(0, filePath.length() - codeSource.length());

        environment.put("__path__", new SString(codeFolder));
        environment.put("__file__", new SString(codeSource));

        FileInputStream fileIn = new FileInputStream(filePath);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        SExpression s = (SExpression) in.readObject();
        in.close();
        fileIn.close();

        return s;
    }
}
