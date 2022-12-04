package qa.annenko.tests;

import org.junit.jupiter.api.BeforeEach;
import qa.annenko.config.WebConfigProvider;

public class TestBase {

    @BeforeEach
    public void configureTests() {
        WebConfigProvider.configure();

    }

}
