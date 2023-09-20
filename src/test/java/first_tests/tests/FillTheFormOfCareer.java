package first_tests.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("test_1")
public class FillTheFormOfCareer extends TestBase{
    @BeforeAll
    static void openForm() {
        open("https://dats.team/career.html");
    }
    @Test
    public void fillTheForm() {
        step("Fill the career form", () -> {
            $("#symfonyDeveloper").click();
            $("input[name='tel']").setValue("89123456789");
            $("input[name='tg']").setValue("@tester");
            $("input[name='text']").setValue("Добрый день! Меня зовут Алия. Я являюсь автотестировщиком.");

            $("input[name='tel']").shouldHave(text("89123456789"));
            $("input[name='tg']").shouldHave(text("@tester"));
            $("input[name='text']").shouldHave(text("Добрый день! Меня зовут Алия. Я являюсь автотестировщиком."));
        });
        }

}
