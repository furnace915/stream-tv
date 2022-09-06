package stream.tv;

public class Viewer {
    static final String REQUIRES_PLAN_UPGRADE_MESSAGE = "upgrade your plan to access this content";

    static String view(Content content) {
        return new StringBuilder()
                .append("playing ")
                .append(content.getCategory().getText())
                .append(": ")
                .append(content.getSubclassification().getText())
                .append(" - ")
                .append(content.getName()).toString();
    }
}
