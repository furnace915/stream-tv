package stream.tv;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamerTest {

    @Test
    void Given_Free_User_When_Player_Invoked_Then_Stream_Content() {
        Content content = new Content.ContentBuilder()
                .classification("Live Stream")
                .name("The Godfather")
                .build();

        Streamer streamer = new Streamer();
        String actual = streamer.play(content);

        assertThat(actual).isEqualTo("playing Live Stream:  Movies-The Godfather");

    }
}
