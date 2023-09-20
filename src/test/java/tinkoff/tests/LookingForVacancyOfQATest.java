package tinkoff.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("test_1")
public class LookingForVacancyOfQATest extends TestBase {
//    @BeforeAll
//    static void openWeb() {
//       open("https://www.tinkoff.ru/career/");
//    }

    @Test
    public void lookingVacancyTest() {
        open();
        $(".navbar-header").$(".trans-header__menu_1").click();


    }
    @Disabled
    @Test
    public void chooseAnyOffersTests () {
        open();
        $(byText("Быстрые офферы")).click();
        $(byText("Выбрать направление")).click();
        $(byText("Выбирайте направление и приходите на fast-интервью")).shouldHave(text("Выбирайте направление и приходите на fast-интервью"));

    }
    @Disabled
    @Test
    public void articlesOpen() {
        open();
        $("[data-schema-path='slides.0']").click();
        $("[role='heading']").shouldHave(text("Как писать в резюме об опыте работы и навыках"));
    }

}
