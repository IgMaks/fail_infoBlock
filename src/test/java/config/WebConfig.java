package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})

public interface WebConfig extends Config{
    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();
    @Key("baseUrl")
    @DefaultValue("https://trudvsem.ru/auth/login#employer")
    String getBaseUrl();
    @Key("version")
    @DefaultValue("100.0")
    String getBrowserVersion();
}