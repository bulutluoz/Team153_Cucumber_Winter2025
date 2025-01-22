package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    /*
        Junit ve TestNG'de extends kullanarak
        istedigimiz class'lari @Before... ve @After... method'larinin bulundugu
        TestBaseEach, TestBaseAll, TestBaseRapor ve TestBaseCross
        class'larina child yapabiliyorduk.
        Extends keyword yazmak veya yazmamak bizim elimizde oldugundan
        istedigimiz class'i extends yapip,
        istemedigimiz class'lari tek basina calistirabiliyorduk


        Cucumber'da extends kullanmiyoruz
        bu sebeple @Before... ve @After... method'larini konrol altina alamayiz
        stepdefinitios klasoru altinda Herhangi bir class'da
        @Before... ve @After... method'lari olursa
        bu method'lar her Scenario icin MUTLAKA CALISIR

        Bundan dolayi
        Cucumber'da @Before... ve @After... method'larini cok dikkatli kullaniriz

        Biz sadece FAILED olan scenario'lar icin
        fotograf cekmek uzere
        bir @After... method'u olusturacagiz

        bu method'u da stepdefinition class'lari icinde kaybolmasin diye
        ozel olarak Hooks diye isimlendirdigimiz class'a kaydedecegiz
     */


    @After // her Scenario'dan sonra calisacak
    public void tearDown(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "screenshots");
        }

        Driver.quitDriver();
    }
}