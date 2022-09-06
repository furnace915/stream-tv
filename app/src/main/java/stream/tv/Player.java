package stream.tv;

import java.util.Optional;

import static stream.tv.Category.LIVESTREAM;
import static stream.tv.SubClassification.RERUN;

public class Player {

    public String play(Content content, Optional<Plan> plan) {

        if (LIVESTREAM.equals(content.getCategory())) {
            if (plan.isPresent()) {
                return Viewer.view(content);
            }
            return Viewer.REQUIRES_PLAN_UPGRADE_MESSAGE;
        }


        if (RERUN.equals(content.getSubclassification())) {
            return Viewer.view(content);
        }
        return Viewer.REQUIRES_PLAN_UPGRADE_MESSAGE;

    }

}
