package ca.test.steps;

import ca.test.pages.Demoqaregistration;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.Configreader;
import utils.Knowstestcontxt;

import java.io.IOException;

public class Demoqa {

    Demoqaregistration demo = new Demoqaregistration(Knowstestcontxt.driver);
    Configreader reader = new Configreader();


@Given("^Open the demoqa browser$")
    public void openingthebrowser() throws IOException {
    Knowstestcontxt.driver.get(reader.properties().getProperty("url"));
    Knowstestcontxt.driver.manage().window().maximize();
}


@Given("^Click on registration$")
    public void clikonregisration(){
    demo.clikregistraion();

}

@Given("^Enter the firstname '(.*)' and lastname '(.*)")
public void enterfirstnamelastname(String first , String last){
    demo.Firstname(first);
    demo.Lastname(last);
}

@Given("^enable single$")
    public void Enablesingle() {
    demo.Maritalstatussingle();
}

@Given("^enable Dance$")
    public void Dance() {
        demo.Hobbydance();
    }

@Given("^Clcik on Submit$")
    public void clickonsubmit() {
    demo.submitbutton();
}

@Given("^Clcik on aboutus$")
public void clickonaboutus(){
demo.clickonAboutus();
   // Assert.assertEquals("About" , demo.abouttext());
    Assert.assertTrue("Text is not equal", demo.aboutCondition());
}
}




