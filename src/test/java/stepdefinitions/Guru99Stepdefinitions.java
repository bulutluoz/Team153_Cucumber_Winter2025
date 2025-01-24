package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import pages.Guru99Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class Guru99Stepdefinitions {

    Guru99Page guru99Page = new Guru99Page();

    @Then("Company listesini consola yazdirir")
    public void companyListesiniConsolaYazdirir() {

        System.out.println(ReusableMethods.stringListeDonustur(guru99Page.sirketIsimElementleriList));
    }

    @And("listede {int}'den fazla sirket oldugunu test eder")
    public void listedeDenFazlaSirketOldugunuTestEder(int expectedMinSirketSayisi) {

        int actualSirketSayisi = guru99Page.sirketIsimElementleriList.size();

        Assertions.assertTrue(actualSirketSayisi >= expectedMinSirketSayisi);
    }

    @And("{string} %Change oraninin pozitif oldugunu test eder")
    public void changeOranininPozitifOldugunuTestEder(String istenenSirket) {

        // tum satirlardaki sirket isimlerini kontrol edip
        // sirket ismi istenenSirket olan satirdaki
        // yuzde degisim miktarini kaydedelim

        String satirdakiYuzdeDegisimOrani = "";
        int satirSayisi = guru99Page.sirketIsimElementleriList.size();
        //      //tbody/tr[   5   ]/td[   1   ]
        String satirdakiDegisimMiktari = "";

        for (int i = 1; i <=satirSayisi ; i++) {

            String satirdakiSirketIsmi = Driver
                                            .getDriver()
                                            .findElement(By.xpath("//tbody/tr[" + i + "]/td[1]"))
                                            .getText();




            if (satirdakiSirketIsmi.equalsIgnoreCase(istenenSirket)){

                satirdakiDegisimMiktari = Driver
                                                .getDriver()
                                                .findElement(By.xpath("//tbody/tr[" + i + "]/td[5]"))
                                                .getText();

                break;
            }


        }

        System.out.println("Degisim miktari : " + satirdakiDegisimMiktari);

        Assertions.assertTrue(satirdakiDegisimMiktari.contains("+"));

    }

}
