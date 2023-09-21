package first_tests.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("test_1")
public class CheckConferencesMeetupsPage  extends TestBase {
    @BeforeAll
    static void openWeb() {
        open("https://dats.team/");
    }
    @Test
    public void conferencesMeetupsTest() {
        step("Open and check a page about Conferences and meetups", () -> {
            openWeb();
            $(".header").$(".trans-header__menu_4").click();
            $(".conf-and-meetup__first-section__intro__title").shouldHave(text("Конференции  и митапы"));
        });
    }
}
