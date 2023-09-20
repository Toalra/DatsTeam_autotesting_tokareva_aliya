package cloudgeometry.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("cloudgeo")
public class OpenDevopsSevice extends TestBase1 {
//    @BeforeAll
//    static void openWeb() {
//        open("https://www.cloudgeometry.io");
//    }
    @Test
    public void openPageDevops() {
        open();
        $(".verticalsList--inner div").$(byText("Select project ")).click();
        $("[data-link='/walk-in-showers']").click();
        $(".customButton_large").click();
        $(".project-name").shouldHave(text("Walk-In Shower"));
    }

    @Disabled
    @Test
    public void openPageSolution() {
        open();
        $("#w-dropdown-toggle-1").$(byText("Solutions")).click();
        $(byText("Infrastructure Management")).click();
        $(".hero__content--l").shouldHave(text("CloudGeometry Infrastructure Management"));
    }

    @Disabled
    @Test
    public void openPageResources() {
        open();
        $("#w-dropdown-toggle-2").$(byText("Resources")).click();
        $(".uui-navbar01_dropdown-link-list").$(byText("Blog")).click();
        $(".hero__content--l").shouldHave(text("Blog"));

    }


}
