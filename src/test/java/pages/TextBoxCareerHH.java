package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxCareerHH {
    SelenideElement
            hhVacancy = $(".trans__hh-link_5"),
            headTitle = $(".bloko-header-1");

    public TextBoxCareerHH openPage() {

        open("https://dats.team");
        return this;
    }

    public TextBoxCareerHH hhVacancy() {
        hhVacancy.click();

        return this;
    }

    public TextBoxCareerHH checkVacancyOnHH(String value) {
        headTitle.shouldHave(text(value));

        return this;
    }
}
