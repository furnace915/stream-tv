package stream.tv;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamerTest {

    @Test
    void Given_Free_User_And_On_Demand_Rerun_When_Play_Then_Return_Streamed_Content() {
        Content content = new Content.ContentBuilder()
                .classification("On-Demand")
                .subclassification("Rerun")
                .name("The Godfather")
                .build();

        Streamer streamer = new Streamer();
        String actual = streamer.play(content);

        assertThat(actual).isEqualTo("playing On-Demand: Rerun - The Godfather");

    }
}
