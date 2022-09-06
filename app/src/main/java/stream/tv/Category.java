package stream.tv;

public enum Category {
    ONDEMAND("On-Demand"),
    LIVESTREAM("Live Stream");


    private final String text;

    Category(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
