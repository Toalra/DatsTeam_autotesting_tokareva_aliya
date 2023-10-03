package first_tests.tests.tests;

import com.github.javafaker.Faker;
import first_tests.tests.pages.TextBoxPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static io.qameta.allure.Allure.step;

public class datsTeamPageObjects extends TestBase {
    TextBoxPage datsTeamPage = new TextBoxPage();

    @Test
    @Tag("test_1")
    void fillFormTest() {


        //Open page
        step( "Open page and fill form of career", () -> {
            datsTeamPage.openPage()
                    .onRussia()
                    .aboutProdects()
                    .aboutDevelop()
                    .conferMeetups()
                    .aboutCompany();
        });
        step("Check form of Career", () -> {
            datsTeamPage.checkAboutProducts("Always on trend")
                    .checkAboutDevelop("About development")
                    .checkAboutMeetups("Conferences and meetups")
                    .checkAboutCompany("dats.team");
        });
    }
}