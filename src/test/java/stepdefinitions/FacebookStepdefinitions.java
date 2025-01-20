package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class FacebookStepdefinitions {

    FacebookPage facebookPage = new FacebookPage();

    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String configurationUrlDegeri) {

        Driver.getDriver().get(ConfigReader.getProperty(configurationUrlDegeri));

    }

    @Then("facebook cookies kabul eder")
    public void facebook_cookies_kabul_eder() {
        facebookPage.cookiesKabulButonu.click();
    }

    @Then("facebook'da yeni hesap olustur butonuna basar")
    public void facebook_da_yeni_hesap_olustur_butonuna_basar() {

        facebookPage.createNewAccountButton.click();

    }
    @When("Faker class'indan bilgilerle facebook kayit formunu doldurur")
    public void faker_class_indan_bilgilerle_facebook_kayit_formunu_doldurur() {

        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());

        actions.click(facebookPage.kayitOlusturSayfasiFirstnameKutusu)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("15")
                .sendKeys(Keys.TAB)
                .sendKeys("Mar")
                .sendKeys(Keys.TAB)
                .sendKeys("1990")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.TAB).perform();

       actions.sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password()).perform();
    }

    @Then("facebook kayit ol tusuna basar")
    public void facebook_kayit_ol_tusuna_basar() {

        facebookPage.signUpButonu.click();
    }

}
