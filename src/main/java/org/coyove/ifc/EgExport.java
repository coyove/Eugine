//package org.coyove.ifc;
//
//import org.antlr.v4.runtime.Token;
//import org.coyove.eugine.base.NativeCallInterface;
//import org.coyove.eugine.base.SExpression;
//import org.coyove.eugine.base.SKeywords;
//import org.coyove.eugine.base.SValue;
//import org.coyove.eugine.parser.Atom;
//import org.coyove.eugine.library.Exportable;
//import org.coyove.eugine.util.EgException;
//import org.coyove.eugine.util.ExecEnvironment;
//import org.coyove.eugine.util.ListEx;
//import org.coyove.eugine.value.SDict;
//import org.coyove.eugine.value.SNativeCall;
//
//import java.util.HashMap;
//
///**
// * Created by zezhong on 2016/12/19.
// */
//public class EgExport implements Exportable {
//    public void export(SKeywords.KeywordMap lookup) {
//        lookup.put("Ifc.read", new SKeywords.CallableKeyword() {
//            public SExpression call(Token tok, ListEx<SExpression> arguments) {
//                return new LoadModel(new Atom(tok), arguments);
//            }
//        });
//        lookup.put("Ifc.Object.getParam", new SKeywords.CallableKeyword() {
//            public SExpression call(Token tok, ListEx<SExpression> arguments) {
//                return new ModelOp(new Atom(tok), arguments, ModelOp.GET_PARAM);
//            }
//        });
//        lookup.put("Ifc.isRelGroup", new SKeywords.CallableKeyword() {
//            public SExpression call(Token tok, ListEx<SExpression> arguments) {
//                return new ModelOp(new Atom(tok), arguments, ModelOp.IS_RELATION_GROUP);
//            }
//        });
//
//        final ModelOp Ifc_isRelGroup = new ModelOp();
//        Ifc_isRelGroup.op = ModelOp.IS_RELATION_GROUP;
//
//        ExecEnvironment.globalStaticEnv.put("Ifc", new SDict(new HashMap<String, SValue>() {{
//            put("isRelGroup", new SNativeCall(new NativeCallInterface() {
//                public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments)
//                        throws EgException {
//                    Ifc_isRelGroup.atom = atom;
//                    Ifc_isRelGroup.object = arguments.head();
//                    if (arguments.size() > 1) {
//                        Ifc_isRelGroup.key = arguments.get(1);
//                    }
//                    return Ifc_isRelGroup.evaluate(env);
//                }
//            }, 1));
//        }}));
//    }
//}
