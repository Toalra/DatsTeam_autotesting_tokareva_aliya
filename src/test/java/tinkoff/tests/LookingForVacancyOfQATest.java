package tinkoff.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LookingForVacancyOfQATest extends TestBase {
    @BeforeAll
    static void openWeb() {
       open("https://www.tinkoff.ru/career/");
    }

    @Test
    @Tag("tinkoff")
    public void lookingVacancyTest() {
        $(byText("Работа в ИТ")).click();
        $(byText("Смотреть вакансии")).click();
        $(byText("Направление")).click();
        $(byText("Backend")).click();
        $("[data-qa-type='listFilter/experiencesUrl.wrapper']").click();
        $(byText("Любой")).click();
        $(byText("Город")).click();
        $(byText("Алматы")).click();
        $(byText("Java")).click();

        $(byText("Java разработчик в Банкоматы")).shouldHave(text("Java разработчик в Банкоматы"));

    }
    @Test
    public void articlesOpen() {
        $("[data-schema-path='slides.0']").click();
        $("[role='heading']").shouldHave(text("Как писать в резюме об опыте работы и навыках"));
    }
}
