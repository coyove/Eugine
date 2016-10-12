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
        put("null", new SNull(true));
        put("#nil", new SNull(true));
        put("true", new SBool(true, true));
        put("false", new SBool(false, true));
        put("#t", new SBool(true, true));
        put("#f", new SBool(false, true));
        put("~init", new SString("~init", true));
        put("~doc", new SString("~doc", true));
        put("~integer.max", new SInteger(Long.MAX_VALUE, true));
        put("~integer.min", new SInteger(Long.MIN_VALUE, true));
        put("~double.max", new SDouble(Double.MAX_VALUE, true));
        put("~double.min", new SDouble(Double.MIN_VALUE, true));
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

    public SExpression loadString(String code) throws Exception {
        Parser p = new Parser();
        environment.put("~source", new SString("<vm>"));
        return SExpression.cast(p.parse(code, "", "<vm>"));
    }

    public SExpression loadBinary(String filePath) throws Exception {
        Path p_ = Paths.get(filePath);

        String codeSource = p_.getFileName().toString();
        String codeFolder = filePath.substring(0, filePath.length() - codeSource.length());

        environment.put("~path", new SString(codeFolder));
        environment.put("~source", new SString(codeSource));

        FileInputStream fileIn = new FileInputStream(filePath);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        SExpression s = (SExpression) in.readObject();
        in.close();
        fileIn.close();

        return s;
    }

    public SExpression loadFile(String filePath) throws Exception {
        String code = new String(Files.readAllBytes(Paths.get(filePath)));
        Path p_ = Paths.get(filePath);

        String codeSource = p_.getFileName().toString();
        String codeFolder = filePath.substring(0, filePath.length() - codeSource.length());

        Parser p = new Parser();
        environment.put("~path", new SString(codeFolder));
        environment.put("~source", new SString(codeSource));

        return SExpression.cast(p.parse(code, codeFolder, codeSource));
    }
}
