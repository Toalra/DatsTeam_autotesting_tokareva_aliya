package tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.TextBoxCareerHH;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class CareerOnHH {

    TextBoxCareerHH openPageOfCompanyOnHH = new TextBoxCareerHH();

    @Test
    @Tag("test_3")
    void openPageOfCompanyOnHH(){
        step("Open page of company on hh.ru", () -> {
            openPageOfCompanyOnHH.openPage()
                    .hhVacancy();
        });

        step("Check page of company on hh.ru", () -> {
            openPageOfCompanyOnHH.checkVacancyOnHH("DatsTeam");
        });
    }
}
