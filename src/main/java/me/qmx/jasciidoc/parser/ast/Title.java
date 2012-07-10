package me.qmx.jasciidoc.parser.ast;

import me.qmx.jasciidoc.parser.Token;

public class Title {

    private final Token title;
    private final Token level;

    public Title(Token title, Token level) {
        this.title = title;
        this.level = level;
    }
}
