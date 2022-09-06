package stream.tv;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {

    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player();
    }

    @Test
    void Given_Free_Plan_When_Play_On_Demand_Rerun_Then_Provide_Content() {
        Content content = new Content.ContentBuilder()
                .classification(Classification.ONDEMAND)
                .subclassification(SubClassification.RERUN)
                .name("The Godfather")
                .build();

        assertThat(player.play(content,Optional.empty() )).isEqualTo("playing On-Demand: Rerun - The Godfather");

    }

    @Test
    void Given_Free_Plan_When_Play_On_Demand_Movie_Then_Block_Content() {
        Content content = new Content.ContentBuilder()
                .classification(Classification.ONDEMAND)
                .subclassification(SubClassification.CURRENT)
                .name("Star Wars 2112")
                .build();

        assertThat(player.play(content, Optional.empty())).isEqualTo("upgrade your plan to access this content");

    }

    @Test
    void Given_Free_Plan_When_Play_Live_Stream_Then_Block_Content() {
        Content content = new Content.ContentBuilder()
                .classification(Classification.LIVESTREAM)
                .subclassification(SubClassification.SPORTS)
                .name("Detroit Lions Football")
                .build();

        assertThat(player.play(content,Optional.empty() )).isEqualTo("upgrade your plan to access this content");

    }

    @Test
    void Given_Gold_Plan_When_Play_Live_Stream_Then_Stream_Content() {
        Content content = new Content.ContentBuilder()
                .classification(Classification.LIVESTREAM)
                .subclassification(SubClassification.SPORTS)
                .name("Michigan vs. Ohio State Football")
                .build();

        assertThat(player.play(content, Optional.of(Plan.GOLD))).isEqualTo("playing Live Stream: Sports - Michigan vs. Ohio State Football");

    }
}
