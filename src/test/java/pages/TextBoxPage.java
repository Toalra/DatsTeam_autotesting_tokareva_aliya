package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {
    SelenideElement
            aboutProducts = $("a[href='/products.html']"),
            aboutDevelop = $("a[href='/develop.html']"),
            conferMeetups = $("a[href='/conf-and-meetup.html']"),
            aboutCompany = $("a[href='/about.html']");

    public TextBoxPage openPage() {

        open("https://dats.team");
        return this;
    }

    public TextBoxPage aboutProducts() {
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

    //Checks
    public TextBoxPage checkAboutProducts(String value) {
        $(".cnt").shouldHave(text(value));

        return this;
    }
    public TextBoxPage checkAboutDevelop(String value) {
        $(".cnt").shouldHave(text(value));

        return this;
    }
    public TextBoxPage checkAboutMeetups(String value) {
        $(".cnt").shouldHave(text(value));

        return this;
    }
    public TextBoxPage checkAboutCompany(String value) {
        $(".about__first-section__achievements").shouldHave(text(value));

        return this;
    }
}