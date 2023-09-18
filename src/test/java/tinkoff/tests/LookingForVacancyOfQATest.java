package tinkoff.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LookingForVacancyOfQATest extends TestBase {
//    @BeforeAll
//    public void openWeb() {
//        open("https://www.tinkoff.ru/career/it/about/");
//    }

    @Test
    @Tag("tinkoff")
    public void lookingVacancyTest() {
        $(".ab32iOGLV").click();
        $(".dbVmwKQGC").click();
        $(".bIy-+Id").shouldHave(text("QA - инженер (frontend) в Тинькофф Инвестиции"));
        $(".bIy-+Id").shouldHave(text("QA-инженер на backend приложений"));
        $(".bIy-+Id").shouldHave(text("Инженер по тестированию веб-приложений"));
        $(".bIy-+Id").shouldHave(text("QA-инженер в мобильное тестирование"));
        $(".bIy-+Id").shouldHave(text("Full-stack QA (Java) в Тинькофф Страхование"));
    }
}
