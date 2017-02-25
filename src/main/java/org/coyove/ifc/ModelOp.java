package org.coyove.ifc;

import org.coyove.eugine.base.ReplaceableVariable;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.*;
import org.coyove.eugine.value.SClosure;
import org.ifc.ifc2x3tc1.IfcRelAssignsToGroup;
import org.ifc.step.parser.ParameterLookup;

/**
 * Created by coyove on 2016/12/19.
 */
public class ModelOp extends SExpression {
    @ReplaceableVariable
    SExpression object;

    @ReplaceableVariable
    SExpression key = null;

    byte op;

    public final static byte GET_PARAM = 0;
    public final static byte IS_RELATION_GROUP = 1;

    public ModelOp() {
    }

    public ModelOp(Atom ha, ListEx<SExpression> args, byte o) {
        super(ha, args, o == GET_PARAM ? 2 : 1);

        if (o == GET_PARAM) {
            object = args.head();
            key = args.get(1);
        } else {
            object = args.head();
        }

        op = o;
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        switch (op) {
            case GET_PARAM: {
                Object obj = this.object.evaluate(env).get();
                String key = EgCast.toString(this.key.evaluate(env), this.atom);
                return Model.getField(obj, key, env);
            }
            case IS_RELATION_GROUP: {
                SValue tester = this.object.evaluate(env);
                Object object;
                if (tester instanceof SClosure) {
                    object = ((SClosure) tester).extra.get("nativeObject").get();
                } else {
                    object = tester.get();
                }

                return object instanceof IfcRelAssignsToGroup ? ExecEnvironment.True : ExecEnvironment.False;
            }
            default:
                return ExecEnvironment.Null;
        }
    }

    @Override
    public SExpression deepClone() {
        ModelOp ret = new ModelOp();
        ret.atom = this.atom;
        ret.object = this.object.deepClone();

        if (this.key != null) {
            ret.key = this.key.deepClone();
        }

        return ret;
    }
}
