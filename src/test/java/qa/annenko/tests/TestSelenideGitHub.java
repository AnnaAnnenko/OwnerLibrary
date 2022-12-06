package qa.annenko.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestSelenideGitHub {
    @Test
    public void checkNameOfPage() {
        open("/");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(".h1-mktg.mb-3").shouldHave(Condition.exactTextCaseSensitive("Build like the best"));
    }
}
