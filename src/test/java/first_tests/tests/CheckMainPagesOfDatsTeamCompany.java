package first_tests.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("test_1")
public class CheckMainPagesOfDatsTeamCompany extends TestBase {
    @BeforeAll
    static void openWeb() {
       open("https://dats.team/");
    }

    @Test
    public void alwaysInTrendTest() {
        step("Open and check a page about Always in trend", () -> {
        openWeb();
        $(".navbar-header").$(".trans-header__menu_1").click();
        $("li[name='performances']").shouldHave(text("Всегда в тренде"));
        });
    }
    @Test
    public void aboutDevelopTests() {
        step("Open and check a page about Develop", () -> {
        openWeb();
        $(".header").$(".trans-header__menu_2").click();
        $(".develop__first-section__intro__title").shouldHave(text("Про разработку"));
        });
    }
    @Test
    public void aboutGameTest() {
    step("Open and check a page about Game", () -> {
        openWeb();
        $(".header").$(".trans-header__menu_3").click();
        $(".PromoScreen_title__MT_n6").shouldHave(text("HYPERCORE FACTORY"));
        });
    }
    @Test
    public void conferencesMeetupsTest() {
        step("Open and check a page about Conferences and meetups", () -> {
        openWeb();
        $(".header").$(".trans-header__menu_4").click();
        $(".conf-and-meetup__first-section__intro__title").shouldHave(text("Конференции  и митапы"));
        });
    }
    @Test
    public void careerTest() {
        step("Open and check a page about Career", () -> {
        openWeb();
        $(".header").$(".trans-header__menu_5").click();
        $(".career__first-section__intro__title").shouldHave(text("Карьера в dats.team"));
        });
    }
    @Test
    public void aboutCompanyTest() {
        step("Open and check a page about Company", () -> {
        openWeb();
        $(".header").$(".trans-header__menu_6").click();
        $(".about__first-section__intro__title").shouldHave(text("Компания dats.team"));
        });
    }

}
