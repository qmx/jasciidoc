package me.qmx.jasciidoc;

import me.qmx.jasciidoc.parser.AsciiDocParser;
import me.qmx.jasciidoc.parser.ParseException;
import me.qmx.jasciidoc.parser.ast.Title;
import org.junit.Test;

import java.io.StringReader;

import static java.text.MessageFormat.format;
import static org.fest.assertions.Assertions.assertThat;

public class AsciiDocParserTest {

    private AsciiDocParser parse(String text) {
        return new AsciiDocParser(new StringReader(text));
    }

    @Test
    public void generatesAnEmptyDocument() throws ParseException {
        assertThat(parse("").document()).isNotNull();
    }

    @Test
    public void handlesMultiLineTitles() throws ParseException {
        assertThat(parse(format("Lol\n{0}", "===")).title()).isNotNull();
        assertThat(parse(format("Lol\n{0}", "---")).title()).isNotNull();
        assertThat(parse(format("Lol\n{0}", "~~~")).title()).isNotNull();
        assertThat(parse(format("Lol\n{0}", "^^^")).title()).isNotNull();
        assertThat(parse(format("Lol\n{0}", "+++")).title()).isNotNull();
    }
}
