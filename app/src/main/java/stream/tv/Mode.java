package stream.tv;

public enum Mode {
    ONDEMAND("On-Demand"),
    LIVESTREAM("Live Stream");


    private final String text;

    Mode(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
