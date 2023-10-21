package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {
    SelenideElement
    //        onRussia = $(".choose-locale"),
            aboutProducts = $("a[href='/products.html']"),
            aboutDevelop = $("a[href='/develop.html']"),
            conferMeetups = $("a[href='/conf-and-meetup.html']"),
            aboutCompany = $("a[href='/about.html']"),
            element_200 = $(".develop__second-section__title");

    public TextBoxPage openPage() {

        open("https://dats.team");
        return this;
    }

//    public TextBoxPage onRussia() {
//        onRussia.click();
//
//        return this;
//    }

    public TextBoxPage aboutProducts() {
        aboutProducts.click();

        return this;
    }

    public TextBoxPage aboutDevelop() {
        aboutDevelop.click();

        return this;
    }

    public TextBoxPage element_200() {
        element_200.scrollTo();

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
        $("div['.trans-products__advantages_title_2']")
                .shouldHave(text(value));

        return this;
    }
    public TextBoxPage checkAboutDevelop(String value) {
        $("section['.develop__second-section']")
                .$(".develop__second-section__title").shouldHave(text(value));

        return this;
    }
    public TextBoxPage checkAboutMeetups(String value) {
        $(".develop__second-section__title").shouldHave(text(value));

        return this;
    }
    public TextBoxPage checkAboutCompany(String value) {
        $("ul['.about__first-section__achievements']").$("li[name='countries']")
                .shouldHave(text(value));

        return this;
    }
}