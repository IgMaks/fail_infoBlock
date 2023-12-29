package config;

import org.aeonbits.owner.Config;

@Config.Sources({"file:./src/test/resources/auth.properties"})
public interface AuthUI extends Config {
    @Key("login")
    String login();
    @Key("pass")
    String pass();
}
