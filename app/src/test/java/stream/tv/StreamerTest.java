package stream.tv;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class StreamerTest {

    @Test
    void Given_Gold_User_When_Player_Invoked_Then_Stream_Content() {

        Streamer streamer = new Streamer();
        String content = streamer.play();
        Assertions.assertThat(content).isEqualTo("playing Live Stream-Movies-The Godfather");

    }
}
