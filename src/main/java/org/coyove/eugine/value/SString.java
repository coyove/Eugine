package org.coyove.eugine.value;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.coyove.eugine.base.NativeCallInterface;
import org.coyove.eugine.base.PseudoCallInterface;
import org.coyove.eugine.base.SValue;
import org.coyove.eugine.base.SComplexValue;
import org.coyove.eugine.parser.Atom;
import org.coyove.eugine.util.EgCast;
import org.coyove.eugine.util.EgException;
import org.coyove.eugine.util.ExecEnvironment;
import org.coyove.eugine.util.ListEx;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by coyove on 2016/9/9.
 */
public class SString extends SComplexValue {
    private static class RegexOptions {
        public boolean first;
        public boolean regex;
    }

    private static RegexOptions parseOptions(String options) {
        RegexOptions ret = new RegexOptions();
        for (char c : options.toLowerCase().toCharArray()) {
            switch (c) {
                case 'r':
                    ret.regex = true;
                    break;
                case 'f':
                    ret.first = true;
                    break;
            }
        }

        return ret;
    }

    public final static Map<String, PseudoCallInterface> pseudoCalls =
            new HashMap<String, PseudoCallInterface>(){{
                put("join", new PseudoCallInterface() {
                    public SValue call(final SValue in) {
                        return new SNativeCall(new NativeCallInterface() {
                            public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments)
                                    throws EgException {
                                SValue subject = arguments.head();
                                String delim = in.get();

                                if (subject instanceof SList) {
                                    ListEx<SValue> l = subject.get();
                                    String[] tmp = new String[l.size()];
                                    for (int i = 0; i < l.size(); i++)
                                        tmp[i] = l.get(i).asString();

                                    return new SString(StringUtils.join(tmp, delim));
                                } else {
                                    return ExecEnvironment.Null;
                                }
                            }
                        }, 1);
                    }
                });

                put("trimmed", new PseudoCallInterface() {
                    public SValue call(SValue in) {
                        return new SString(StringUtils.trim(in.<String>get()));
                    }
                });

                put("lowered", new PseudoCallInterface() {
                    public SValue call(SValue in) {
                        return new SString(in.<String>get().toLowerCase());
                    }
                });

                put("uppered", new PseudoCallInterface() {
                    public SValue call(SValue in) {
                        return new SString(in.<String>get().toUpperCase());
                    }
                });

                put("ascii", new PseudoCallInterface() {
                    public SValue call(SValue in) {
                        String text = in.get();
                        if (text.length() > 0)
                            return new SNumber(text.charAt(0));
                        else
                            return ExecEnvironment.Null;
                    }
                });

                put("split", new PseudoCallInterface() {
                    public SValue call(final SValue in) {
                        return new SNativeCall(new NativeCallInterface() {
                            public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments)
                                    throws EgException {
                                String delim = EgCast.toString(arguments.head(), atom);
                                String text = in.get();

                                RegexOptions opt = new RegexOptions();
                                if (arguments.size() > 2)
                                    opt = parseOptions(EgCast.toString(arguments.get(2), atom));

                                ListEx<SValue> ret = new ListEx<SValue>();

                                if (opt.regex) {
                                    for (String s : text.split(delim))
                                        ret.add(new SString(s));
                                } else {
                                    for (String s : StringUtils.splitByWholeSeparator(text, delim))
                                        ret.add(new SString(s));
                                }

                                return new SList(ret);
                            }
                        }, 1);
                    }
                });

                put("replace", new PseudoCallInterface() {
                    public SValue call(final SValue in) {
                        return new SNativeCall(new NativeCallInterface() {
                            public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments)
                                    throws EgException {
                                String oldtext = EgCast.toString(arguments.head(), atom);
                                String newtext = EgCast.toString(arguments.get(1), atom);
                                String text = in.get();
                                RegexOptions opt = new RegexOptions();

                                if (arguments.size() > 2)
                                    opt = parseOptions(EgCast.toString(arguments.get(2), atom));

                                if (opt.regex) {
                                    if (opt.first)
                                        return new SString(text.replaceFirst(oldtext, newtext));
                                    else
                                        return new SString(text.replaceAll(oldtext, newtext));
                                } else {
                                    return new SString(text.replace(oldtext, newtext));
                                }
                            }
                        }, 2);
                    }
                });

                put("startswith", new PseudoCallInterface() {
                    public SValue call(final SValue in) {
                        return new SNativeCall(new NativeCallInterface() {
                            public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments)
                                    throws EgException {
                                String text = EgCast.toString(arguments.head(), atom);
                                return in.<String>get().startsWith(text) ?
                                        ExecEnvironment.True : ExecEnvironment.False;
                            }
                        }, 1);
                    }
                });

                put("endswith", new PseudoCallInterface() {
                    public SValue call(final SValue in) {
                        return new SNativeCall(new NativeCallInterface() {
                            public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments)
                                    throws EgException {
                                String text = EgCast.toString(arguments.head().evaluate(env), atom);
                                return in.<String>get().endsWith(text) ?
                                        ExecEnvironment.True : ExecEnvironment.False;
                            }
                        }, 1);
                    }
                });

                put("match", new PseudoCallInterface() {
                    public SValue call(final SValue in) {
                        return new SNativeCall(new NativeCallInterface() {
                            public SValue call(Atom atom, ExecEnvironment env, ListEx<SValue> arguments)
                                    throws EgException {
                                String regex = EgCast.toString(arguments.head().evaluate(env), atom);
                                Matcher m = Pattern.compile(regex).matcher(in.<String>get());

                                ListEx<SValue> ret = new ListEx<SValue>();
                                while (m.find()) {
                                    HashMap<String, SValue> mapMatch = new HashMap<String, SValue>();
                                    int i = 0;

                                    while (m.group(i) != null && i < m.groupCount()) {
                                        mapMatch.put("text", new SString(m.group(i)));
                                        mapMatch.put("start", new SNumber(m.start(i)));
                                        mapMatch.put("end", new SNumber(m.end(i)));

                                        i++;
                                    }

                                    ret.add(new SDict(mapMatch));
                                }

                                return new SList(ret);
                            }
                        }, 1);
                    }
                });
            }};

    public SString() {
        // Only used by SConcatString
    }

    public SString(String str) {
        super(str);
    }

    public void setCharAt(int index, char c) {
        StringBuilder sb = new StringBuilder(((String) underlying));
        sb.setCharAt(index, c);
        underlying = sb.toString();
    }

    @Override
    public SValue clone() {
        return new SString((String) underlying);
    }

    @Override
    public SValue lightClone() {
        return clone();
    }

    @Override
    public String toString() {
        return "string = \"" + StringEscapeUtils.escapeJava(underlying.toString()) + "\"";
    }

    @Override
    public String asString() {
        return underlying.toString();
    }
}
