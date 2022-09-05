package stream.tv;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamerTest {

    private Streamer streamer;

    @BeforeEach
    void setUp() {
        streamer = new Streamer();
    }

    @Test
    void Given_Free_Plan_When_Play_On_Demand_Rerun_Then_Provide_Streamed_Content() {
        Content content = new Content.ContentBuilder()
                .classification(Classification.ONDEMAND)
                .subclassification(SubClassification.RERUN)
                .name("The Godfather")
                .build();

        assertThat(streamer.play(content)).isEqualTo("playing On-Demand: Rerun - The Godfather");

    }

    @Test
    void Given_Free_Plan_When_Play_On_Demand_Movie_Then_Block_Streamed_Content() {
        Content content = new Content.ContentBuilder()
                .classification(Classification.ONDEMAND)
                .subclassification(SubClassification.CURRENT)
                .name("Star Wars 2112")
                .build();

        assertThat(streamer.play(content)).isEqualTo("upgrade your plan to access this content");

    }

    @Test
    void Given_Free_Plan_When_Play_Live_Stream_Then_Block_Content() {
        Content content = new Content.ContentBuilder()
                .classification(Classification.LIVESTREAM)
                .subclassification(SubClassification.SPORTS)
                .name("Detroit Lions Football")
                .build();

        assertThat(streamer.play(content)).isEqualTo("upgrade your plan to access this content");

    }
}
