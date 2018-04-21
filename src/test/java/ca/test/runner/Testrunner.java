package ca.test.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature/demoqa.feature",
        glue = "ca.test.steps",
       format = {"pretty", "html:Reports"}
       //  tags = "@Test"
)

public class Testrunner {

}
