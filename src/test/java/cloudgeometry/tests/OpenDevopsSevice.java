package cloudgeometry.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("cloudgeo")
public class OpenDevopsSevice extends TestBase1 {
    @BeforeAll
    static void openWeb() {
        open("https://www.cloudgeometry.io/");
    }
    @Test
    public void openPageDevops() {
        $(byText("Services")).click();
        $(byText("DevOps as a Service")).click();
        $(".hero__content--l").shouldHave(text("DevOps as a Service."));
    }

    @Test
    public void openPageSolution() {
        $(byText("Solutions")).click();
        $(byText("Infrastructure Management")).click();
        $(".hero__content--l").shouldHave(text("CloudGeometry Infrastructure Management"));
    }


}
