package junitpkg;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class T1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void t1test()  
  {
    driver.get("https://www.amazon.in/");
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.xpath("//div[@id=\'nav-xshop\']/a[4]")).click();
    driver.findElement(By.xpath("//div[@id=\'B0CRDDTQXS\']/a/div/img")).click();
    {
      WebElement element = driver.findElement(By.xpath("//div[@id=\'nav-xshop\']/a[5]"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.close();
  }
}
