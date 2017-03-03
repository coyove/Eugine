package org.coyove.cli;

import org.coyove.eugine.library.log;
import org.coyove.eugine.parser.Parser;

public class main {
    public final static String VERSION = "1.0.0rc";

    public static ArgumentsParser.Options options = null;

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        System.setProperty("file.encoding", "utf-8");
        options = ArgumentsParser.read(args);

        log.Logger.info("eugine " + VERSION + " started");

        if (options.source != null) {
            try {
                if (options.binary) {
                    Parser.compileFile(options.source, options.outputBinaries);
                } else {
                    log.Logger.info(Parser.executeFile(options.source).toString());
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            log.Logger.warn("no source specified");
        }

        log.Logger.info("eugine quited");
    }
}