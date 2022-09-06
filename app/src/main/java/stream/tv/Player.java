package stream.tv;

import java.util.Optional;

public class Player {

    public String play(Content content, Optional<Plan> plan) {
        Viewer viewer = new Viewer();
        return viewer.view(content, plan);
    }

}
