package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.TextBoxGames;

import static io.qameta.allure.Allure.step;

public class OpeningPageOfGames {

    TextBoxGames openPageOfGame = new TextBoxGames();

    @Test
    @Tag("test_4")
    void openPageOfGame() {
        step("Open page of games", () -> {
            openPageOfGame
                    .openPage()
                    .aboutGames();
        });
        step("Check page of games", () -> {
            openPageOfGame
                    .checkPromoTitle("HYPERCORE ");
        });
    }
}
