package org.coyove.eugine.parser;

import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by coyove on 2016/9/9.
 */
public abstract class Base implements java.io.Serializable {
    public abstract Base clone();

    public static HashMap<String, Token.TokenType> bracketLookup =
        new HashMap<String, Token.TokenType>()
        {{
            put("(", Token.TokenType.LPAREN );
            put(")", Token.TokenType.RPAREN );
            put("[", Token.TokenType.LBRACK );
            put("]", Token.TokenType.RBRACK );
            put("{", Token.TokenType.LBRACE );
            put("}", Token.TokenType.RBRACE );
        }};


}
