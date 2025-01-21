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
    @ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME,value = "true")

    //@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report/HtmlReport.html")
    //@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, json:target/json-reports/cucumberRapor.json")
    //@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, junit:target/xml-report/cucumber.xml")

    public class Runner {
        /*
            Runner class'i bos bi class'dir
            class body'sinde hicbir kod yoktur

            Runner class'i tum islevlerini
            Notasyonlar sayesinde gerceklestirir
         */
    }
