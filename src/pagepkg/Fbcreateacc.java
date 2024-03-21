package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Fbcreateacc {
   WebDriver driver;

	By createpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By signup=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	
	public Fbcreateacc(WebDriver driver)
	{
		this.driver=driver;
	}
	public void createpage()
	{
		driver.findElement(createpage).click();
		
	}
	public void signup()
	{
		driver.findElement(signup).click();  
		
	}
	
}