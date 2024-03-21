package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonscrolldown {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void scrolldown()
	
	{
		driver.get("https://www.amazon.in/");
		JavascriptExecutor  scroll=(JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,document.body.scrollheight)");
		driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")).click();
	}
		
}

