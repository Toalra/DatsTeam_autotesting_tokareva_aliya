package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxCareerHH {

    SelenideElement
            onRussia = $(".choose-locale"),
            aboutCareer = $("a[href='/career.html']"),
            elementPage = $("#productManager"),
            hhVacancy = $(".trans__hh-link_5");

    public TextBoxCareerHH openPage() {
        open("https://dats.team");

        return this;
    }
    public TextBoxCareerHH onRussia() {
        onRussia.click();

        return this;
    }

    public TextBoxCareerHH aboutCareer() {
        aboutCareer.click();

        return this;
    }

    public TextBoxCareerHH elementPage() {
        elementPage.scrollTo();

        return this;
    }

    public TextBoxCareerHH checkVacancyOnHH(String value) {
        hhVacancy.shouldHave(text(value));

        return this;
    }
}
