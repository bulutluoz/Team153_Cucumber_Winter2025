package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EmagPage {

    public EmagPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id ="searchboxTrigger")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//p[@class='product-new-price'])[1]")
    public WebElement ilkUrunFiyatElementi;
}
