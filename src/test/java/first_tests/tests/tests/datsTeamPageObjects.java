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

        Faker faker = new Faker(new Locale("en-US"));
        String
                number = faker.phoneNumber().subscriberNumber(10),
                telegram = faker.name().firstName(),
                setText = faker.lebowski().character();

        //Open page
        step( "Open page and fill form of career", () -> {
            datsTeamPage.openPage()
                    .onRussia()
                    .aboutProdects()
                    .aboutDevelop()
                    .conferMeetups()
                    .aboutCompany()
                    .aboutCareer()
                    .number("8912345678")
                    .telegram("@test_user")
                    .setText("Меня зовут Алия, я-инженер-тестировщик")
                    .aboutGame();
        });
        step("Check form of Career", () -> {
            datsTeamPage.checkFormOfCareer(number)
                    .checkFormOfCareer(telegram)
                    .checkFormOfCareer(setText);
        });
    }
}