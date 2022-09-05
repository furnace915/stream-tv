package stream.tv;

import static stream.tv.Classification.LIVESTREAM;
import static stream.tv.SubClassification.RERUN;

public class Streamer {

    private static final String REQUIRES_PLAN_UPGRADE_MESSAGE = "upgrade your plan to access this content";

    public String play(Content content) {
        if (LIVESTREAM.equals(content.getClassification())) {
            return REQUIRES_PLAN_UPGRADE_MESSAGE;
        }

        if (RERUN.equals(content.getSubclassification())) {
            return new StringBuilder()
                    .append("playing ")
                    .append(content.getClassification().getText())
                    .append(": ")
                    .append(content.getSubclassification().getText())
                    .append(" - ")
                    .append(content.getName()).toString();
        }
        return REQUIRES_PLAN_UPGRADE_MESSAGE;

    }
}
