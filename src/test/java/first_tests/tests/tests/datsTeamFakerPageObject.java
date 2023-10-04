package first_tests.tests.tests;

import com.github.javafaker.Faker;
import first_tests.tests.pages.TextBoxPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static io.qameta.allure.Allure.step;

public class datsTeamFakerPageObject {
    TextBoxPage fillFormOfCareer = new TextBoxPage();

    @Test
    @Tag("test_2")
    void fillFormOfCareer(){

        Faker faker = new Faker(new Locale("en-US"));
        String
                number = faker.phoneNumber().subscriberNumber(10),
                telegram = faker.name().firstName(),
                setText = faker.lebowski().character();

        step( "Open page and fill form of career", () -> {
            fillFormOfCareer.openPage()
                    .setNumber(number)
                    .setTelegram(telegram)
                    .setTextCandidate(setText);
        });
        step("Check form of Career", () -> {
            fillFormOfCareer.checkFormOfCareer(number)
                    .checkFormOfCareer(telegram)
                    .checkFormOfCareer(setText);
        });

    }
}
