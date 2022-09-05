package stream.tv;

public enum SubClassification {
    CURRENT("Current"),
    RERUN("Rerun");

    private final String text;

    SubClassification(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
