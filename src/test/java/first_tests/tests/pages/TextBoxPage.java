package first_tests.tests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {
    SelenideElement
            onRussia = $(".choose-locale"),
            aboutProducts = $(".header").$(byText("про продукты")),
            aboutDevelop = $(".header").$(byText("про разработку")),
            conferMeetups = $(".header").$(byText("конференции и митапы")),
            aboutCompany = $(".header").$(byText("о компании")),
            aboutCareer = $(".navbar_item ").$(byText("карьера")),
            number = $("name=['number']"),
            telegram = $("name=['telegram']"),
            setText = $("name=['text']"),
            formCareer = $(".career__form");

    public TextBoxPage openPage() {

        open("https://dats.team");
        return this;
    }

//    public TextBoxPage onRussia() {
//        onRussia.click();
//
//        return this;
//    }

    public TextBoxPage aboutProdects() {

        aboutProducts.click();

        return this;
    }
    public TextBoxPage aboutDevelop() {

        aboutDevelop.click();

        return this;
    }
    public TextBoxPage conferMeetups() {

        conferMeetups.click();

        return this;
    }

    public TextBoxPage aboutCompany() {
        aboutCompany.click();

        return this;
    }
    public TextBoxPage aboutCareer() {
        aboutCareer.click();

        return this;
    }

    public TextBoxPage setNumber(String value) {
        number.setValue(value);

        return this;
    }
    public TextBoxPage setTelegram(String value) {
        telegram.setValue(value);

        return this;
    }
    public TextBoxPage setTextCandidate(String value) {
        setText.setValue(value);

        return this;
    }

    public TextBoxPage checkOverResults(String value, String valueCheck) {
        formCareer.$(byText(value)).parent().shouldHave(text(valueCheck));

        return this;
    }

    //Checks
    public TextBoxPage checkAboutProducts(String value) {
        $("name=['performances']").shouldHave(text(value));

        return this;
    }
    public TextBoxPage checkAboutDevelop(String value) {
        $(".trans_develop__first-section__intro__title").shouldHave(text(value));

        return this;
    }
    public TextBoxPage checkAboutMeetups(String value) {
        $(".trans-first__section_title").shouldHave(text(value));

        return this;
    }
    public TextBoxPage checkAboutCompany(String value) {
        $(".trans-first__section_title").shouldHave(text(value));

        return this;
    }

    public TextBoxPage checkFormOfCareer(String value) {
        $(".career__form").shouldHave(text(value));

        return this;
    }




}