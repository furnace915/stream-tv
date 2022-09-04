package stream.tv;

public class Streamer {
    public String play(Content content) {
        return new StringBuilder()
                .append("playing ")
                .append(content.getClassification())
                .append(":  ")
                .append("Movies")
                .append("-")
                .append(content.getName()).toString();
    }
}
