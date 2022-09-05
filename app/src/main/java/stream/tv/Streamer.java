package stream.tv;

import static stream.tv.Classification.LIVESTREAM;
import static stream.tv.SubClassification.RERUN;

public class Streamer {
    public String play(Content content) {
        if (LIVESTREAM.equals(content.getClassification())) {
            return "upgrade your plan to access this content";
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
        return "upgrade your plan to access this content";

    }
}
