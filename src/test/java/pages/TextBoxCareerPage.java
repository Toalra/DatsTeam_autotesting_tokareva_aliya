package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxCareerPage {
    SelenideElement
            onRussia = $(".choose-locale"),
            aboutCareer = $("a[href='/career.html']"),
            formContact = $(".trans__vacancy__about_5"),
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


    public TextBoxCareerPage checkFormContact(String value) {
        formContact.shouldHave(text(value));
        return this;
    }
}