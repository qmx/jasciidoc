package me.qmx.jasciidoc.parser;

import me.qmx.jasciidoc.parser.ast.Title;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class AsciiDocParserTest {
    @Test
    public void parseTitle() {
        final Title expected = new Title("MyTitle", Title.Level.LEVEL_0);
        Title title = new AsciiDocParser("MyTitle\n=======").title();
        assertThat(title)
                .isNotNull()
                .isEqualTo(expected);
    }
}
