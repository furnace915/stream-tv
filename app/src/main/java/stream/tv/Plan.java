package stream.tv;

public enum Plan {
    GOLD("gold"),
    SILVER("silver"),
    TRIAL("trial");


    private final String text;

    Plan(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
