package first_tests.tests;

import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class CheckCareerPage  extends TestBase {
    @BeforeAll
    static void openWeb() {
        open("https://dats.team/");
    }

}
