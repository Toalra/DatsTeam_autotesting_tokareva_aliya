package first_tests.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("test_1")
public class CheckAboutCompanyPage  extends TestBase {
    @BeforeAll
    static void openWeb() {
        open("https://dats.team/");
    }

    @Test
    public void aboutCompanyTest() {
        step("Open and check a page about Company", () -> {
            openWeb();
            $(".header").$(".trans-header__menu_6").click();
            $(".about__first-section__intro__title").shouldHave(text("Компания dats.team"));
        });
    }
}
