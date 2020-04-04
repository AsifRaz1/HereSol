package TestScript;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/FeatureFile/LinkVerification.feature"},
glue= {"StepDefinition"},
plugin = {"html:Reports/cucumber-html-report"},
strict = true

)

public class LinkValidation {


}
