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
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME,value = "@paralel2")

@ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME,value = "false")

@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report/HtmlReport2.html")
//@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, json:target/json-reports/cucumberRapor2.json")
//@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, junit:target/xml-report/cucumber2.xml")

public class ParalelRun2 {
}
