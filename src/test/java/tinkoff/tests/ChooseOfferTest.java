package tinkoff.tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ChooseOfferTest {
    @BeforeAll
    static void openWeb() {
        open("https://www.tinkoff.ru/career/");
    }

    @Test
    @Tag("tinkoff_offer")
    public void chooseAnyOffersTests () {
        $(byText("Быстрые офферы")).click();
        $(byText("Выбрать направление")).click();
        $(byText("Выбирайте направление и приходите на fast-интервью")).shouldHave(text("Выбирайте направление и приходите на fast-интервью"));

    }

}
