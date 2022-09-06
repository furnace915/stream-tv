package stream.tv;


public class Content {

    private final Category category;

    private final SubClassification subclassification;
    private final String name;

    private Content(Builder builder) {
        this.category = builder.category;
        this.subclassification = builder.subclassification;
        this.name = builder.name;
    }

    public Category getCategory() {
        return category;
    }

    public SubClassification getSubclassification() {
        return subclassification;
    }

    public String getName() {
        return name;
    }

    public static class Builder {

        private Category category;

        private SubClassification subclassification;
        private String name;

        public Builder category(Category category) {
            this.category = category;
            return this;
        }

        public Builder subclassification(SubClassification classification) {
            this.subclassification = classification;
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
