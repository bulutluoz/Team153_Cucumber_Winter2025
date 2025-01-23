package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoqaPage;
import utilities.Driver;

import java.time.Duration;

public class DemoqaStepdefinitions {

    DemoqaPage demoqaPage = new DemoqaPage();

    @Then("Alerts’e tiklar")
    public void alerts_e_tiklar() {
        demoqaPage.alertsButonu.click();
    }

    @When("On button click, alert will appear after {int} seconds karsisindaki click me butonuna basar")
    public void on_button_click_alert_will_appear_after_seconds_karsisindaki_click_me_butonuna_basar(Integer onemsiz) {

        demoqaPage.timerAlertButton.click();

    }

    @When("Alert’in gorunur olmasini bekler")
    public void alert_in_gorunur_olmasini_bekler() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    @Then("Alert uzerindeki yazinin {string} oldugunu test eder")
    public void alert_uzerindeki_yazinin_oldugunu_test_eder(String expectedAlertYazi) {

        String actualAlertYazi = Driver.getDriver().switchTo().alert().getText();

        Assertions.assertEquals(expectedAlertYazi,actualAlertYazi);

    }


    @Then("Ok diyerek alerti kapatir")
    public void ok_diyerek_alerti_kapatir() {

        Driver.getDriver()
                .switchTo()
                .alert()
                .accept();
    }


}
