package me.qmx.jasciidoc.parser.ast;

public class Title {
    private final String text;
    private final Level level;

    public static enum Level {LEVEL_0, LEVEL_1, LEVEL_2, LEVEL_3, LEVEL_4}

    public Title(String text, Level level) {
        this.text = text;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Title title = (Title) o;

        if (level != title.level) return false;
        if (text != null ? !text.equals(title.text) : title.text != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = text != null ? text.hashCode() : 0;
        result = 31 * result + (level != null ? level.hashCode() : 0);
        return result;
    }
}
