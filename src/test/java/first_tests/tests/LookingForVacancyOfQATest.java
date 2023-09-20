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
    public void alwaysInTrendTest() {
        openWeb();
        $(".navbar-header").$(".trans-header__menu_1").click();
        $("li[name='performances']").shouldHave(text("Всегда в тренде"));
    }
    @Test
    public void aboutDevelopTests() {
        openWeb();
        $(".header").$(".trans-header__menu_2").click();
        $(".develop__first-section__intro__title").shouldHave(text("Про разработку"));

    }
    @Test
    public void aboutGameTest() {
        openWeb();
        $(".header").$(".trans-header__menu_3").click();
        $(".PromoScreen_title__MT_n6").shouldHave(text("HYPERCORE FACTORY"));
    }
    @Test
    public void conferencesMeetupsTest() {
        openWeb();
        $(".header").$(".trans-header__menu_4").click();
        $(".conf-and-meetup__first-section__intro__title").shouldHave(text("Конференции  и митапы"));
    }
    @Test
    public void careerTest() {
        openWeb();
        $(".header").$(".trans-header__menu_5").click();
        $(".career__first-section__intro__title").shouldHave(text("Карьера в dats.team"));
    }
    @Test
    public void aboutCompanyTest() {
        openWeb();
        $(".header").$(".trans-header__menu_6").click();
        $(".about__first-section__intro__title").shouldHave(text("Компания dats.team"));
    }

}
