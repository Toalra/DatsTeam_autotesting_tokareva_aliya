package tinkoff.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ReadArticleTest {

    @BeforeAll
    static void openWeb() {
        open("https://www.tinkoff.ru/career/");
    }
    @Disabled
    @Test
    @Tag("tinkoff_articles")
    public void articlesOpen() {
        $("[data-schema-path='slides.0']").click();
        $("[role='heading']").shouldHave(text("Как писать в резюме об опыте работы и навыках"));
    }

}
