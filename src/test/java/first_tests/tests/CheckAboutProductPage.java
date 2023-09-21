package first_tests.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("test_1")
public class CheckAboutProductPage extends TestBase {
    @BeforeAll
    static void openWeb() {
        open("https://dats.team/");
    }

    @Test
    public void aboutProductTest() {
        step("Open and check a page about product", () -> {
            openWeb();
            $(".navbar-header").$(".trans-header__menu_1").click();
            $("li[name='performances']").shouldHave(text("Всегда в тренде"));
        });
    }
}

