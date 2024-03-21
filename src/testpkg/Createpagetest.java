package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbcreateacc;

public class Createpagetest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void signup()
	{
		Fbcreateacc ob=new Fbcreateacc(driver);
		ob.createpage();
		ob.signup();
	}

}
 