package org.coyove.mapdb;

import org.antlr.v4.runtime.Token;
import org.coyove.eugine.base.SExpression;
import org.coyove.eugine.base.SKeywords;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.pm.Exportable;
import org.coyove.eugine.util.ListEx;

import java.util.HashMap;

/**
 * Created by coyove on 2016/11/16.
 */
public class EgExport implements Exportable {
    public void export(HashMap<String, SKeywords.CallableKeyword> lookup) {
        lookup.put("MapDB.open", new SKeywords.CallableKeyword() {
            public SExpression call(Token tok, ListEx<SExpression> arguments) {
                return new OpenOp(new Atom(tok), arguments);
            }
        });
    }
}
