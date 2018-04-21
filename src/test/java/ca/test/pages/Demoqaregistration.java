package ca.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Commonutils;
import utils.Knowstestcontxt;

public class Demoqaregistration {
     Commonutils utils = new Commonutils();

    public Demoqaregistration(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "menu-item-374")
    public WebElement registration;

    @FindBy(id = "name_3_firstname")
    public WebElement firstname;

    @FindBy (id = "name_3_lastname")
    public WebElement lastname;

    @FindBy (xpath = "//*[@value='single']")
    public WebElement Single;

    @FindBy(xpath = "//*[@value='married']")
    public WebElement Married;

    @FindBy(xpath = "//*[@value='divorced']")
    public WebElement divorce;

    @FindBy(xpath = "//*[@value='dance']")
    public WebElement Dance;

    @FindBy(xpath = "//*[@value='reading']")
    public WebElement reading;

    @FindBy(xpath = "//*[@value='cricket']")
    public WebElement Cricket;

    @FindBy(id = "dropdown_7")
    public WebElement Country;

    @FindBy(id = "mm_date_8")
    public WebElement Month;

    @FindBy(id = "dd_date_8")
    public WebElement Day;

    @FindBy(id = "yy_date_8")
    public WebElement Year;

    @FindBy (id = "phone_9")
    public WebElement Phone;

    @FindBy(id = "username")
    public WebElement Username;

    @FindBy(id = "email_1")
    public WebElement Email;

    @FindBy (id = "profile_pic_10")
    public WebElement Profilepic;

    @FindBy (id = "description")
    public WebElement Description;

    @FindBy (id = "password_2")
    public WebElement password;

    @FindBy (id = "confirm_password_password_2")
    public WebElement Confirmpass;

    @FindBy (name = "pie_submit")
    public WebElement Submit;

    @FindBy (xpath ="//*[text()='About us']")
    public WebElement aboutus;

    @FindBy(xpath = "//*[@class='entry-title']")
    public WebElement aboutustext;

    public void clikregistraion() {
        utils.waitForElements(registration, Knowstestcontxt.timeout , Knowstestcontxt.driver);
        registration.click();
    }

//    public void submitbutton(){
//        utils.waitForElements(Submit, Knowstestcontxt.timeout, Knowstestcontxt.driver);
//        Submit.click();
//    }

    public void Firstname(String first){
        utils.waitForElements(firstname, Knowstestcontxt.timeout , Knowstestcontxt.driver);
        firstname.sendKeys(first);
    }

    public void Lastname(String pass){
        utils.waitForElements(lastname, Knowstestcontxt.timeout , Knowstestcontxt.driver);
        lastname.sendKeys(pass);
    }

    public void Maritalstatussingle(){
        utils.waitForElements(lastname, Knowstestcontxt.timeout , Knowstestcontxt.driver);
        Single.click();
    }

    public void Hobbydance(){
        utils.waitForElements(Dance, Knowstestcontxt.timeout , Knowstestcontxt.driver);
        Dance.click();
    }

   public void submitbutton(){
        utils.waitForElements(Submit, Knowstestcontxt.timeout, Knowstestcontxt.driver);
        Submit.click();
    }

    public void clickonAboutus(){
        aboutus.click();
    }

    public String abouttext(){
       return aboutustext.getText();

    }

    public boolean aboutCondition(){
        boolean condition=false;
        if(aboutustext.getText().equals("About")){
            condition=true;
        }
        else{
            condition=false;
        }
        return  condition;
    }
}
