package ca.test.steps;

import ca.test.pages.Loginpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Commonutils;
import utils.Configreader;
import utils.Knowstestcontxt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Login {

       Loginpage loginpage = new Loginpage(Knowstestcontxt.driver);
       Configreader reader = new Configreader();


    @Given("^Opening the browser$")
    public void browseropen() throws IOException {
        Knowstestcontxt.driver.get(reader.properties().getProperty("url"));
        Knowstestcontxt.driver.manage().window().maximize();
        Knowstestcontxt.driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
    }

    @Given("^clcik on login button$")
    public void clickLogin() {
       loginpage.clicklogin();
    }

    @When("^Enter the username '(.*)' and password '(.*)")
    public void credential(String user , String pass) {
        loginpage.enterusername(user);
        loginpage.enterpassword(pass);
    }

    @Then("^Clcik on Loginbutton$")
    public void clcikLoginbutton()  {
        loginpage.clickonlogin();
        loginpage.Waitforpageload();
    }


}
