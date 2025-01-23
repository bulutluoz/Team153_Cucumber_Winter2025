package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoqaPage {

    public DemoqaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Alerts']")
    public WebElement alertsButonu;

    @FindBy(id = "timerAlertButton")
    public WebElement timerAlertButton;

    @FindBy(id = "enableAfter")
    public WebElement willEnable5SecondsButonu;

    @FindBy(xpath = "(//*[@class='header-wrapper'])[1]")
    public WebElement elementsMenusu;

    @FindBy(xpath = "(//*[.='Dynamic Properties']")
    public WebElement DynamicPropertiesMenusu;


}
