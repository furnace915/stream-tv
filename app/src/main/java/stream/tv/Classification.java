package stream.tv;

public enum Classification {
    ONDEMAND("On-Demand");


    private final String text;

    Classification(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
