package first_tests.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("test_1")
public class LookingForVacancyOfQATest extends TestBase {
    @BeforeAll
    static void openWeb() {
       open("https://dats.team/");
    }

    @Test
    public void lookingVacancyTest() {
        open();
        $(".navbar-header").$(".trans-header__menu_1").click();
        $("li[name='performances']").shouldHave(text("Всегда в тренде"));
    }
    @Test
    public void chooseAnyOffersTests () {

        $(".header").$(".trans-header__menu_2").click();
        $(".develop__first-section__intro__title").shouldHave(text("Про разработку"));

    }
    @Test
    public void articlesOpen() {
        $(".header").$(".trans-header__menu_3").click();
        $(".PromoScreen_title__MT_n6").shouldHave(text("HYPERCORE FACTORY"));
    }

}
