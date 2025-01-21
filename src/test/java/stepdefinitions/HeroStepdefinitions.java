package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.HeroPage;

public class HeroStepdefinitions {
    HeroPage heroPage = new HeroPage();

    @When("kullanici Add Element butonuna basar")
    public void kullaniciAddElementButonunaBasar() {
        heroPage.addElementButonu.click();
    }

    @And("Delete butonu’nun gorunur oldugunu test eder")
    public void deleteButonuNunGorunurOldugunuTestEder() {

        Assertions.assertTrue(heroPage.deleteButonu.isDisplayed());

    }

    @Then("Delete tusuna basar")
    public void deleteTusunaBasar() {

        heroPage.deleteButonu.click();

    }

    @And("Add Remove Elements yazisinin gorunur oldugunu test eder")
    public void addRemoveElementsYazisininGorunurOldugunuTestEder() {

        Assertions.assertTrue(heroPage.addRemoveElementsYaziElementi.isDisplayed());

    }
}
