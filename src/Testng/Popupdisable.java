package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Popupdisable {
 WebDriver driver;
@BeforeTest
public void setup()
{
	ChromeOptions popup=new ChromeOptions();
	popup.addArguments("--disable-notifications");
	driver=new ChromeDriver(popup);
	driver.manage().window().maximize();
}
	@Test
	public void test()
	{
		driver.get("https://www.justdial.com/");
	}
}

 