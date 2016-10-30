package org.coyove.eugine.library;

import org.coyove.eugine.base.*;
import org.coyove.eugine.parser.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.util.*;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zezhong on 2016/9/10.
 */
public class SERegexMatch extends SExpression {
    private SExpression text;
    private SExpression regex;

    public SERegexMatch() {}

    public SERegexMatch(Atom ha, Compound c) throws VMException {
        super(ha, c, 2);

        text = SExpression.cast(c.atoms.pop());
        regex = SExpression.cast(c.atoms.pop());
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws VMException {
        String text = Utils.cast(this.text.evaluate(env), SString.class,
                new VMException(3010, "subject must be string", headAtom)).get();

        String regex = Utils.cast(this.regex.evaluate(env), SString.class,
                new VMException(3011, "regex must be string", headAtom)).get();

        Matcher m = Pattern.compile(regex).matcher(text);

        List<SExpression> ret = new List<SExpression>();
        while (m.find()) {
            HashMap<String, SExpression> mapMatch = new HashMap<String, SExpression>();
            int i = 0;

            while (m.group(i) != null && i < m.groupCount()) {
                mapMatch.put("text", new SString(m.group(i)));
                mapMatch.put("start", new SInteger(m.start(i)));
                mapMatch.put("end", new SInteger(m.end(i)));

                i++;
            }

            ret.add(new SDict(mapMatch));
        }

        return new SList(ret);
    }

    @Override
    public SExpression deepClone() throws VMException {
        SERegexMatch ret = new SERegexMatch();
        ret.headAtom = this.headAtom;
        ret.tailCompound = this.tailCompound;
        ret.text = this.text.deepClone();
        ret.regex = this.regex.deepClone();

        return ret;
    }
}
