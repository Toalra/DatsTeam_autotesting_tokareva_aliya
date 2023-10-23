package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxGames {
    SelenideElement
            aboutGames = $("[href='https://dats.games/']"),
            promoTitle = $(".PromoScreen_title__MT_n6");

    public TextBoxGames openPage() {
        open("https://dats.team");

        return this;
    }

    public TextBoxGames aboutGames() {
        aboutGames.click();

        return this;
    }

    public TextBoxGames checkPromoTitle(String value) {
        promoTitle.shouldHave(text(value));

        return this;
    }
}

