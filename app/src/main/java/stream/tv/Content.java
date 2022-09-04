package stream.tv;


public class Content {

    private final String classification;
    private final String name;

    private Content(ContentBuilder contentBuilder) {
        this.classification = contentBuilder.classification;
        this.name = contentBuilder.name;
    }

    public String getClassification() {
        return classification;
    }

    public String getName() {
        return name;
    }

    public static class ContentBuilder {

        private String classification;
        private String name;

        public ContentBuilder classification(String classification) {
            this.classification = classification;
            return this;
        }

        public ContentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Content build() {
            Content content = new Content(this);
            return content;
        }

    }
}
