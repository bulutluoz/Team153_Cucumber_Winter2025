package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.SauceDemoPage;

public class SauceDemoStepdefinitions {
    SauceDemoPage sauceDemoPage = new SauceDemoPage();
    String ilkUrunIsmi;

    @Then("saucedemo username kutusuna {string} yazar")
    public void saucedemoUsernameKutusunaYazar(String girilenUsername) {
        sauceDemoPage.usernameKutusu.sendKeys(girilenUsername);
    }
    @And("saucedemo password kutusuna {string} yazar")
    public void saucedemoPasswordKutusunaYazar(String girilenPassword) {
        sauceDemoPage.passwordKutusu.sendKeys(girilenPassword);
    }
    @Then("saucedemo login tusuna basar")
    public void saucedemoLoginTusunaBasar() {
        sauceDemoPage.loginButonu.click();
    }
    @And("saucedemo ilk urunun ismini kaydeder ve bu urunun sayfasina gider")
    public void saucedemoIlkUrununIsminiKaydederVeBuUrununSayfasinaGider() {
        ilkUrunIsmi=sauceDemoPage.anasayfaUrunlerList.get(0).getText();
        sauceDemoPage.anasayfaUrunlerList.get(0).click();
    }
    @When("saucedemo add to Cart butonuna basar")
    public void saucedemoAddToCartButonunaBasar() {
        sauceDemoPage.addtoCartButton.click();
    }
    @Then("saucedemo alisveris sepetine tiklar")
    public void saucedemoAlisverisSepetineTiklar() {
        sauceDemoPage.shoppingCart.click();
    }
    @And("saucedemo sectigi urunun basarili olarak sepete eklendigini test eder")
    public void saucedemoSectigiUrununBasariliOlarakSepeteEklendiginiTestEder() {
        String sepettekiUrunIsmi = sauceDemoPage.sepettekiUrunIsmi.getText();
        Assertions.assertEquals(sepettekiUrunIsmi,ilkUrunIsmi);
    }
}
