package Testng;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Rclick 
  {
	

			ChromeDriver driver;
		String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
		
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
			
		}
		@Test
		public void rightclick() throws InterruptedException
		{
			WebElement right = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
			Actions act=new Actions(driver);
			act.contextClick(right);
			act.perform();
			
			WebElement cut=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[2]"));
			cut.click();
			Thread.sleep(2000);
			Alert a=driver.switchTo().alert();
			String alerttext=a.getText();
			System.out.println("alerttext="+alerttext);
			a.accept();
}
}
