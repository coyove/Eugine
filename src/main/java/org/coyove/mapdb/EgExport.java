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
        lookup.put("MapDB.table.open", new SKeywords.CallableKeyword() {
            public SExpression call(Token tok, ListEx<SExpression> arguments) {
                return new OpenTableOp(new Atom(tok), arguments);
            }
        });
        lookup.put("MapDB.close", new SKeywords.CallableKeyword() {
            public SExpression call(Token tok, ListEx<SExpression> arguments) {
                return new DbOp(new Atom(tok), arguments, DbOp.OPERATION.CLOSE);
            }
        });
        lookup.put("MapDB.commit", new SKeywords.CallableKeyword() {
            public SExpression call(Token tok, ListEx<SExpression> arguments) {
                return new DbOp(new Atom(tok), arguments, DbOp.OPERATION.COMMIT);
            }
        });
        lookup.put("MapDB.table.put", new SKeywords.CallableKeyword() {
            public SExpression call(Token tok, ListEx<SExpression> arguments) {
                return new TableOp(new Atom(tok), arguments, TableOp.OPERATION.PUT);
            }
        });
        lookup.put("MapDB.table.get", new SKeywords.CallableKeyword() {
            public SExpression call(Token tok, ListEx<SExpression> arguments) {
                return new TableOp(new Atom(tok), arguments, TableOp.OPERATION.GET);
            }
        });
        lookup.put("MapDB.table.remove", new SKeywords.CallableKeyword() {
            public SExpression call(Token tok, ListEx<SExpression> arguments) {
                return new TableOp(new Atom(tok), arguments, TableOp.OPERATION.REMOVE);
            }
        });
    }
}
