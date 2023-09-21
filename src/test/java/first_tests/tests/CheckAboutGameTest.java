package first_tests.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("test_1")
public class CheckAboutGameTest extends TestBase {
    @BeforeAll
    static void openWeb() {
        open("https://dats.team/");
    }

    @Test
    public void aboutGameTest() {
        step("Open and check a page about Game", () -> {
            openWeb();
            $(".header").$(".trans-header__menu_3").click();
            $(".PromoScreen_title__MT_n6").shouldHave(text("HYPERCORE FACTORY"));
        });
    }
}
