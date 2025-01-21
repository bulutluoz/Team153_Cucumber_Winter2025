package stepdefinitions;

import io.cucumber.java.en.*;

public class ExcelStepdefinitions {

    @Given("kullanici urunListesi excel'indeki Sheet1 e gider")
    public void kullanici_urun_listesi_excel_indeki_sheet1_e_gider() {

    }
    @Then("listede verilen {string} daki urun ismini ve minimum sonuc sayisini kaydeder")
    public void listede_verilen_daki_urun_ismini_ve_minimum_sonuc_sayisini_kaydeder(String string) {

    }
    @When("arama kutusuna kaydedilen urun ismini yazip aratir")
    public void arama_kutusuna_kaydedilen_urun_ismini_yazip_aratir() {

    }
    @Then("arama sonucunda minumum sonuc sayisi veya daha fazla urun bulunabildigini test eder")
    public void arama_sonucunda_minumum_sonuc_sayisi_veya_daha_fazla_urun_bulunabildigini_test_eder() {

    }
    @Then("bulunan sonuc sayisini {string} daki {int}.sutuna, tarihi de {int}.sutuna yazar")
    public void bulunan_sonuc_sayisini_daki_sutuna_tarihi_de_sutuna_yazar(String string, Integer int1, Integer int2) {

    }
}
