package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebaymouseover {
	WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	
}
@Test
public void ebay()
{
   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	driver.get("https://www.ebay.com/");
	WebElement electronics=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
	Actions act=new Actions(driver);
	 act.moveToElement(electronics).perform();
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a "))).click();
	// driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
 }
}
