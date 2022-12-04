package qa.annenko.config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.function.Supplier;

public class WebConfigProvider {

    static WebConfig configuration = ConfigFactory.create(WebConfig.class, System.getProperties());

    public static void configure() {

        Configuration.baseUrl = configuration.getBaseUrl();
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();

        String remoteUrl = config.getRemoteUrl();
        if (remoteUrl != null) {
            Configuration.remote = remoteUrl;
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
        }
    }
}
