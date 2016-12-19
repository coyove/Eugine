package org.coyove.ifc;

/**
 * Created by zezhong on 2016/12/19.
 */

import org.coyove.eugine.base.ReplaceableVariable;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;
import org.coyove.eugine.value.*;

import java.io.FileInputStream;
import java.util.HashMap;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;
import org.ifc.ifc2x3tc1.ClassInterface;
import org.ifc.ifcmodel.IfcModel;

/**
 * Created by coyove on 2016/9/10.
 */
public class LoadModel extends SExpression {
    @ReplaceableVariable
    private SExpression argument;

    public LoadModel() {}

    public LoadModel(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 1);
        argument = args.head();
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        String path = EgCast.toString(argument.evaluate(env), this.atom);
        IfcModel model = new IfcModel();
        try {
            model.readStepFile(new FileInputStream(path));
            SClosure m = new SClosure(env,
                    new ListEx<String>(),
                    new ListEx<Boolean>(),
                    new ListEx<SExpression>(),
                    "Ifc model at: " + path);

            ListEx<SValue> objects = new ListEx<SValue>(model.getIfcObjects().size());
            for (ClassInterface ci : model.getIfcObjects()) {
                objects.add(new SObject(ci));
            }
            m.extra.put("objects", new SList(objects));

//            m.extra.put("forEach", new SClosure(env, ));

            return m;
        } catch(Exception e) {
            return ExecEnvironment.Null;
        }
    }

    @Override
    public SExpression deepClone() {
        LoadModel ret = new LoadModel();
        ret.atom = this.atom;
        ret.argument = this.argument.deepClone();
        return ret;
    }
}
