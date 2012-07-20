package me.qmx.jasciidoc.parser;

import me.qmx.jasciidoc.parser.ast.Title;

import java.io.Reader;
import java.io.StringReader;

public class AsciiDocParser {

    private final Reader reader;

    public AsciiDocParser(String text) {
        this(new StringReader(text));
    }

    public AsciiDocParser(Reader reader) {
        this.reader = reader;
    }

    public Title title() {
        return new Title("meh", Title.Level.LEVEL_1);
    }
}
