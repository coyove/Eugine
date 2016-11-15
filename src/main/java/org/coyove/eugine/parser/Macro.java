package org.coyove.eugine.parser;

import org.coyove.eugine.util.ListEx;
import org.coyove.eugine.util.VMException;

import java.util.HashMap;

/**
 * Created by coyove on 2016/9/13.
 */
public class Macro {
    public String macroName;
    public ListEx<String> macroArgs;
    public Base macroBody;

    private class ReplacePair extends HashMap<String, Base> {
        public ListEx<Base> tails;
    }

    public Macro(Compound macro) throws VMException {
        Atom headAtom = (Atom) macro.atoms.head();
        if (macro.atoms.size() != 3)
            throw new VMException(1200, "must have 2 arguments", headAtom);

        if (macro.atoms.get(1) instanceof Atom)
            throw new VMException(1201, "the 2nd argument must be the macro header", headAtom);

        Compound header = (Compound) macro.atoms.get(1);
        if (header.atoms.size() == 0)
            throw new VMException(1202, "macro header must have a name", headAtom);

        Base n = header.atoms.get(0);
        if (n instanceof Compound || ((Atom) n).token.type != Token.TokenType.ATOMIC)
            throw new VMException(1203, "macro name must be a string atom", headAtom);

        macroName = ((Atom) n).token.value.toString();
        macroArgs = new ListEx<String>();

        for (Base a : header.atoms.skip(1)) {
            if (a instanceof Compound || ((Atom) a).token.type != Token.TokenType.ATOMIC)
                throw new VMException(1204, "macro argument must be a string atom", headAtom);

            macroArgs.add(((Atom) a).token.value.toString());
        }

        macroBody = macro.atoms.get(2);
    }

    public Base replace(Compound src) throws VMException {
        Atom headAtom = (Atom) src.atoms.head();

        if (src.atoms.size() < macroArgs.size() + 1)
            throw new VMException(1205, "not enough arguments to expand macro", headAtom);

        src.atoms.pop(); // first = macro name

        ReplacePair cands = new ReplacePair();
        for (String arg : macroArgs) {
            if (!arg.endsWith("...")) {
                cands.put(arg, src.atoms.pop());
            } else {
                cands.put(arg, null);
                cands.tails = new ListEx<Base>();
                cands.tails.addAll((ListEx<Base>)src.atoms.clone());
                src.atoms.clear();
                break;
            }
        }

        return replace_(macroBody.clone(), cands);
    }

    private Base replace_(Base body, ReplacePair cands) {
        if (body instanceof Atom) {
            String c = ((Atom) body).token.value.toString();
            if (cands.containsKey(c)) {
                Base ret = cands.get(c);
                return ret == null ? new Compound(cands.tails) : ret;
            } else {
                return body;
            }
        } else {
            ListEx<Base> atoms = ((Compound) body).atoms;
            int i = 0;
            while (i < atoms.size()) {
                if (atoms.get(i) instanceof Atom) {
                    String c = ((Atom)atoms.get(i)).token.value.toString();

                    if (cands.containsKey(c)) {
                        Base ret = cands.get(c);
                        if (ret != null) {
                            atoms.set(i, ret);
                        } else {
                            atoms.remove(i);
                            atoms.addAll(i, cands.tails);
                            i += 1 + cands.tails.size();
                            continue;
                        }
                    }

                } else {
                    atoms.set(i, replace_(atoms.get(i), cands));
                }
                i++;
            }
            return body;
        }
    }
}
