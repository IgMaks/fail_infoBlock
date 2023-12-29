package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.AuthorizationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;


public class Authorization extends TestBase {
    AuthorizationPage authorizationPage = new AuthorizationPage();
    @DisplayName("Проверка авторизации прод лог/пасс")
    @Test
    public void authorizationProdManager() {
        authorizationPage.setLoginProd()
                .setPasswordProd();
        webdriver().shouldHave(url("https://trudvsem.ru/auth/manager/"));
        $(".main").shouldNotHave(text("Информация временно недоступна"));

    }
}
