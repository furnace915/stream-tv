package stream.tv;

import static stream.tv.SubClassification.RERUN;

public class Streamer {
    public String play(Content content) {

        if (RERUN.equals(content.getSubclassification())) {
            return new StringBuilder()
                    .append("playing ")
                    .append(content.getClassification().getText())
                    .append(": ")
                    .append(content.getSubclassification().getText())
                    .append(" - ")
                    .append(content.getName()).toString();
        } else {
            return "upgrade your plan to access this content";
        }


    }
}
