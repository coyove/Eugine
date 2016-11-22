package org.coyove.test;

import java.util.HashMap;

/**
 * Created by coyove on 2016/11/22.
 */
public class ArgumentsParser {
    public static class Arguments extends HashMap<String, Object> {
        public boolean isEnabled(String key) {
            Object v = super.get(key);
            return v instanceof Boolean ? ((Boolean) v) : false;
        }

        public String getSource() {
            return ((String) super.get("source"));
        }
    }

    public static Arguments read(String[] args) {
        int i = 0;
        Arguments ret = new Arguments();
        while(i < args.length) {
            if (args[i].equals("--repl") || args[i].equals("-r")) {
                ret.put("repl", true);
                i++;
            } else if (args[i].equals("--aggressive")) {
                ret.put("aggressive", true);
                i++;
            } else if (args[i].equals("--core-only")) {
                ret.put("core", true);
                i++;
            } else if (args[i].equals("--no-robot")) {
                ret.put("no-robot", true);
                i++;
            } else {
                ret.put("source", args[i]);
                i++;
            }
        }

        return ret;
    }
}
