package org.coyove.eugine.library;

import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SEInStr extends SExpression {
    private SExpression text;
    private SExpression findText;

    public SEInStr() {}

    public SEInStr(Atom ha, Compound c) throws VMException {
        super(ha, c, 2);

        text = SExpression.cast(c.atoms.pop());
        findText = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        String text = Utils.cast(this.text.evaluate(env), SString.class,
                new VMException(3010, "subject must be string", headAtom)).get();

        String findText = Utils.cast(this.findText.evaluate(env), SString.class,
                new VMException(3011, "finder must be string", headAtom)).get();

        return new SBool(StringUtils.contains(text, findText));
    }

    @Override
    public SExpression deepClone() throws VMException {
        SEInStr ret = new SEInStr();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.text = this.text.deepClone();
        ret.findText = this.findText.deepClone();

        return ret;
    }
}
