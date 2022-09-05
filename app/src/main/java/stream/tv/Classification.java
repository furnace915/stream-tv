package stream.tv;

public enum Classification {
    ONDEMAND("On-Demand"),
    LIVESTREAM("Streaming");


    private final String text;

    Classification(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
