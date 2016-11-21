package org.coyove.eugine.core;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by coyove on 2016/9/10.
 */
public class PAppend extends SExpression {
    @ReplaceableVariable
    private SExpression left;

    @ReplaceableVariable
    private SExpression right;

    public PAppend() {}

    public PAppend(Atom ha, SExpression l, SExpression r) {
        atom = ha;
        left = l;
        right = r;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SValue evaluate(ExecEnvironment env) throws EgException {
        SValue left = this.left.evaluate(env);
        SValue right = this.right.evaluate(env);

        if (left instanceof SConcatString) {
            if (right != ExecEnvironment.Null) {
                if (right instanceof SConcatString) {
                    ((SConcatString) left).texts.addAll(((SConcatString) right).texts);
                } else {
                    ((SConcatString) left).texts.add(right.asString());
                }
            }

            return left;
        }

        if (left instanceof SString) {
            if (right != ExecEnvironment.Null) {
                String text = left.get();
                if (right instanceof SConcatString) {
                    left.underlying = text + right.<String>get();
                } else {
                    left.underlying = text + right.asString();
                }
            }

            return left;
        }

        if (left instanceof SList) {
            ListEx<SValue> list = left.get();
            if (left.immutable) {
                throw new EgException(2101, "list is immutable", atom);
            }

            list.add(right);
            return left;
        }

        return ExecEnvironment.Null;
    }

    @Override
    public SExpression deepClone() throws EgException {
        PAppend ret = new PAppend();
        ret.atom = this.atom;
        ret.left = this.left.deepClone();
        ret.right = this.right.deepClone();

        return ret;
    }
}
