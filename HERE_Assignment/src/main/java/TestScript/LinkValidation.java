package TestScript;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"FeatureFile/LinkVerification.feature"},
glue= {"src/main/java/StepDefinition"},
plugin = {"html:Reports/cucumber-html-report"}
)

public class LinkValidation {


}
