package tests;

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

        step( "Open page form of career", () -> {
            fillFormOfCareer.openPage()
                    .onRussia()
                    .aboutCareer()
                    .element();
        });
        step("Check form of Career", () -> {
            fillFormOfCareer
                    .checkFormContact("расскажите о себе");
        });

    }
}