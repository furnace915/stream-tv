package stream.tv;

import java.util.Objects;
import java.util.Optional;

public class Viewer implements Viewable {

    public String view(Content content, Optional<Plan> plan) {
        if (plan.isPresent()) {
            return new StringBuilder()
                    .append("playing ")
                    .append(content.getCategory().getText())
                    .append(": ")
                    .append(content.getSubclassification().getText())
                    .append(" - ")
                    .append(content.getName())
                    .toString();
        }

        if (Objects.equals(SubClassification.RERUN, content.getSubclassification())) {
            return new StringBuilder()
                    .append("playing ")
                    .append(content.getCategory().getText())
                    .append(": ")
                    .append(content.getSubclassification().getText())
                    .append(" - ")
                    .append(content.getName())
                    .toString();
        }

        return "upgrade your plan to access this content";

    }
}
