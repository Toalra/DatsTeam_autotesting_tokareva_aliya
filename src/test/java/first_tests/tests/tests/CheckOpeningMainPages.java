package first_tests.tests.tests;

import first_tests.tests.pages.TextBoxPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class CheckOpeningMainPages extends TestBase {
    TextBoxPage datsTeamPage = new TextBoxPage();

    @Test
    @Tag("test_1")
    void checkPagesTest() {

        step( "Open pages", () -> {
            datsTeamPage.openPage()
                    .aboutProdects()
                    .aboutDevelop()
                    .conferMeetups()
                    .aboutCompany();
        });
        step("Check pages", () -> {
            datsTeamPage.checkAboutProducts("Всегда в тренде")
                    .checkAboutDevelop("Про разработку")
                    .checkAboutMeetups("Конференции и митапы")
                    .checkAboutCompany("dats.team");
        });
    }
}