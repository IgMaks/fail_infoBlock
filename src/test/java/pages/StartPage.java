package pages;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class StartPage {
    @Step(value = "Согласие обработки персональных данных")
    public StartPage buttonCloseCookie() {
        $x("//div[@class='col-12 col-md-3 col-lg-2']").click();
        return this;
    }
    @Step(value = "Открытие Все сервисы")
    public StartPage clickAllServices(){
        $x("//button[contains(text(),'Все сервисы')]").click();
        return this;
    }
    @Step(value = "Открытие Все услуги")
    public StartPage clickAll(){
        $x("//a[contains(@class,'mega-menu__submenu-link')][contains(text(),'Все услуги')]").click();
        return this;
    }
    @Step(value = "Выбор региона")
    public StartPage chooseRegion(){
        $x("//button[@title='Выберите...']").click();
        return this;
    }
    public StartPage searchRegion(){
        $x("//span[contains(text(),'г. Санкт-Петербург')]").click();
        return this;
    }
    public StartPage startForm(){
        $(".group-container").click();
        return this;
    }
    public StartPage benefit(){
        $x("//span[contains(text(),'Я претендую на признание безработным')]").click();
        return this;
    }
    public StartPage resumeButton(){
        $x("//button[contains(@title,'Выберите резюме')]").click();
        return this;
    }
    public StartPage resume(){
        $x("//a[@id='bs-select-14-1']//span[@class='text']//span[1]").click();
        return this;
    }
    public StartPage regionForm(){
        $x("//button[@title='Выберите регион']").click();
        return this;
    }
    public StartPage regionFormSearch(){
        $x("//div[@class='dropdown-menu show']//input[@name='search']").setValue("Санкт");
        return this;
    }
    public StartPage regionFormInput(){
        $x("//span[@class='text'][contains(text(),'г Санкт-Петербург')]").setValue("Санкт");
        return this;
    }
    public StartPage regionSznForm(){
        $x("//a[@id='bs-select-26-1']//span[@class='text'][contains(text(),'г Санкт-Петербург')]").click();
        return this;
    }
    public StartPage regionSznFormInput(){
        $x("//a[@id='bs-select-26-1']//span[@class='text'][contains(text(),'г Санкт-Петербург')]").click();
        return this;
    }
    public StartPage szn(){
        $x("//div[@class='dropdown bootstrap-select select__control dropup']//button[@title='Выберите...']").click();
        return this;
    }
    public StartPage sznInput(){
        $x("//span[contains(text(),'СПб ГАУ ЦЗН АЗН Красногвардейского района СПб')]").click();
        return this;
    }
    public StartPage benefitPay(){
        $x("//span[contains(text(),'Карта национальной платежной системы «Мир»')]").click();
        return this;
    }
    public StartPage cardNumber(){
        $x("//input[@placeholder='Введите номер карты «Мир»']").setValue("2222 2222 2222 2222");
        return this;
    }
    public StartPage infEmpl(){
        $x("//div[@id='form-control-127']//span[contains(@class,'radio__label')][contains(text(),'Не отношусь')]").click();
        $x("//div[@id='form-control-130']//span[contains(@class,'radio__label')][contains(text(),'Не отношусь')]").click();
        $x("//div[@id='form-control-132']//span[contains(@class,'radio__label')][contains(text(),'Не отношусь')]").click();
        $x("//div[@id='form-control-135']//span[contains(@class,'radio__label')][contains(text(),'Не отношусь')]").click();
        $x("//div[@id='form-control-138']//span[contains(@class,'radio__label')][contains(text(),'Не отношусь')]").click();
        $x("//div[@id='form-control-140']//span[contains(@class,'radio__label')][contains(text(),'Не отношусь')]").click();
        $x("//div[@id='form-control-143']//span[contains(@class,'radio__label')][contains(text(),'Не отношусь')]").click();
        $x("//div[@id='form-control-145']//span[contains(@class,'radio__label')][contains(text(),'Не отношусь')]").click();
        $x("//div[@id='form-control-148']//span[contains(@class,'radio__label')][contains(text(),'Не отношусь')]").click();
        $x("//div[@id='form-control-151']//span[contains(@class,'radio__label')][contains(text(),'Не отношусь')]").click();
        $x("//div[@id='form-control-154']//span[contains(@class,'radio__label')][contains(text(),'Не отношусь')]").click();
        $x("//div[@id='form-control-157']//span[contains(@class,'radio__label')][contains(text(),'Не отношусь')]").click();
        $x("//div[@id='form-control-159']//span[contains(@class,'radio__label')][contains(text(),'Не отношусь')]").click();
        $x("//div[@id='form-control-161']//span[contains(@class,'radio__label')][contains(text(),'Не отношусь')]").click();
        return this;
    }
    public StartPage upDait(){
        Selenide.refresh();
        return this;
    }
    public StartPage closeWindow(){
        Selenide.closeWindow();
        return this;
    }

}
