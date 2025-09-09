package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
                 glue={"StepDefinition"},
                 plugin= {"pretty","html:target/htmlreport2.html",
		                           "json:target/jsonreport2",
		                           "junit:target/junitreport2"})
public class TestRunner {
 
}