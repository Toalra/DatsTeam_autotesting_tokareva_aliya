package first_tests.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("test_1")
public class CheckDevelopTestsPage extends TestBase {
    @BeforeAll
    static void openWeb() {
        open("https://dats.team/");
    }
    @Test
    public void aboutDevelopTests() {
        step("Open and check a page about Develop", () -> {
            openWeb();
            $(".header").$(".trans-header__menu_2").click();
            $(".develop__first-section__intro__title").shouldHave(text("Про разработку"));
        });
    }
}
