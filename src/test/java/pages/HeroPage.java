package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HeroPage {

    public HeroPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
