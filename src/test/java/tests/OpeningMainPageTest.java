package tests;

import pages.TextBoxPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class OpeningMainPageTest extends TestBase {
    TextBoxPage datsTeamPage = new TextBoxPage();

    @Test
    @Tag("test_1")
    void checkPagesTest() {
        step( "Open pages", () -> {
            datsTeamPage.openPage()
                    //.onRussia()
                    .aboutProducts()
                    .aboutDevelop()
                    .element_200()
                    .conferMeetups()
                    .aboutCompany();
        });
        step("Check pages", () -> {
            datsTeamPage.checkAboutProducts("Здесь и сейчас")
                    .checkAboutDevelop("200+ специалистов - среди которых")
                    .checkAboutMeetups("Конференции и митапы")
                    .checkAboutCompany("32");
        });
    }
}