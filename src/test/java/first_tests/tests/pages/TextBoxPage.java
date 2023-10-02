package first_tests.tests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {
    SelenideElement
            onRussia = $(".choose-locale"),
            aboutProducts = $(".navbar-header").$(byText("про продукты")),
            aboutDevelop = $(".navbar-header").$(byText("про разработку")),
            aboutGame = $(".navbar-header").$(byText("про игры")),
            conferMeetups = $(".navbar-header").$(byText("конференции и митапы")),
            aboutCareer = $(".navbar-header").$(byText("карьера")),
            aboutCompany = $(".navbar-header").$(byText("о компании")),
            number = $("type='[number]'"),
            telegram = $("type='[telegram]'"),
            setText = $("name='[text]'"),
            formCareer = $(".career__form");


    public TextBoxPage openPage() {

        open("https://dats.team");
        return this;

    }
    public TextBoxPage removeBan() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public TextBoxPage onRussia() {

        onRussia.click();

        return this;
    }

    public TextBoxPage aboutProdects() {

        aboutProducts.click();

        return this;
    }
    public TextBoxPage aboutDevelop() {

        aboutDevelop.click();

        return this;
    }
    public TextBoxPage aboutGame() {

        aboutGame.click();

        return this;
    }
    public TextBoxPage conferMeetups() {

        conferMeetups.click();

        return this;
    }
    public TextBoxPage aboutCareer() {
        aboutCareer.click();

        return this;
    }
    public TextBoxPage aboutCompany() {
        aboutCompany.click();

        return this;
    }

    public TextBoxPage number(String value) {

        number.setValue(value);

        return this;
    }

    public TextBoxPage telegram(String value) {

        telegram.setValue(value);

        return this;
    }
    public TextBoxPage setText(String value) {

        setText.setValue(value);

        return this;
    }

    public TextBoxPage checkOverResults(String value, String valueCheck) {
        formCareer.$(byText(value)).parent().shouldHave(text(valueCheck));

        return this;
    }

    //Checks
    public TextBoxPage checkFormOfCareer(String value) {

        $(".career__form").shouldHave(text(value));

        return this;
    }
}