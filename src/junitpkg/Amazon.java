package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	   ChromeDriver driver;
	   String baseurl="https://www.amazon.in";
	
	   
	   @Before
	   public void  setup()
	   {
		   driver=new ChromeDriver();
		   
	   }
	   @Test
	   
		   public void amazonlogin() 
		   {
		   driver.get(baseurl);
		     //WebElement search=driver.findElement(By.name("field-keywords"));
		     // search.sendKeys("mobiles");
		     //search.submit();
		   
		   WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		   search.sendKeys("mobiles");
		   search.submit();
		   WebElement bs=driver.findElement(By.xpath("//div[@id='nav-xshop-container']/div/a[5]"));
		   bs.click();
		   WebElement hs=driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]/div"));
		   hs.click();
		   driver.navigate().back();
		   WebElement cart=driver.findElement(By.xpath("//div[@id='nav-tools']/a[4]/div/span"));
		   cart.click();
		   WebElement handberber=driver.findElement(By.xpath(""));

		   

		   

		   
		   }
}
