package qa.annenko.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import qa.annenko.config.WebConfigProvider;

public class TestBase {

    @BeforeAll
    public void configureTests() {
        WebConfigProvider.configure();

    }

}
