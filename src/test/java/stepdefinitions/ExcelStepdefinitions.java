package stepdefinitions;

import io.cucumber.java.en.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasyonuPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepdefinitions {

    Sheet sheet1;
    String satirdakiUrunIsmi;
    double satirdakiMinimumSonucSayisi;
    int bulunanSonucSayisi;
    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();


    @Given("kullanici urunListesi excel'indeki Sheet1 e gider")
    public void kullanici_urun_listesi_excel_indeki_sheet1_e_gider() throws IOException {
        String excelDosyaYolu = "src/test/resources/urunListesi.xlsx";
        FileInputStream fileInputStream = new FileInputStream(excelDosyaYolu);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        sheet1 = workbook.getSheet("Sheet1");
    }


    @Then("listede verilen {string} daki urun ismini ve minimum sonuc sayisini kaydeder")
    public void listede_verilen_daki_urun_ismini_ve_minimum_sonuc_sayisini_kaydeder(String satirNoStr) {

        int satirNo = Integer.parseInt(satirNoStr);
        satirdakiUrunIsmi = sheet1.getRow(satirNo-1) // verilen satira gider
                                    .getCell(0) // satirda urun ismi olan cell'e gider
                                    .getStringCellValue(); // cell'deki String degeri alir

        satirdakiMinimumSonucSayisi = sheet1.getRow(satirNo-1) // verilen satira gider
                                            .getCell(1) // satirda urun ismi olan cell'e gider
                                            .getNumericCellValue(); // cell'deki double degeri alir


    }

    @When("arama kutusuna kaydedilen urun ismini yazip aratir")
    public void arama_kutusuna_kaydedilen_urun_ismini_yazip_aratir() {

        testotomasyonuPage.aramaKutusu.sendKeys(satirdakiUrunIsmi + Keys.ENTER);

    }

    @Then("arama sonucunda minumum sonuc sayisi veya daha fazla urun bulunabildigini test eder")
    public void arama_sonucunda_minumum_sonuc_sayisi_veya_daha_fazla_urun_bulunabildigini_test_eder() {

        String aramaSonucYazisi = testotomasyonuPage.aramaSonucYaziElementi.getText();
        // "3 Products Found"

        aramaSonucYazisi = aramaSonucYazisi.replaceAll("\\D",""); // 3

        bulunanSonucSayisi = Integer.parseInt(aramaSonucYazisi);

        Assertions.assertTrue(bulunanSonucSayisi >= satirdakiMinimumSonucSayisi);


    }

    @Then("bulunan sonuc sayisini {string} daki {int}.sutuna, tarihi de {int}.sutuna yazar")
    public void bulunan_sonuc_sayisini_daki_sutuna_tarihi_de_sutuna_yazar(String string, Integer int1, Integer int2) {


    }


}
