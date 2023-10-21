package tests;

import com.github.javafaker.Faker;
import pages.TextBoxCareerPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static io.qameta.allure.Allure.step;

public class FormOfCareer {
    TextBoxCareerPage fillFormOfCareer = new TextBoxCareerPage();

    @Test
    @Tag("test_2")
    void fillFormOfCareerTest(){

        Faker faker = new Faker(new Locale("en-US"));
        String
                number = faker.phoneNumber().subscriberNumber(10),
                telegram = faker.name().firstName(),
                setText = faker.lebowski().character();

        step( "Open page and fill form of career", () -> {
            fillFormOfCareer.openPage()
                   // .onRussia()
                    .aboutCareer()
                    .element()
                    .setNumber(number)
                    .setTelegram(telegram)
                    .setTextCandidate(setText);
        });
        step("Check form of Career", () -> {
            fillFormOfCareer.checkTextOfNumberTest(number)
                    .checkTextOfTelegramTest(telegram)
                    .checkTextOfAboutEmployeeTest(setText);
        });

    }
}
