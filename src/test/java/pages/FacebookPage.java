package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Allow all cookies'])[2]")
    public WebElement cookiesKabulButonu;

    @FindBy(id = "email")
    public WebElement loginSayfasiEmailKutusu;

    @FindBy(id = "pass")
    public WebElement loginSayfasiPasswordKutusu;

    @FindBy(name = "login")
    public WebElement loginSayfasiLoginButonu;

    @FindBy(xpath = "//*[@data-testid='open-registration-form-button']")
    public WebElement createNewAccountButton;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement kayitOlusturSayfasiFirstnameKutusu;

    @FindBy(xpath = "//button[@name='websubmit']")
    public WebElement signUpButonu;

}
