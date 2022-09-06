package stream.tv;


public class Content {

    private final Mode mode;

    private final Category category;
    private final String name;

    private Content(Builder builder) {
        this.mode = builder.mode;
        this.category = builder.category;
        this.name = builder.name;
    }

    public Mode getMode() {
        return mode;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public static class Builder {

        private Mode mode;

        private Category category;
        private String name;

        public Builder mode(Mode mode) {
            this.mode = mode;
            return this;
        }

        public Builder category(Category classification) {
            this.category = classification;
            return this;
        }


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Content build() {
            return new Content(this);
        }

    }
}
