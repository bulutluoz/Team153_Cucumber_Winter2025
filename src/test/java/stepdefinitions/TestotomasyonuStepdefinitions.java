package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestotomasyonuStepdefinitions {

    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();
    String urunSayfasindaKaydedilenUrunIsmi;

    @Given("kullanici testotomasyonu anasayfaya gider")
    public void kullanici_testotomasyonu_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }

    @When("arama kutusuna phone yazip aratir")
    public void arama_kutusuna_phone_yazip_aratir() {
        testotomasyonuPage.aramaKutusu.sendKeys("phone" + Keys.ENTER);
    }

    @Then("arama sonucunda urun bulunabildigini test eder")
    public void arama_sonucunda_urun_bulunabildigini_test_eder() {
        Assertions.assertTrue(testotomasyonuPage.bulunanUrunElementleriList.size()>0);
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();
    }

    @When("arama kutusuna dress yazip aratir")
    public void aramaKutusunaDressYazipAratir() {
        testotomasyonuPage.aramaKutusu.sendKeys("dress" + Keys.ENTER);
    }

    @When("arama kutusuna Java yazip aratir")
    public void arama_Kutusuna_Java_Yazip_Aratir() {
        testotomasyonuPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }

    @Then("arama sonucunda urun bulunamadigini test eder")
    public void aramaSonucundaUrunBulunamadiginiTestEder() {
        String expectedSonucYazisi = ConfigReader.getProperty("toBulunamadiYazisi");
        String actualSonucYazisi = testotomasyonuPage.aramaSonucYaziElementi.getText();

        Assertions.assertEquals(expectedSonucYazisi,actualSonucYazisi);
    }

    @When("arama kutusuna belirlenen aranacak kelimeyi yazip aratir")
    public void arama_kutusuna_belirlenen_aranacak_kelimeyi_yazip_aratir() {
        testotomasyonuPage.aramaKutusu.sendKeys(ConfigReader.getProperty("toAranacakKelime") + Keys.ENTER);
    }

    @Then("aratma sonuclarindan ilk urunu tiklar")
    public void aratma_sonuclarindan_ilk_urunu_tiklar() {
        testotomasyonuPage.bulunanUrunElementleriList
                            .get(0)
                            .click();
    }

    @Then("acilan urun sayfasindaki urun isminde case sensitive olmadan aranacak kelime bulundugunu test eder")
    public void acilan_urun_sayfasindaki_urun_isminde_case_sensitive_olmadan_aranacak_kelime_bulundugunu_test_eder() {
        String expectedUrunIsimIcerigi = ConfigReader.getProperty("toAranacakKelime");
        String actualUrunIsmi = testotomasyonuPage.urunSayfasindakiIsimElementi
                                                    .getText()
                                                    .toLowerCase();

        Assertions.assertTrue(actualUrunIsmi.contains(expectedUrunIsimIcerigi));
    }

    @Then("acilan urun sayfasindaki urun ismini kaydeder")
    public void acilan_urun_sayfasindaki_urun_ismini_kaydeder() {
        urunSayfasindaKaydedilenUrunIsmi = testotomasyonuPage.urunSayfasindakiIsimElementi.getText();
    }

    @When("urunu sepete ekler")
    public void urunu_sepete_ekler() {
        testotomasyonuPage.urunSayfasindakiSepeteEkleButonu.click();

    }

    @When("your cart linkine tiklar")
    public void your_cart_linkine_tiklar() {

        testotomasyonuPage.urunSayfasindakiYourCartButonu.click();

    }

    @Then("sepetteki urun ismi ile daha once kaydettigi ismin ayni oldugunu test eder")
    public void sepetteki_urun_ismi_ile_daha_once_kaydettigi_ismin_ayni_oldugunu_test_eder() {

        String sepettekiActualUrunIsmi = testotomasyonuPage.yourCartSayfasindakiUrunIsmi.getText();

        Assertions.assertEquals(urunSayfasindaKaydedilenUrunIsmi,sepettekiActualUrunIsmi);

    }

    @Then("sepetteki urun ismi ile daha once kaydettigi ismin case sensitive olmadan ayni oldugunu test eder")
    public void sepettekiUrunIsmiIleDahaOnceKaydettigiIsminCaseSensitiveOlmadanAyniOldugunuTestEder() {

        String expectedUrunIsmi = urunSayfasindaKaydedilenUrunIsmi.toLowerCase();
        String actualUrunIsmi = testotomasyonuPage.yourCartSayfasindakiUrunIsmi
                                                    .getText()
                                                    .toLowerCase();

        Assertions.assertEquals(expectedUrunIsmi,actualUrunIsmi);
    }

    @When("arama kutusuna {string} yazip aratir")
    public void aramaKutusunaYazipAratir(String aranacakUrunIsmi) {
        testotomasyonuPage.aramaKutusu.sendKeys(aranacakUrunIsmi + Keys.ENTER);
    }

    @Then("acilan urun sayfasindaki urun isminde case sensitive olmadan {string} bulundugunu test eder")
    public void acilanUrunSayfasindakiUrunIsmindeCaseSensitiveOlmadanBulundugunuTestEder(String aratilanUrunIsmi) {

        String actualUrunIsmi = testotomasyonuPage.urunSayfasindakiIsimElementi
                                                    .getText()
                                                    .toLowerCase();

        Assertions.assertTrue(actualUrunIsmi.contains(aratilanUrunIsmi));

    }

    @And("senkronizasyon icin {int} saniye bekler")
    public void senkronizasyonIcinSaniyeBekler(int beklemeSuresi) {

        ReusableMethods.bekle(beklemeSuresi);
    }

    @Then("anasayfadaki account linkine tiklar")
    public void anasayfadakiAccountLinkineTiklar() {
        testotomasyonuPage.accountLinki
                            .click();
    }

    @When("email kutusuna configuration dosyasindaki {string} degerini girer")
    public void emailKutusunaConfigurationDosyasindakiDegeriniGirer(String configurationdakiEmail) {
        // configurationdakiEmail ==> toGecerliEmail, toGecersizEmail

        testotomasyonuPage.loginSayfasiEmailKutusu
                            .sendKeys(ConfigReader.getProperty(configurationdakiEmail));

    }

    @And("password kutusuna configuration dosyasindaki {string} degerini girer")
    public void passwordKutusunaConfigurationDosyasindakiDegeriniGirer(String configurationdakiPassword) {

        testotomasyonuPage.loginSayfasiPasswordKutusu
                            .sendKeys(ConfigReader.getProperty(configurationdakiPassword));
    }

    @Then("login sayfasindaki signIn butonuna basar")
    public void loginSayfasindakiSignInButonunaBasar() {
        testotomasyonuPage.loginSayfasiSubmitButonu.click();
    }

    @And("basarili sekilde giris yapilabildigini test eder")
    public void basariliSekildeGirisYapilabildiginiTestEder() {
        Assertions.assertTrue(testotomasyonuPage.logoutButonu.isDisplayed());
    }

    @Then("logout butonuna basar")
    public void logoutButonunaBasar() {
        testotomasyonuPage.logoutButonu.click();
    }

    @Then("basarili olarak giris yapilamadigini test eder")
    public void basariliOlarakGirisYapilamadiginiTestEder() {
        Assertions.assertTrue(testotomasyonuPage.loginSayfasiEmailKutusu.isDisplayed());
    }

    @Then("email kutusuna listede verilen {string} degerini girer")
    public void emailKutusunaListedeVerilenDegeriniGirer(String verilenListedekiEmail) {
        testotomasyonuPage.loginSayfasiEmailKutusu.sendKeys(verilenListedekiEmail);
    }

    @And("password kutusuna listede verilen {string} degerini girer")
    public void passwordKutusunaListedeVerilenDegeriniGirer(String verilenListedekiPassword) {
        testotomasyonuPage.loginSayfasiPasswordKutusu.sendKeys(verilenListedekiPassword);
    }


    @Then("arama sonucunda {string} veya daha fazla urun bulunabildigini test eder")
    public void aramaSonucundaVeyaDahaFazlaUrunBulunabildiginiTestEder(String belirtilenMiktarStr) {

        int belirtilenMiktar = Integer.parseInt(belirtilenMiktarStr);

        String aramaSonucYazisi = testotomasyonuPage.aramaSonucYaziElementi.getText();
        // "3 Products Found"

        aramaSonucYazisi = aramaSonucYazisi.replaceAll("\\D",""); // 3

        int actualBulunanUrunSayisi = Integer.parseInt(aramaSonucYazisi);


        Assertions.assertTrue(actualBulunanUrunSayisi >= belirtilenMiktar);

    }


}
