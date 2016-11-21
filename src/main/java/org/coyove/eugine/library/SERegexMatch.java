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
    @ReplaceableVariable
    private SExpression text;

    @ReplaceableVariable
    private SExpression regex;

    public SERegexMatch() {}

    public SERegexMatch(Atom ha, ListEx<SExpression> args) {
        super(ha, args, 2);

        text = args.get(0);
        regex = args.get(1);
    }

    @Override
    public SValue evaluate(ExecEnvironment env) throws EgException {
        String text = Utils.castString(this.text.evaluate(env), atom);
        String regex = Utils.castString(this.regex.evaluate(env), atom);

        Matcher m = Pattern.compile(regex).matcher(text);

        ListEx<SValue> ret = new ListEx<SValue>();
        while (m.find()) {
            HashMap<String, SValue> mapMatch = new HashMap<String, SValue>();
            int i = 0;

            while (m.group(i) != null && i < m.groupCount()) {
                mapMatch.put("text", new SString(m.group(i)));
                mapMatch.put("start", new SLong(m.start(i)));
                mapMatch.put("end", new SLong(m.end(i)));

                i++;
            }

            ret.add(new SDict(mapMatch));
        }

        return new SList(ret);
    }

    @Override
    public SExpression deepClone() throws EgException {
        SERegexMatch ret = new SERegexMatch();
        ret.atom = this.atom;

        ret.text = this.text.deepClone();
        ret.regex = this.regex.deepClone();

        return ret;
    }
}
