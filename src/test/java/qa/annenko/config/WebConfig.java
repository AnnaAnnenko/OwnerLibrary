package qa.annenko.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${environment}.properties"
})

public interface WebConfig extends Config {

        @Key("baseUrl")
        @DefaultValue("https://github.com")
        String getBaseUrl();

        @Key("browser")
        @DefaultValue("chrome")
        String getBrowser();

        @Key("browserVersion")
        @DefaultValue("100.0")
        String getBrowserVersion();

        @Key("remoteUrl")
        String getRemoteUrl();
}
