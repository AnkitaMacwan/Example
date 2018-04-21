package ca.test.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Commonutils;
import utils.Configreader;
import utils.Knowstestcontxt;

import java.io.IOException;

public class Hooks {

    Commonutils util = new Commonutils();
    Configreader reader = new Configreader();

    @Before

    public void statUp() throws IOException {
        Knowstestcontxt.driver = util.getDriver(reader.properties().getProperty("browser"));
    }


    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.embed(((TakesScreenshot) Knowstestcontxt.driver).getScreenshotAs(OutputType.BYTES), "image/png");
            Knowstestcontxt.driver.quit();
        }

    }
}





