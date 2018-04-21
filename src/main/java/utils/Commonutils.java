package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commonutils {

      public void waitForElements(WebElement e, int timeout, WebDriver driver) {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.visibilityOf(e));
      }
      public WebDriver getDriver(String browserType) {
          WebDriver driver = Knowstestcontxt.driver;
          if (browserType.equalsIgnoreCase("chrome")) {
              System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
              driver = new ChromeDriver();
          } else if (browserType.equalsIgnoreCase("firefox")) {
              System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
              driver = new FirefoxDriver();
          }


          return driver;
      }
}


