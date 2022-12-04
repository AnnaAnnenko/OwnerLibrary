package qa.annenko.tests;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestSelenideGitHub {

    public void test(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".wiki-more-pages-link .Link--muted").click();
        $("[data-filterable-for='wiki-pages-filter']").shouldHave(Condition.text("SoftAssertions"));
        $("a[href$='SoftAssertions']").click();
    }
}
