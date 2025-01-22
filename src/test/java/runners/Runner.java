package runners;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

    @Suite
    @IncludeEngines("cucumber")
    @SelectClasspathResource("src/test/java")

    @ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME,value = "src/test/resources/features")
    @ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME,value = "stepdefinitions")
    @ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME,value = "@wip")

    @ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME,value = "false")

    @ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report/HtmlReport.html")
    //@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, json:target/json-reports/cucumberRapor.json")
    //@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, junit:target/xml-report/cucumber.xml")

    public class Runner {
        /*
            Runner class'i bos bi class'dir
            class body'sinde hicbir kod yoktur

            Runner class'i tum islevlerini
            Notasyonlar sayesinde gerceklestirir

            @IncludeEngines("cucumber") : Bu class'in cucumber kullanarak calismasini saglar

            @SelectClasspathResource("src/test/java") : java dosyalarinin bulundugu ana dosyayin
                                                        yerini belirler,
                                                        Calistiginiz projede java tabanli class'lar
                                                        farkli bir klasor altinda toplaniyorsa
                                                        o klasorun dosya yolu girilmelidir

            Constants.FEATURES_PROPERTY_NAME = "src/test/resources/features"
                projemizde feature dosyalarin bulundugu klasoru belirtir
                EGER calistirilacak feature dosyalari daha spesifik bir klasor altinda toplanmissa
                o klasorun dosya yolu girilmelidir.
                Dikkat edilecek konu : Runner class'i verilen dosya yolundaki klasor disinda bulunan
                hicbir feature dosyasini calistirmaz

           Constants.GLUE_PROPERTY_NAME,value = "stepdefinitions"
                Bu tanimlama, secilen feature dosyalarini hangi klasordeki
                Java kodlarini kullanarak calistiracagimizi belirler
                Burada dikkat edecegimiz sey, spesifik bir class'in degil
                tum stepdefinitios class'larinin bulundugu klasoru secmemizdir

           Constants.FILTER_TAGS_PROPERTY_NAME,value = "@wip"
               Yukarda calisacak feature dosyalari icin
               features klasorunu sectik.
               Runner'i her calistirdigimizda, tum feature'lari degil
               belirledigimiz bir tag'a sahip olan feature'lari calistirmak icin kullanilir

            Yapilan bu 3 ayar sayesinde
            Cucumber FEATURES_PROPERTY_NAME olarak verilen klasordeki feature dosyalarindan
            FILTER_TAGS_PROPERTY_NAME de verilen tag'a sahip olanlari
            GLUE_PROPERTY_NAME de verilen dosya yolu altindaki java stepdefinitions kodlarini
            kullanarak calistirir.

            EXECUTION_DRY_RUN_PROPERTY_NAME,value = "false"
            EGER bu parametre'nin degeri true yapilirsa
            Kodlari calistirmak yerine
            SADECE eksik adim kontrolu yapar
            eksik adim varsa, o step'lerin java method'larini olusturur
            eksik adim yoksa, bunu vurgulamak icin, kodlari calistirmadan "test passed" der


            PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report/HtmlReport.html
            HTML raporlar ureten plugin'i calistirir
            ANCCCAAAAK bu satir Runner class'inda oldugu icin
            Runner ile calistirilan feature'lar icin html rapor olusturur
            Feature veya Scenario yanindaki yesil tus ile calistirilirsa rapor olusturmaz

            dosya yolu olarak target/cucumber-report/HtmlReport.html girildiginden
            bir degisiklik yapmazsak her seferinde ayni dosyanin uzerine kaydeder
            ozel olarak saklamak istedigimiz raporlar olursa
            HtmlReport yerine istenen isim yazilabilir
            Eger Farkli bir klasor altinda raporlari kaydetmek isterseniz
            target/cucumber-report/  kismi degistirilebilir

            Diger rapaorlar da PLUGIN_PROPERTY_NAME olarak tanimlandigindan
            Html, json veya xml raporlarindan hangisini istiyorsak
            o satir yorumdan cikarilmali,
            diger rapor satirlari yorum yapilmalidir



         */
    }
