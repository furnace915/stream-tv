package stream.tv;

public enum SubClassification {
    CURRENT("Current"),
    RERUN("Rerun"),
    SPORTS("Sports");

    private final String text;

    SubClassification(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
