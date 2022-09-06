package stream.tv;

public enum Category {
    CURRENT("Current"),
    RERUN("Rerun"),
    SPORTS("Sports");

    private final String text;

    Category(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
