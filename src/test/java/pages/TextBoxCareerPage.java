package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxCareerPage {
    SelenideElement
            onRussia = $(".choose-locale"),
            aboutCareer = $(".header").$(byText("карьера")),
            number = $("#form-contact-1").$("input[name='phone']"),
            telegram = $("#form-contact-1").$("input[name='telegram']"),
            setText = $("#form-contact-1").$("textarea[name='text']"),
            formCareer = $("#form-contact-1").$(".career__form"),
            element = $("#productManager");

    public TextBoxCareerPage openPage() {

        open("https://dats.team");
        return this;
    }

    public TextBoxCareerPage onRussia() {
        onRussia.click();

        return this;
    }

    public TextBoxCareerPage aboutCareer() {
        aboutCareer.click();

        return this;
    }

    public TextBoxCareerPage element() {
        element.scrollTo();
        return this;
    }

    public TextBoxCareerPage setNumber(String value) {
        number.doubleClick();
        number.setValue(value);

        return this;
    }
    public TextBoxCareerPage setTelegram(String value) {
        telegram.click();
        telegram.setValue(value);

        return this;
    }
    public TextBoxCareerPage setTextCandidate(String value) {
        setText.click();
        setText.setValue(value);

        return this;
    }

    //Checks
    public TextBoxCareerPage checkTextOfNumberTest(String value) {
        number.shouldHave(text(value));

        return this;
    }
    public TextBoxCareerPage checkTextOfTelegramTest(String value) {
        telegram.shouldHave(text(value));

        return this;
    }
    public TextBoxCareerPage checkTextOfAboutEmployeeTest(String value) {
        setText.shouldHave(text(value));

        return this;
    }
}