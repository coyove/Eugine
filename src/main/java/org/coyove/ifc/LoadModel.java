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
import java.lang.reflect.Array;
import java.util.Arrays;

import org.coyove.eugine.base.*;
import org.coyove.eugine.util.*;
import org.ifc.ifc2x3tc1.ClassInterface;
import org.ifc.ifc2x3tc1.IfcRoot;
import org.ifc.ifc2x3tc1.RootInterface;
import org.ifc.ifcmodel.IfcModel;
import org.ifc.step.parser.ParameterLookup;

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
        final IfcModel model = new IfcModel();
        try {
            model.readStepFile(new FileInputStream(path));
            SClosure m = SClosure.makeEmptyClosure(env);
            m.doc = "Ifc model at: " + path;

            final ListEx<SValue> objects = new ListEx<SValue>(model.getIfcObjects().size());
            for (ClassInterface ci : model.getIfcObjects()) {
                if (ci != null) {
                    objects.add(new SObject(ci));
                }
            }
            m.extra.put("objects", new SList(objects));

            m.extra.put("find", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments)
                        throws EgException {
                    String id = EgCast.toString(arguments.head(), atom);
                    return Model.decorateObject(new SObject(
                            model.getIfcObjectByEntityInstanceName(Integer.valueOf(id))), env);
                }
            }, 1));

            m.extra.put("walk", new SNativeCall(new NativeCallInterface() {
                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments)
                        throws EgException {

                    SClosure pred = EgCast.to(arguments.head(), SClosure.class);
                    if (pred == null || pred.argNames.size() == 0) {
                        throw new EgException(6987, "invalid predicate", atom);
                    }

                    ExecEnvironment newEnv = new ExecEnvironment();
                    newEnv.parentEnv = env;

                    SClosure newObject = SClosure.makeEmptyClosure(env);
                    newObject.extra.put("get",
                            new SNativeCall(new ForEachObjectGetDummy(), 1));

                    String arg = pred.argNames.head();
                    for (SValue object : objects) {
                        Model.decorateObject(object, newObject);
                        newEnv.bPut(arg, newObject);

                        for (SExpression se : pred.body) {
                            se.evaluate(newEnv);
                        }
                    }

                    return ExecEnvironment.Null;
                }
            }, 1));

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

class ForEachObjectGetDummy implements NativeCallInterface {
    protected Object object;

    public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments) throws EgException {
        if (arguments.size() == 0) {
            throw new EgException(2000, "not enough arguments", atom);
        }

        String name = EgCast.toString(arguments.head(), atom);

        if (name.equals("Id")) {
            return new SString(((IfcRoot) object).getGlobalId().getDecodedValue());
        } else {
//            Object v = ParameterLookup.getFieldRawValue(object, name);
//
//            if (v instanceof ClassInterface) {
//                return Model.decorateObject(new SObject(v), env);
//            } else if (v == null) {
//                return new SString("");
//            } else if (v.getClass().isArray()) {
//                int len = Array.getLength(v);
//                ListEx<SValue> ret = new ListEx<SValue>(len);
//
//                for (int i = 0; i < len; i++) {
//                    ret.add(Model.decorateObject(new SObject(Array.get(v, i)), env));
//                }
//
//                return new SList(ret);
//            } else {
//                return EgInterop.castJavaType(v);
//            }
            return Model.getField(object, name, env);
        }
    }
}
