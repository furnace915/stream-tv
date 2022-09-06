package stream.tv;

import java.util.Optional;

public interface Viewable {

    String view(Content content, Optional<Plan> plan);
}
