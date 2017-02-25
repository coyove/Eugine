package org.coyove.eugine;

import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.cli.main;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by coyove on 2016/9/9.
 */
public class Eugine implements Serializable {
    public ExecEnvironment environment = new ExecEnvironment() {{
        put("__comparator__", new SString("__comparator__"));
        put("__doc__", new SString("__doc__"));
        put("__version__", new SString(main.VERSION));
        put("__number_max__", new SNumber(Double.MAX_VALUE));
        put("__number_min__", new SNumber(Double.MIN_VALUE));
    }};

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
