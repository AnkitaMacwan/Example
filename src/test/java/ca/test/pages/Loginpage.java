package ca.test.pages;


import gherkin.lexer.Kn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Commonutils;
import utils.Knowstestcontxt;

public class Loginpage {

//*// The @FindBy annotation is used in Page Objects in Selenium tests to
// specify the object location strategy for a WebElement or a list of WebElements.
//Using the PageFactory, these WebElements are usually initialized when a Page Object is created.//*

    Commonutils util = new Commonutils();

    @FindBy(id = "modal-login-button")
    public WebElement login ;//?

    @FindBy(id = "usernameLogin")
    public WebElement username ;

    @FindBy(xpath = "//*[@type='password'][@name='rawPwdLogin']")
    public WebElement password ;

    @FindBy (id = "btn_login")
    public WebElement Loginbutton;

    @FindBy (id = "userDropdownMenuLink")
    public WebElement Dropdownlink;

//    initialize the constructor

    public Loginpage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public void clicklogin(){
        util.waitForElements(login , Knowstestcontxt.timeout , Knowstestcontxt.driver);
        login.click();


    }

    public void enterusername(String user){
        util.waitForElements(username , Knowstestcontxt.timeout , Knowstestcontxt.driver);
        username.sendKeys(user);
    }

    public void enterpassword(String pass) {
        util.waitForElements(password , Knowstestcontxt.timeout , Knowstestcontxt.driver);
        password.sendKeys(pass);
    }

    public void clickonlogin(){
        util.waitForElements(Loginbutton , Knowstestcontxt.timeout , Knowstestcontxt.driver);
        Loginbutton.click();
        }

        public void Waitforpageload(){
        util.waitForElements(Dropdownlink, Knowstestcontxt.timeout, Knowstestcontxt.driver);

        }

        //public void quit(){
          //  Knowstestcontxt.driver.quit();
        }


