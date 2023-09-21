package first_tests.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("test_1")
public class CheckGamePage extends TestBase {
    @BeforeAll
    static void openWeb() {
        open("https://dats.games/");
    }
    @Test
    public void openPageOfGame(){
        step("Open and check a page about Game", () -> {
            openWeb();
            $(".Header_desktopNav__nYVk1").$(byText("Games")).click();
            $(".PromoScreen_title__MT_n6").shouldHave(text("HYPERCORE FACTORY"));
        });
    }
    @Test
    public void openPageAboutUs(){
        step("Open and check a page about Game", () -> {
            openWeb();
            $(".Header_desktopNav__nYVk1").$(byText("About us")).click();
            $(".container").shouldHave(text("GET TO KNOW US"));
        });

    }
    @Test
    public void openPageTermOfUse(){
        step("Open and check a page about Game", () -> {
            openWeb();
            $(".Header_desktopNav__nYVk1").$(byText("Terms of use")).click();
            $(".TextPageTitle_title__OPTw4").shouldHave(text("Terms and Conditions of DATS. GAMES"));
        });

    }
    @Test
    public void openPagePrivacyPolicy(){
        step("Open and check a page about Game", () -> {
            openWeb();
            $(".Header_desktopNav__nYVk1").$(byText("Privacy policy")).click();
            $(".TextPageTitle_title__OPTw4").shouldHave(text("PRIVACY POLICY"));
        });

    }

}
