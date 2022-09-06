package stream.tv;

import java.util.Optional;

import static stream.tv.Category.LIVESTREAM;
import static stream.tv.SubClassification.RERUN;

public class Player {

    public String play(Content content, Optional<Plan> plan) {
        Viewer viewer = new Viewer();
        return viewer.view(content, plan);
    }

}
