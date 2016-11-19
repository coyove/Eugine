package org.coyove.eugine.parser;

import org.apache.commons.lang3.tuple.Pair;
import org.coyove.eugine.util.*;

import java.nio.file.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.*;

/**
 * Created by coyove on 2016/9/9.
 */
@Deprecated
public class Parser {

    private String basePath;
    private HashMap<String, Macro> macros = new HashMap<String, Macro>();

    private String getGroup(Matcher m, String gn) {
        try {
            String r = m.group(gn);
            return r;
        } catch (Exception e) {
            return null;
        }
    }

    public Compound parse(String text, String path, String source) throws EgException {
        Pattern reString = Pattern.compile(
                "(%\"(?<rawstr>(\"\"|[^\"])*)\")|" +
                        "(\"(?<str>(\\\\.|[^\"\\\\])*)\")|" +
                        "(?<paren>[\\(\\)\\[\\]\\{\\}])|" +
                        "((?<atom>[^\\(\\)\\[\\]\\{\\}\\s\\r\\n;]+)(?=[\\s\\r\\n\\(\\)\\[\\]\\{\\};]+))|" +
                        "(?<comment>;(.|\\r)*?(\\n|$))"
        );

        if (text.length() < 2)
            throw new EgException(1000, "Invalid code");

        basePath = path;

        ListEx<Token> tokens = new ListEx<Token>();

        Matcher m = reString.matcher(text);
        LineFinder finder = new LineFinder(text);

        while (m.find()) {
            if (getGroup(m, "comment") != null)
                continue;

            Pair<Integer, Integer> n = finder.find(m.start());
            Token tok = new Token();
            tok.line = n.getLeft();
            tok.lineIndex = n.getRight();
            tok.source = source;

            if (getGroup(m, "str") != null) {
                tok.type = Token.TokenType.STRING;
                tok.value = finder.unescapeString(getGroup(m, "str"));
                tokens.add(tok);
            } else if (getGroup(m, "rawstr") != null) {
                tok.type = Token.TokenType.STRING;
                tok.value = getGroup(m, "rawstr").replaceAll("\"\"", "\"");
                tokens.add(tok);
            } else if (getGroup(m, "paren") != null) {
                tok.value = getGroup(m, "paren");
                tok.type = Base.bracketLookup.get(tok.value);
                tokens.add(tok);
            } else if (getGroup(m, "atom") != null) {
                String v = getGroup(m, "atom");

                if (v.contains("::") && !v.equals("::")) {
                    String[] parts = v.split("::");
                    Token[] toks = new Token[parts.length + 3];

                    toks[0] = new Token(Token.TokenType.LPAREN, "(");
                    toks[toks.length - 1] = new Token(Token.TokenType.RPAREN, ")");
                    toks[1] = new Token(Token.TokenType.ATOMIC, "::");
                    toks[2] = new Token(Token.TokenType.ATOMIC, parts[0].isEmpty() ? "~this" : parts[0]);

                    for (int i = 1; i < parts.length; i++) {
                        toks[2 + i] = new Token(Token.TokenType.ATOMIC, parts[i]);
                    }

                    tokens.addAll(Arrays.asList(toks));

                } else {
                    try {
                        if (v.contains(".")) {
                            tok.value = Double.parseDouble(v);
                            tok.type = Token.TokenType.DOUBLE;
                            tokens.add(tok);
                        } else {
                            tok.value = Long.parseLong(v);
                            tok.type = Token.TokenType.INTEGER;
                            tokens.add(tok);
                        }
                    } catch (Exception e) {
                        tok.type = Token.TokenType.ATOMIC;
                        tok.value = v;
                        tokens.add(tok);
                    }
                }
            }
        }

        Compound chain = new Compound();
        chain.atoms.add(new Atom(new Token(Token.TokenType.ATOMIC, "chain")));

        while (tokens.size() > 0) chain.atoms.add(parseNext(tokens));

        return chain;
    }

    private Base parseNext(ListEx<Token> tokens) throws EgException {
        Token token = tokens.pop();
        if (token == null)
            return null;

        if (token.type == Token.TokenType.RPAREN ||
                token.type == Token.TokenType.RBRACK ||
                token.type == Token.TokenType.RBRACE)
            throw new EgException(1000, "unexpected character");

        if (token.type == Token.TokenType.LPAREN ||
                token.type == Token.TokenType.LBRACK ||
                token.type == Token.TokenType.LBRACE) {

            Token.TokenType ending;
            switch (token.type) {
                case LPAREN:
                    ending = Token.TokenType.RPAREN;
                    break;
                case LBRACE:
                    ending = Token.TokenType.RBRACE;
                    break;
                default:
                    ending = Token.TokenType.RBRACK;
            }

            Compound comp = new Compound();

            while (tokens.head() != null && tokens.head().type != ending)
                comp.atoms.add(parseNext(tokens));

            if (tokens.size() == 0 || tokens.head().type != ending)
                throw new EgException(1000, "unexpected character");

            tokens.pop();

            // [...] form
            if (token.type == Token.TokenType.LBRACK && comp.atoms.size() >= 2) {
                Base tmp = comp.atoms.get(0);
                comp.atoms.set(0, comp.atoms.get(1));
                comp.atoms.set(1, tmp);
            }

            // {...} form
            if (token.type == Token.TokenType.LBRACE)
                comp.atoms.add(0, new Atom(new Token(Token.TokenType.ATOMIC, "chain")));

            if (comp.atoms.size() == 2 && comp.atoms.get(0) instanceof Atom && comp.atoms.get(1) instanceof Atom &&
                    ((Atom) comp.atoms.head()).token.value.toString().equals("~include")) {

                Atom path = (Atom) comp.atoms.get(1);
                if (path.token.type == Token.TokenType.STRING) {
                    String codePath = basePath + path.token.value;
                    Path p_ = Paths.get(codePath);

                    String codeSource = p_.getFileName().toString();
                    String codeFolder = codePath.substring(0, codePath.length() - codeSource.length());

                    try {
                        Parser p = new Parser();
                        p.macros = macros;
                        Compound inc = p.parse(new String(Files.readAllBytes(p_)), codeFolder, codeSource);
                        comp.atoms = new ListEx<Base>();
                        comp.atoms.add(inc);
                    } catch (Exception ex) {
                        throw new EgException(1100, "failed to include '" + codePath + "', " + ex.getMessage(),
                                (Atom) comp.atoms.get(0));
                    }
                } else {
                    throw new EgException(1101, "path must be a static string", (Atom) comp.atoms.head());
                }
            }

            if (comp.atoms.size() == 3 && comp.atoms.head() instanceof Atom &&
                    ((Atom) comp.atoms.head()).token.value.toString().equals("~define")) {
                Macro m = new Macro(comp);
                macros.put(m.macroName, m);
                return new Compound();
            }

            if (comp.atoms.size() == 2 && comp.atoms.head() instanceof Atom &&
                    ((Atom) comp.atoms.head()).token.value.toString().equals("~undef")) {
                Atom name = Utils.cast(comp.atoms.get(1), Atom.class,
                        new EgException(1102, "invalid subject to undef", (Atom) comp.atoms.head()));
                macros.remove(name.token.value.toString());
                return new Compound();
            }

            if (comp.atoms.head() instanceof Atom) {
                String lead = ((Atom) comp.atoms.head()).token.value.toString();
                if (macros.containsKey(lead)) {
                    Macro m = macros.get(lead);
                    Base ret = m.replace(comp);

                    if (m.macroArgs.size() == comp.atoms.size()) {
                        return ret;
                    } else {
                        comp.atoms.add(0, ret);
                    }
                }
            }

            return comp;
        }

        return new Atom(token);
    }
}
