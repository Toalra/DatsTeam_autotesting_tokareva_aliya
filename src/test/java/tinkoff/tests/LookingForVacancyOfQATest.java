package tinkoff.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LookingForVacancyOfQATest extends TestBase {
    @BeforeAll
    static void openWeb() {
       open("https://www.tinkoff.ru/career/it/about/");
    }

    @Test
    @Tag("tinkoff")
    public void lookingVacancyTest() {
        $(byText("Работа в ИТ")).click();
        $(byText("Смотреть вакансии")).click();
        $(byText("Направление")).click();
        $(byText("Backend")).click();
        $(byText("Любой")).click();
        $(byText("Middle")).click();
        $(byText("Город")).click();
        $(byText("Алматы")).click();
        $(byText("Java")).click();

        $(byText("Java-разработчик")).shouldHave(text("Java-разработчик "));
    }
}
