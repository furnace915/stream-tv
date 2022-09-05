package stream.tv;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamerTest {

    @Test
    void Given_Free_Plan_When_Play_On_Demand_Rerun_Then_Provide_Streamed_Content() {
        Content content = new Content.ContentBuilder()
                .classification(Classification.ONDEMAND)
                .subclassification(SubClassification.RERUN)
                .name("The Godfather")
                .build();

        Streamer streamer = new Streamer();
        String actual = streamer.play(content);

        assertThat(actual).isEqualTo("playing On-Demand: Rerun - The Godfather");

    }

    @Test
    void Given_Free_Plan_When_Play_On_Demand_Movie_Then_Block_Streamed_Content() {
        Content content = new Content.ContentBuilder()
                .classification(Classification.ONDEMAND)
                .subclassification(SubClassification.CURRENT)
                .name("Star Wars XX")
                .build();

        Streamer streamer = new Streamer();
        String actual = streamer.play(content);

        assertThat(actual).isEqualTo("upgrade your plan to access this content");

    }
}
