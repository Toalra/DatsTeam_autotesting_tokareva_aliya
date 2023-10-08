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
            aboutCareer = $(".header").$(byText("карьера")),
            number = $("#form-contact-1").$("input[name='phone']"),
            telegram = $("#form-contact-1").$("input[name='telegram']"),
            setText = $("#form-contact-1").$("textarea[name='text']"),
            formCareer = $("#form-contact-1").$(".career__form"),
            element = $("#productManager");

    public TextBoxPage openPage() {

        open("https://dats.team");
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

    public TextBoxPage element() {
        element.scrollTo();
        return this;
    }

    public TextBoxPage setNumber(String value) {
        number.doubleClick();
        number.setValue(value);

        return this;
    }
    public TextBoxPage setTelegram(String value) {
        telegram.click();
        telegram.setValue(value);

        return this;
    }
    public TextBoxPage setTextCandidate(String value) {
        setText.click();
        setText.setValue(value);

        return this;
    }

    //Checks
    public TextBoxPage checkAboutProducts(String value) {
        $("li[name='performances']").$(".products__second-section__advantages__title").shouldHave(text(value));

        return this;
    }
    public TextBoxPage checkAboutDevelop(String value) {
        $("section['.develop__first-section']")
                .$(".develop__first-section__intro")
                .$(".develop__first-section__intro__title").shouldHave(text(value));

        return this;
    }
    public TextBoxPage checkAboutMeetups(String value) {
        $(".develop__second-section__title").shouldHave(text(value));

        return this;
    }
    public TextBoxPage checkAboutCompany(String value) {
        $("section['.about__first-section']")
                .$(".trans-first__section_title").shouldHave(text(value));

        return this;
    }
    public TextBoxPage checkTextOfNumberTest(String value) {
        number.shouldHave(text(value));

        return this;
    }
    public TextBoxPage checkTextOfTelegramTest(String value) {
        telegram.shouldHave(text(value));

        return this;
    }
    public TextBoxPage checkTextOfAboutEmployeeTest(String value) {
        setText.shouldHave(text(value));

        return this;
    }
}