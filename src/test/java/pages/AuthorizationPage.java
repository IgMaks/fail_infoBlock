package pages;

import config.AuthUI;
import io.qameta.allure.Step;
import org.aeonbits.owner.ConfigFactory;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AuthorizationPage {

    @Step(value = "Кнопка войти") // название шага , отображется в отчете
    public AuthorizationPage clickLogIn() {
        $x("//span[@class='mega-menu__user-handler']").click();
        return this;
    }
    @Step(value = "Войти через ЕСИА")
    public AuthorizationPage clickESIA() {
        $x("//div[@class='mb-3 row']").click();
        return this;
    }
    @Step(value = "Ввод логина")
    public AuthorizationPage setLogin() {
        AuthUI configProperties = ConfigFactory.create(AuthUI.class);
        $x("//input[@id='login']").setValue(configProperties.login());
        return this;
    }
    @Step(value = "Ввод пароля")
    public AuthorizationPage setPassword() {
        AuthUI configProperties = ConfigFactory.create(AuthUI.class);
        $x("//input[@id='password']").setValue(configProperties.pass());
        clickEnter();
        return this;
    }
    @Step(value = "Кнопка войти")
    public AuthorizationPage clickEnter() {
        $x("//button[@class='plain-button plain-button_wide']").click();
        return this;
    }
    @Step(value = "Выбор роли")
    public AuthorizationPage clickCV() {
        $x("//button[@id='individual_button']").click();
        return this;
    }
    @Step(value = "Ввод email")
    public AuthorizationPage inputEmail() {
        $("input[name='login']").click();
        return this;
    }
    @Step(value = "Выбор пароля")
    public AuthorizationPage inputPass() {
        $("[name='password']").click();
        return this;
    }

    @Step(value = "Войти по лог/пас")
    public AuthorizationPage enterForLogPass() {
        $(".button.button_wide").click();
        return this;
    }
    @Step(value = "Ввод логина")
    public AuthorizationPage setLoginProd() {
        AuthUI configProperties = ConfigFactory.create(AuthUI.class);
        $("input[name='login']").setValue(configProperties.login());
        return this;
    }
    @Step(value = "Ввод пароля")
    public AuthorizationPage setPasswordProd() {
        AuthUI configProperties = ConfigFactory.create(AuthUI.class);
        $("input[name='password']").setValue(configProperties.pass());
        enterForLogPass();
        return this;
    }
}

