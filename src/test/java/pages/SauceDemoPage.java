package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SauceDemoPage {

    public SauceDemoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "user-name")
    public WebElement usernameKutusu;

    @FindBy(id = "password")
    public WebElement passwordKutusu;

    @FindBy(id = "login-button")
    public WebElement loginButonu;

    @FindBy(xpath = "//*[@data-test='inventory-item-name']")
    public List<WebElement> anasayfaUrunlerList;

    @FindBy(id = "add-to-cart")
    public WebElement addtoCartButton;

    @FindBy(id = "shopping_cart_container")
    public WebElement shoppingCart;

    @FindBy(className = "inventory_item_name")
    public WebElement sepettekiUrunIsmi;

}

