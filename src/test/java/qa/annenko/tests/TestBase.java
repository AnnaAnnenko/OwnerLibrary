package qa.annenko.tests;

import org.junit.jupiter.api.BeforeAll;
import qa.annenko.config.WebDriverProvider;

public class TestBase {

    @BeforeAll
    static void configureTests() {
        WebDriverProvider.configure();

    }

}
