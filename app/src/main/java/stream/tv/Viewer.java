package stream.tv;

import java.util.Objects;
import java.util.Optional;

public class Viewer implements Viewable {

    public String view(Content content, Optional<Plan> plan) {
        if (plan.isPresent()) {
            return new StringBuilder()
                    .append("playing ")
                    .append(content.getMode().getText())
                    .append(": ")
                    .append(content.getCategory().getText())
                    .append(" - ")
                    .append(content.getName())
                    .toString();
        }

        if (Objects.equals(Category.RERUN, content.getCategory())) {
            return new StringBuilder()
                    .append("playing ")
                    .append(content.getMode().getText())
                    .append(": ")
                    .append(content.getCategory().getText())
                    .append(" - ")
                    .append(content.getName())
                    .toString();
        }

        return "upgrade your plan to access this content";

    }
}
