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

    //@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report/HtmlReport.html")
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


         */
    }
