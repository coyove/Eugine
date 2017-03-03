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

        FileInputStream fileIn = new FileInputStream(filePath);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        SExpression s = (SExpression) in.readObject();
        in.close();
        fileIn.close();

        return s;
    }
}
