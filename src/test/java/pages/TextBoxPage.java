package pages;

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
            aboutCareer = $(".header").$(byText("карьера"));

    public TextBoxPage openPage() {

        open("https://dats.team");
        return this;
    }

    public TextBoxPage onRussia() {
            onRussia.click();


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
    public TextBoxPage aboutCareer() {
        aboutCareer.click();

        return this;
    }

    //Checks
    public TextBoxPage checkAboutProducts(String value) {
        $("li[name='clock']")
                .$(".products__second-section__advantages__title")
                .shouldHave(text(value));

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
        $("ul['.about__first-section__achievements']").$("li[name='countries']")
                .shouldHave(text(value));

        return this;
    }
}